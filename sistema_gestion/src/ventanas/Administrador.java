package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Administrador extends JFrame {

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
		setTitle("Adminstrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jLabel_nombreusuario = new JLabel("New label");
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
		
		JLabel lblNewLabel = new JLabel("Registrar Usuario");
		lblNewLabel.setBounds(34, 181, 97, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblGestionarUsuarios = new JLabel("Gestionar Usuarios");
		lblGestionarUsuarios.setBounds(280, 181, 110, 14);
		contentPane.add(lblGestionarUsuarios);
		
		JLabel lblCapturista = new JLabel("Capturista");
		lblCapturista.setBounds(531, 181, 46, 14);
		contentPane.add(lblCapturista);
		
		JLabel lblTcnico = new JLabel("T\u00E9cnico");
		lblTcnico.setBounds(61, 350, 52, 14);
		contentPane.add(lblTcnico);
		
		JLabel lblAcercaDe = new JLabel("Acerca de");
		lblAcercaDe.setBounds(297, 350, 66, 14);
		contentPane.add(lblAcercaDe);
		
		JLabel jLabe_wallpaper = new JLabel("");
		jLabe_wallpaper.setBounds(0, 0, 634, 392);
		contentPane.add(jLabe_wallpaper);
		setLocationRelativeTo(null);
	}
}
