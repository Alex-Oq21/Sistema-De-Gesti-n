package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import javax.swing.JScrollPane;

public class GestionarUsuario extends JFrame {

	private JPanel contentPane;
	
	String user;
	public static String user_update = "";
	DefaultTableModel model = new DefaultTableModel();
	private JTable table;
	private JTable table_usuario;

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
		
		try {
			Connection cn = Conexion.conectar();
			PreparedStatement pst = cn.prepareStatement(
					"SELECT id_usuario, nombre_usuario, username, tipo_nivel, estatus FROM usuarios");
			ResultSet rs = pst.executeQuery();
			
			JLabel lblNewLabel_1 = new JLabel("Usuarios Registrados");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
			lblNewLabel_1.setBounds(210, 10, 233, 29);
			contentPane.add(lblNewLabel_1);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(131, 72, 349, 166);
			contentPane.add(scrollPane);
			
			table_usuario = new JTable(model);
			scrollPane.setViewportView(table_usuario);
			
			model.addColumn("");
			model.addColumn("Nombre");
			model.addColumn("Nombre Usuario");
			model.addColumn("Permisos");
			model.addColumn("Estatus");
			
			while(rs.next()) {
				Object[] fila = new Object[5];
				for (int i = 0; i < 5; i++) {
					fila[i] = rs.getObject(i +1);
				}
				model.addRow(fila);
			}
			cn.close();
			
			
			
		}catch(SQLException e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null, "Error en el sistema");
		}
		
		
		JLabel jLabel_wallpaper = new JLabel("");
		jLabel_wallpaper.setBounds(0, 0, 614, 281);
		contentPane.add(jLabel_wallpaper);
	}
}
