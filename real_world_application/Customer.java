/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
////
package Real_World_Application;


public class Customer extends Thread {
    int Num;
    static int Number=0;
    private Room room;
    public Customer(Room room){
	super();
	this.room=room;
        Num=Number;
	Number++;
    }

    private void in(){
        System.out.format("Customer\t%d\tin the room\n", Num);
        try {Thread.sleep(500);
        } catch (InterruptedException e) {}
    }
    
    private void out(){
        System.out.format("Customer\t%d\tout of the room\n", Num);
        try { Thread.sleep(500);
        } catch (InterruptedException e) {}
    }
    public void run(){
        while(true){
            out();
            room.book();
            in();
            room.leave();
        }
    }
}

