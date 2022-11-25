package Lab8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JTextArea;

public class Jframe extends JFrame {

	private JPanel contentPane;
	private JTextField textNume;
	private JTextField textID;
	private JTextField textVarsta;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
   
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jframe frame = new Jframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Jframe() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/exemplu";
		String sql = "select * from persoane";
		Connection connection = DriverManager.getConnection(url, "root", "root");
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		rs.first();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNume = new JTextField();
		textNume.setBounds(219, 71, 86, 20);
		contentPane.add(textNume);
		textNume.setColumns(10);
		textNume.setText(rs.getString(2));
		
		textID = new JTextField();
		textID.setBounds(219, 40, 86, 20);
		textID.setColumns(10);
		textID.setText(rs.getString(1));
		contentPane.add(textID);
		
		textVarsta = new JTextField();
		textVarsta.setBounds(219, 113, 86, 20);
		textVarsta.setColumns(10);
		textVarsta.setText(rs.getString(3));
		contentPane.add(textVarsta);
		
		JLabel lbID = new JLabel("ID");
		lbID.setBounds(163, 43, 46, 14);
		lbID.setHorizontalAlignment(SwingConstants.RIGHT);
		lbID.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPane.add(lbID);
		
		JLabel lbNume = new JLabel("NUME");
		lbNume.setBounds(163, 74, 46, 14);
		lbNume.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lbNume);
		
		JLabel lbVarsta = new JLabel("VARSTA");
		lbVarsta.setBounds(163, 116, 46, 14);
		lbVarsta.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lbVarsta);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 406, 25);
		contentPane.add(toolBar);
		
		JButton btnMoveF = new JButton("");
		btnMoveF.setIcon(new ImageIcon("C:\\Users\\student\\Downloads\\Imagini\\MoveFirst.png"));
		toolBar.add(btnMoveF);
		
		JButton btnMoveP = new JButton("");
		btnMoveP.setIcon(new ImageIcon("C:\\Users\\student\\Downloads\\Imagini\\MovePrevious.png"));
		toolBar.add(btnMoveP);
		
		textField = new JTextField();
		toolBar.add(textField);
		textField.setColumns(10);
		
		JButton btnMoveN = new JButton("");
		btnMoveN.setIcon(new ImageIcon("C:\\Users\\student\\Downloads\\Imagini\\MoveNext.png"));
		toolBar.add(btnMoveN);
		
		JButton btnMoveL = new JButton("");
		btnMoveL.setIcon(new ImageIcon("C:\\Users\\student\\Downloads\\Imagini\\MoveLast.png"));
		toolBar.add(btnMoveL);
		
		JButton btnAdd = new JButton("");
		btnAdd.setIcon(new ImageIcon("C:\\Users\\student\\Downloads\\Imagini\\Add.png"));
		toolBar.add(btnAdd);
		
		JButton btnEdit = new JButton("");
		btnEdit.setIcon(new ImageIcon("C:\\Users\\student\\Downloads\\Imagini\\Edit.png"));
		toolBar.add(btnEdit);
		
		JButton btnDelete = new JButton("");
		btnDelete.setIcon(new ImageIcon("C:\\Users\\student\\Downloads\\Imagini\\Delete.png"));
		toolBar.add(btnDelete);
		
		JButton btnFind = new JButton("");
		btnFind.setIcon(new ImageIcon("C:\\Users\\student\\Downloads\\Imagini\\find.JPG"));
		toolBar.add(btnFind);
		
		JButton btnSave = new JButton("");
		btnSave.setIcon(new ImageIcon("C:\\Users\\student\\Downloads\\Imagini\\save.JPG"));
		toolBar.add(btnSave);
		
		JButton btnUndo = new JButton("");
		btnUndo.setIcon(new ImageIcon("C:\\Users\\student\\Downloads\\Imagini\\undo.JPG"));
		toolBar.add(btnUndo);
	}
}
