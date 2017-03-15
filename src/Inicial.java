import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicial extends JFrame {

	private JPanel contentPane;
	private JTextField textoUsuario;
	private JTextField textoContrasena;
	
	Usuario usuario = new Usuario("Iker","123456789");
	String nombreUsuario = usuario.getNombre();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicial frame = new Inicial();
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
	public Inicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAplicacionDeAlumnos = new JLabel("APLICACI\u00D3N DE ALUMNOS");
		lblAplicacionDeAlumnos.setBounds(87, 29, 272, 14);
		lblAplicacionDeAlumnos.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		contentPane.add(lblAplicacionDeAlumnos);
		
		JLabel lblUsuario = new JLabel("USUARIO:");
		lblUsuario.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblUsuario.setBounds(87, 99, 91, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasena = new JLabel("CONTRASE\u00D1A:");
		lblContrasena.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblContrasena.setBounds(87, 146, 113, 14);
		contentPane.add(lblContrasena);
		
		textoUsuario = new JTextField();
		textoUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textoUsuario.setBounds(227, 97, 86, 20);
		contentPane.add(textoUsuario);
		textoUsuario.setColumns(10);
		
		textoContrasena = new JTextField();
		textoContrasena.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textoContrasena.setBounds(227, 144, 86, 20);
		contentPane.add(textoContrasena);
		textoContrasena.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textoUsuario.getText().equals(usuario.getNombre()) && textoContrasena.getText().equals(usuario.getPassword())){
					entrarComprobacion();
				}else{
					JOptionPane.showMessageDialog(getContentPane(), "ERROR. Usuario y/o contraseña incorrectos.","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnEntrar.setBounds(227, 209, 89, 23);
		contentPane.add(btnEntrar);
	
	}

	protected void entrarComprobacion() {
		
		// TODO Auto-generated method stub
		Comprobacion comprobacion = new Comprobacion(nombreUsuario);
		comprobacion.setVisible(true);
	}
}