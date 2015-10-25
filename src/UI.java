import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class UI extends JFrame {
	BufferedImage [] step = new BufferedImage[4];
	
	public UI() {
        initUI();
    }

	
    private void initUI() {
    	DrawPanel dpnl = new DrawPanel();
        add(dpnl);
        
        setTitle("Deadlock Example");
        setSize(960, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){   	
    	SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            	UI ex = new UI();
                ex.setVisible(true);
            }
        });
    }
}
