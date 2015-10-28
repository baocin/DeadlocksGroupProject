/*
 * Name: Michael Pedersen
 * Group: 7
 * Date: 10/27/15
 */

/*
 * Start of program execution
 */
public class Driver {
	static Process a, b;
	static Resource A, B;
	static int stepDelay = 4000; 	//4 seconds
	
	public static void main(String[] args) throws InterruptedException {
		UI.start();
		
		//Setting everything up
		a = new Process();
		b = new Process();
		A = new Resource();
		A.name = "Printer";
		B = new Resource();
		B.name = "Hard Drive";
		
		//Each process reserves one of the two available resources
		a.reserveResource(A);
		b.reserveResource(B);
		UI.changeStep(0);
        Thread.sleep(stepDelay);		//Sleep
		
        //Each process tries to reserve the resource each is missing
		a.reserveResource(B);
		b.reserveResource(A);
		UI.changeStep(1);
        Thread.sleep(stepDelay);		//Sleep
        
        UI.changeStep(2);
		
		
		
	}
	

}
