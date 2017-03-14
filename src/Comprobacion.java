import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Comprobacion extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the dialog.
	 */
	public Comprobacion(JFrame inicial, boolean modal, String usuario) {
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblOngiEtorri = new JLabel("ONGI ETORRI");
			lblOngiEtorri.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblOngiEtorri.setBounds(150, 98, 146, 14);
			contentPanel.add(lblOngiEtorri);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnContinuar = new JButton("Continuar");
				btnContinuar.setActionCommand("OK");
				buttonPane.add(btnContinuar);
				getRootPane().setDefaultButton(btnContinuar);
			}
		}
	}
}
