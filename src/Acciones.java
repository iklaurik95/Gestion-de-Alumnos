import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Acciones extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JComboBox listaAlumno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Acciones dialog = new Acciones();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Acciones() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		listaAlumno = new JComboBox();
		listaAlumno.setBounds(286, 70, 108, 20);
		contentPanel.add(listaAlumno);
		
		JLabel lblDatosDelAlumno = new JLabel("DATOS DEL ALUMNO");
		lblDatosDelAlumno.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblDatosDelAlumno.setBounds(125, 25, 208, 14);
		contentPanel.add(lblDatosDelAlumno);
		
		JButton btnIntroducir = new JButton("Introducir");
		btnIntroducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirVentanaEntradaDatos();
			}
		});
		btnIntroducir.setBounds(106, 84, 89, 23);
		contentPanel.add(btnIntroducir);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaAlumno.removeItemAt(listaAlumno.getSelectedIndex());
			}
		});
		btnBorrar.setBounds(106, 133, 89, 23);
		contentPanel.add(btnBorrar);
		
		JButton btnEdadMedia = new JButton("Edad Media");
		btnEdadMedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String alumno;
				int edad =0;
				int total =0;
				int tamano = listaAlumno.getItemCount();
				
				for(int i=0;i<tamano;i++){
					alumno = String.valueOf(listaAlumno.getItemAt(i));
					String[] partes = alumno.split(":");
					total=total+edad;				
				}
				
				double media = (double)total/(double)tamano;
				//JOptionPane.showMessageDialog(this,"La media es: " + media,JOptionPane.OK_OPTION);
			}
		});
		btnEdadMedia.setBounds(106, 181, 113, 23);
		contentPanel.add(btnEdadMedia);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
	
	protected void abrirVentanaEntradaDatos() {
		// TODO Auto-generated method stub
		EntradaDatos entradaDatos = new EntradaDatos();
		entradaDatos.setVisible(true);
	}

	public void anadirAlumno (Alumno alumno){
		this.listaAlumno.addItem(alumno.getNombre() + " " + alumno.getApellido() + " - " + alumno.getEdad());
	}

}
