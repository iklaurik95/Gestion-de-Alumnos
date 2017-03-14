import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class EntradaDatos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textoMatricula;
	private JTextField textoNombre;
	private JTextField textoApellido;
	private JTextField textoEdad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EntradaDatos dialog = new EntradaDatos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public EntradaDatos() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblMatricula = new JLabel("N\u00BA MATRICULA");
			lblMatricula.setFont(new Font("Times New Roman", Font.ITALIC, 14));
			lblMatricula.setBounds(79, 56, 117, 14);
			contentPanel.add(lblMatricula);
		}
		{
			JLabel lblNombre = new JLabel("NOMBRE:");
			lblNombre.setFont(new Font("Times New Roman", Font.ITALIC, 14));
			lblNombre.setBounds(79, 100, 96, 14);
			contentPanel.add(lblNombre);
		}
		{
			JLabel lblApellido = new JLabel("APELLIDO:");
			lblApellido.setFont(new Font("Times New Roman", Font.ITALIC, 14));
			lblApellido.setBounds(79, 139, 96, 14);
			contentPanel.add(lblApellido);
		}
		{
			JLabel lblEdad = new JLabel("EDAD:");
			lblEdad.setFont(new Font("Times New Roman", Font.ITALIC, 14));
			lblEdad.setBounds(79, 187, 71, 14);
			contentPanel.add(lblEdad);
		}
		{
			textoMatricula = new JTextField();
			textoMatricula.setBounds(226, 54, 128, 20);
			contentPanel.add(textoMatricula);
			textoMatricula.setColumns(10);
		}
		{
			textoNombre = new JTextField();
			textoNombre.setBounds(226, 98, 128, 20);
			contentPanel.add(textoNombre);
			textoNombre.setColumns(10);
		}
		{
			textoApellido = new JTextField();
			textoApellido.setBounds(226, 137, 128, 20);
			contentPanel.add(textoApellido);
			textoApellido.setColumns(10);
		}
		{
			textoEdad = new JTextField();
			textoEdad.setBounds(226, 185, 128, 20);
			contentPanel.add(textoEdad);
			textoEdad.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnGuardar = new JButton("Guardar");
				btnGuardar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
				btnGuardar.setActionCommand("OK");
				buttonPane.add(btnGuardar);
				getRootPane().setDefaultButton(btnGuardar);
			}
		}
	}

}
