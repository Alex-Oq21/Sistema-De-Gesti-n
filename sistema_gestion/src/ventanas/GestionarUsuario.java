package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import java.sql.*;
import clases.Conexion;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import java.awt.Color;
import javax.swing.ListSelectionModel;

public class GestionarUsuario extends JFrame {

	private JPanel contentPane;
	
	String user;
	public static String user_update = "";
	DefaultTableModel model = new DefaultTableModel();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionarUsuario frame = new GestionarUsuario();
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
	public GestionarUsuario() {
		user = Login.user;
		
		setSize(630,330);
		setTitle("Usuarios Registrados - " + user);
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 630, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel_1 = new JLabel("Usuarios Registrados");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(210, 10, 233, 29);
		contentPane.add(lblNewLabel_1);
		
		table = new JTable();
		table.setBorder(UIManager.getBorder("TextArea.border"));
		table.setRowSelectionAllowed(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(162, 214, 281, -139);
		contentPane.add(table);
		
		JLabel jLabel_wallpaper = new JLabel("");
		jLabel_wallpaper.setBounds(0, 0, 614, 281);
		contentPane.add(jLabel_wallpaper);
	}
}
