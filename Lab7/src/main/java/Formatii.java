import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Formatii extends JFrame {

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
					Formatii frame = new Formatii();
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
	public Formatii() {
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