/**
 * 
 */
package pps.u02.multithreading;

import java.util.Date;

/**
 * @author JESÚS
 *
 */
public class Exercise01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exercise01Thread ex01th = new Exercise01Thread();
		System.out.println("Creating a file request: " + new Date());
		ex01th.start();
		System.out.println("File request thrown: " + new Date());		
	}
}