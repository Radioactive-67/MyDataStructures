/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyDS;

/**
 *
 * @author Ashish Anand
 */
public class StackImplementation {
    public static void main(String[] args) throws Exception {
        MyStack<Integer> x = new MyStack();
        //Pushing Elements in my Stack
        x.push(1);
        x.push(2);
        x.push(3);
        
        //Popping The last element
        System.out.println("The Popped element is");
        x.pop();
        System.out.println("The last element now is (Peeking) : ");
        x.peek();
    }
    
}
