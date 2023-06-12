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
	private JPanel gran_panel;
	private String actual="Inicio";
	private String anterior="Inicio";
	private String subPanelPedidos="loby",subPanelProvedor="loby",subPanelEmpleados="loby",subPanelProductos="loby";

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
		route();
	}
	
	
	public JPanel Inicio()
	{
		// EL PANEL DE INICIO
		JPanel Inicio = new JPanel();
		Inicio.setBackground(Color.BLACK);
		frame.getContentPane().add(Inicio, "name_389654173536400");
		Inicio.setLayout(null);
		// NOMBRE DEL SUPERMERCADO
		JLabel tag1 = new JLabel("Super Mercado Del multiverse");
		tag1.setBackground(Color.BLACK);
		tag1.setHorizontalAlignment(SwingConstants.CENTER);
		tag1.setSize(312, 42);
		tag1.setFont(new Font("Arial", Font.BOLD, 20));
		tag1.setForeground(Color.RED);
		tag1.setLocation(282, 11);
		Inicio.add(tag1);
		// DIRECCION DEL SUPER MERCADO
		JLabel tag2 = new JLabel("Direccion : pico de orizaba y santa alicia ");
		tag2.setSize(443, 36);
		tag2.setBackground(Color.BLACK);
		tag2.setHorizontalAlignment(SwingConstants.CENTER);
		tag1.setSize(312, 75);
		tag2.setFont(new Font("Arial", Font.BOLD, 20));
		tag2.setForeground(Color.RED);
		tag2.setLocation(214, 65);
		Inicio.add(tag2);
		// NUMERO DE TELEFONO DEL SUPER MERCADO
		JLabel tag3 = new JLabel("numero de telefono : 61235887443");
		tag3.setBackground(Color.BLACK);
		tag3.setHorizontalAlignment(SwingConstants.CENTER);
		tag3.setSize(410, 34);
		tag3.setFont(new Font("Arial", Font.BOLD, 20));
		tag3.setForeground(Color.RED);
		tag3.setLocation(225, 112);
		Inicio.add(tag3);
		// CODIGO POSTAL DEL SUPER
		JLabel tag4 = new JLabel("Codigo Postal: 23080");
		tag4.setBackground(Color.BLACK);
		tag4.setHorizontalAlignment(SwingConstants.CENTER);
		tag4.setSize(312, 24);
		tag4.setFont(new Font("Arial", Font.BOLD, 20));
		tag4.setForeground(Color.RED);
		tag4.setLocation(282, 157);
		Inicio.add(tag4);

		// TITULO DE ORDEN DEL PEDIDO
		JLabel tag6 = new JLabel("ORDEN DEL PEDIDO");
		tag6.setBackground(Color.BLACK);
		tag6.setHorizontalAlignment(SwingConstants.CENTER);
		tag6.setSize(312, 24);
		tag6.setFont(new Font("Arial", Font.BOLD, 20));
		tag6.setForeground(Color.RED);
		tag6.setLocation(80, 234);
		Inicio.add(tag6);
		// TITULO DEL PROVEDOR
		JLabel tag7 = new JLabel("PROVEDOR");
		tag7.setBackground(Color.BLACK);
		tag7.setHorizontalAlignment(SwingConstants.CENTER);
		tag7.setSize(312, 24);
		tag7.setFont(new Font("Arial", Font.BOLD, 20));
		tag7.setForeground(Color.RED);
		tag7.setLocation(40, 366);
		Inicio.add(tag7);
		// TITULO DEL EMPLEADO
		JLabel tag8 = new JLabel("EMPLEADO");
		tag8.setBackground(Color.BLACK);
		tag8.setHorizontalAlignment(SwingConstants.CENTER);
		tag8.setSize(312, 24);
		tag8.setFont(new Font("Arial", Font.BOLD, 20));
		tag8.setForeground(Color.RED);
		tag8.setLocation(487, 366);
		Inicio.add(tag8);
		// TITULO DE LA ORDEN DE COMPRA
		JLabel tag9 = new JLabel("CREAR PRODUCTO");
		tag9.setBackground(Color.BLACK);
		tag9.setHorizontalAlignment(SwingConstants.CENTER);
		tag9.setSize(312, 24);
		tag9.setFont(new Font("Arial", Font.BOLD, 20));
		tag9.setForeground(Color.RED);
		tag9.setLocation(500, 234);
		Inicio.add(tag9);
		// LOGOS DEL SUPER
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
		// CREAR AL PROVEDOR
		JButton provedor = new JButton("Crear provedor");
		provedor.setBounds(138, 414, 149, 34);
		provedor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				anterior = actual;
				actual = "Crearprovedor";
				route();
			}});
		Inicio.add(provedor);
		// CREAR AL EMPLEADO
		JButton empleado = new JButton("Crear empleado");
		empleado.setBounds(513, 414, 197, 34);
		empleado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				anterior = actual;
				actual = "Crearempleado";
				route();
			}});
		Inicio.add(empleado);
		// CREAR LAS ORDEN COMPRAS
		JButton producto = new JButton(" Crear Producto");
		producto.setBounds(513, 282, 206, 34);
		producto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				anterior = actual;
				actual = "Crearproducto";
				route();
			}});
		Inicio.add(producto);
		// CREAR LA ORDEH DEL PEDIDO
		JButton orden = new JButton("Crear la orden del pedido");
		orden.setBounds(129, 282, 206, 35);
		orden.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				anterior = actual;
				actual = "Crearpedido";
				route();
			}});
		Inicio.add(orden);
		return Inicio;
	}
	
	public JPanel Crearpedido() 
	{
//////////PANEL DE PEDUDO MAS LOA 2 BOTONES DE CARRITO Y ELIMINAR
		
		JPanel Crearpedido = new JPanel();
		Crearpedido.setBackground(Color.WHITE);
		frame.getContentPane().add(Crearpedido, "name_389654201308900");
		Crearpedido.setLayout(null);
		if(subPanelPedidos=="loby") {CrearpedidoLoby(Crearpedido);}		

		
		return Crearpedido;
	}
						public void CrearpedidoLoby(JPanel Crearpedido) 
						{
								Crearpedido.removeAll();
								JLabel tag11 = new JLabel("BIENVENIDO A LA SESION DE PEDIDOS");
								tag11.setBackground(Color.BLACK);
								tag11.setHorizontalAlignment(SwingConstants.CENTER);
								tag11.setSize(454, 45);
								tag11.setFont(new Font("Arial", Font.BOLD, 20));
								tag11.setForeground(Color.PINK);
								tag11.setLocation(208, 41);
								Crearpedido.add(tag11);
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
								ImageIcon img13 = new ImageIcon("1.png");
								JButton BtnCrearPedido = new JButton(img13);
								BtnCrearPedido .setSize(46, 42);
								BtnCrearPedido.setLocation(50, 220);
								Image esc13 = img13.getImage().getScaledInstance(BtnCrearPedido.getWidth(), BtnCrearPedido.getHeight(), Image.SCALE_SMOOTH);
								Icon ices13 = new ImageIcon(esc13);
								BtnCrearPedido.setIcon(ices13);
								BtnCrearPedido.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent e) {
										subPanelPedidos="crear";
										CrearpedidoCrear(Crearpedido);
										frame.repaint();
									}});
								Crearpedido.add(BtnCrearPedido);
								ImageIcon img14 = new ImageIcon("2.jpeg");
								JButton BtnEliminarPedido = new JButton(img14);
								BtnEliminarPedido.setSize(46, 42);
								BtnEliminarPedido.setLocation(50, 280);
								BtnEliminarPedido.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent e) {
										subPanelPedidos="eliminar";
										CrearpedidoDel(Crearpedido);
										frame.repaint();
									}});
								Image esc14 = img14.getImage().getScaledInstance(BtnEliminarPedido.getWidth(), BtnEliminarPedido.getHeight(), Image.SCALE_SMOOTH);
								Icon ices14 = new ImageIcon(esc14);
								BtnEliminarPedido.setIcon(ices14);
								Crearpedido.add(BtnEliminarPedido);
								ImageIcon img15 = new ImageIcon("3.png");
								JButton BtnBuscarPedidos = new JButton(img15);
								BtnBuscarPedidos.setSize(46, 42);
								BtnBuscarPedidos.setLocation(50, 340);
								BtnBuscarPedidos.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent e) {
										subPanelPedidos="buscar";
										CrearpedidoBus(Crearpedido);
										frame.repaint();
									}});
								Image esc15 = img15.getImage().getScaledInstance(BtnBuscarPedidos.getWidth(), BtnBuscarPedidos.getHeight(), Image.SCALE_SMOOTH);
								Icon ices15 = new ImageIcon(esc15);
								BtnBuscarPedidos.setIcon(ices15);
								Crearpedido.add(BtnBuscarPedidos);
									/////////////// Texto de cada boton
								JLabel agregar = new JLabel("Agregar algo al carrito");
								agregar.setHorizontalAlignment(SwingConstants.CENTER);
								agregar.setSize(276, 53);
								agregar.setFont(new Font("Arial", Font.BOLD, 20));
								agregar.setForeground(Color.decode("#000000"));
								agregar.setLocation(80, 210);
								Crearpedido.add(agregar);
								JLabel eliminar = new JLabel("Eliminar");
								eliminar.setHorizontalAlignment(SwingConstants.CENTER);
								eliminar.setSize(276, 53);
								eliminar.setFont(new Font("Arial", Font.BOLD, 20));
								eliminar.setForeground(Color.decode("#000000"));
								eliminar.setLocation(10, 275);
								Crearpedido.add(eliminar);
								JLabel historial = new JLabel("Historial");
								historial.setHorizontalAlignment(SwingConstants.CENTER);
								historial.setSize(276, 53);
								historial.setFont(new Font("Arial", Font.BOLD, 20));
								historial.setForeground(Color.decode("#000000"));
								historial.setLocation(10, 330);
								Crearpedido.add(historial);
								ImageIcon imgRegresar = new ImageIcon("regresar.png");
								JButton regresar = new JButton(imgRegresar);
								regresar.setBounds(700, 400, 100,100);
								regresar.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent e) {
										if(subPanelPedidos=="loby")
										{anterior = actual;
										actual = "Inicio";
										route();}
									}});
								Crearpedido.add(regresar);
						}
						
						public void CrearpedidoCrear(JPanel Crearpedido) 
						{
								Crearpedido.removeAll();
								JLabel tag11 = new JLabel("BIENVENIDO A LA SESION DE PEDIDOS");
								tag11.setBackground(Color.BLACK);
								tag11.setHorizontalAlignment(SwingConstants.CENTER);
								tag11.setSize(454, 45);
								tag11.setFont(new Font("Arial", Font.BOLD, 20));
								tag11.setForeground(Color.PINK);
								tag11.setLocation(208, 41);
								Crearpedido.add(tag11);
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
								ImageIcon imgRegresar = new ImageIcon("regresar.png");
								JButton regresar = new JButton(imgRegresar);
								regresar.setBounds(700, 400, 100,100);
								regresar.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent e) {
										if(subPanelPedidos=="loby")
										{anterior = actual;
										actual = "Inicio";
										route();}else if(subPanelPedidos=="crear") 
										{
											CrearpedidoLoby(Crearpedido);
											subPanelPedidos="loby";
											frame.repaint();
										}
									}});
								Crearpedido.add(regresar);
						}
						public void CrearpedidoDel(JPanel Crearpedido) 
						{
								Crearpedido.removeAll();
								JLabel tag11 = new JLabel("BIENVENIDO A LA SESION DE PEDIDOS");
								tag11.setBackground(Color.BLACK);
								tag11.setHorizontalAlignment(SwingConstants.CENTER);
								tag11.setSize(454, 45);
								tag11.setFont(new Font("Arial", Font.BOLD, 20));
								tag11.setForeground(Color.PINK);
								tag11.setLocation(208, 41);
								Crearpedido.add(tag11);
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
								ImageIcon imgRegresar = new ImageIcon("regresar.png");
								JButton regresar = new JButton(imgRegresar);
								regresar.setBounds(700, 400, 100,100);
								regresar.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent e) {
										if(subPanelPedidos=="loby")
										{anterior = actual;
										actual = "Inicio";
										route();}else if(subPanelPedidos=="eliminar") 
										{
											subPanelPedidos="loby";
											CrearpedidoLoby(Crearpedido);
											frame.repaint();
										}
									}});
								Crearpedido.add(regresar);
						}
						public void CrearpedidoBus(JPanel Crearpedido) 
						{
								Crearpedido.removeAll();
								JLabel tag11 = new JLabel("BIENVENIDO A LA SESION DE PEDIDOS");
								tag11.setBackground(Color.BLACK);
								tag11.setHorizontalAlignment(SwingConstants.CENTER);
								tag11.setSize(454, 45);
								tag11.setFont(new Font("Arial", Font.BOLD, 20));
								tag11.setForeground(Color.PINK);
								tag11.setLocation(208, 41);
								Crearpedido.add(tag11);
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
								ImageIcon imgRegresar = new ImageIcon("regresar.png");
								JButton regresar = new JButton(imgRegresar);
								regresar.setBounds(700, 400, 100,100);
								regresar.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent e) {
										if(subPanelPedidos=="loby")
										{anterior = actual;
										actual = "Inicio";
										route();}else if(subPanelPedidos=="buscar") 
										{
											subPanelPedidos="loby";
											CrearpedidoLoby(Crearpedido);
											frame.repaint();
										}
									}});
								Crearpedido.add(regresar);
						}
	
	
	JPanel Crearprovedor() 
	{
		JPanel Crearprovedor = new JPanel();
		Crearprovedor.setBackground(Color.RED);
		frame.getContentPane().add(Crearprovedor, "name_389654215556400");
		Crearprovedor.setLayout(null);
		if(subPanelProvedor=="loby") {CrearprovedorLoby(Crearprovedor);}
		return Crearprovedor;
	}
					public void CrearprovedorLoby(JPanel Crearprovedor) 
					{
							Crearprovedor.removeAll();
							////// TITULO DE CREAR PERSONA
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
							Image esc8 = img8.getImage().getScaledInstance(im8.getWidth(), im8.getHeight(), Image.SCALE_SMOOTH);
							Icon ices8 = new ImageIcon(esc8);
							im8.setIcon(ices8);
							Crearprovedor.add(im8);
							JLabel añadirjl = new JLabel("Añadir");
							JLabel iconjl = new JLabel("Eliminar");
							JLabel buscarjl = new JLabel("Buscar");
							añadirjl.setFont(new Font("Arial", Font.BOLD, 20));
							iconjl.setFont(new Font("Arial", Font.BOLD, 20));
							buscarjl.setFont(new Font("Arial", Font.BOLD, 20));
							añadirjl.setBounds(150, 300, 130, 30);
							iconjl.setBounds(150, 350, 130, 30);
							buscarjl.setBounds(150, 400, 130, 30);
							ImageIcon img13 = new ImageIcon("añadir.png");
							ImageIcon img14 = new ImageIcon("Icon1.jpg");
							ImageIcon img15 = new ImageIcon("buscar.jpg");
							JButton añadir = new JButton(img13);
							añadir.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									subPanelProvedor="crear";
									CrearprovedorCrear(Crearprovedor);
									frame.repaint();
								}});
							añadir.setBounds(100, 300, 30, 30);
							JButton eliminar = new JButton(img14);
							eliminar.setBounds(100, 350, 30, 30);
							eliminar.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									subPanelProvedor="eliminar";
									CrearprovedorDel(Crearprovedor);
									frame.repaint();
								}});
							JButton buscar = new JButton(img15);
							buscar.setBounds(100, 400, 30, 30);
							buscar.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									subPanelProvedor="buscar";
									CrearprovedorBuscar(Crearprovedor);
									frame.repaint();
								}});
							ImageIcon imgRegresar = new ImageIcon("regresar.png");
							JButton regresar = new JButton(imgRegresar);
							regresar.setBounds(700, 400, 100,100);
							regresar.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									if(subPanelProvedor=="loby")
									{anterior = actual;
									actual = "Inicio";
									route();}
								}});
							Crearprovedor.add(añadirjl);
							Crearprovedor.add(iconjl);
							Crearprovedor.add(buscarjl);
							Crearprovedor.add(añadir);
							Crearprovedor.add(eliminar);
							Crearprovedor.add(buscar );
							Crearprovedor.add(regresar);
					}
					
					public void CrearprovedorCrear(JPanel Crearprovedor) 
					{
							Crearprovedor.removeAll();
							////// TITULO DE CREAR PERSONA
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
							Image esc8 = img8.getImage().getScaledInstance(im8.getWidth(), im8.getHeight(), Image.SCALE_SMOOTH);
							Icon ices8 = new ImageIcon(esc8);
							im8.setIcon(ices8);
							Crearprovedor.add(im8);
							ImageIcon imgRegresar = new ImageIcon("regresar.png");
							JButton regresar = new JButton(imgRegresar);
							regresar.setBounds(700, 400, 100,100);
							regresar.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									if(subPanelProvedor=="loby")
									{anterior = actual;
									actual = "Inicio";
									route();}else if(subPanelProvedor=="crear") 
									{
										CrearprovedorLoby(Crearprovedor);
										subPanelProvedor="loby";
										frame.repaint();
									}
								}});
							Crearprovedor.add(regresar);
					}
					public void CrearprovedorDel(JPanel Crearprovedor) 
					{
							Crearprovedor.removeAll();
							////// TITULO DE CREAR PERSONA
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
							Image esc8 = img8.getImage().getScaledInstance(im8.getWidth(), im8.getHeight(), Image.SCALE_SMOOTH);
							Icon ices8 = new ImageIcon(esc8);
							im8.setIcon(ices8);
							Crearprovedor.add(im8);
							ImageIcon imgRegresar = new ImageIcon("regresar.png");
							JButton regresar = new JButton(imgRegresar);
							regresar.setBounds(700, 400, 100,100);
							regresar.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									if(subPanelProvedor=="loby")
									{anterior = actual;
									actual = "Inicio";
									route();}else if(subPanelProvedor=="eliminar") 
									{
										CrearprovedorLoby(Crearprovedor);
										subPanelProvedor="loby";
										frame.repaint();
									}
								}});
							Crearprovedor.add(regresar);
					}
					public void CrearprovedorBuscar(JPanel Crearprovedor) 
					{
							Crearprovedor.removeAll();
							////// TITULO DE CREAR PERSONA
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
							Image esc8 = img8.getImage().getScaledInstance(im8.getWidth(), im8.getHeight(), Image.SCALE_SMOOTH);
							Icon ices8 = new ImageIcon(esc8);
							im8.setIcon(ices8);
							Crearprovedor.add(im8);
							ImageIcon imgRegresar = new ImageIcon("regresar.png");
							JButton regresar = new JButton(imgRegresar);
							regresar.setBounds(700, 400, 100,100);
							regresar.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									if(subPanelProvedor=="loby")
									{anterior = actual;
									actual = "Inicio";
									route();}else if(subPanelProvedor=="buscar") 
									{
										CrearprovedorLoby(Crearprovedor);
										subPanelProvedor="loby";
										frame.repaint();
									}
								}});
							Crearprovedor.add(regresar);
					}					
	public JPanel Crearempleado() 
	{
		JPanel Crearempleado = new JPanel();
		Crearempleado.setBackground(Color.BLACK);
		frame.getContentPane().add(Crearempleado, "name_389654229685100");
		Crearempleado.setLayout(null);
		if(subPanelEmpleados=="loby") {CrearempleadoLoby(Crearempleado);}
		return Crearempleado;
	}
					public void CrearempleadoLoby(JPanel Crearempleado) 
					{
						Crearempleado.removeAll();
					////// TITULO DE CREAR EMPLEADO
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
						Image esc10 = img10.getImage().getScaledInstance(im10.getWidth(), im10.getHeight(), Image.SCALE_SMOOTH);
						Icon ices10 = new ImageIcon(esc10);
						im10.setIcon(ices10);
						Crearempleado.add(im10);
						JLabel añadirjl = new JLabel("Añadir");
						JLabel iconjl = new JLabel("Eliminar");
						JLabel buscarjl = new JLabel("Buscar");
						añadirjl.setFont(new Font("Arial", Font.BOLD, 20));
						iconjl.setFont(new Font("Arial", Font.BOLD, 20));
						buscarjl.setFont(new Font("Arial", Font.BOLD, 20));
						añadirjl.setBounds(150, 300, 130, 30);
						iconjl.setBounds(150, 350, 130, 30);
						buscarjl.setBounds(150, 400, 130, 30);
						ImageIcon img13 = new ImageIcon("añadir.png");
						ImageIcon img14 = new ImageIcon("Icon1.jpg");
						ImageIcon img15 = new ImageIcon("buscar.jpg");
						JButton añadir = new JButton(img13);
						añadir.setBounds(100, 300, 30, 30);
						añadir.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								CrearempleadoCrear(Crearempleado);
								subPanelEmpleados="crear";
								frame.repaint();
							}});
						JButton eliminar = new JButton(img14);
						eliminar.setBounds(100, 350, 30, 30);
						eliminar.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								CrearempleadoDel(Crearempleado);
								subPanelEmpleados="eliminar";
								frame.repaint();
							}});
						JButton buscar = new JButton(img15);
						buscar.setBounds(100, 400, 30, 30);
						buscar.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								CrearempleadoBuscar(Crearempleado);
								subPanelEmpleados="buscar";
								frame.repaint();
							}});
						ImageIcon imgRegresar = new ImageIcon("regresar.png");
						JButton regresar = new JButton(imgRegresar);
						regresar.setBounds(700, 400, 100,100);
						regresar.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								if(subPanelEmpleados=="loby")
								{anterior = actual;
								actual = "Inicio";
								route();}
							}});
						Crearempleado.add(añadirjl);
						Crearempleado.add(buscarjl);
						Crearempleado.add(iconjl);
						Crearempleado.add(regresar);
						Crearempleado.add(añadir);
						Crearempleado.add(eliminar);
						Crearempleado.add(buscar);
					}
					
					public void CrearempleadoCrear(JPanel Crearempleado) 
					{
						Crearempleado.removeAll();
					////// TITULO DE CREAR EMPLEADO
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
						Image esc10 = img10.getImage().getScaledInstance(im10.getWidth(), im10.getHeight(), Image.SCALE_SMOOTH);
						Icon ices10 = new ImageIcon(esc10);
						im10.setIcon(ices10);
						Crearempleado.add(im10);
						ImageIcon imgRegresar = new ImageIcon("regresar.png");
						JButton regresar = new JButton(imgRegresar);
						regresar.setBounds(700, 400, 100,100);
						regresar.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								if(subPanelEmpleados=="loby")
								{anterior = actual;
								actual = "Inicio";
								route();}else if(subPanelEmpleados=="crear") 
								{
									CrearempleadoLoby(Crearempleado);
									subPanelEmpleados="loby";
									frame.repaint();
								}
							}});
						Crearempleado.add(regresar);
					}
					
					public void CrearempleadoDel(JPanel Crearempleado) 
					{
						Crearempleado.removeAll();
					////// TITULO DE CREAR EMPLEADO
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
						Image esc10 = img10.getImage().getScaledInstance(im10.getWidth(), im10.getHeight(), Image.SCALE_SMOOTH);
						Icon ices10 = new ImageIcon(esc10);
						im10.setIcon(ices10);
						Crearempleado.add(im10);
						ImageIcon imgRegresar = new ImageIcon("regresar.png");
						JButton regresar = new JButton(imgRegresar);
						regresar.setBounds(700, 400, 100,100);
						regresar.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								if(subPanelEmpleados=="loby")
								{anterior = actual;
								actual = "Inicio";
								route();}else if(subPanelEmpleados=="eliminar") 
								{
									CrearempleadoLoby(Crearempleado);
									subPanelEmpleados="loby";
									frame.repaint();
								}
							}});
						Crearempleado.add(regresar);
					}
					public void CrearempleadoBuscar(JPanel Crearempleado) 
					{
						Crearempleado.removeAll();
					////// TITULO DE CREAR EMPLEADO
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
						Image esc10 = img10.getImage().getScaledInstance(im10.getWidth(), im10.getHeight(), Image.SCALE_SMOOTH);
						Icon ices10 = new ImageIcon(esc10);
						im10.setIcon(ices10);
						Crearempleado.add(im10);
						ImageIcon imgRegresar = new ImageIcon("regresar.png");
						JButton regresar = new JButton(imgRegresar);
						regresar.setBounds(700, 400, 100,100);
						regresar.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								if(subPanelEmpleados=="loby")
								{anterior = actual;
								actual = "Inicio";
								route();}else if(subPanelEmpleados=="buscar") 
								{
									CrearempleadoLoby(Crearempleado);
									subPanelEmpleados="loby";
									frame.repaint();
								}
							}});
						Crearempleado.add(regresar);
					}
					
					
	public JPanel Crearproducto() 
	{		
		JPanel Crearproducto = new JPanel();
		Crearproducto.setBackground(Color.RED);
		frame.getContentPane().add(Crearproducto, "name_389654242683100");
		Crearproducto.setLayout(null);
		if(subPanelProductos=="loby") {CrearproductoLoby(Crearproducto);}
		return Crearproducto;
	}
						public void CrearproductoLoby(JPanel Crearproducto) 
						{
							Crearproducto.removeAll();
						////// TITULO DE CREAR EMPLEADO
						////// TITULO DE CREAR COMPRA
							JLabel tag14 = new JLabel("BIEVENIDO A LA SECCION DE PRODUCTOS");
							tag14.setBackground(Color.BLACK);
							tag14.setHorizontalAlignment(SwingConstants.CENTER);
							tag14.setSize(429, 45);
							tag14.setFont(new Font("Arial", Font.BOLD, 20));
							tag14.setForeground(Color.WHITE);
							tag14.setLocation(229, 36);
							Crearproducto.add(tag14);
							//// LOGOS DEL SUPER
							ImageIcon img11 = new ImageIcon("Logo5.png");
							JLabel im11 = new JLabel(img11);
							im11.setHorizontalAlignment(SwingConstants.LEFT);
							im11.setBounds(42, 25, 177, 172);
							Image esc11 = img11.getImage().getScaledInstance(im11.getWidth(), im11.getHeight(), Image.SCALE_SMOOTH);
							Icon ices11 = new ImageIcon(esc11);
							im11.setIcon(ices11);
							Crearproducto.add(im11);
							ImageIcon img12 = new ImageIcon("Logotipo5.png");
							JLabel im12 = new JLabel(img12);
							im12.setHorizontalAlignment(SwingConstants.LEFT);
							im12.setBounds(700, 25, 187, 184);
							Image esc12 = img12.getImage().getScaledInstance(im12.getWidth(), im12.getHeight(), Image.SCALE_SMOOTH);
							Icon ices12 = new ImageIcon(esc12);
							im12.setIcon(ices12);
							Crearproducto.add(im12);
							JLabel añadirjl = new JLabel("Añadir");
							JLabel iconjl = new JLabel("Eliminar");
							JLabel buscarjl = new JLabel("Buscar");
							añadirjl.setFont(new Font("Arial", Font.BOLD, 20));
							iconjl.setFont(new Font("Arial", Font.BOLD, 20));
							buscarjl.setFont(new Font("Arial", Font.BOLD, 20));
							añadirjl.setBounds(150, 300, 130, 30);
							iconjl.setBounds(150, 350, 130, 30);
							buscarjl.setBounds(150, 400, 130, 30);
							ImageIcon img13 = new ImageIcon("añadir.png");
							ImageIcon img14 = new ImageIcon("Icon1.jpg");
							ImageIcon img15 = new ImageIcon("buscar.jpg");
							ImageIcon imgRegresar = new ImageIcon("regresar.png");

							JButton añadir = new JButton(img13);
							añadir.setBounds(100, 300, 30, 30);
							añadir.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									CrearproductoLobyCrear(Crearproducto);
									subPanelProductos="crear";
									frame.repaint();
								}});
							JButton eliminar = new JButton(img14);
							eliminar.setBounds(100, 350, 30, 30);
							eliminar.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									CrearproductoLobyDel(Crearproducto);
									subPanelProductos="eliminar";
									frame.repaint();
									}});
							JButton buscar = new JButton(img15);
							buscar.setBounds(100, 400, 30, 30);
							buscar.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									CrearproductoLobyBuscar(Crearproducto);
									subPanelProductos="buscar";
									frame.repaint();
								}});
							JButton regresar = new JButton(imgRegresar);
							regresar.setBounds(700, 400, 100,100);
							regresar.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									if(subPanelProductos=="loby") {anterior = actual;
									actual = "Inicio";
									route();}
								}});
							Crearproducto.add(buscarjl);
							Crearproducto.add(añadirjl);
							Crearproducto.add(iconjl);
							Crearproducto.add(añadir);
							Crearproducto.add(eliminar);
							Crearproducto.add(buscar);
							Crearproducto.add(regresar);
						}
						
						public void CrearproductoLobyCrear(JPanel Crearproducto) 
						{
							Crearproducto.removeAll();
						////// TITULO DE CREAR EMPLEADO
						////// TITULO DE CREAR COMPRA
							JLabel tag14 = new JLabel("BIEVENIDO A LA SECCION DE PRODUCTOS");
							tag14.setBackground(Color.BLACK);
							tag14.setHorizontalAlignment(SwingConstants.CENTER);
							tag14.setSize(429, 45);
							tag14.setFont(new Font("Arial", Font.BOLD, 20));
							tag14.setForeground(Color.WHITE);
							tag14.setLocation(229, 36);
							Crearproducto.add(tag14);
							//// LOGOS DEL SUPER
							ImageIcon img11 = new ImageIcon("Logo5.png");
							JLabel im11 = new JLabel(img11);
							im11.setHorizontalAlignment(SwingConstants.LEFT);
							im11.setBounds(42, 25, 177, 172);
							Image esc11 = img11.getImage().getScaledInstance(im11.getWidth(), im11.getHeight(), Image.SCALE_SMOOTH);
							Icon ices11 = new ImageIcon(esc11);
							im11.setIcon(ices11);
							Crearproducto.add(im11);
							ImageIcon img12 = new ImageIcon("Logotipo5.png");
							JLabel im12 = new JLabel(img12);
							im12.setHorizontalAlignment(SwingConstants.LEFT);
							im12.setBounds(700, 25, 187, 184);
							Image esc12 = img12.getImage().getScaledInstance(im12.getWidth(), im12.getHeight(), Image.SCALE_SMOOTH);
							Icon ices12 = new ImageIcon(esc12);
							im12.setIcon(ices12);
							Crearproducto.add(im12);
							ImageIcon imgRegresar = new ImageIcon("regresar.png");
							JButton regresar = new JButton(imgRegresar);
							regresar.setBounds(700, 400, 100,100);
							regresar.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									if(subPanelProductos=="loby") {anterior = actual;
									actual = "Inicio";
									route();}else if(subPanelProductos=="crear") 
									{
										CrearproductoLoby(Crearproducto);
										subPanelProductos="loby";
										frame.repaint();
									}
								}});
							Crearproducto.add(regresar);
						}
						
						public void CrearproductoLobyDel(JPanel Crearproducto) 
						{
							Crearproducto.removeAll();
						////// TITULO DE CREAR EMPLEADO
						////// TITULO DE CREAR COMPRA
							JLabel tag14 = new JLabel("BIEVENIDO A LA SECCION DE PRODUCTOS");
							tag14.setBackground(Color.BLACK);
							tag14.setHorizontalAlignment(SwingConstants.CENTER);
							tag14.setSize(429, 45);
							tag14.setFont(new Font("Arial", Font.BOLD, 20));
							tag14.setForeground(Color.WHITE);
							tag14.setLocation(229, 36);
							Crearproducto.add(tag14);
							//// LOGOS DEL SUPER
							ImageIcon img11 = new ImageIcon("Logo5.png");
							JLabel im11 = new JLabel(img11);
							im11.setHorizontalAlignment(SwingConstants.LEFT);
							im11.setBounds(42, 25, 177, 172);
							Image esc11 = img11.getImage().getScaledInstance(im11.getWidth(), im11.getHeight(), Image.SCALE_SMOOTH);
							Icon ices11 = new ImageIcon(esc11);
							im11.setIcon(ices11);
							Crearproducto.add(im11);
							ImageIcon img12 = new ImageIcon("Logotipo5.png");
							JLabel im12 = new JLabel(img12);
							im12.setHorizontalAlignment(SwingConstants.LEFT);
							im12.setBounds(700, 25, 187, 184);
							Image esc12 = img12.getImage().getScaledInstance(im12.getWidth(), im12.getHeight(), Image.SCALE_SMOOTH);
							Icon ices12 = new ImageIcon(esc12);
							im12.setIcon(ices12);
							Crearproducto.add(im12);
							ImageIcon imgRegresar = new ImageIcon("regresar.png");
							JButton regresar = new JButton(imgRegresar);
							regresar.setBounds(700, 400, 100,100);
							regresar.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									if(subPanelProductos=="loby") {anterior = actual;
									actual = "Inicio";
									route();}else if(subPanelProductos=="eliminar") 
									{
										CrearproductoLoby(Crearproducto);
										subPanelProductos="loby";
										frame.repaint();
									}
								}});
							Crearproducto.add(regresar);
						}
						public void CrearproductoLobyBuscar(JPanel Crearproducto) 
						{
							Crearproducto.removeAll();
						////// TITULO DE CREAR EMPLEADO
						////// TITULO DE CREAR COMPRA
							JLabel tag14 = new JLabel("BIEVENIDO A LA SECCION DE PRODUCTOS");
							tag14.setBackground(Color.BLACK);
							tag14.setHorizontalAlignment(SwingConstants.CENTER);
							tag14.setSize(429, 45);
							tag14.setFont(new Font("Arial", Font.BOLD, 20));
							tag14.setForeground(Color.WHITE);
							tag14.setLocation(229, 36);
							Crearproducto.add(tag14);
							//// LOGOS DEL SUPER
							ImageIcon img11 = new ImageIcon("Logo5.png");
							JLabel im11 = new JLabel(img11);
							im11.setHorizontalAlignment(SwingConstants.LEFT);
							im11.setBounds(42, 25, 177, 172);
							Image esc11 = img11.getImage().getScaledInstance(im11.getWidth(), im11.getHeight(), Image.SCALE_SMOOTH);
							Icon ices11 = new ImageIcon(esc11);
							im11.setIcon(ices11);
							Crearproducto.add(im11);
							ImageIcon img12 = new ImageIcon("Logotipo5.png");
							JLabel im12 = new JLabel(img12);
							im12.setHorizontalAlignment(SwingConstants.LEFT);
							im12.setBounds(700, 25, 187, 184);
							Image esc12 = img12.getImage().getScaledInstance(im12.getWidth(), im12.getHeight(), Image.SCALE_SMOOTH);
							Icon ices12 = new ImageIcon(esc12);
							im12.setIcon(ices12);
							Crearproducto.add(im12);
							ImageIcon imgRegresar = new ImageIcon("regresar.png");
							JButton regresar = new JButton(imgRegresar);
							regresar.setBounds(700, 400, 100,100);
							regresar.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									if(subPanelProductos=="loby") {anterior = actual;
									actual = "Inicio";
									route();}else if(subPanelProductos=="buscar") 
									{
										CrearproductoLoby(Crearproducto);
										subPanelProductos="loby";
										frame.repaint();
									}
								}});
							Crearproducto.add(regresar);
						}
	public void route() {

		if(gran_panel!=null) {
			frame.remove(gran_panel);
		}

		if(actual.equals("Inicio")) { 
			gran_panel = Inicio();  
		}
		if(actual.equals("Crearpedido")) { 
			gran_panel = Crearpedido();  
		}
		if(actual.equals("Crearprovedor")) { 
			gran_panel = Crearprovedor();  
		}
		if(actual.equals("Crearempleado")) { 
			gran_panel = Crearempleado();  
		}
		if(actual.equals("Crearproducto")) { 
			gran_panel = Crearproducto();  
		}

		frame.add(gran_panel);
		frame.revalidate();
		frame.repaint(); 
	}

		
}
