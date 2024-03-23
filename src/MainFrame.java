import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	private JPanel canvas;
	
	public MainFrame() {
		setTitle("Super Mario Bros");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                
                													
                Ground ground = new Ground(50, 520, 800, 80);
                ground.draw(g2d);
                
                // Crear e instanciar las figuras
                Platform p1 = new Platform(320, 320, 110, 200, new Color(37,144,222));
                Platform p2 = new Platform(240, 400, 120, 120, new Color(240, 148, 105));
                Platform p3 = new Platform(680, 400, 125, 120, new Color(39, 123, 46));
                Pipe pipe = new Pipe(530, 400, 80, 120, new Color(25, 136, 16));
                Block obstacle = new Block(50, 352, 40, 40, new Color(254, 144, 99));
                Block obstacle2 = new Block(195, 230, 40, 40, new Color(254, 144, 99));
                Block obstacle3 = new Block(235, 230, 40, 40, new Color(254, 144, 99));
                Block obstacle4 = new Block(720, 260, 40, 40, new Color(254, 144, 99));
                
                
                // Dibujar las figuras
                p1.draw(g2d);
                p2.draw(g2d);
                p3.draw(g2d);
                pipe.draw(g2d);
                obstacle.draw(g2d);
                obstacle2.draw(g2d);
                obstacle3.draw(g2d);
                obstacle4.draw(g2d);
                
                Toolkit toolkit = Toolkit.getDefaultToolkit();

                Dimension screenSize = toolkit.getScreenSize();
       		 
       		 	int screenWidth = screenSize.width;
       		 	int screenHeight = screenSize.height;
                
                g2d.setColor(new Color(33,33,33));
    	    	g2d.setStroke(new BasicStroke(3));
    	    	g2d.drawRect(0, 600, screenWidth, 20);
                g2d.setColor(new Color(251,198,182));
                g2d.fillRect(0, 600, screenWidth, 20);
             
            }
        };

        canvas.setBackground(new Color(179,238,254));
        add(canvas);
    }
  }
