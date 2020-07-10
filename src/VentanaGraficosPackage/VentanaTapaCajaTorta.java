package VentanaGraficosPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaTapaCajaTorta extends JFrame {

	JPanel jpanel = (JPanel) this.getContentPane();

	JLabel labelBASE = new JLabel();
	JLabel labelLATERALMENOR = new JLabel();
	JLabel labelLATERALMAYOR = new JLabel();

	JTextField textBASE1 = new JTextField();
	JTextField textBASE2 = new JTextField();
	JTextField textLATERALMENOR1 = new JTextField();
	JTextField textLATERALMENOR2 = new JTextField();
	JTextField textLATERALMAYOR1 = new JTextField();
	JTextField textLATERALMAYOR2 = new JTextField();

	JLabel labelX1 = new JLabel();
	JLabel labelX2 = new JLabel();
	JLabel labelX3 = new JLabel();

	public static double ancho;
	public static double alto;
	public static double profundidad;
	public static double densidadCarton;

	public VentanaTapaCajaTorta(double ancho, double alto, double profundidad, double dc) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(500, 200);
		setTitle("CalcuBox: Tapa");
		setVisible(true);
		setResizable(false);

		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		int height = pantalla.height;
		int width = pantalla.width;

		setLocation(height + 100, width / 2 - 150);

		jpanel.setLayout(null);
		jpanel.setBackground(new Color(249, 224, 199));

		this.ancho = ancho;
		this.alto = alto;
		this.profundidad = profundidad;
		this.densidadCarton = dc / 10;

		// -------------------------------BASE---------------------------------------//

		labelBASE.setBounds(new Rectangle(25, 15, 150, 21));
		labelBASE.setText("BASE:");
		labelBASE.setHorizontalAlignment(JTextField.LEFT);
		labelBASE.setForeground(Color.black);

		double baseR1 = ancho + 2;
		textBASE1.setBounds(new Rectangle(195, 15, 100, 21));
		textBASE1.setText(String.valueOf(baseR1));
		textBASE1.setEditable(false);
		textBASE1.setHorizontalAlignment(JTextField.LEFT);

		labelX1.setBounds(new Rectangle(320, 15, 150, 21));
		labelX1.setText("X");
		labelX1.setHorizontalAlignment(JTextField.LEFT);
		labelX1.setForeground(Color.black);

		double baseR2 = profundidad + 2;
		textBASE2.setBounds(new Rectangle(350, 15, 100, 21));
		textBASE2.setText(String.valueOf(baseR2));
		textBASE2.setEditable(false);
		textBASE2.setHorizontalAlignment(JTextField.LEFT);

		// ------------------------------------------LATERALMENOR-----------------------------------------------//
		labelLATERALMENOR.setBounds(new Rectangle(25, 45, 150, 21));
		labelLATERALMENOR.setText("LATERAL MENOR:");
		labelLATERALMENOR.setHorizontalAlignment(JTextField.LEFT);
		labelLATERALMENOR.setForeground(Color.black);

		double lateralMenorR1 = ancho + 2 - densidadCarton;
		textLATERALMENOR1.setBounds(new Rectangle(195, 45, 100, 21));
		textLATERALMENOR1.setText(String.valueOf(lateralMenorR1));
		textLATERALMENOR1.setEditable(false);
		textLATERALMENOR1.setHorizontalAlignment(JTextField.LEFT);

		labelX2.setBounds(new Rectangle(320, 45, 150, 21));
		labelX2.setText("X");
		labelX2.setHorizontalAlignment(JTextField.LEFT);
		labelX2.setForeground(Color.black);

		textLATERALMENOR2.setBounds(new Rectangle(350, 45, 100, 21));
		textLATERALMENOR2.setText(String.valueOf(6));
		textLATERALMENOR2.setEditable(false);
		textLATERALMENOR2.setHorizontalAlignment(JTextField.LEFT);

		// ------------------------------------------LATERALMAYOR-----------------------------------------------//
		labelLATERALMAYOR.setBounds(new Rectangle(25, 75, 150, 21));
		labelLATERALMAYOR.setText("LATERAL MAYOR:");
		labelLATERALMAYOR.setHorizontalAlignment(JTextField.LEFT);
		labelLATERALMAYOR.setForeground(Color.black);

		double lateralMayorR1 = ancho + 2;
		textLATERALMAYOR1.setBounds(new Rectangle(195, 75, 100, 21));
		textLATERALMAYOR1.setText(String.valueOf(lateralMayorR1));
		textLATERALMAYOR1.setEditable(false);
		textLATERALMAYOR1.setHorizontalAlignment(JTextField.LEFT);

		labelX3.setBounds(new Rectangle(320, 75, 150, 21));
		labelX3.setText("X");
		labelX3.setHorizontalAlignment(JTextField.LEFT);
		labelX3.setForeground(Color.black);

		textLATERALMAYOR2.setBounds(new Rectangle(350, 75, 100, 21));
		textLATERALMAYOR2.setText(String.valueOf(6));
		textLATERALMAYOR2.setEditable(false);
		textLATERALMAYOR2.setHorizontalAlignment(JTextField.LEFT);

		jpanel.add(labelBASE);
		jpanel.add(textBASE1);
		jpanel.add(labelX1);
		jpanel.add(textBASE2);
		jpanel.add(labelLATERALMENOR);
		jpanel.add(textLATERALMENOR1);
		jpanel.add(labelX2);
		jpanel.add(textLATERALMENOR2);
		jpanel.add(labelLATERALMAYOR);
		jpanel.add(textLATERALMAYOR1);
		jpanel.add(labelX3);
		jpanel.add(textLATERALMAYOR2);
	}

}