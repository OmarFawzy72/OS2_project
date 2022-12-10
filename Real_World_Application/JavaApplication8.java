/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Real_World_Application;

/**
 *
 * @author Lenovo Ideapad L340
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Room room = new Room();
            new Customer(room).start();
            new Customer(room).start();
            new Customer(room).start();
            new Customer(room).start();
            new Customer(room).start();

    }
    
}
