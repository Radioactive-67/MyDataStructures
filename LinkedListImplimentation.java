package MyDS;
import java.util.Scanner;
public class LinkedListImplimentation {
    public static void main(String[] args) throws Exception {
        myLinkedList<Integer> x = new myLinkedList<>();
        
        for(int i=1;i<=20;i++){
            x.add(i);
        }
        System.out.println("The elements in the LinkedList are(Before any modification) : ");
        x.print();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index whose value you want to find :");
        int z = sc.nextInt();
        System.out.println("The element at index "+ z + " is : ");
        x.get(z);
        System.out.println("Enter the index whose value you want to remove from the list :");
        int y = sc.nextInt();
        
        System.out.println("The element which will be removed is : ");
        x.get(y);
        x.remove(y);
        System.out.println("The new element at index "+ y + " is : ");
        x.get(y);
        System.out.println("The Final list is :");
        x.print();
        System.out.println("The Size of the edited LinkedList is : ");
        System.out.println(x.size());
    }
}
