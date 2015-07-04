package tetris;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class Tetris {
    
    
    
    protected static final Color[] COLORS = {Color.black, Color.yellow, 
        Color.blue, Color.green, Color.orange, Color.magenta, Color.pink};

    public static void main(String[] args) {
        
        System.out.println("Start!");
        Model model = new Model();

        final Controller controller = new Controller();
        model.addListener(controller);
        
        View view = new View();

        controller.setView(view);
        controller.setModel(model);
        
        // JFrame
        JFrame frame = new JFrame("Tetris");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 700));

        frame.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    controller.moveLeft();
                    break;
                case KeyEvent.VK_RIGHT:
                    controller.moveRight();
                    break;
                case KeyEvent.VK_DOWN:
                    controller.dropDown();
                    break;
                default:
                    break;
                }
            }
        });
        
        Thread thread = new Thread(new Runnable() {
            
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    controller.moveDown();
                }
            }
        });
        thread.start();
        
        
        frame.add(panel);

        frame.pack();
        
        frame.setVisible(true);

        final Graphics2D graphics = (Graphics2D) panel.getGraphics();
        
        view.setGraphics(new Graphics() {
            
            @Override
            public void fillRect(int x, int y, int width, int height, int colorIndex) {
                graphics.setColor(COLORS[colorIndex]);
                graphics.fillRect(x, y, width, height);
                //graphics.setColor(Color.red);
                //graphics.drawRect(x, y, width, height);
            }
        });
        
        
    }

}
