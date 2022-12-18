/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/////
package Dining_Philosophers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pouya
 */
class Philosopher extends Thread{
    int Num;
    static int Number=0;
    private Chopstick Chop;
    public Philosopher(Chopstick Chop){
	super();
	this.Chop=Chop;
        Num=Number;
	Number++;
    }

private void hungry(){
        System.out.format("Philosopher\t%d\tis Hungry\n", Num);
                };    
    private void eating(){
        System.out.format("Philosopher\t%d\tis Eating\n", Num);
        try {Thread.sleep(500);
        } catch (InterruptedException e) {}
    }
    private void thinking(){
        System.out.format("Philosopher\t%d\tis Thinking\n", Num);
        try { Thread.sleep(500);
        } catch (InterruptedException e) {}
    }
    public void run(){
        while(true){
            thinking();
            hungry();
            Chop.take();
            eating();
            Chop.release();
        }
    }
}



