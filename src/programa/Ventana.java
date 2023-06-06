package programa;

import java.awt.EventQueue;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;

public class Ventana {

	private JFrame frame;
	private Main main;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 967, 622);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel Inicio = new JPanel();
		Inicio.setBackground(Color.BLACK);
		Inicio.setBounds(0, 0, 951, 583);
		frame.getContentPane().add(Inicio);
		Inicio.setLayout(null);
		
		
		JLabel tag1 = new JLabel("Super Mercado De Broklin");
		tag1.setBackground(Color.BLACK);
		tag1.setHorizontalAlignment(SwingConstants.CENTER);
		tag1.setSize(312, 42);
		tag1.setFont(new Font("Arial", Font.BOLD, 20));
		tag1.setForeground(Color.RED);
		tag1.setLocation(282, 11);
		Inicio.add(tag1);
		
		
		JLabel tag2 = new JLabel("Direccion : pico de orizaba y santa alicia ");
		tag2.setSize(443, 36);
		tag2.setBackground(Color.BLACK);
		tag2.setHorizontalAlignment(SwingConstants.CENTER);
		tag1.setSize(312, 75);
		tag2.setFont(new Font("Arial", Font.BOLD, 20));
		tag2.setForeground(Color.RED);
		tag2.setLocation(214, 65);
		Inicio.add(tag2);
		
		
		JLabel tag3 = new JLabel("numero de telefono : 61235887443");
		tag3.setBackground(Color.BLACK);
		tag3.setHorizontalAlignment(SwingConstants.CENTER);
		tag3.setSize(410, 34);
		tag3.setFont(new Font("Arial", Font.BOLD, 20));
		tag3.setForeground(Color.RED);
		tag3.setLocation(225, 112);
		Inicio.add(tag3);
		
		
		JLabel tag4 = new JLabel("Codigo Postal: 23080");
		tag4.setBackground(Color.BLACK);
		tag4.setHorizontalAlignment(SwingConstants.CENTER);
		tag4.setSize(312, 24);
		tag4.setFont(new Font("Arial", Font.BOLD, 20));
		tag4.setForeground(Color.RED);
		tag4.setLocation(282, 157);
		Inicio.add(tag4);
		
		ImageIcon img1 = new ImageIcon("Logo.jpg");
		JLabel im1 = new JLabel(img1);
		im1.setHorizontalAlignment(SwingConstants.LEFT);
		im1.setBounds(26, 38, 139, 126);

		Image esc1 = img1.getImage().getScaledInstance(im1.getWidth(), im1.getHeight(), Image.SCALE_SMOOTH);
		Icon ices1 = new ImageIcon(esc1);
		im1.setIcon(ices1);
		Inicio.add(im1);
		

		ImageIcon img2 = new ImageIcon("Logotipo.png");
		JLabel im2 = new JLabel(img2);
		im2.setHorizontalAlignment(SwingConstants.LEFT);
		im2.setBounds(745, 24, 149, 165);

		Image esc2 = img2.getImage().getScaledInstance(im2.getWidth(), im2.getHeight(), Image.SCALE_SMOOTH);
		Icon ices2 = new ImageIcon(esc2);
		im2.setIcon(ices2);
		Inicio.add(im2);
		
		///CREAR PERSONA
		JButton persona = new JButton("Crear persona");
		persona.setBounds(189, 238, 163, 34);
		Inicio.add(persona);
		persona.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				main.crearPersona();
			}});
		
		
		//// ELIMINAR PERSONA
		JButton eliminar = new JButton("Elimniiar Persona");
		eliminar.setBounds(362, 238, 165, 34);
		Inicio.add(eliminar);
		eliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			}});
		
		/////CREAR AL PROVEDOR
		JButton provedor = new JButton("Crear provedor");
		provedor.setBounds(541, 238, 183, 34);
		Inicio.add(provedor);
		
		//// ELIMINAR EL PROVEDOR
		JButton eliminar1= new JButton("Eliminar Provedor");
		eliminar1.setBounds(734, 238, 183, 34);
		Inicio.add(eliminar1);
		
		
		//// CREAR AL EMPLEADO
		JButton empleado = new JButton("Crear empleado");
		empleado.setBounds(10, 238, 165, 34);
		Inicio.add(empleado);
		
		//// ELIMINAR AL EMPLEADO
		JButton eliminar3 = new JButton("Eliminar Empleado");
		eliminar3.setBounds(10, 303, 164, 34);
		Inicio.add(eliminar3);
		
		
		////CREAR LAS  ORDEN COMPRAS
		JButton compra = new JButton(" Crear Orden de la compra");
		compra.setBounds(184, 303, 168, 34);
		Inicio.add(compra);
		
		
		///// ELIMINAR LAS ORDENES DE COMPRAS
		JButton eliminar4 = new JButton("Eliminar orden la compra");
		eliminar4.setBounds(362, 303, 170, 34);
		Inicio.add(eliminar4);
		
		
		
		////// CREAR EL PRODUCTO
		JButton producto= new JButton("Crear producto");
		producto.setBounds(541, 303, 183, 34);
		Inicio.add(producto);
		
		
		
		///// ELIMINAR  EL PRODUCTO
		JButton eliminar5 = new JButton("Eliminiar producto");
		eliminar5.setBounds(734, 303, 183, 34);
		Inicio.add(eliminar5);
		
		
		
		
		////// CREAR LA ORDEH DEL PEDIDO
		JButton orden = new JButton("Crear la orden del pedido");
		orden.setBounds(10, 374, 165, 35);
		Inicio.add(orden);
		
		
		////////  ELIMINAR LA ORDEN DE LOS PEDIDOS
		
		JButton eliminar6 = new JButton("Eliminar la orden del pedido");
		eliminar6.setBounds(184, 374, 168, 35);
		Inicio.add(eliminar6);
		
		
		/////// CREAR EL LOCAL
		
		JButton local= new JButton("Crear el Local");
		local.setBounds(362, 374, 170, 35);
		Inicio.add(local);
		
		
		////// ELIMINAR EL LOCAL
		JButton eliminar7 = new JButton("Eliminar el Local");
		eliminar7.setBounds(541, 374, 183, 35);
		Inicio.add(eliminar7);
		
		
		
		///// SUBIR LOS DATOS A LA BASE 
		JButton  subir= new JButton("Subir Los Datos a la base");
		subir.setBounds(734, 374, 183, 35);
		Inicio.add(subir);
		
		
		///// BOTON DE VISUALIZAR LA BASE
		JButton visualizar = new JButton("Visualizar la base");
		visualizar.setBounds(360, 453, 192, 36);
		Inicio.add(visualizar);
		
	}

}
