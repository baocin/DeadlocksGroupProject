public class Driver {
	static Process a, b;
	static Resource x, y;
	
	public static void main(String[] args) throws InterruptedException {
		UI.start();
		
		a = new Process();
		b = new Process();
		x = new Resource();
		y = new Resource();
		
		a.reserveResource(x);
		b.reserveResource(y);
		UI.changeStep(0);
		
		a.reserveResource(y);
		b.reserveResource(x);
		UI.changeStep(1);
		
		
		UI.changeStep(2);
		
		
	}
	

}
