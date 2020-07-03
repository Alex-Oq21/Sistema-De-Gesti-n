package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import clases.Conexion;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registrar_Usuarios extends JFrame {
	String user;

	private JPanel contentPane;
	private JTextField txt_Nombre;
	private JTextField txt_Email;
	private JTextField txt_telefono;
	private JTextField txt_username;
	private JPasswordField txt_password;
	
	public void Limpiar() {
		txt_Email.setText("");
		txt_Nombre.setText("");
		txt_password.setText("");
		txt_username.setText("");
		txt_telefono.setText("");
		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrar_Usuarios frame = new Registrar_Usuarios();
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
	public Registrar_Usuarios() {
		user = Login.user;
		setTitle("Registar Usuario - sesión de " + user);
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); 
		setBounds(100, 100, 630, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Registro De Usuarios");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(210, 10, 236, 29);
		contentPane.add(lblNewLabel);
		
		JLabel jLabel_Nombre = new JLabel("Nombre :");
		jLabel_Nombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		jLabel_Nombre.setBounds(20, 50, 66, 14);
		contentPane.add(jLabel_Nombre);
		
		txt_Nombre = new JTextField();
		txt_Nombre.setHorizontalAlignment(SwingConstants.CENTER);
		txt_Nombre.setFont(new Font("Arial", Font.BOLD, 12));
		txt_Nombre.setBounds(20, 64, 210, 20);
		contentPane.add(txt_Nombre);
		txt_Nombre.setColumns(10);
		
		JLabel jLabel_Email = new JLabel("Email :");
		jLabel_Email.setFont(new Font("Tahoma", Font.BOLD, 12));
		jLabel_Email.setBounds(20, 95, 66, 14);
		contentPane.add(jLabel_Email);
		
		txt_Email = new JTextField();
		txt_Email.setHorizontalAlignment(SwingConstants.CENTER);
		txt_Email.setFont(new Font("Arial", Font.BOLD, 12));
		txt_Email.setColumns(10);
		txt_Email.setBounds(20, 120, 210, 20);
		contentPane.add(txt_Email);
		
		JLabel jLabel_telefono = new JLabel("T\u00E9lefono :");
		jLabel_telefono.setFont(new Font("Tahoma", Font.BOLD, 12));
		jLabel_telefono.setBounds(20, 151, 66, 14);
		contentPane.add(jLabel_telefono);
		
		txt_telefono = new JTextField();
		txt_telefono.setHorizontalAlignment(SwingConstants.CENTER);
		txt_telefono.setFont(new Font("Arial", Font.BOLD, 12));
		txt_telefono.setColumns(10);
		txt_telefono.setBounds(20, 176, 210, 20);
		contentPane.add(txt_telefono);
		
		JLabel jLabel_permisos = new JLabel("Permisos De :");
		jLabel_permisos.setFont(new Font("Tahoma", Font.BOLD, 12));
		jLabel_permisos.setBounds(20, 207, 66, 14);
		contentPane.add(jLabel_permisos);
		
		JLabel jLabel_username = new JLabel("Nombre Usuario  :");
		jLabel_username.setFont(new Font("Tahoma", Font.BOLD, 12));
		jLabel_username.setBounds(380, 50, 113, 14);
		contentPane.add(jLabel_username);
		
		txt_username = new JTextField();
		txt_username.setHorizontalAlignment(SwingConstants.CENTER);
		txt_username.setFont(new Font("Arial", Font.BOLD, 12));
		txt_username.setColumns(10);
		txt_username.setBounds(380, 70, 210, 20);
		contentPane.add(txt_username);
		
		JLabel jLabel_password = new JLabel("Contrase\u00F1a :");
		jLabel_password.setFont(new Font("Tahoma", Font.BOLD, 12));
		jLabel_password.setBounds(380, 110, 99, 14);
		contentPane.add(jLabel_password);
		
		txt_password = new JPasswordField();
		txt_password.setHorizontalAlignment(SwingConstants.CENTER);
		txt_password.setBounds(380, 130, 210, 20);
		contentPane.add(txt_password);
		
		JComboBox comboNiveles = new JComboBox();
		comboNiveles.setModel(new DefaultComboBoxModel(new String[] {"Administrador", "Capturista", "Tecnico"}));
		comboNiveles.setBounds(20, 232, 99, 29);
		contentPane.add(comboNiveles);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int permisos_cmb, validacion=0;
				String nombre,mail, telefono, username, pass, permisos_string="";
				mail = txt_Email.getText().trim();
				username = txt_username.getText().trim();
				pass = txt_password.getText().trim();
				nombre = txt_Nombre.getText().trim();
				telefono = txt_telefono.getText().trim();
				permisos_cmb = comboNiveles.getSelectedIndex() +1;
				
				if(mail.equals("")) {
					txt_Email.setBorder(BorderFactory.createLineBorder(Color.RED));
					validacion ++;
				}
				if(username.equals("")) {
					txt_username.setBorder(BorderFactory.createLineBorder(Color.red));
					validacion ++;
				}
				if(pass.equals("")) {
					txt_password.setBorder(BorderFactory.createLineBorder(Color.red));
					validacion ++;
				}
				if(nombre.equals("")) {
					txt_Nombre.setBorder(BorderFactory.createLineBorder(Color.red));
					validacion ++;
				}
				if(telefono.equals("")) {
					txt_telefono.setBorder(BorderFactory.createLineBorder(Color.red));
					validacion ++;
				}
				
				if(permisos_cmb == 1) {
					permisos_string = "Administrador";
				}else if(permisos_cmb == 2) {
					permisos_string = "Capturista";
				}else if(permisos_cmb ==3) {
					permisos_string = "Tecnico";
				}
				try {
					Connection cn = Conexion.conectar();
					PreparedStatement pst = cn.prepareStatement(
							"SELECT username FROM usuarios WHERE username = '" + "'");
					ResultSet rs = pst.executeQuery();
					
					if(rs.next()) {
						txt_username.setBorder(BorderFactory.createLineBorder(Color.red));
						JOptionPane.showMessageDialog(null, "Este usuario ya existe");
						cn.close();
					}else {
						cn.close();
						
						if(validacion == 0) {
							try {
								Connection cn2 = Conexion.conectar();
								PreparedStatement pst2 = cn2.prepareStatement(
										"INSERT INTO usuarios VALUES(?,?,?,?,?,?,?,?,?)");
								pst2.setInt(1,0);
								pst2.setString(2,nombre);
								pst2.setString(3,mail);
								pst2.setString(4,telefono);
								pst2.setString(5,username);
								pst2.setString(6,pass);
								pst2.setString(7,permisos_string);
								pst2.setString(8,"Activo");
								pst2.setString(9, user);
								
								pst2.executeUpdate();
								cn2.close();
								
								Limpiar();
								
								txt_Email.setBorder(BorderFactory.createLineBorder(Color.green));
								txt_username.setBorder(BorderFactory.createLineBorder(Color.green));
								txt_password.setBorder(BorderFactory.createLineBorder(Color.green));
								txt_Nombre.setBorder(BorderFactory.createLineBorder(Color.green));
								txt_telefono.setBorder(BorderFactory.createLineBorder(Color.green));
								
								JOptionPane.showMessageDialog(null, "Registro Exitoso");
								

							}catch(SQLException e) {
								System.out.println(e);
								JOptionPane.showMessageDialog(null, "Error en el sistema al registrar usuario");
							}
						}else {
							JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");

						}
					}
				}catch(SQLException e) {
					System.err.println("Error en validación"+e);
					JOptionPane.showMessageDialog(null, "Error en el sistema");
				}
				
			}
			
		});
		btnNewButton.setIcon(new ImageIcon(Registrar_Usuarios.class.getResource("/images/add.png")));
		btnNewButton.setBounds(470, 170, 120, 100);
		contentPane.add(btnNewButton);
		
		JLabel jLabel_wallpaper = new JLabel("");
		jLabel_wallpaper.setBounds(0, 0, 614, 291);
		contentPane.add(jLabel_wallpaper);
		
		
	}
}
