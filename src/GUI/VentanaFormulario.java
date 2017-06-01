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
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblDni;
	private JLabel lblEdad;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnNewRadioButton_3;
	private JRadioButton rdbtnNewRadioButton_4;
	private JRadioButton rdbtnNewRadioButton_5;
	private JButton btnGuardar;
	private JButton button;
	private JButton button_1;

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
		componentsInitializers();
		componentsAdders();
		componentsProperties();
	}

	private void componentsInitializers(){
		frmFormularioAlumno = new JFrame();
		lblNombre = new JLabel("Nombre:");
		lblApellidos = new JLabel("Apellidos:");
		lblDni = new JLabel("DNI:");
		lblEdad = new JLabel("Edad:");
		textField = new JTextField();
		textField_1 = new JTextField();
		textField_2 = new JTextField();
		textField_3 = new JTextField();
		rdbtnNewRadioButton = new JRadioButton("Programacion");
		rdbtnNewRadioButton_1 = new JRadioButton("Entorno de Desarrollo");
		rdbtnNewRadioButton_2 = new JRadioButton("Bases de Datos");
		rdbtnNewRadioButton_3 = new JRadioButton("Sistemas Informaticos");
		rdbtnNewRadioButton_4 = new JRadioButton("Lenguaje de Marcas");
		rdbtnNewRadioButton_5 = new JRadioButton("FOL");
		btnGuardar = new JButton("Guardar");
		button = new JButton("<");
		button_1 = new JButton(">");
		
	}
	
	private void componentsAdders(){
		frmFormularioAlumno.getContentPane().add(lblNombre);
		frmFormularioAlumno.getContentPane().add(lblApellidos);
		frmFormularioAlumno.getContentPane().add(lblEdad);
		frmFormularioAlumno.getContentPane().add(lblDni);
		frmFormularioAlumno.getContentPane().add(textField);
		frmFormularioAlumno.getContentPane().add(textField_1);
		frmFormularioAlumno.getContentPane().add(textField_2);
		frmFormularioAlumno.getContentPane().add(textField_3);
		frmFormularioAlumno.getContentPane().add(rdbtnNewRadioButton);
		frmFormularioAlumno.getContentPane().add(rdbtnNewRadioButton_1);
		frmFormularioAlumno.getContentPane().add(rdbtnNewRadioButton_2);
		frmFormularioAlumno.getContentPane().add(rdbtnNewRadioButton_3);
		frmFormularioAlumno.getContentPane().add(rdbtnNewRadioButton_4);
		frmFormularioAlumno.getContentPane().add(rdbtnNewRadioButton_5);
		frmFormularioAlumno.getContentPane().add(btnGuardar);
		frmFormularioAlumno.getContentPane().add(button);
		frmFormularioAlumno.getContentPane().add(button_1);
	}
	
	private void componentsProperties() {
		
		
		frmFormularioAlumno.setTitle("Formulario Alumno");
		frmFormularioAlumno.setBounds(100, 100, 474, 282);
		frmFormularioAlumno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFormularioAlumno.getContentPane().setLayout(null);
		
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(22, 21, 66, 14);
		
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblApellidos.setBounds(22, 57, 66, 19);
		
		
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEdad.setBounds(22, 100, 52, 14);
		
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDni.setBounds(22, 143, 46, 14);
		
		textField.setBounds(96, 20, 86, 20);
		textField.setColumns(10);
		
		textField_1.setBounds(96, 58, 86, 20);
		textField_1.setColumns(10);
		
		textField_2.setBounds(96, 99, 86, 20);
		textField_2.setColumns(10);
		
		textField_3.setBounds(96, 142, 86, 20);
		textField_3.setColumns(10);
		
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBounds(266, 18, 109, 23);
		
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setBounds(266, 44, 156, 23);
		
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_2.setBounds(266, 70, 156, 23);
		
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_3.setBounds(266, 97, 156, 23);
		
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_4.setBounds(266, 123, 156, 23);
		
		rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_5.setBounds(266, 151, 109, 23);
		
		btnGuardar.setBounds(172, 197, 109, 36);
		
		button.setBounds(110, 197, 52, 36);
		
		button_1.setBounds(291, 197, 52, 36);
		
	}
}
