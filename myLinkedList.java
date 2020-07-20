package MyDS;

public class myLinkedList<E> {
    Node<E> head;
    
    void add(E data){
        Node<E> toAdd = new Node<E>(data);
        if(isEmpty()){
            head = toAdd ;
            return;
        }
        Node<E> temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = toAdd;
    }
    void get(int i ){
        Node<E> temp = head;
        int k=0;
        while(k!=i){
            temp=temp.next ;
            k++;
        }
        System.out.println(temp.data);
    }
    void set(int i , E x){
       Node<E> temp = head;
        int k=0;
        while(k!=i){
            temp=temp.next ;
            k++;
        }
        temp.data=x;
    }
    Node<E> remove(int i){
       Node<E> temp = head;
       Node<E> temp2 = head;
       int k=0;
       while(k!=i){
            temp=temp.next ;
            k++;
        }
       int j=0;
       while(j!=i-1){
            temp2=temp2.next ;
            j++;
        }
       temp2.next=temp.next;
       
       return temp2;
    }
    
    void print(){
        Node<E> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    boolean isEmpty(){
        return head == null;
    }
    
    
    static class Node<E>{
        E data;
        Node<E> next;
        public Node(E data){
            this.data = data;
            next = null;
        }
    }
}
