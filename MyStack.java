/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyDS;
import MyDS.myLinkedList.*;
/**
 *
 * @author Ashish Anand
 */
public class MyStack<E> {
    private myLinkedList<E> ll = new myLinkedList<>();
    
    void push(E e){
        ll.add(e);
    }
    
    void pop() throws Exception{
        if(ll.isEmpty()){
            throw new Exception("Popping from an empty Stack");
           
        }
        else{
            int y = ll.size()-1;
            ll.get(y);
            ll.remove(y);
            
        }
    }
    
    void peek() throws Exception{
        if(ll.isEmpty()){
            throw new Exception("Popping from an empty Stack");
           
        }
        else{
            int y = ll.size()-1;
            ll.get(y);
        }
    }
    
    
}
