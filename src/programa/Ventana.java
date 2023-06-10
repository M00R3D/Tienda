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
import java.awt.CardLayout;

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
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		// EL PANEL DE INICIO 
		JPanel Inicio = new JPanel();
		Inicio.setBackground(Color.BLACK);
		frame.getContentPane().add(Inicio, "name_389654173536400");
		Inicio.setLayout(null);
		
		////NOMBRE DEL SUPERMERCADO
		JLabel tag1 = new JLabel("Super Mercado Del multiverse");
		tag1.setBackground(Color.BLACK);
		tag1.setHorizontalAlignment(SwingConstants.CENTER);
		tag1.setSize(312, 42);
		tag1.setFont(new Font("Arial", Font.BOLD, 20));
		tag1.setForeground(Color.RED);
		tag1.setLocation(282, 11);
		Inicio.add(tag1);
		
		///// DIRECCION  DEL SUPER MERCADO
		JLabel tag2 = new JLabel("Direccion : pico de orizaba y santa alicia ");
		tag2.setSize(443, 36);
		tag2.setBackground(Color.BLACK);
		tag2.setHorizontalAlignment(SwingConstants.CENTER);
		tag1.setSize(312, 75);
		tag2.setFont(new Font("Arial", Font.BOLD, 20));
		tag2.setForeground(Color.RED);
		tag2.setLocation(214, 65);
		Inicio.add(tag2);
		
		//// NUMERO DE TELEFONO DEL SUPER MERCADO
		JLabel tag3 = new JLabel("numero de telefono : 61235887443");
		tag3.setBackground(Color.BLACK);
		tag3.setHorizontalAlignment(SwingConstants.CENTER);
		tag3.setSize(410, 34);
		tag3.setFont(new Font("Arial", Font.BOLD, 20));
		tag3.setForeground(Color.RED);
		tag3.setLocation(225, 112);
		Inicio.add(tag3);
		
		//// CODIGO POSTAL DEL SUPER 
		JLabel tag4 = new JLabel("Codigo Postal: 23080");
		tag4.setBackground(Color.BLACK);
		tag4.setHorizontalAlignment(SwingConstants.CENTER);
		tag4.setSize(312, 24);
		tag4.setFont(new Font("Arial", Font.BOLD, 20));
		tag4.setForeground(Color.RED);
		tag4.setLocation(282, 157);
		Inicio.add(tag4);
		
		//////TITULO DE CREAR PERSONA
		JLabel tag5 = new JLabel("CREAR PERSONA");
		tag5.setBackground(Color.BLACK);
		tag5.setHorizontalAlignment(SwingConstants.CENTER);
		tag5.setSize(312, 24);
		tag5.setFont(new Font("Arial", Font.BOLD, 20));
		tag5.setForeground(Color.RED);
		tag5.setLocation(40, 234);
		Inicio.add(tag5);
		
		
		///// TITULO DE ORDEN DEL PEDIDO
		JLabel tag6 = new JLabel("ORDEN DEL PEDIDO");
		tag6.setBackground(Color.BLACK);
		tag6.setHorizontalAlignment(SwingConstants.CENTER);
		tag6.setSize(312, 24);
		tag6.setFont(new Font("Arial", Font.BOLD, 20));
		tag6.setForeground(Color.RED);
		tag6.setLocation(487, 234);
		Inicio.add(tag6);
		
		///// TITULO DEL PROVEDOR
		JLabel tag7 = new JLabel("PROVEDOR");
		tag7.setBackground(Color.BLACK);
		tag7.setHorizontalAlignment(SwingConstants.CENTER);
		tag7.setSize(312, 24);
		tag7.setFont(new Font("Arial", Font.BOLD, 20));
		tag7.setForeground(Color.RED);
		tag7.setLocation(40, 366);
		Inicio.add(tag7);
		
		////// TITULO DEL EMPLEADO
		JLabel tag8 = new JLabel("EMPLEADO");
		tag8.setBackground(Color.BLACK);
		tag8.setHorizontalAlignment(SwingConstants.CENTER);
		tag8.setSize(312, 24);
		tag8.setFont(new Font("Arial", Font.BOLD, 20));
		tag8.setForeground(Color.RED);
		tag8.setLocation(487, 366);
		Inicio.add(tag8);
		
		////// TITULO DE LA ORDEN DE COMPRA
		JLabel tag9= new JLabel("ORDEN DE LA COMPRA");
		tag9.setBackground(Color.BLACK);
		tag9.setHorizontalAlignment(SwingConstants.CENTER);
		tag9.setSize(312, 24);
		tag9.setFont(new Font("Arial", Font.BOLD, 20));
		tag9.setForeground(Color.RED);
		tag9.setLocation(257, 474);
		Inicio.add(tag9);
		
		
		//// LOGOS DEL SUPER
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
		persona.setBounds(40, 292, 149, 34);
		Inicio.add(persona);
		persona.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				main.crearPersona();
			}});
		
		
		//// ELIMINAR PERSONA
		JButton eliminar = new JButton("Eliminar Persona");
		eliminar.setBounds(203, 292, 149, 34);
		Inicio.add(eliminar);
		eliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			}});
		
		/////CREAR AL PROVEDOR
		JButton provedor = new JButton("Crear provedor");
		provedor.setBounds(38, 414, 149, 34);
		Inicio.add(provedor);
		
		//// ELIMINAR EL PROVEDOR
		JButton eliminar1= new JButton("Eliminar Provedor");
		eliminar1.setBounds(203, 414, 149, 34);
		Inicio.add(eliminar1);
		
		
		//// CREAR AL EMPLEADO
		JButton empleado = new JButton("Crear empleado");
		empleado.setBounds(429, 414, 197, 34);
		Inicio.add(empleado);
		
		//// ELIMINAR AL EMPLEADO
		JButton eliminar3 = new JButton("Eliminar Empleado");
		eliminar3.setBounds(655, 414, 205, 34);
		Inicio.add(eliminar3);
		
		
		////CREAR LAS  ORDEN COMPRAS
		JButton compra = new JButton(" Crear Orden de la compra");
		compra.setBounds(213, 509, 206, 34);
		Inicio.add(compra);
		
		
		///// ELIMINAR LAS ORDENES DE COMPRAS
		JButton eliminar4 = new JButton("Eliminar orden la compra");
		eliminar4.setBounds(429, 509, 206, 34);
		Inicio.add(eliminar4);
		
		
		////// CREAR LA ORDEH DEL PEDIDO
		JButton orden = new JButton("Crear la orden del pedido");
		orden.setBounds(429, 292, 206, 35);
		Inicio.add(orden);
		
		
		////////  ELIMINAR LA ORDEN DE LOS PEDIDOS
		
		JButton eliminar6 = new JButton("Eliminar la orden del pedido");
		eliminar6.setBounds(655, 292, 197, 35);
		Inicio.add(eliminar6);
		
		JPanel crearpersona = new JPanel();
		crearpersona.setBackground(Color.BLUE);
		frame.getContentPane().add(crearpersona, "name_389654187339800");
		crearpersona.setLayout(null);
		

		//////TITULO DE CREAR PERSONA
		JLabel tag10 = new JLabel("BIENVENIDO A LA SESION DE CREAR PERSONA");
		tag10.setBackground(Color.BLACK);
		tag10.setHorizontalAlignment(SwingConstants.CENTER);
		tag10.setSize(491, 45);
		tag10.setFont(new Font("Arial", Font.BOLD, 20));
		tag10.setForeground(Color.RED);
		tag10.setLocation(196, 38);
		crearpersona.add(tag10);
		
		
		//// LOGOS DEL SUPER
		ImageIcon img3 = new ImageIcon("Logo1.png");
		JLabel im3 = new JLabel(img3);
		im3.setHorizontalAlignment(SwingConstants.LEFT);
		im3.setBounds(42, 25, 124, 138);

		Image esc3 = img3.getImage().getScaledInstance(im3.getWidth(), im3.getHeight(), Image.SCALE_SMOOTH);
		Icon ices3 = new ImageIcon(esc3);
		im3.setIcon(ices3);
		crearpersona.add(im3);
		

		ImageIcon img4 = new ImageIcon("Logotipo1.png");
		JLabel im4 = new JLabel(img4);
		im4.setHorizontalAlignment(SwingConstants.LEFT);
		im4.setBounds(745, 24, 149, 157);

		Image esc4 = img4.getImage().getScaledInstance(im4.getWidth(), im4.getHeight(), Image.SCALE_SMOOTH);
		Icon ices4 = new ImageIcon(esc4);
		im4.setIcon(ices4);
		crearpersona.add(im4);
		
		JPanel Crearpedido = new JPanel();
		Crearpedido.setBackground(Color.WHITE);
		frame.getContentPane().add(Crearpedido, "name_389654201308900");
		Crearpedido.setLayout(null);
		
	//////TITULO DE CREAR PEDIDOS
			JLabel tag11 = new JLabel("BIENVENIDO A LA SESION DE PEDIDOS");
			tag11.setBackground(Color.BLACK);
			tag11.setHorizontalAlignment(SwingConstants.CENTER);
			tag11.setSize(454, 45);
			tag11.setFont(new Font("Arial", Font.BOLD, 20));
			tag11.setForeground(Color.PINK);
			tag11.setLocation(208, 41);
			Crearpedido.add(tag11);
			
			
			//// LOGOS DEL SUPER
			ImageIcon img5 = new ImageIcon("Logo2.png");
			JLabel im5 = new JLabel(img5);
			im5.setHorizontalAlignment(SwingConstants.LEFT);
			im5.setBounds(42, 11, 124, 187);

			Image esc5 = img5.getImage().getScaledInstance(im5.getWidth(), im5.getHeight(), Image.SCALE_SMOOTH);
			Icon ices5 = new ImageIcon(esc5);
			im5.setIcon(ices5);
			Crearpedido.add(im5);
			

			ImageIcon img6 = new ImageIcon("Logotipo2.png");
			JLabel im6 = new JLabel(img6);
			im6.setHorizontalAlignment(SwingConstants.LEFT);
			im6.setBounds(738, 25, 149, 187);

			Image esc6 = img6.getImage().getScaledInstance(im6.getWidth(), im6.getHeight(), Image.SCALE_SMOOTH);
			Icon ices6 = new ImageIcon(esc6);
			im6.setIcon(ices6);
			Crearpedido.add(im6);
		
		
		JPanel Crearprovedor = new JPanel();
		Crearprovedor.setBackground(Color.RED);
		frame.getContentPane().add(Crearprovedor, "name_389654215556400");
		Crearprovedor.setLayout(null);
		
		//////TITULO DE CREAR PERSONA
				JLabel tag12 = new JLabel("BIENVENIDO A LA SESION DE PEDIDO");
				tag12.setBackground(Color.BLACK);
				tag12.setHorizontalAlignment(SwingConstants.CENTER);
				tag12.setSize(387, 45);
				tag12.setFont(new Font("Arial", Font.BOLD, 20));
				tag12.setForeground(Color.WHITE);
				tag12.setLocation(245, 35);
				Crearprovedor.add(tag12);
				
				
				//// LOGOS DEL SUPER
				ImageIcon img7 = new ImageIcon("Logo3.png");
				JLabel im7 = new JLabel(img7);
				im7.setHorizontalAlignment(SwingConstants.LEFT);
				im7.setBounds(42, 25, 124, 157);

				Image esc7 = img7.getImage().getScaledInstance(im7.getWidth(), im7.getHeight(), Image.SCALE_SMOOTH);
				Icon ices7 = new ImageIcon(esc7);
				im7.setIcon(ices7);
				Crearprovedor.add(im7);
				

				ImageIcon img8 = new ImageIcon("Logotipo3.png");
				JLabel im8 = new JLabel(img8);
				im8.setHorizontalAlignment(SwingConstants.LEFT);
				im8.setBounds(738, 25, 149, 172);

				Image esc8= img8.getImage().getScaledInstance(im8.getWidth(), im8.getHeight(), Image.SCALE_SMOOTH);
				Icon ices8 = new ImageIcon(esc8);
				im8.setIcon(ices8);
				Crearprovedor.add(im8);
		
		
		
		JPanel Crearempleado = new JPanel();
		Crearempleado.setBackground(Color.BLACK);
		frame.getContentPane().add(Crearempleado, "name_389654229685100");
		Crearempleado.setLayout(null);
		
		//////TITULO DE CREAR EMPLEADO
					JLabel tag13 = new JLabel("BIEVENIDO A LA SESION DE EMPLEADO");
					tag13.setBackground(Color.BLACK);
					tag13.setHorizontalAlignment(SwingConstants.CENTER);
					tag13.setSize(429, 45);
					tag13.setFont(new Font("Arial", Font.BOLD, 20));
					tag13.setForeground(Color.WHITE);
					tag13.setLocation(229, 36);
					Crearempleado.add(tag13);
					
					
					//// LOGOS DEL SUPER
					ImageIcon img9 = new ImageIcon("Logo4.png");
					JLabel im9 = new JLabel(img9);
					im9.setHorizontalAlignment(SwingConstants.LEFT);
					im9.setBounds(42, 25, 177, 172);

					Image esc9 = img9.getImage().getScaledInstance(im9.getWidth(), im9.getHeight(), Image.SCALE_SMOOTH);
					Icon ices9 = new ImageIcon(esc9);
					im9.setIcon(ices9);
					Crearempleado.add(im9);
					

					ImageIcon img10 = new ImageIcon("Logotipo4.png");
					JLabel im10 = new JLabel(img10);
					im10.setHorizontalAlignment(SwingConstants.LEFT);
					im10.setBounds(700, 25, 187, 229);

					Image esc10= img10.getImage().getScaledInstance(im10.getWidth(), im10.getHeight(), Image.SCALE_SMOOTH);
					Icon ices10 = new ImageIcon(esc10);
					im10.setIcon(ices10);
					Crearempleado.add(im10);
			
		
		JPanel Crearcompra = new JPanel();
		Crearcompra.setBackground(Color.RED);
		frame.getContentPane().add(Crearcompra, "name_389654242683100");
		Crearcompra.setLayout(null);
		
		
		//////TITULO DE CREAR COMPRA
					JLabel tag14 = new JLabel("BIEVENIDO A LA SESION DE COMPRAS");
					tag14.setBackground(Color.BLACK);
					tag14.setHorizontalAlignment(SwingConstants.CENTER);
					tag14.setSize(429, 45);
					tag14.setFont(new Font("Arial", Font.BOLD, 20));
					tag14.setForeground(Color.WHITE);
					tag14.setLocation(229, 36);
					Crearcompra.add(tag14);
					
					
					//// LOGOS DEL SUPER
					ImageIcon img11 = new ImageIcon("Logo5.png");
					JLabel im11 = new JLabel(img11);
					im11.setHorizontalAlignment(SwingConstants.LEFT);
					im11.setBounds(42, 25, 177, 172);

					Image esc11 = img11.getImage().getScaledInstance(im11.getWidth(), im11.getHeight(), Image.SCALE_SMOOTH);
					Icon ices11 = new ImageIcon(esc11);
					im11.setIcon(ices11);
					Crearcompra.add(im11);
					

					ImageIcon img12 = new ImageIcon("Logotipo5.png");
					JLabel im12 = new JLabel(img12);
					im12.setHorizontalAlignment(SwingConstants.LEFT);
					im12.setBounds(700, 25, 187, 184);

					Image esc12= img12.getImage().getScaledInstance(im12.getWidth(), im12.getHeight(), Image.SCALE_SMOOTH);
					Icon ices12 = new ImageIcon(esc12);
					im12.setIcon(ices12);
					Crearcompra.add(im12);
			
		
	
		///////trqbajo
	}
}
