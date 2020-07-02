package ventanas;

import java.sql.*;
import clases.Conexion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Administrador extends JFrame {
	String user,nombre_usuario;
	public static int sesion_usuario;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Administrador frame = new Administrador();
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
	public Administrador() {
		user = Login.user;
		sesion_usuario =1;
		
		setResizable(false);
		setTitle("Administrador - Sesión de: "+user);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel jLabel_nombreusuario = new JLabel("");
		jLabel_nombreusuario.setFont(new Font("Arial", Font.BOLD, 20));
		jLabel_nombreusuario.setForeground(Color.WHITE);
		jLabel_nombreusuario.setBounds(10, 10, 46, 14);
		contentPane.add(jLabel_nombreusuario);
		
		JButton Button_RegistrarUsuario = new JButton("");
		Button_RegistrarUsuario.setIcon(new ImageIcon(Administrador.class.getResource("/images/addUser.png")));
		Button_RegistrarUsuario.setBounds(24, 70, 120, 100);
		contentPane.add(Button_RegistrarUsuario);
		
		JButton button_GestionarUsuario = new JButton("");
		button_GestionarUsuario.setIcon(new ImageIcon(Administrador.class.getResource("/images/informationuser.png")));
		button_GestionarUsuario.setBounds(270, 70, 120, 100);
		contentPane.add(button_GestionarUsuario);
		
		JButton button_Capturista = new JButton("");
		button_Capturista.setIcon(new ImageIcon(Administrador.class.getResource("/images/capturista.png")));
		button_Capturista.setBounds(500, 70, 120, 100);
		contentPane.add(button_Capturista);
		
		JButton button_Tecnico = new JButton("");
		button_Tecnico.setIcon(new ImageIcon(Administrador.class.getResource("/images/tecnico.png")));
		button_Tecnico.setBounds(27, 240, 120, 100);
		contentPane.add(button_Tecnico);
		
		JButton button_AcercaDe = new JButton("");
		button_AcercaDe.setBounds(270, 240, 120, 100);
		contentPane.add(button_AcercaDe);
		
		JLabel jLabel_RegistrarUsuario = new JLabel("Registrar Usuario");
		jLabel_RegistrarUsuario.setBounds(34, 181, 97, 14);
		contentPane.add(jLabel_RegistrarUsuario);
		
		JLabel jLabeGestionarUsuarios = new JLabel("Gestionar Usuarios");
		jLabeGestionarUsuarios.setBounds(280, 181, 110, 14);
		contentPane.add(jLabeGestionarUsuarios);
		
		JLabel jLabel_Capturista = new JLabel("Capturista");
		jLabel_Capturista.setBounds(531, 181, 46, 14);
		contentPane.add(jLabel_Capturista);
		
		JLabel jLabel_Tecnico = new JLabel("T\u00E9cnico");
		jLabel_Tecnico.setBounds(61, 350, 52, 14);
		contentPane.add(jLabel_Tecnico);
		
		JLabel jLabel_AcercaDe = new JLabel("Acerca de");
		jLabel_AcercaDe.setBounds(297, 350, 66, 14);
		contentPane.add(jLabel_AcercaDe);
		
		ImageIcon wallpaper = new ImageIcon("src/images/admi1.jpg");
		JLabel jLabe_wallpaper = new JLabel("");
		jLabe_wallpaper.setBounds(1, 1, 644, 392);
		contentPane.add(jLabe_wallpaper);
		Icon icono_logo = new ImageIcon(wallpaper.getImage().getScaledInstance(659,500,659)); 
		jLabe_wallpaper.setIcon(icono_logo);
		setLocationRelativeTo(null);
		this.repaint();
		
		try {
			Connection cn = Conexion.conectar();
			PreparedStatement pst = cn.prepareStatement(
					"select nombe_usuario from usuarios where username = '"+user+"'");
			ResultSet rs= pst.executeQuery();
			if(rs.next()) {
				nombre_usuario = rs.getString("nombre_usuario");
				jLabel_nombreusuario.setText(nombre_usuario);
			}
		}catch(SQLException e) {
			
			System.err.println("Error en la conexión desde ventana: Administrador");
		}
	}
}
