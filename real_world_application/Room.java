/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
///////
package Real_World_Application;

/**
 *
 * @author Lenovo Ideapad L340
 */
public class Room {
    private boolean[] taking=new boolean[real_World_Application.K];
    Room()
    {
        for(int i=0;i<real_World_Application.K;i++)
        {
            taking[i]=false;
        }
    }
    public synchronized void leave(){
	Customer cust=(Customer) Thread.currentThread();
	int Num=cust.Num;
	System.out.format("Customer\t%d\tleaves the room\n", Num);
	taking[Num]=false;
	taking[((Num+1)%real_World_Application.K)]=false;
	notifyAll();
    }
    public synchronized void book(){
	Customer cust=(Customer) Thread.currentThread();
	int Num=cust.Num;
	while(taking[((Num+1)%real_World_Application.K)] || taking[Num]){
            try {wait();} catch (InterruptedException e){}
        }
        System.out.format("Customer\t%d\tbook a room\n", Num);
        taking[Num]=true;
        taking[((Num+1)%real_World_Application.K)]=true;
    }
}

