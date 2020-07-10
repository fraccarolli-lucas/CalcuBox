package VentanaGraficosPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaGabeta extends JFrame {

	JPanel jpanel = (JPanel) this.getContentPane();

	JLabel labelBASE = new JLabel();
	JLabel labelBASETAPA = new JLabel();
	JLabel labelLOMO = new JLabel();
	JLabel labelLATERALES = new JLabel();

	JTextField textBASE1 = new JTextField();
	JTextField textBASE2 = new JTextField();
	JTextField textBASETAPA1 = new JTextField();
	JTextField textBASETAPA2 = new JTextField();
	JTextField textLOMO1 = new JTextField();
	JTextField textLOMO2 = new JTextField();
	JTextField textLATERALES1 = new JTextField();
	JTextField textLATERALES2 = new JTextField();

	JLabel labelX1 = new JLabel();
	JLabel labelX2 = new JLabel();
	JLabel labelX3 = new JLabel();
	JLabel labelX4 = new JLabel();

	public static double ancho;
	public static double alto;
	public static double profundidad;
	public static double densidadCarton;

	public VentanaGabeta(double ancho, double alto, double profundidad, double dc) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(500, 200);
		setTitle("Calcubox: Gabeta");
		setVisible(true);
		setResizable(false);

		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		int height = pantalla.height;
		int width = pantalla.width;

		setLocation(height + 100, width / 4 - 10);

		jpanel.setLayout(null);
		jpanel.setBackground(new Color(187, 243, 229));

		this.ancho = ancho;
		this.alto = alto;
		this.profundidad = profundidad;
		this.densidadCarton = dc / 10;

		// -------------------------------BASE---------------------------------------//

		labelBASE.setBounds(new Rectangle(25, 15, 150, 21));
		labelBASE.setText("BASE:");
		labelBASE.setHorizontalAlignment(JTextField.LEFT);
		labelBASE.setForeground(Color.black);

		double baseR1 = ancho + 0.6;
		textBASE1.setBounds(new Rectangle(195, 15, 100, 21));
		textBASE1.setText(String.valueOf(baseR1));
		textBASE1.setEditable(false);
		textBASE1.setHorizontalAlignment(JTextField.LEFT);

		labelX1.setBounds(new Rectangle(320, 15, 150, 21));
		labelX1.setText("X");
		labelX1.setHorizontalAlignment(JTextField.LEFT);
		labelX1.setForeground(Color.black);

		double baseR2 = profundidad + 0.5;
		textBASE2.setBounds(new Rectangle(350, 15, 100, 21));
		textBASE2.setText(String.valueOf(baseR2));
		textBASE2.setEditable(false);
		textBASE2.setHorizontalAlignment(JTextField.LEFT);

		// ------------------------------------------BASETAPA-----------------------------------------------//
		labelBASETAPA.setBounds(new Rectangle(25, 45, 150, 21));
		labelBASETAPA.setText("BASE TAPA:");
		labelBASETAPA.setHorizontalAlignment(JTextField.LEFT);
		labelBASETAPA.setForeground(Color.black);

		textBASETAPA1.setBounds(new Rectangle(195, 45, 100, 21));
		textBASETAPA1.setText(String.valueOf(baseR1));
		textBASETAPA1.setEditable(false);
		textBASETAPA1.setHorizontalAlignment(JTextField.LEFT);

		labelX2.setBounds(new Rectangle(320, 45, 150, 21));
		labelX2.setText("X");
		labelX2.setHorizontalAlignment(JTextField.LEFT);
		labelX2.setForeground(Color.black);

		textBASETAPA2.setBounds(new Rectangle(350, 45, 100, 21));
		textBASETAPA2.setText(String.valueOf(baseR2));
		textBASETAPA2.setEditable(false);
		textBASETAPA2.setHorizontalAlignment(JTextField.LEFT);

		// ------------------------------------------LOMO-----------------------------------------------//
		labelLOMO.setBounds(new Rectangle(25, 75, 150, 21));
		labelLOMO.setText("LOMO:");
		labelLOMO.setHorizontalAlignment(JTextField.LEFT);
		labelLOMO.setForeground(Color.black);

		textLOMO1.setBounds(new Rectangle(195, 75, 100, 21));
		textLOMO1.setText(String.valueOf(baseR1));
		textLOMO1.setEditable(false);
		textLOMO1.setHorizontalAlignment(JTextField.LEFT);

		labelX3.setBounds(new Rectangle(320, 75, 150, 21));
		labelX3.setText("X");
		labelX3.setHorizontalAlignment(JTextField.LEFT);
		labelX3.setForeground(Color.black);

		double LOMOR2 = alto + 0.5;
		textLOMO2.setBounds(new Rectangle(350, 75, 100, 21));
		textLOMO2.setText(String.valueOf(LOMOR2));
		textLOMO2.setEditable(false);
		textLOMO2.setHorizontalAlignment(JTextField.LEFT);

		// ------------------------------------------LATERALES-----------------------------------------------//

		labelLATERALES.setBounds(new Rectangle(25, 105, 150, 21));
		labelLATERALES.setText("LATERALES (x2):");
		labelLATERALES.setHorizontalAlignment(JTextField.LEFT);
		labelLATERALES.setForeground(Color.black);

		double lateralesR1 = profundidad + densidadCarton;
		textLATERALES1.setBounds(new Rectangle(195, 105, 100, 21));
		textLATERALES1.setText(String.valueOf(lateralesR1));
		textLATERALES1.setEditable(false);
		textLATERALES1.setHorizontalAlignment(JTextField.LEFT);

		labelX4.setBounds(new Rectangle(320, 105, 150, 21));
		labelX4.setText("X");
		labelX4.setHorizontalAlignment(JTextField.LEFT);
		labelX4.setForeground(Color.black);

		double lateralesR2 = alto + 0.5;
		textLATERALES2.setBounds(new Rectangle(350, 105, 100, 21));
		textLATERALES2.setText(String.valueOf(lateralesR2));
		textLATERALES2.setEditable(false);
		textLATERALES2.setHorizontalAlignment(JTextField.LEFT);

		jpanel.add(labelBASE);
		jpanel.add(textBASE1);
		jpanel.add(labelX1);
		jpanel.add(textBASE2);
		jpanel.add(labelBASETAPA);
		jpanel.add(textBASETAPA1);
		jpanel.add(labelX2);
		jpanel.add(textBASETAPA2);
		jpanel.add(labelLOMO);
		jpanel.add(textLOMO1);
		jpanel.add(labelX3);
		jpanel.add(textLOMO2);
		jpanel.add(labelLATERALES);
		jpanel.add(textLATERALES1);
		jpanel.add(labelX4);
		jpanel.add(textLATERALES2);
	}

}
