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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Font;

public class Login extends JFrame {

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
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 377, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		txt_user = new JTextField();
		txt_user.setHorizontalAlignment(SwingConstants.CENTER);
		txt_user.setFont(new Font("Arial", Font.PLAIN, 18));
		txt_user.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_user.setForeground(Color.WHITE);
		txt_user.setBackground(Color.WHITE);
		txt_user.setBounds(91, 195, 210, 20);
		contentPane.add(txt_user);
		txt_user.setColumns(10);
		
		
		ImageIcon wallpaper_logo = new ImageIcon("src/images/login.png");
		JLabel jLabel_Logo = new JLabel("");
		jLabel_Logo.setBounds(136, 51, 100, 100);
		contentPane.add(jLabel_Logo);
		Icon icono_logo = new ImageIcon(wallpaper_logo.getImage().getScaledInstance(jLabel_Logo.getHeight(), jLabel_Logo.getWidth(), Image.SCALE_DEFAULT));
		jLabel_Logo.setIcon(icono_logo);
		
		this.repaint();
		ImageIcon wallpaper = new ImageIcon("src/images/fondo.jpg");
		Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(353,500,353));
		
		txt_password = new JPasswordField();
		txt_password.setHorizontalAlignment(SwingConstants.CENTER);
		txt_password.setFont(new Font("Arial", Font.PLAIN, 18));
		txt_password.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_password.setForeground(Color.WHITE);
		txt_password.setBounds(95, 257, 210, 20);
		contentPane.add(txt_password);
		
		JLabel jLabel_wallpaper = new JLabel("");
		jLabel_wallpaper.setBounds(5, 5, 361, 511);
		contentPane.add(jLabel_wallpaper);
		jLabel_wallpaper.setIcon(icono);
		this.repaint(); 
	}
}

