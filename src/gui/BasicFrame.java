package gui;

import javax.swing.JFrame;

public class BasicFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Das erste Fenster");  // erstelle neues Fenster mit dem Titel "Das erste Fenster"
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // beende das Programm, wenn das Fenster geschlossen wird
		frame.setSize(500, 300);  // setze die Größe auf 500 Pixel breit und 300 Pixel hoch
		frame.setVisible(true);  // zeige das Fenster an
	}

}
