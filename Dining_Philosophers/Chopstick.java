/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
///
package Dining_Philosophers;

class Chopstick{
    private boolean[] taking= new boolean[DiningTest.K];
    
    Chopstick()
    {
        for(int i=0;i<DiningTest.K;i++)
        {
            taking[i]=false;
        }
    }
    public synchronized void release(){
	Philosopher phi=(Philosopher) Thread.currentThread();
	int Num=phi.Num;
	System.out.format("Philosopher\t%d\treleases Chopstick\n", Num);
	taking[Num]=false;
	taking[((Num+1)%DiningTest.K)]=false;
	notifyAll();
    }
    public synchronized void take(){
	Philosopher phi=(Philosopher) Thread.currentThread();
	int Num=phi.Num;
	while(taking[((Num+1)%DiningTest.K)] || taking[Num]){
            try {wait();} catch (InterruptedException e){}
        }
        System.out.format("Philosopher\t%d\ttakes Chopstick\n", Num);
        taking[Num]=true;
        taking[((Num+1)%DiningTest.K)]=true;
    }
}
