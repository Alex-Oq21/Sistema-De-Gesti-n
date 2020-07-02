package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Registrar_Usuarios extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Nombre;
	private JTextField txt_Email;
	private JTextField txt_telefono;
	private JTextField txt_username;
	private JPasswordField txt_password;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registro De Usuarios");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(210, 10, 236, 29);
		contentPane.add(lblNewLabel);
		
		JLabel jLabel_Nombre = new JLabel("Nombre :");
		jLabel_Nombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		jLabel_Nombre.setBounds(20, 50, 66, 14);
		contentPane.add(jLabel_Nombre);
		
		txt_Nombre = new JTextField();
		txt_Nombre.setFont(new Font("Arial", Font.BOLD, 12));
		txt_Nombre.setBounds(20, 64, 210, 20);
		contentPane.add(txt_Nombre);
		txt_Nombre.setColumns(10);
		
		JLabel jLabel_Email = new JLabel("Email :");
		jLabel_Email.setFont(new Font("Tahoma", Font.BOLD, 12));
		jLabel_Email.setBounds(20, 95, 66, 14);
		contentPane.add(jLabel_Email);
		
		txt_Email = new JTextField();
		txt_Email.setFont(new Font("Arial", Font.BOLD, 12));
		txt_Email.setColumns(10);
		txt_Email.setBounds(20, 120, 210, 20);
		contentPane.add(txt_Email);
		
		JLabel jLabel_telefono = new JLabel("T\u00E9lefono :");
		jLabel_telefono.setFont(new Font("Tahoma", Font.BOLD, 12));
		jLabel_telefono.setBounds(20, 151, 66, 14);
		contentPane.add(jLabel_telefono);
		
		txt_telefono = new JTextField();
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
		btnNewButton.setIcon(new ImageIcon(Registrar_Usuarios.class.getResource("/images/add.png")));
		btnNewButton.setBounds(470, 170, 120, 100);
		contentPane.add(btnNewButton);
		
		JLabel jLabel_wallpaper = new JLabel("");
		jLabel_wallpaper.setBounds(0, 0, 614, 291);
		contentPane.add(jLabel_wallpaper);
	}
}
