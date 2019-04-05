package interfaz;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Mainventana extends JFrame implements ActionListener{
	public Mainventana() {
		setSize(600, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		
		
		ImageIcon vent = new ImageIcon("src/interfaz/images/ventana.png");
		ImageIcon icono = new ImageIcon("src/interfaz/images/Icono.png");
		setIconImage(icono.getImage());
		System.out.println("hola");
		
		JLabel ventana = new JLabel(vent);
		ventana.setBounds(0, 0, 600,600);
		add(ventana);
		
		
		setVisible(true);

		JButton butt = new JButton();
		butt.setText("Play");
        butt.setBounds(0, 600, 120, 70);
        add(butt);
        
        
        butt.addActionListener(this);}
        
        public void actionPerformed(ActionEvent e) {
                this.setVisible(false);
                new Tablero().setVisible(true); // Main Form to show after the Login Form..
            }
       
	
	
	public static void main(String args[]) {
		new Mainventana();
	}

}
