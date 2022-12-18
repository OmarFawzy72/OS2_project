/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Real_World_Application;

import java.util.Scanner;

/**
 *
 * @author Lenovo Ideapad L340
 */
public class real_World_Application {
         static int K;
    public static void main(String[] args){
        System.out.println("Enter number of Customers : ");
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        K=n;
        Room room=new Room();
        
        for(int i =0; i<K;i++)
        {
            new Customer(room).start();
        }
    }
    
}
