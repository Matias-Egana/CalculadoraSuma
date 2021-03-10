package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class vistaCalculadora extends JFrame {

	private JPanel contentPane;
	public JTextField textNum1;
	public JTextField textNum2;
	public JLabel labelRespuesta;
	private JLabel labelSuma;
	public JButton bCalcular;


	public vistaCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese dos numeros a operar:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(36, 10, 266, 13);
		contentPane.add(lblNewLabel);
		
		textNum1 = new JTextField();
		textNum1.setBounds(10, 54, 96, 19);
		contentPane.add(textNum1);
		textNum1.setColumns(10);
		
		textNum2 = new JTextField();
		textNum2.setBounds(136, 54, 96, 19);
		contentPane.add(textNum2);
		textNum2.setColumns(10);
		
		JLabel labelResultado = new JLabel("=");
		labelResultado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelResultado.setBounds(242, 56, 18, 13);
		contentPane.add(labelResultado);
		
		labelRespuesta = new JLabel(" ");
		labelRespuesta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelRespuesta.setBounds(253, 56, 83, 13);
		contentPane.add(labelRespuesta);
		
		labelSuma = new JLabel("+");
		labelSuma.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelSuma.setBounds(116, 56, 18, 13);
		contentPane.add(labelSuma);
		
		bCalcular = new JButton("Calcular");
		bCalcular.setFont(new Font("Tahoma", Font.PLAIN, 13));
		bCalcular.setBounds(211, 232, 111, 21);
		contentPane.add(bCalcular);
	}
}
