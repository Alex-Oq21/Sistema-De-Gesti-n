package ventanas;
import java.sql.*;
import clases.Conexion;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.JButton;

public class RestaurarPassword extends JFrame {
	String user="", user_update="";

	private JPanel contentPane;
	private JPasswordField txt_password;
	private JPasswordField txt_passwordConfirmacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurarPassword frame = new RestaurarPassword();
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
	public RestaurarPassword() {
		user = Login.user;
		user_update = GestionarUsuario.user_update;
		setResizable(false);
		setTitle("Cambio de contrase�a para - " + user_update);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 360, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCambiarContrasea = new JLabel("Cambiar Contrase\u00F1a");
		lblCambiarContrasea.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCambiarContrasea.setBounds(65, 11, 236, 29);
		contentPane.add(lblCambiarContrasea);
		
		JLabel lblNuevaContrasea = new JLabel("Nueva Contrase\u00F1a :");
		lblNuevaContrasea.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNuevaContrasea.setBounds(20, 50, 132, 14);
		contentPane.add(lblNuevaContrasea);
		
		JLabel lblConfirmarContrasea = new JLabel("Confirmar Contrase\u00F1a :");
		lblConfirmarContrasea.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConfirmarContrasea.setBounds(20, 110, 149, 14);
		contentPane.add(lblConfirmarContrasea);
		
		txt_password = new JPasswordField();
		txt_password.setHorizontalAlignment(SwingConstants.CENTER);
		txt_password.setBounds(20, 70, 210, 20);
		contentPane.add(txt_password);
		
		txt_passwordConfirmacion = new JPasswordField();
		txt_passwordConfirmacion.setHorizontalAlignment(SwingConstants.CENTER);
		txt_passwordConfirmacion.setBounds(20, 130, 210, 20);
		contentPane.add(txt_passwordConfirmacion);
		
		JButton button = new JButton("Restaurar Contrase\u00F1a");
		button.setBounds(20, 180, 210, 35);
		contentPane.add(button);
		
		JLabel jLabel_wallpapaer = new JLabel("");
		jLabel_wallpapaer.setBounds(5, 5, 334, 211);
		contentPane.add(jLabel_wallpapaer);
	}

}
