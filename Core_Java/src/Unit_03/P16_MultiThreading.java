package Unit_03;
import java.util.Scanner;

/*
 *  - Prerequisites :
 *       Multiprocessing -:   
 *      1-: Sequential multiprocessing {no user involvement}  
 *      2-: Parallel multiprocessing  (best but not easily achievable,user involvement for purchasing cores only)
 *      3-: concurrent multiprocessing
 *     
 *     Multitasking -:
 *     1-: Sequential multitasking
 *     2-:Parallel multitasking  (Not possible or not feasible)
 *     3-: Concurrent multitasking(70% important) (switch based,no role of OS and User)
 *     
 *  
 */

public class P16_MultiThreading {

	public static void main(String[] args) {
//		c1 obj1=new c1();
//		c2 obj2=new c2();
//		obj1.show1();
//		obj2.show2();
		
		//Abc7 obj = new Abc7();
//		obj.threadConcept();
//		obj.threadSynchronization();
//		obj.ProducerConsumerProblems();
//		obj.Wait_And_Notify();
		
		Thread t1=new Thread(new T1(),"T1");
		Thread t2=new Thread(new T2(),"T2");
		Thread t3=new Thread(new T3(),"T3");
		t1.start();
		t2.start();
		t3.start();

	}

}
class T1 extends Thread
{
	public void run() {    //this run() already exist in thread class
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(a);
		
	}
}
class T3 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hello");
		}
	}
}
 
 class c1
 {
 	void show1() {
 		Scanner sc= new Scanner(System.in);
 		int a=sc.nextInt();
 		System.out.println(a);
 		
 	}
 }
 class c2{
		void show2() {
			for(int i=0;i<10;i++) {
				System.out.println("Hello guyzz");
			}
		}
	}
 class T2 extends Thread{
		public void run() {
			for(int i=0;i<10;i++) {
				System.out.println("Hello guyzz");
			}
		}
	}