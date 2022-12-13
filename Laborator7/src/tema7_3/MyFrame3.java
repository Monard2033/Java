package tema7_3;

import java.awt.EventQueue;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class MyFrame3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtFilm;
	private JTextField txtActori;
	private JLabel lblFilm;
	private JLabel lblActori;
	private JSpinner spinner;
	private JLabel lblAnLansare;
	private JCheckBox chcComedie;
	private JCheckBox chcDrama;
	private JCheckBox chcIstoric;
	private JCheckBox chcRomantic;
	private JCheckBox chcActiune;
	private JPanel pnlGenuri;
	private JButton btnAdauga;
	private JButton btnSterge;
	private DefaultTableModel tableModel;
	private JTable table;
	private JScrollPane scrollPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame3 frame = new MyFrame3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MyFrame3() {
		setTitle("Filme");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tableModel=new DefaultTableModel(0,0);
		String[] header=new String[] {"Film","Actori","An lansare","Genuri"};
		tableModel.setColumnIdentifiers(header);
		
		lblFilm = new JLabel("Film");
		lblFilm.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFilm.setBounds(177, 36, 92, 24);
		contentPane.add(lblFilm);
		
		txtFilm = new JTextField();
		txtFilm.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtFilm.setBounds(291, 36, 259, 24);
		contentPane.add(txtFilm);
		txtFilm.setColumns(10);
		
		lblActori = new JLabel("Actori");
		lblActori.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblActori.setBounds(177, 88, 92, 24);
		contentPane.add(lblActori);
		
		txtActori = new JTextField();
		txtActori.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtActori.setColumns(10);
		txtActori.setBounds(291, 88, 259, 24);
		contentPane.add(txtActori);
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(2020, 2015, 2020, 1));
		spinner.setFont(new Font("Tahoma", Font.BOLD, 13));
		spinner.setBounds(355, 139, 79, 34);
		contentPane.add(spinner);
		
		lblAnLansare = new JLabel("An lansare");
		lblAnLansare.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAnLansare.setBounds(177, 143, 92, 24);
		contentPane.add(lblAnLansare);
		
		chcComedie = new JCheckBox("comedie");
		chcComedie.setFont(new Font("Tahoma", Font.BOLD, 14));
		chcComedie.setBounds(176, 215, 93, 21);
		contentPane.add(chcComedie);
		
		chcDrama = new JCheckBox("drama");
		chcDrama.setFont(new Font("Tahoma", Font.BOLD, 14));
		chcDrama.setBounds(271, 215, 93, 21);
		contentPane.add(chcDrama);
		
		chcIstoric = new JCheckBox("istoric");
		chcIstoric.setFont(new Font("Tahoma", Font.BOLD, 14));
		chcIstoric.setBounds(362, 215, 93, 21);
		contentPane.add(chcIstoric);
		
		chcRomantic = new JCheckBox("romantic");
		chcRomantic.setFont(new Font("Tahoma", Font.BOLD, 14));
		chcRomantic.setBounds(457, 215, 93, 21);
		contentPane.add(chcRomantic);
		
		chcActiune = new JCheckBox("actiune");
		chcActiune.setFont(new Font("Tahoma", Font.BOLD, 14));
		chcActiune.setBounds(306, 250, 93, 21);
		contentPane.add(chcActiune);
		
		pnlGenuri = new JPanel();
		pnlGenuri.setBounds(159, 199, 404, 90);
		pnlGenuri.setBorder(BorderFactory.createTitledBorder("Genuri"));
		contentPane.add(pnlGenuri);
		
		btnAdauga = new JButton("Adauga");
		btnAdauga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String film=txtFilm.getText();
				String actori=txtActori.getText();
				String an=String.valueOf(spinner.getValue());
				String genuri="";
				if(chcActiune.isSelected())
					genuri=genuri+chcActiune.getText()+" ";
				if(chcComedie.isSelected())
					genuri=genuri+chcComedie.getText()+" ";
				if(chcDrama.isSelected())
					genuri=genuri+chcDrama.getText()+" ";
				if(chcIstoric.isSelected())
					genuri=genuri+chcIstoric.getText()+" ";
				if(chcRomantic.isSelected())
					genuri=genuri+chcRomantic.getText()+" ";
				tableModel.addRow(new Object[] { film, actori, an, genuri});
				
			}
		});
		btnAdauga.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAdauga.setBounds(159, 305, 130, 34);
		contentPane.add(btnAdauga);
		
		btnSterge = new JButton("Sterge");
		btnSterge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] n=table.getSelectedRows();
				
				for(int i=n.length-1;i>=0;i--)
				{
					tableModel.removeRow(n[i]);
				}
			}
		});
		btnSterge.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSterge.setBounds(433, 305, 130, 34);
		contentPane.add(btnSterge);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 373, 682, 135);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(tableModel);
		scrollPane.setViewportView(table);
	}
}
