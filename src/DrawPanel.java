import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DrawPanel extends JPanel {
    BufferedImage [] step = new BufferedImage[4];
    TexturePaint [] texStep = new TexturePaint[4];
    
    public DrawPanel() {
        loadImages();
    }

    private void loadImages() {
        try {
        	step[0] = ImageIO.read(this.getClass().getResource("stepImages/step 1.png"));
        	step[1] = ImageIO.read(this.getClass().getResource("stepImages/step 2.png"));
//        	step[2] = ImageIO.read(this.getClass().getResource("stepImages/step 3.png"));
//        	step[3] = ImageIO.read(this.getClass().getResource("stepImages/step 4.png"));
//        	
        } catch (IOException ex) {
        	System.out.println("Error loading some images...");
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }
//    
//    public void paintComponent(Graphics g, int stepID) {
//    	super.paintComponent(g);
//        draw(g, stepID);
//    }

    private void draw(Graphics g) {
    	int stepID = 0;
        Graphics2D g2d = (Graphics2D) g;

        TexturePaint texp = new TexturePaint(step[stepID], new Rectangle(0, 0, 960, 720));
 
        g2d.setPaint(texp);
        g2d.fillRect(0, 0, 960, 720);

    }
}
