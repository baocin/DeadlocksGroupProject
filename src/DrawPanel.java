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
    static int stepID = 0;
    
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
    
    private void loadTextures(){
    	texStep[0] = new TexturePaint(step[0], new Rectangle(0, 0, 960, 720));
    	texStep[1] = new TexturePaint(step[1], new Rectangle(0, 0, 960, 720));
    	texStep[2] = new TexturePaint(step[2], new Rectangle(0, 0, 960, 720));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void drawStep(int stepID){
    	this.stepID = stepID;
    }
    
    private void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(texStep[stepID]);
    	g2d.fillRect(0, 0, 960, 720);
    	
//        for (TexturePaint tp : texStep){
//        	g2d.setPaint(tp);
//        	g2d.fillRect(0, 0, 960, 720);
//        }
    }
}
