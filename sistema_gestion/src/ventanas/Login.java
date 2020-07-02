package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import clases.Conexion;

public class Login extends JFrame {
	
	public static String user= "";
	String pass="";

	private JPanel contentPane;
	private JTextField txt_user;
	private JPasswordField txt_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setSize(353,550);
		setResizable(false);
		setTitle("Acceso Al Sistema");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 377, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JButton btn_Acceder = new JButton("Acceder");
		btn_Acceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				user = txt_user.getText().trim();
				pass = txt_password.getText().trim();
				if(!user.equals("")|| !pass.equals("")) {
					try {
						Connection cn= Conexion.conectar();
						PreparedStatement pst = cn.prepareStatement(
							"select tipo_nivel, estatus from usuarios where username = '" + user
							+ "' and password = '" + pass+"'");
						ResultSet rs = pst.executeQuery();
						if(rs.next()) {
							String tipo_nivel = rs.getString("tipo_nivel");
							String estatus = rs.getString("estatus");
							
							if(tipo_nivel.equalsIgnoreCase("Administrador") && estatus.equalsIgnoreCase("Activo")) {
								dispose();
								new Administrador().setVisible(true);
							}else if(tipo_nivel.equalsIgnoreCase("Capturista") && estatus.equalsIgnoreCase("Activo")) {
								dispose();
								new Capturista().setVisible(true);
							}else if(tipo_nivel.equalsIgnoreCase("Tecnico") && estatus.equalsIgnoreCase("Activo")) {
								dispose();
								new Tecnico().setVisible(true);
							}
						}else {
							JOptionPane.showMessageDialog(null, "Datos incorrectos.");
							txt_user.setText("");
							txt_password.setText("");
						}
						
					}catch(SQLException e) {
						//Mensaje para el programador
						System.err.println("Error en el botón de acceso" +e);
						//Mensaje para el cliente en caso de errores en el sistema(Error de programador).
						JOptionPane.showMessageDialog(null, "Error en el sistema, contacte al administrador.");

					}
				}else {
					JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
				}
			}
		});
		
		
		txt_user = new JTextField();
		txt_user.setHorizontalAlignment(SwingConstants.CENTER);
		txt_user.setFont(new Font("Arial", Font.PLAIN, 18));
		txt_user.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_user.setForeground(Color.BLACK);
		txt_user.setBackground(Color.WHITE);
		txt_user.setBounds(91, 195, 210, 20);
		contentPane.add(txt_user);
		txt_user.setColumns(10);
		btn_Acceder.setFont(new Font("Arial Narrow", Font.PLAIN, 11));
		btn_Acceder.setForeground(UIManager.getColor("Menu.foreground"));
		btn_Acceder.setBackground(UIManager.getColor("Menu.selectionBackground"));
		btn_Acceder.setBounds(151, 317, 89, 23);
		contentPane.add(btn_Acceder);
		
		
		ImageIcon wallpaper_logo = new ImageIcon("src/images/login.png");
		this.repaint();
		
		ImageIcon wallpaper = new ImageIcon("src/images/fondo.jpg");
		Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(353,500,353));
		this.repaint(); 
		txt_password = new JPasswordField();
		txt_password.setBackground(Color.WHITE);
		txt_password.setHorizontalAlignment(SwingConstants.CENTER);
		txt_password.setFont(new Font("Arial", Font.PLAIN, 18));
		txt_password.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_password.setForeground(Color.BLACK);
		txt_password.setBounds(95, 257, 210, 20);
		contentPane.add(txt_password);
		JLabel jLabel_Logo = new JLabel("");
		jLabel_Logo.setBounds(136, 51, 100, 100);
		contentPane.add(jLabel_Logo);
		Icon icono_logo = new ImageIcon(wallpaper_logo.getImage().getScaledInstance(jLabel_Logo.getHeight(), jLabel_Logo.getWidth(), Image.SCALE_DEFAULT));
		jLabel_Logo.setIcon(icono_logo);
		JLabel jLabel_wallpaper = new JLabel("");
		jLabel_wallpaper.setBounds(5, 5, 361, 511);
		contentPane.add(jLabel_wallpaper);
		jLabel_wallpaper.setIcon(icono);
		
		
	}
}

