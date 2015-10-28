import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DrawPanel extends Panel {
    static BufferedImage [] step = new BufferedImage[4];
    int stepID = 0;
    final int numImages = 3;
    
    public DrawPanel() {
        loadImages();
    }

    private void loadImages() {
        try {
        	step[0] = ImageIO.read(this.getClass().getResource("stepImages/step 1.png"));
        	step[1] = ImageIO.read(this.getClass().getResource("stepImages/step 2.png"));
        	step[2] = ImageIO.read(this.getClass().getResource("stepImages/step 3.png"));
        } catch (IOException ex) {
        	System.out.println("Error loading some images...");
        }
    }
    
    public void paint(Graphics g) {
    	super.paintComponents(g);
		g.drawImage(step[stepID], 0, 0, null);
	}
    
    public void clear(Graphics g){
    	g.clearRect(0,0,UI.screenWidth, UI.screenHeight);
    }
    
}
