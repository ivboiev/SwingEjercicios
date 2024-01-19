import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Ej2Swing extends JFrame implements ActionListener {
    
	JLabel lblImagen;
    ImageIcon imgGato;
    ImageIcon imgPerro;
    ImageIcon imgSerpiente;
    ImageIcon imgTigre;
    
    JComboBox cboAnimales;
    String animales[] = {"Gato","Perro","Serpiente","Tigre"};
    
    Ej2Swing(){
    	setLayout(new FlowLayout());
    	
    	cboAnimales = new JComboBox(animales);
    	cboAnimales.addActionListener(this);
    	
    	imgGato = new ImageIcon("C:\\imagenes\\gato.jpg");
    	imgPerro = new ImageIcon("C:\\imagenes\\perro.jpg");
    	imgSerpiente = new ImageIcon("C:\\imagenes\\snake.jpg");
    	imgTigre = new ImageIcon("C:\\imagenes\\tiger.jpg");
    	
    	lblImagen = new JLabel();
    	
    	
    	add(cboAnimales);
    	add(lblImagen);  
    	
    	setTitle("Imágenes animales");
		setSize(800,600);
		setVisible(true);
    	
    }
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this,"Seleccionado: " + cboAnimales.getSelectedItem());
		
		if(cboAnimales.getSelectedItem()=="Gato") {	
			lblImagen.setIcon(imgGato);
		}
		else if(cboAnimales.getSelectedItem()=="Perro") {
			lblImagen.setIcon(imgPerro);
		}
		else if(cboAnimales.getSelectedItem()=="Serpiente") {
			lblImagen.setIcon(imgSerpiente);
		}
		else if(cboAnimales.getSelectedItem()=="Tigre") {
			lblImagen.setIcon(imgTigre);
		}
			

	}

	public static void main(String[] args) {
		Ej2Swing animal = new Ej2Swing();

	}

}
