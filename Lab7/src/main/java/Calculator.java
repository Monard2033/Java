import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
@SuppressWarnings("serial")
public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtOperand1;
	private JTextField txtOperand2;
	private JLabel lblOperand1;
	private JLabel lblOperand2;
	private JButton btnAdunare;
	private JButton btnScadere;
	private JButton btnInmultire;
	private JButton btnImpartire;
	private JLabel lblRezultat;
	private JButton btnClear;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblOperand1 = new JLabel("Operand 1");
		lblOperand1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOperand1.setBounds(69, 36, 89, 23);
		contentPane.add(lblOperand1);
		
		lblOperand2 = new JLabel("Operand 2");
		lblOperand2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOperand2.setBounds(69, 69, 89, 23);
		contentPane.add(lblOperand2);
		
		txtOperand1 = new JTextField();
		txtOperand1.setBounds(184, 36, 165, 23);
		contentPane.add(txtOperand1);
		txtOperand1.setColumns(10);
		
		txtOperand2 = new JTextField();
		txtOperand2.setBounds(184, 69, 165, 23);
		contentPane.add(txtOperand2);
		txtOperand2.setColumns(10);
		
		btnAdunare = new JButton("Adunare");
		btnAdunare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int operand1;
				int operand2;
				int suma;
				
				try {
					operand1=Integer.parseInt(txtOperand1.getText());
					operand2=Integer.parseInt(txtOperand2.getText());
					
					suma=operand1+operand2;
					lblRezultat.setText(String.valueOf(suma));
				}
				catch(NumberFormatException exc) {
					lblRezultat.setText("Format gresit!");
				}
			}
		});
		btnAdunare.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdunare.setBounds(69, 121, 131, 32);
		contentPane.add(btnAdunare);
		
		btnScadere = new JButton("Scadere");
		btnScadere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int operand1;
				int operand2;
				int dif;
				
				try {
					operand1=Integer.parseInt(txtOperand1.getText());
					operand2=Integer.parseInt(txtOperand2.getText());
					
					dif=operand1-operand2;
					lblRezultat.setText(String.valueOf(dif));
				}
				catch(NumberFormatException exc) {
					lblRezultat.setText("Format gresit!");
				}
			}
		});
		btnScadere.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnScadere.setBounds(218, 121, 131, 32);
		contentPane.add(btnScadere);
		
		btnInmultire = new JButton("Inmultire");
		btnInmultire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int operand1;
				int operand2;
				int prod;
				
				try {
					operand1=Integer.parseInt(txtOperand1.getText());
					operand2=Integer.parseInt(txtOperand2.getText());
					
					prod=operand1*operand2;
					lblRezultat.setText(String.valueOf(prod));
				}
				catch(NumberFormatException exc) {
					lblRezultat.setText("Format gresit!");
				}
			}
		});
		btnInmultire.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnInmultire.setBounds(69, 173, 131, 32);
		contentPane.add(btnInmultire);
		
		btnImpartire = new JButton("Impartire");
		btnImpartire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int operand1;
				int operand2;
				int imp;
				
				try {
					operand1=Integer.parseInt(txtOperand1.getText());
					operand2=Integer.parseInt(txtOperand2.getText());
					
					imp=operand1/operand2;
					lblRezultat.setText(String.valueOf(imp));
				}
				catch(NumberFormatException exc) {
					lblRezultat.setText("Format gresit!");
				}
				catch(ArithmeticException exc2) {
					lblRezultat.setText("Impartitorul nu poate fi 0!");
				}
			}
		});
		btnImpartire.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnImpartire.setBounds(218, 173, 131, 32);
		contentPane.add(btnImpartire);
		
		lblRezultat = new JLabel("");
		lblRezultat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRezultat.setBounds(69, 241, 280, 23);
		lblRezultat.setOpaque(true);
		lblRezultat.setBackground(Color.white);
		contentPane.add(lblRezultat);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperand1.setText(null);
				txtOperand2.setText(null);
				lblRezultat.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClear.setBounds(69, 297, 280, 37);
		contentPane.add(btnClear);
	}
}
