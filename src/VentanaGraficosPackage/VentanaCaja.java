package VentanaGraficosPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaCaja extends JFrame {

	JPanel jpanel = (JPanel) this.getContentPane();

	JLabel labelBASECAJA = new JLabel();
	JLabel labelLATERALMENOR = new JLabel();
	JLabel labelLATERALMAYOR = new JLabel();
	JLabel labelTAPA = new JLabel();
	JLabel labelBASETAPA = new JLabel();
	JLabel labelLOMO = new JLabel();
	JLabel labelTRAMPA = new JLabel();

	JTextField textBASECAJA1 = new JTextField();
	JTextField textBASECAJA2 = new JTextField();
	JTextField textLATERALMENOR1 = new JTextField();
	JTextField textLATERALMENOR2 = new JTextField();
	JTextField textLATERALMAYOR1 = new JTextField();
	JTextField textLATERALMAYOR2 = new JTextField();
	JTextField textTAPA1 = new JTextField();
	JTextField textTAPA2 = new JTextField();
	JTextField textBASETAPA1 = new JTextField();
	JTextField textBASETAPA2 = new JTextField();
	JTextField textLOMO1 = new JTextField();
	JTextField textLOMO2 = new JTextField();
	JTextField textTRAMPA1 = new JTextField();
	JTextField textTRAMPA2 = new JTextField();

	JLabel labelX1 = new JLabel();
	JLabel labelX2 = new JLabel();
	JLabel labelX3 = new JLabel();
	JLabel labelX4 = new JLabel();
	JLabel labelX5 = new JLabel();
	JLabel labelX6 = new JLabel();
	JLabel labelX7 = new JLabel();

	public static double ancho;
	public static double alto;
	public static double profundidad;
	public static double densidadCarton;

	public VentanaCaja(double ancho, double alto, double profundidad, double dc) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(500, 250);
		setTitle("CalcuBox: Caja");
		setVisible(true);
		setResizable(false);

		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		int height = pantalla.height;
		int width = pantalla.width;

		setLocation(height + 100, width / 21);

		jpanel.setLayout(null);
		jpanel.setBackground(new Color(194, 170, 232));

		this.ancho = ancho;
		this.alto = alto;
		this.profundidad = profundidad;
		this.densidadCarton = dc / 10;

		// ------------------------------------------BASECAJA-----------------------------------------------//

		labelBASECAJA.setBounds(new Rectangle(25, 15, 150, 21));
		labelBASECAJA.setText("BASE CAJA:");
		labelBASECAJA.setHorizontalAlignment(JTextField.LEFT);
		labelBASECAJA.setForeground(Color.black);

		textBASECAJA1.setBounds(new Rectangle(195, 15, 100, 21));
		textBASECAJA1.setText(String.valueOf(profundidad));
		textBASECAJA1.setEditable(false);
		textBASECAJA1.setHorizontalAlignment(JTextField.LEFT);

		labelX1.setBounds(new Rectangle(320, 15, 150, 21));
		labelX1.setText("X");
		labelX1.setHorizontalAlignment(JTextField.LEFT);
		labelX1.setForeground(Color.black);

		textBASECAJA2.setBounds(new Rectangle(350, 15, 100, 21));
		textBASECAJA2.setText(String.valueOf(ancho));
		textBASECAJA2.setEditable(false);
		textBASECAJA2.setHorizontalAlignment(JTextField.LEFT);

		// ------------------------------------------LATERALMENOR-----------------------------------------------//
		labelLATERALMENOR.setBounds(new Rectangle(25, 45, 150, 21));
		labelLATERALMENOR.setText("LATERAL MENOR:");
		labelLATERALMENOR.setHorizontalAlignment(JTextField.LEFT);
		labelLATERALMENOR.setForeground(Color.black);

		double lateralMenor1 = profundidad - (densidadCarton * 2);
		textLATERALMENOR1.setBounds(new Rectangle(195, 45, 100, 21));
		textLATERALMENOR1.setText(String.valueOf(lateralMenor1));
		textLATERALMENOR1.setEditable(false);
		textLATERALMENOR1.setHorizontalAlignment(JTextField.LEFT);

		labelX2.setBounds(new Rectangle(320, 45, 150, 21));
		labelX2.setText("X");
		labelX2.setHorizontalAlignment(JTextField.LEFT);
		labelX2.setForeground(Color.black);

		textLATERALMENOR2.setBounds(new Rectangle(350, 45, 100, 21));
		textLATERALMENOR2.setText(String.valueOf(alto));
		textLATERALMENOR2.setEditable(false);
		textLATERALMENOR2.setHorizontalAlignment(JTextField.LEFT);

		// ------------------------------------------LATERALMAYOR-----------------------------------------------//
		labelLATERALMAYOR.setBounds(new Rectangle(25, 75, 150, 21));
		labelLATERALMAYOR.setText("LATERAL MAYOR:");
		labelLATERALMAYOR.setHorizontalAlignment(JTextField.LEFT);
		labelLATERALMAYOR.setForeground(Color.black);

		textLATERALMAYOR1.setBounds(new Rectangle(195, 75, 100, 21));
		textLATERALMAYOR1.setText(String.valueOf(ancho));
		textLATERALMAYOR1.setEditable(false);
		textLATERALMAYOR1.setHorizontalAlignment(JTextField.LEFT);

		labelX3.setBounds(new Rectangle(320, 75, 150, 21));
		labelX3.setText("X");
		labelX3.setHorizontalAlignment(JTextField.LEFT);
		labelX3.setForeground(Color.black);

		textLATERALMAYOR2.setBounds(new Rectangle(350, 75, 100, 21));
		textLATERALMAYOR2.setText(String.valueOf(alto));
		textLATERALMAYOR2.setEditable(false);
		textLATERALMAYOR2.setHorizontalAlignment(JTextField.LEFT);

		// ------------------------------------------TAPA-----------------------------------------------//

		labelTAPA.setBounds(new Rectangle(25, 105, 150, 21));
		labelTAPA.setText("TAPA:");
		labelTAPA.setHorizontalAlignment(JTextField.LEFT);
		labelTAPA.setForeground(Color.black);

		double tapaR1 = ancho + 1;
		textTAPA1.setBounds(new Rectangle(195, 105, 100, 21));
		textTAPA1.setText(String.valueOf(tapaR1));
		textTAPA1.setEditable(false);
		textTAPA1.setHorizontalAlignment(JTextField.LEFT);

		labelX4.setBounds(new Rectangle(320, 105, 150, 21));
		labelX4.setText("X");
		labelX4.setHorizontalAlignment(JTextField.LEFT);
		labelX4.setForeground(Color.black);

		double tapaR2 = profundidad + 1;
		textTAPA2.setBounds(new Rectangle(350, 105, 100, 21));
		textTAPA2.setText(String.valueOf(tapaR2));
		textTAPA2.setEditable(false);
		textTAPA2.setHorizontalAlignment(JTextField.LEFT);

		// ------------------------------------------BASETAPA-----------------------------------------------//
		labelBASETAPA.setBounds(new Rectangle(25, 135, 150, 21));
		labelBASETAPA.setText("BASE TAPA:");
		labelBASETAPA.setHorizontalAlignment(JTextField.LEFT);
		labelBASETAPA.setForeground(Color.black);

		textBASETAPA1.setBounds(new Rectangle(195, 135, 100, 21));
		textBASETAPA1.setText(String.valueOf(tapaR1));
		textBASETAPA1.setEditable(false);
		textBASETAPA1.setHorizontalAlignment(JTextField.LEFT);

		labelX5.setBounds(new Rectangle(320, 135, 150, 21));
		labelX5.setText("X");
		labelX5.setHorizontalAlignment(JTextField.LEFT);
		labelX5.setForeground(Color.black);

		textBASETAPA2.setBounds(new Rectangle(350, 135, 100, 21));
		textBASETAPA2.setText(String.valueOf(tapaR2));
		textBASETAPA2.setEditable(false);
		textBASETAPA2.setHorizontalAlignment(JTextField.LEFT);

		// ------------------------------------------LOMO-----------------------------------------------//
		labelLOMO.setBounds(new Rectangle(25, 165, 150, 21));
		labelLOMO.setText("LOMO:");
		labelLOMO.setHorizontalAlignment(JTextField.LEFT);
		labelLOMO.setForeground(Color.black);

		double lomoR1 = ancho + 1;
		textLOMO1.setBounds(new Rectangle(195, 165, 100, 21));
		textLOMO1.setText(String.valueOf(lomoR1));
		textLOMO1.setEditable(false);
		textLOMO1.setHorizontalAlignment(JTextField.LEFT);

		labelX6.setBounds(new Rectangle(320, 165, 150, 21));
		labelX6.setText("X");
		labelX6.setHorizontalAlignment(JTextField.LEFT);
		labelX6.setForeground(Color.black);

		textLOMO2.setBounds(new Rectangle(350, 165, 100, 21));
		textLOMO2.setText(String.valueOf(alto));
		textLOMO2.setEditable(false);
		textLOMO2.setHorizontalAlignment(JTextField.LEFT);

		// ------------------------------------------TRAMPA-----------------------------------------------//
		labelTRAMPA.setBounds(new Rectangle(25, 195, 150, 21));
		labelTRAMPA.setText("TRAMPA:");
		labelTRAMPA.setHorizontalAlignment(JTextField.LEFT);
		labelTRAMPA.setForeground(Color.black);

		double trampaR1 = ancho - 2;
		textTRAMPA1.setBounds(new Rectangle(195, 195, 100, 21));
		textTRAMPA1.setText(String.valueOf(trampaR1));
		textTRAMPA1.setEditable(false);
		textTRAMPA1.setHorizontalAlignment(JTextField.LEFT);

		labelX7.setBounds(new Rectangle(320, 195, 150, 21));
		labelX7.setText("X");
		labelX7.setHorizontalAlignment(JTextField.LEFT);
		labelX7.setForeground(Color.black);

		double trampaR2 = profundidad - 2;
		textTRAMPA2.setBounds(new Rectangle(350, 195, 100, 21));
		textTRAMPA2.setText(String.valueOf(trampaR2));
		textTRAMPA2.setEditable(false);
		textTRAMPA2.setHorizontalAlignment(JTextField.LEFT);

		jpanel.add(labelBASECAJA);
		jpanel.add(textBASECAJA1);
		jpanel.add(labelX1);
		jpanel.add(textBASECAJA2);
		jpanel.add(labelLATERALMENOR);
		jpanel.add(textLATERALMENOR1);
		jpanel.add(labelX2);
		jpanel.add(textLATERALMENOR2);
		jpanel.add(labelLATERALMAYOR);
		jpanel.add(textLATERALMAYOR1);
		jpanel.add(labelX3);
		jpanel.add(textLATERALMAYOR2);
		jpanel.add(labelTAPA);
		jpanel.add(textTAPA1);
		jpanel.add(labelX4);
		jpanel.add(textTAPA2);
		jpanel.add(labelBASETAPA);
		jpanel.add(textBASETAPA1);
		jpanel.add(labelX5);
		jpanel.add(textBASETAPA2);
		jpanel.add(labelLOMO);
		jpanel.add(textLOMO1);
		jpanel.add(labelX6);
		jpanel.add(textLOMO2);
		jpanel.add(labelTRAMPA);
		jpanel.add(textTRAMPA1);
		jpanel.add(labelX7);
		jpanel.add(textTRAMPA2);
	}
}
