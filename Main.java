import java.awt.*;
import java.awt.event.*;

public class Main extends Frame {
	public static void main(String[] args) {
		new Main();
	}

	Main() {
		super("Modo de mapeamento anisotrópico");
		addWindowListener(new WindowAdapter()

		{
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(400, 300);
		add("Center", new CvAnisotr());
		setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		show();
	}
}