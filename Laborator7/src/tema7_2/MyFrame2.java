package tema7_2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class MyFrame2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtFormatie;
	@SuppressWarnings("rawtypes")
	private JList lstFormatii;
	private JButton btnStergere;
	@SuppressWarnings("rawtypes")
	private DefaultListModel listModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame2 frame = new MyFrame2();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public MyFrame2() {
		setTitle("Formatii");
		listModel=new DefaultListModel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 352);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		
		txtFormatie = new JTextField();
		txtFormatie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.addElement(txtFormatie.getText());
			}
		});
		txtFormatie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(txtFormatie, BorderLayout.NORTH);
		txtFormatie.setColumns(10);
		
		lstFormatii = new JList(listModel);
		lstFormatii.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lstFormatii, BorderLayout.CENTER);
		
		btnStergere = new JButton("Sterge");
		btnStergere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] selectate=lstFormatii.getSelectedIndices();
				
				for(int i=selectate.length-1;i>=0;i--)
				{
					listModel.removeElementAt(selectate[i]);
				}
			}
		});
		btnStergere.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(btnStergere, BorderLayout.SOUTH);
	}

}
