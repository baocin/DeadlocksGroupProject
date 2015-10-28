import javax.swing.JFrame;

/*
 * This class initiates the ui and configures variables like window size and title.
 */
public class UI extends JFrame {
	public static DrawPanel panel;
	public static KeyControl keyControl;
	public static int screenHeight = 720;
	public static int screenWidth = 960;
	
	public static void start() throws InterruptedException {
		JFrame frame = new JFrame("Deadlocks Presentation");
		panel = new DrawPanel();
		keyControl = new KeyControl();
		frame.getContentPane().add(panel);
		frame.setSize(screenWidth, screenHeight);
		frame.setVisible(true);
		frame.addKeyListener(keyControl);
	}
		
	
    public static void redraw(){
    	panel.clear(panel.getGraphics());
		panel.paintAll(panel.getGraphics());
		System.out.println("Redrew window");
	}
    
    public static void changeStep(int stepID){
    	if (stepID < 0)
    		panel.stepID = 2;
    	else if (stepID >= 3)
    		panel.stepID = 0;
    	else
    		panel.stepID = stepID;
    	redraw();
    }
}
