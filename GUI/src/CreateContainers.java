import java.awt.Component;
import java.awt.Window;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JWindow;


public class CreateContainers {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setTitle("First Frame");
		f.setSize(300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		JDialog d=new JDialog();
		d.setTitle("First Dialog");
		d.setSize(300, 300);
		d.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		d.setVisible(true);
		
		JWindow w=new JWindow();
		w.setSize(300, 300);
		w.setVisible(true);
		
	}

}
