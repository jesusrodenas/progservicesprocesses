/**
 * 
 */
package pps.u02.multithreading;

/**
 * @author JESÚS
 *
 */
public class Example01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Example01Thread ex01th1 = new Example01Thread(1);
		Example01Thread ex01th2 = new Example01Thread(2);
		Example01Thread ex01th3 = new Example01Thread(3);
		Example01Thread ex01th4 = new Example01Thread(4);
		
		System.out.println("Before creation of threads...");
		
		ex01th1.start();
		ex01th2.start();
		ex01th3.start();
		ex01th4.start();
		
		System.out.println("After creation of threads...");
	}
}