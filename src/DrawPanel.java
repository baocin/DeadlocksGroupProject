/*
 * Name: Michael Pedersen
 * Group: 7
 * Date: 10/27/15
 */

import java.awt.Graphics;
import java.awt.Panel;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/*
 * This class setups the inner panel of the UI that handles image switching.
 */
public class DrawPanel extends Panel {
    static BufferedImage [] step = new BufferedImage[4];
    int stepID = 0;
    final int numImages = 3;
    
    //Constructor
    public DrawPanel() {
        loadImages();
    }

    //Load all images from the disk on program load
    private void loadImages() {
        try {
        	step[0] = ImageIO.read(this.getClass().getResource("stepImages/step 1.png"));
        	step[1] = ImageIO.read(this.getClass().getResource("stepImages/step 2.png"));
        	step[2] = ImageIO.read(this.getClass().getResource("stepImages/step 3.png"));
        } catch (IOException ex) {
        	System.out.println("Error loading some images...");
        }
    }
    
    //Base function to paint the images on the panel
    public void paint(Graphics g) {
//    	super.paintComponents(g);
		g.drawImage(step[stepID], 0, 0, null);
	}
    
    //clear the panel so the images don't overlap on painting
    public void clear(Graphics g){
    	g.clearRect(0,0,UI.screenWidth, UI.screenHeight);
    }
    
}
