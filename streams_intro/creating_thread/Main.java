/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author catalin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServerThread thread = new ServerThread("Server1");
        thread.start();
        thread.start();
        // try {
        //     thread.start(); // This should throw IllegalThreadStateException
        //     System.out.println("Let's see if this code is running");
        // } catch (IllegalThreadStateException e) {
        //     System.out.println("Caught IllegalThreadStateException: " + e.getMessage());
        // }

        // System.out.println("Things are continuing");
    }
    
}
