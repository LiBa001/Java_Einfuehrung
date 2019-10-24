package gui;

import java.awt.Container;
import java.awt.Label;

import javax.swing.JFrame;

public class FrameWithContent {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Fenster mit Inhalt");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = frame.getContentPane();
		Label label = new Label("Das ist der Inhalt!");  // erstellt neues Label
		contentPane.add(label);  // fügt das Label zur contentPane und somit zum frame hinzu

		frame.pack();  // passt Größe an Inhalt an (alternativ zu setSize)
		frame.setVisible(true);
	}

}
