import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyControl implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Current stepid: " + UI.panel.stepID);
		if(e.getKeyCode() == e.VK_LEFT){
			UI.changeStep(UI.panel.stepID-1);
		}else if (e.getKeyCode() == e.VK_RIGHT){
			UI.changeStep(UI.panel.stepID+1);
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}

}
