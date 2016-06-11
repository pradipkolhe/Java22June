import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
public class FirstApplet extends Applet{
	@Override
	public void init() {
		System.out.println("in init()");
	}
	@Override
	public void start() {
		System.out.println("in start()");
	}
	@Override
	public void paint(Graphics g) {
		System.out.println("in paint()");
		setSize(300, 400);
		g.drawString("Hello First Applet", 100, 150);
		
		g.setColor(Color.yellow);
		g.fillOval(200, 200, 50, 100);
		g.setColor(Color.red);
		g.fillRect(50, 50, 100, 150);
		Test t=new Test();
		
		Thread t1=new Thread(t);
		t1.start();
		System.out.println(Thread.currentThread());
	}
	@Override
	public void stop() {
		System.out.println("in stop()");
	}
	@Override
	public void destroy() {
		System.out.println("in destroy()");
	}
}

class Test extends Applet implements Runnable{
	@Override
	public void run() {
		paint(getGraphics());
	}
	@Override
	public void paint(Graphics g) {
		g.drawString("Second Applet", 50, 50);
	}
}