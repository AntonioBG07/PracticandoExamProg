package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class VentanaFormulario {

	private JFrame frmFormularioAlumno;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFormulario window = new VentanaFormulario();
					window.frmFormularioAlumno.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaFormulario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFormularioAlumno = new JFrame();
		frmFormularioAlumno.setTitle("Formulario Alumno");
		frmFormularioAlumno.setBounds(100, 100, 474, 282);
		frmFormularioAlumno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFormularioAlumno.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(22, 21, 66, 14);
		frmFormularioAlumno.getContentPane().add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblApellidos.setBounds(22, 57, 66, 19);
		frmFormularioAlumno.getContentPane().add(lblApellidos);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEdad.setBounds(22, 100, 52, 14);
		frmFormularioAlumno.getContentPane().add(lblEdad);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDni.setBounds(22, 143, 46, 14);
		frmFormularioAlumno.getContentPane().add(lblDni);
		
		textField = new JTextField();
		textField.setBounds(96, 20, 86, 20);
		frmFormularioAlumno.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(96, 58, 86, 20);
		frmFormularioAlumno.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(96, 99, 86, 20);
		frmFormularioAlumno.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(96, 142, 86, 20);
		frmFormularioAlumno.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Programacion");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBounds(266, 18, 109, 23);
		frmFormularioAlumno.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Entorno de Desarrollo");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setBounds(266, 44, 156, 23);
		frmFormularioAlumno.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Bases de Datos");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_2.setBounds(266, 70, 156, 23);
		frmFormularioAlumno.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Sistemas Informaticos");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_3.setBounds(266, 97, 156, 23);
		frmFormularioAlumno.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Lenguaje de Marcas");
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_4.setBounds(266, 123, 156, 23);
		frmFormularioAlumno.getContentPane().add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("FOL");
		rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_5.setBounds(266, 151, 109, 23);
		frmFormularioAlumno.getContentPane().add(rdbtnNewRadioButton_5);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(172, 197, 109, 36);
		frmFormularioAlumno.getContentPane().add(btnGuardar);
		
		JButton button = new JButton("<");
		button.setBounds(110, 197, 52, 36);
		frmFormularioAlumno.getContentPane().add(button);
		
		JButton button_1 = new JButton(">");
		button_1.setBounds(291, 197, 52, 36);
		frmFormularioAlumno.getContentPane().add(button_1);
	}
}
