/*
 * Name: Michael Pedersen
 * Group: 7
 * Date: 10/27/15
 */

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyControl implements KeyListener {

	//Monitor key presses on the left and right arrow keys, changing the image accordingly
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == e.VK_LEFT){
			UI.changeStep(UI.panel.stepID-1);
		}else if (e.getKeyCode() == e.VK_RIGHT){
			UI.changeStep(UI.panel.stepID+1);
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		//nothing
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		//nothing
	}

}
