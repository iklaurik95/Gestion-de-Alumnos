import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Comprobacion extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the dialog.
	 */
	public Comprobacion(String usuario) {
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblOngiEtorri = new JLabel("ONGI ETORRI" + " " + usuario);
			lblOngiEtorri.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblOngiEtorri.setBounds(150, 98, 216, 14);
			contentPanel.add(lblOngiEtorri);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnContinuar = new JButton("Continuar");
				btnContinuar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						abrirVentanaAcciones();
					}
				});
				btnContinuar.setActionCommand("OK");
				buttonPane.add(btnContinuar);
				getRootPane().setDefaultButton(btnContinuar);
			}
		}
	}

	protected void abrirVentanaAcciones() {
		// TODO Auto-generated method stub
		Acciones acciones = new Acciones();
		acciones.setVisible(true);
		dispose();
	}
}