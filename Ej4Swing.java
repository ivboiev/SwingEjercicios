import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ej4Swing extends JFrame implements ActionListener {
	JButton btnMostrar;
	JLabel lblNum1, lblNum2, lblNum3, lblResultado;
	
	Ej4Swing(){
		setLayout(new FlowLayout());
		
		btnMostrar = new JButton("Mostrar");
		lblNum1 = new JLabel();
		lblNum2 = new JLabel();
		lblNum3 = new JLabel();
		lblResultado = new JLabel();
		
		add(btnMostrar);
		add(lblNum1);
		add(lblNum2);
		add(lblNum3);
		add(lblResultado);
		
		setTitle("num");
		setSize(800,600);
		setVisible(true);
		btnMostrar.addActionListener(this);
	}
 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		int num1 = (int)Math.floor(Math.random()*10);
		int num2 = (int)Math.floor(Math.random()*10);
		int num3 = (int)Math.floor(Math.random()*10);
		 
 	    lblNum1.setText(String.valueOf(num1));
 	    lblNum2.setText(String.valueOf(num2));
 	    lblNum3.setText(String.valueOf(num3));
    
if(lblNum1.getText().equals(lblNum2.getText())&&lblNum1.getText().equals(lblNum3.getText())&&lblNum2.getText().equals(lblNum3.getText())){ 
	JOptionPane.showMessageDialog(this, "Los tres valores son iguales");
    }
else if(lblNum1.getText().equals(lblNum2.getText())||lblNum1.getText().equals(lblNum3.getText())||lblNum2.getText().equals(lblNum3.getText())){
	JOptionPane.showMessageDialog(this, "Hay dos valores iguales");
}
else {
	JOptionPane.showMessageDialog(this, "Los tres valores son diferentes");
}
	//imgicon img1 = NEW iMAGiCON(E;///)




	
 	//  (lblNum1.getText().equals(lblNum2.getText()) || lblNum1.getText().equals(lblNum3.getText()))
	}

	public static void main(String[] args) {
		Ej4Swing numeros = new Ej4Swing();
	}

}
