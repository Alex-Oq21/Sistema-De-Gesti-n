package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Informacion_Usuario extends JFrame {

	private JPanel contentPane;
	private JTextField txt_nombre;
	private JTextField txt_Email;
	private JTextField txt_Telefono;
	private JTextField txt_username;
	private JTextField txt_registradopor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Informacion_Usuario frame = new Informacion_Usuario();
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
	public Informacion_Usuario() {
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 630, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informaci\u00F3n Del Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(177, 11, 271, 29);
		contentPane.add(lblNewLabel);
		
		JLabel jLabel_nombre = new JLabel("Nombre :");
		jLabel_nombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		jLabel_nombre.setBounds(20, 50, 72, 14);
		contentPane.add(jLabel_nombre);
		
		JLabel jLabel_Email = new JLabel("Email : ");
		jLabel_Email.setFont(new Font("Tahoma", Font.BOLD, 12));
		jLabel_Email.setBounds(20, 110, 72, 14);
		contentPane.add(jLabel_Email);
		
		JLabel jLabel_Telefono = new JLabel("Telefono :");
		jLabel_Telefono.setFont(new Font("Tahoma", Font.BOLD, 12));
		jLabel_Telefono.setBounds(20, 170, 72, 14);
		contentPane.add(jLabel_Telefono);
		
		JLabel jLabel_PermisosDe = new JLabel("Permisos de :");
		jLabel_PermisosDe.setFont(new Font("Tahoma", Font.BOLD, 12));
		jLabel_PermisosDe.setBounds(20, 230, 90, 14);
		contentPane.add(jLabel_PermisosDe);
		
		JLabel jLabel_NombeDeUsuario = new JLabel("Nombe de usuario :");
		jLabel_NombeDeUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
		jLabel_NombeDeUsuario.setBounds(380, 50, 123, 14);
		contentPane.add(jLabel_NombeDeUsuario);
		
		JLabel lblEstatus = new JLabel("Estatus :");
		lblEstatus.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEstatus.setBounds(380, 110, 72, 14);
		contentPane.add(lblEstatus);
		
		JLabel jLabel_RegistaradoPor = new JLabel("Registrado por :");
		jLabel_RegistaradoPor.setFont(new Font("Tahoma", Font.BOLD, 12));
		jLabel_RegistaradoPor.setBounds(380, 170, 121, 14);
		contentPane.add(jLabel_RegistaradoPor);
		
		txt_nombre = new JTextField();
		txt_nombre.setHorizontalAlignment(SwingConstants.CENTER);
		txt_nombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		txt_nombre.setBounds(20, 70, 210, 20);
		contentPane.add(txt_nombre);
		txt_nombre.setColumns(10);
		
		txt_Email = new JTextField();
		txt_Email.setHorizontalAlignment(SwingConstants.CENTER);
		txt_Email.setFont(new Font("Tahoma", Font.BOLD, 16));
		txt_Email.setColumns(10);
		txt_Email.setBounds(20, 130, 210, 20);
		contentPane.add(txt_Email);
		
		txt_Telefono = new JTextField();
		txt_Telefono.setHorizontalAlignment(SwingConstants.CENTER);
		txt_Telefono.setFont(new Font("Tahoma", Font.BOLD, 16));
		txt_Telefono.setColumns(10);
		txt_Telefono.setBounds(20, 190, 210, 20);
		contentPane.add(txt_Telefono);
		
		txt_username = new JTextField();
		txt_username.setHorizontalAlignment(SwingConstants.CENTER);
		txt_username.setFont(new Font("Tahoma", Font.BOLD, 16));
		txt_username.setColumns(10);
		txt_username.setBounds(380, 70, 210, 20);
		contentPane.add(txt_username);
		
		txt_registradopor = new JTextField();
		txt_registradopor.setEnabled(false);
		txt_registradopor.setHorizontalAlignment(SwingConstants.CENTER);
		txt_registradopor.setFont(new Font("Tahoma", Font.BOLD, 16));
		txt_registradopor.setColumns(10);
		txt_registradopor.setBounds(380, 190, 210, 20);
		contentPane.add(txt_registradopor);
		
		JComboBox combo_estatus = new JComboBox();
		combo_estatus.setModel(new DefaultComboBoxModel(new String[] {"Activo", "Inactivo"}));
		combo_estatus.setBounds(380, 130, 68, 20);
		contentPane.add(combo_estatus);
		
		JComboBox combo_niveles = new JComboBox();
		combo_niveles.setModel(new DefaultComboBoxModel(new String[] {"Administrador", "Capturista", "Tecnico"}));
		combo_niveles.setBounds(20, 250, 114, 20);
		contentPane.add(combo_niveles);
		
		JLabel jLabel_Wallpaper = new JLabel("");
		jLabel_Wallpaper.setBounds(5, 5, 604, 401);
		contentPane.add(jLabel_Wallpaper);
		setLocationRelativeTo(null);
	}
}
