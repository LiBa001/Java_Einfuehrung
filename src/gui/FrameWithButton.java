package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameWithButton extends JFrame implements ActionListener {
	// Diese Klasse "erbt" von der Klasse 'JFrame' bzw. erweitert sie
	// und implementiert die Methode 'actionPerformed' des Interface 'ActionListener'
	
	JLabel label;  // deklariere Klassenvariablen 'label', 'button' und 'panel'
	JButton button;
	JPanel panel;

	public FrameWithButton() {
		// Das ist der Konstruktor.
		// Er wird aufgerufen, wenn eine Instanz der Methode erstellt wird
		
		this.setTitle("Fenster mit Inhalt");  // setzt Titel
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // beende Programm beim Schließen des Fensters
		
		panel = new JPanel();  // erstellt neues Panel
		
		label = new JLabel();  // erstellt neues Label ohne Inhalt
		panel.add(label);  // fügt Label zum Panel hinzu
		
		button = new JButton("Marco?");  // erstellt neuen Button
		panel.add(button);  // fügt Button zum Panel hinzu
		
		button.addActionListener(this);  // fügt sich selbst als ActionListener zum button hinzu
		
		this.add(panel);  // fügt panel zum Fenster hinzu
		this.setSize(400, 200);  // setzt Größe auf 400 Pixel breit und 200 Pixel hoch;
	}
	
	public static void main(String[] args) {
		FrameWithButton frame = new FrameWithButton();  // erstellt Instanz der eigenen Klasse
		frame.setVisible(true);  // setzt Fenster auf sichtbar
	}

	public void actionPerformed(ActionEvent e) {
		// Diese Methode wird aufgerufen, wenn ein Event für den Button ausgelöst wird
		
		label.setText("Polo!");  // setzt Text des (noch leeren) Labels
	}

}
