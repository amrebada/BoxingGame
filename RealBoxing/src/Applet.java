import javax.swing.JFrame;

public class Applet extends JFrame {
	public Applet() {
		setSize(1000, 700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		Draw draw = new Draw();
		draw.addKeyListener(draw);
		draw.setFocusable(true);
		draw.setBounds(0, 0, getWidth(), getHeight());
		add(draw);
	}

	public static void main(String[] args) {
		Applet applet = new Applet();
	}

}
