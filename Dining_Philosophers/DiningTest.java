/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
///////
package Dining_Philosophers;

import java.util.Scanner;

/**
 *
 * @author Pouya
 */

public class DiningTest {
         static int K;
    public static void main(String[] args){
        System.out.println("Enter number of Philosophers : ");
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        K=n;
        
        Chopstick CH = new Chopstick();
        for(int i =0; i<K;i++)
        {
            new Philosopher(CH).start();
        }
    }
    }

