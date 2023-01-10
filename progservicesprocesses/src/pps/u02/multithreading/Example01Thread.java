/**
 * 
 */
package pps.u02.multithreading;

/**
 * @author JESÚS
 *
 */
public class Example01Thread extends Thread {
	private int counter;
	private int threadNumber;
	
	/**
	 * Creating a Thread with an identifier
	 * @param threadNumber
	 */
	public Example01Thread(int threadNumber) {
		super();
		this.threadNumber = threadNumber;
	}



	@Override
	/**
	 * Writing the thread's identifier and its counter value.
	 */
	public void run() {
		counter = 1;
		while (counter<=5) {
			System.out.println(
					"Thread " + this.threadNumber + ", Counter: " + this.counter);
			counter++;
		}
		
	}
}