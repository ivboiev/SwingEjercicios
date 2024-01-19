import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ej1Swing extends JFrame implements ActionListener {

	JTextField txtNombre;
	JPasswordField pwdContras;
	JButton btnEntrar;
	JLabel lblResultado;
	
	Ej1Swing(){
		setLayout(new GridLayout(4,1));
		
		txtNombre = new JTextField("Nombre");
		pwdContras = new JPasswordField("Contaseña");
		btnEntrar = new JButton("Entrar");
		lblResultado = new JLabel();
		
		add(txtNombre);
		add(pwdContras);
		add(btnEntrar);
		add(lblResultado);
		
		btnEntrar.addActionListener(this);
		
		setTitle("Entrada");
		setSize(200,200);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnEntrar) {
			if(txtNombre.getText().equals("admin") && pwdContras.getText().equals("admin1234")) {
			
			lblResultado.setText("La contraseña es correcta");
			}
			else {
				lblResultado.setText("La contraseña no es correcta");
			}
			}
		}
			
			//  if(JTextField = "admin" && JPasswordField = "admin1234") {
			   
		  // }
		//}
			
		//double cant = Double.parseDouble(txtCantidad.getText());

	

	public static void main(String[] args) {
		Ej1Swing entrada = new Ej1Swing();

	}

}
