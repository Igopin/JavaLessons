package lesson150331.linked_list.anonymous;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.Transient;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UIExample {

	static class ButtonClickProcessor implements ActionListener {

		@Override
        public void actionPerformed(ActionEvent e) {
			System.out.println("OHH! FUCK YOU!");
        }
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("SHIT");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(640, 480);

//		JButton button = new JButton("DON'T TOUCH!");
//		
//		button.addActionListener(new ButtonClickProcessor());
//		button.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("I KILL YOU!");
//			}
//		});
		
		frame.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("realased" + e);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("pressed");
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("exited");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("entered");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("clicked");
			}
		});
		
//		frame.add(button);
		frame.setVisible(true);

    }
}
