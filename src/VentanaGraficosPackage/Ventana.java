package VentanaGraficosPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {
	JPanel jpanel = (JPanel) this.getContentPane();

	JLabel labelPROFUNDIDAD = new JLabel();
	JLabel labelANCHO = new JLabel();
	JLabel labelALTO = new JLabel();
	JLabel labelDENSIDADCARTON = new JLabel();

	JTextField jtextPROFUNDIDAD = new JTextField();
	JTextField jtextfieldANCHO = new JTextField();
	JTextField jtextfieldALTO = new JTextField();
	JTextField jtextfieldDENSIDADCARTON = new JTextField();

	JButton jbuttonOK = new JButton("OK");
	JButton jbuttonLimpiar = new JButton("Limpiar");

	VentanaCaja caja;
	VentanaTapaCajaTorta cajaTorta;
	VentanaGabeta gabeta;

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		int height = pantalla.height;
		int width = pantalla.width;
		setSize(width / 2, height / 2);

		setLocationRelativeTo(null);

		jpanel.setLayout(null);
		jpanel.setBackground(Color.pink);

		labelPROFUNDIDAD.setBounds(new Rectangle(25, 15, 150, 21));
		labelPROFUNDIDAD.setText("PROFUNDIDAD:");
		labelPROFUNDIDAD.setHorizontalAlignment(JTextField.LEFT);
		labelPROFUNDIDAD.setForeground(Color.black);

		labelANCHO.setBounds(new Rectangle(25, 45, 150, 21));
		labelANCHO.setText("ANCHO:");
		labelANCHO.setHorizontalAlignment(JTextField.LEFT);
		labelANCHO.setForeground(Color.black);

		labelALTO.setBounds(new Rectangle(25, 75, 150, 21));
		labelALTO.setText("ALTO:");
		labelALTO.setHorizontalAlignment(JTextField.LEFT);
		labelALTO.setForeground(Color.black);

		labelDENSIDADCARTON.setBounds(new Rectangle(25, 105, 150, 21));
		labelDENSIDADCARTON.setText("DENSIDAD CARTON (mm):");
		labelDENSIDADCARTON.setHorizontalAlignment(JTextField.LEFT);
		labelDENSIDADCARTON.setForeground(Color.black);

		jtextPROFUNDIDAD.setBounds(new Rectangle(195, 15, 150, 21));
		jtextPROFUNDIDAD.setText("");
		jtextPROFUNDIDAD.setEditable(true);
		jtextPROFUNDIDAD.setHorizontalAlignment(JTextField.LEFT);

		jtextfieldANCHO.setBounds(new Rectangle(195, 45, 150, 21));
		jtextfieldANCHO.setText("");
		jtextfieldANCHO.setEditable(true);
		jtextfieldANCHO.setHorizontalAlignment(JTextField.LEFT);

		jtextfieldALTO.setBounds(new Rectangle(195, 75, 150, 21));
		jtextfieldALTO.setText("");
		jtextfieldALTO.setEditable(true);
		jtextfieldALTO.setHorizontalAlignment(JTextField.LEFT);

		jtextfieldDENSIDADCARTON.setBounds(new Rectangle(195, 105, 150, 21));
		jtextfieldDENSIDADCARTON.setText("");
		jtextfieldDENSIDADCARTON.setEditable(true);
		jtextfieldDENSIDADCARTON.setHorizontalAlignment(JTextField.LEFT);

		jbuttonOK.setBounds(new Rectangle(25, 155, 70, 21));
		jbuttonOK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				double profundidad = Double.parseDouble(jtextPROFUNDIDAD.getText());
				double ancho = Double.parseDouble(jtextfieldANCHO.getText());
				double alto = Double.parseDouble(jtextfieldALTO.getText());
				double densidad = Double.parseDouble(jtextfieldDENSIDADCARTON.getText());

				caja = new VentanaCaja(ancho, alto, profundidad, densidad);
				caja.setVisible(true);
				gabeta = new VentanaGabeta(ancho, alto, profundidad, densidad);
				gabeta.setVisible(true);
				cajaTorta = new VentanaTapaCajaTorta(ancho, alto, profundidad, densidad);
				gabeta.setVisible(true);
			}

		});
		jbuttonLimpiar.setBounds(new Rectangle(105, 155, 80, 21));
		jbuttonLimpiar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				jtextPROFUNDIDAD.setText("");
				jtextfieldALTO.setText("");
				jtextfieldANCHO.setText("");
				jtextfieldDENSIDADCARTON.setText("");
				caja.setVisible(false);
				caja.dispose();
				cajaTorta.setVisible(false);
				cajaTorta.dispose();
				gabeta.setVisible(false);
				gabeta.dispose();
			}

		});

		jpanel.add(jtextPROFUNDIDAD, null);
		jpanel.add(jtextfieldANCHO, null);
		jpanel.add(jtextfieldALTO, null);
		jpanel.add(jtextfieldDENSIDADCARTON, null);
		jpanel.add(labelPROFUNDIDAD, null);
		jpanel.add(labelALTO, null);
		jpanel.add(labelANCHO, null);
		jpanel.add(labelDENSIDADCARTON, null);
		jpanel.add(jbuttonOK, null);
		jpanel.add(jbuttonLimpiar, null);

		setSize(500, 250);
		setTitle("CalcuBox");
		setVisible(true);
		setResizable(false);
	}
}
