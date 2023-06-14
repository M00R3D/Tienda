package programa;

import java.awt.EventQueue;
import java.util.Random;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.mysql.jdbc.PreparedStatement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import java.awt.CardLayout;

public class Ventana {

	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/pruebita";
    private static final String USUARIO = "root";
    private static final String CLAVE = "";
	
	private JFrame frame;
	private JPanel gran_panel;
	private String actual = "Inicio";
	private String anterior = "Inicio";
	private String subPanelPedidos = "loby", subPanelProvedor = "loby", subPanelEmpleados = "loby",
			subPanelProductos = "loby";

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

	public JPanel Inicio() {
		// EL PANEL DE INICIO
		JPanel Inicio = new JPanel();
		Inicio.setBackground(Color.BLACK);
		frame.getContentPane().add(Inicio, "name_389654173536400");
		Inicio.setLayout(null);
		// NOMBRE DEL SUPERMERCADO
		JLabel tagProveedor = new JLabel("Super Mercado Del multiverse");
		tagProveedor.setBackground(Color.BLACK);
		tagProveedor.setHorizontalAlignment(SwingConstants.CENTER);
		tagProveedor.setSize(312, 42);
		tagProveedor.setFont(new Font("Arial", Font.BOLD, 20));
		tagProveedor.setForeground(Color.RED);
		tagProveedor.setLocation(282, 11);
		Inicio.add(tagProveedor);
		// DIRECCION DEL SUPER MERCADO
		JLabel tag2 = new JLabel("Direccion : pico de orizaba y santa alicia ");
		tag2.setSize(443, 36);
		tag2.setBackground(Color.BLACK);
		tag2.setHorizontalAlignment(SwingConstants.CENTER);
		tagProveedor.setSize(312, 75);
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
		JLabel tagProducto = new JLabel("Codigo Postal: 23080");
		tagProducto.setBackground(Color.BLACK);
		tagProducto.setHorizontalAlignment(SwingConstants.CENTER);
		tagProducto.setSize(312, 24);
		tagProducto.setFont(new Font("Arial", Font.BOLD, 20));
		tagProducto.setForeground(Color.RED);
		tagProducto.setLocation(282, 157);
		Inicio.add(tagProducto);

		// TITULO DE ORDEN DEL PEDIDO
		JLabel tagCodigo = new JLabel("ORDEN DEL PEDIDO");
		tagCodigo.setBackground(Color.BLACK);
		tagCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		tagCodigo.setSize(312, 24);
		tagCodigo.setFont(new Font("Arial", Font.BOLD, 20));
		tagCodigo.setForeground(Color.RED);
		tagCodigo.setLocation(80, 234);
		Inicio.add(tagCodigo);
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
			}
		});
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
			}
		});
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
			}
		});
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
			}
		});
		Inicio.add(orden);
		return Inicio;
	}

	public JPanel Crearpedido() {
//////////PANEL DE PEDUDO MAS LOA 2 BOTONES DE CARRITO Y ELIMINAR

		JPanel Crearpedido = new JPanel();
		Crearpedido.setBackground(Color.WHITE);
		frame.getContentPane().add(Crearpedido, "name_389654201308900");
		Crearpedido.setLayout(null);
		if (subPanelPedidos == "loby") {
			CrearpedidoLoby(Crearpedido);
		}

		return Crearpedido;
	}

	public void CrearpedidoLoby(JPanel Crearpedido) {
		Crearpedido.removeAll();
	
		
		
		
		JLabel tagProveedor1 = new JLabel("BIENVENIDO A LA SESION DE PEDIDOS");
		tagProveedor1.setBackground(Color.BLACK);
		tagProveedor1.setHorizontalAlignment(SwingConstants.CENTER);
		tagProveedor1.setSize(454, 45);
		tagProveedor1.setFont(new Font("Arial", Font.BOLD, 20));
		tagProveedor1.setForeground(Color.PINK);
		tagProveedor1.setLocation(208, 41);
		Crearpedido.add(tagProveedor1);
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
		BtnCrearPedido.setSize(46, 42);
		BtnCrearPedido.setLocation(50, 220);
		Image esc13 = img13.getImage().getScaledInstance(BtnCrearPedido.getWidth(), BtnCrearPedido.getHeight(),
				Image.SCALE_SMOOTH);
		Icon ices13 = new ImageIcon(esc13);
		BtnCrearPedido.setIcon(ices13);
		BtnCrearPedido.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				subPanelPedidos = "crear";
				CrearpedidoCrear(Crearpedido);
				frame.repaint();
			}
		});
		Crearpedido.add(BtnCrearPedido);
		ImageIcon img14 = new ImageIcon("3.png");
		JButton BtnEliminarPedido = new JButton(img14);
		BtnEliminarPedido.setSize(46, 42);
		BtnEliminarPedido.setLocation(50, 280);
		BtnEliminarPedido.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				subPanelPedidos = "eliminar";
				CrearpedidoDel(Crearpedido);
				frame.repaint();
			}
		});
		Image esc14 = img14.getImage().getScaledInstance(BtnEliminarPedido.getWidth(), BtnEliminarPedido.getHeight(),
				Image.SCALE_SMOOTH);
		Icon ices14 = new ImageIcon(esc14);
		BtnEliminarPedido.setIcon(ices14);
		Crearpedido.add(BtnEliminarPedido);
		ImageIcon img15 = new ImageIcon("2.jpeg");
		JButton BtnBuscarPedidos = new JButton(img14);
		BtnBuscarPedidos.setSize(46, 42);
		BtnBuscarPedidos.setLocation(50,340 );
		BtnBuscarPedidos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				subPanelPedidos = "buscar";
				CrearpedidoBus(Crearpedido);
				frame.repaint();
			}
		});
		Image esc15 = img15.getImage().getScaledInstance(BtnBuscarPedidos.getWidth(), BtnBuscarPedidos.getHeight(),
				Image.SCALE_SMOOTH);
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
		eliminar.setLocation(10, 330);
		Crearpedido.add(eliminar);
		JLabel historial = new JLabel("Historial");
		historial.setHorizontalAlignment(SwingConstants.CENTER);
		historial.setSize(276, 53);
		historial.setFont(new Font("Arial", Font.BOLD, 20));
		historial.setForeground(Color.decode("#000000"));
		historial.setLocation(10, 275);
		Crearpedido.add(historial);
		ImageIcon imgRegresar = new ImageIcon("regresar.png");
		JButton regresar = new JButton(imgRegresar);
		regresar.setBounds(700, 400, 100, 100);
		regresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (subPanelPedidos == "loby") {
					anterior = actual;
					actual = "Inicio";
					route();
				}
			}
		});
		Crearpedido.add(regresar);
	}

	public void CrearpedidoCrear(JPanel Crearpedido) {
		Crearpedido.removeAll();
		
				try {
					
		            Connection conexion = conectar();
		            Statement statement = conexion.createStatement();
		            String query = "SELECT * FROM productos";
		            ResultSet resultSet = statement.executeQuery(query);
		            
		            OrdenPedido ordenPedido = new OrdenPedido(
				            "2023-06-13",
				            "123456",
				            "Juan",
				            "2023-07-01",
				            "Sucursal A",
				            "100.0"
				        );
		            int contadorY=0;
		            while (resultSet.next()) {
		                double codigo = resultSet.getDouble("codigo");
		                String tipo = resultSet.getString("tipo");
		                String nombre = resultSet.getString("nombre");
		                int fechaCaducidad = resultSet.getInt("Fecha_caducidad");
		                String proveedor = resultSet.getString("proveedor");
		                double precio = resultSet.getDouble("precio");
		
		                Producto producto = new Producto(codigo, tipo, nombre, fechaCaducidad, proveedor, precio);
		
		                System.out.println("Producto: " + nombre);
		                System.out.println("Código: " + codigo);
		                System.out.println("Tipo: " + tipo);
		                System.out.println("Fecha de caducidad: " + fechaCaducidad);
		                System.out.println("Proveedor: " + proveedor);
		                System.out.println("Precio: " + precio);
		                System.out.println("---------------------------");
		                
		                JLabel labelAux= new JLabel(producto.toString());
		                labelAux.setBounds(140,140+(contadorY*40),380,20);
		                labelAux.setOpaque(true);
		                labelAux.setBackground(Color.cyan);
		                BotonEspecial add = new BotonEspecial();
		                add.setBounds(140+400,140+(contadorY*40),20,20);
		                add.setOpaque(true);add.setBackground(Color.green);
		                add.setProducto(producto);
		                add.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								//								System.out.println(add.getProducto().toString());
								ordenPedido.agregarProducto(producto);
								System.out.println(ordenPedido.generarTicket());
								
								int pedidoClave = 12412441;
				                String ticket = ordenPedido.generarTicket();
				                String informacion=("Clave: " + pedidoClave + "\n\nTicket: " + ticket);
				                int maxLength = 45; // Longitud máxima para cada subcadena
				                int totalLabels = (int) Math.ceil((double) informacion.length() / maxLength);
				                for (int i = 0; i < totalLabels; i++) {
				                    int startIndex = i * maxLength;
				                    int endIndex = Math.min((i + 1) * maxLength, informacion.length());
				                    String subString = informacion.substring(startIndex, endIndex);
				                    JLabel labelTicket = new JLabel(subString);
				                    labelTicket.setBounds(450, 100 + (i * 20), 500, 20);
				                    labelTicket.setOpaque(true);
				                    labelTicket.setBackground(Color.WHITE);
				                    Crearpedido.add(labelTicket);

				                    }
				                
				                
				                
			                	Crearpedido.repaint();

							
							}
				                
							});
		                
		                BotonEspecial del = new BotonEspecial();
		                del.setBounds(170+400,140+(contadorY*40),20,20);
		                del.setOpaque(true);del.setBackground(Color.red);
		                del.setProducto(producto);
		                del.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								ordenPedido.eliminarProducto(producto);
//								System.out.println(add.getProducto().toString());
								int pedidoClave = 12412441;
				                String ticket = ordenPedido.generarTicket();
				                String informacion=("Clave: " + pedidoClave + "\n\nTicket: " + ticket);
				                int maxLength = 45; // Longitud máxima para cada subcadena
				                int totalLabels = (int) Math.ceil((double) informacion.length() / maxLength);
				                for (int i = 0; i < totalLabels; i++) {
				                    int startIndex = i * maxLength;
				                    int endIndex = Math.min((i + 1) * maxLength, informacion.length());
				                    String subString = informacion.substring(startIndex, endIndex);
				                    JLabel labelTicket = new JLabel(subString);
				                    labelTicket.setBounds(450, 100 + (i * 20), 500, 20);
				                    labelTicket.setOpaque(true);
				                    labelTicket.setBackground(Color.WHITE);
				                    Crearpedido.add(labelTicket);}
								
							}});
		                
		                JButton comprar = new JButton("Comprar");
		                comprar.setBounds(200,90,180,30);
		                comprar.setOpaque(true);comprar.setBackground(Color.yellow);
		                comprar.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								 try {
							            Connection conexion = conectar();
							            String query = "INSERT INTO pedidos (clave, ticket) VALUES (?, ?)";
							            PreparedStatement statement = (PreparedStatement) conexion.prepareStatement(query);
										int pedidoClave = new Random().nextInt(10000000);

							            
							            statement.setInt(1, pedidoClave);
							            statement.setString(2, ordenPedido.generarTicket());
							            statement.executeUpdate();

							            System.out.println("Pedido agregado correctamente");
							            
							            statement.close();
							            conexion.close();
							            CrearpedidoLoby(Crearpedido);
							            subPanelPedidos="loby";
							            Crearpedido.repaint();
							        } catch (SQLException e1) {
							            System.out.println("Error en la conexión");
							            e1.printStackTrace();
							        }
							}});
		                
		                
		                
		                Crearpedido.add(comprar);
		                contadorY++;
		                Crearpedido.add(labelAux);
		                Crearpedido.add(add);Crearpedido.add(del);
		            }
		
		            resultSet.close();
		            statement.close();
		            conexion.close();
		
		        } catch (SQLException e) {
		            System.out.println("Error en la conexión");
		            e.printStackTrace();
		        }
		
		JLabel tagProveedor1 = new JLabel("BIENVENIDO A LA SESION DE PEDIDOS");
		tagProveedor1.setBackground(Color.BLACK);
		tagProveedor1.setHorizontalAlignment(SwingConstants.CENTER);
		tagProveedor1.setSize(454, 45);
		tagProveedor1.setFont(new Font("Arial", Font.BOLD, 20));
		tagProveedor1.setForeground(Color.PINK);
		tagProveedor1.setLocation(208, 41);
		Crearpedido.add(tagProveedor1);
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
		regresar.setBounds(700, 400, 100, 100);
		regresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (subPanelPedidos == "loby") {
					anterior = actual;
					actual = "Inicio";
					route();
				} else if (subPanelPedidos == "crear") {
					CrearpedidoLoby(Crearpedido);
					subPanelPedidos = "loby";
					frame.repaint();
				}
			}
		});
		Crearpedido.add(regresar);
	}

	public void CrearpedidoDel(JPanel Crearpedido) {
		Crearpedido.removeAll();
		
		try {
            Connection conexion = conectar();
            Statement statement = conexion.createStatement();
            String query = "SELECT * FROM pedidos";
            ResultSet resultSet = statement.executeQuery(query);
            int contadorY=0;
            
            while (resultSet.next()) {
                int clave = resultSet.getInt("clave");
                String ticket = resultSet.getString("ticket");
                String strClave = String.valueOf(clave);

                System.out.println("Clave: " + clave + ", Ticket: " + ticket);
                JLabel labelAux= new JLabel();
                labelAux.setText(strClave);
                labelAux.setBounds(140,140+(contadorY*40),80,20);
                labelAux.setOpaque(true);
                labelAux.setBackground(Color.white);
                BotonEspecial botAux=new BotonEspecial();
                botAux.setTipo("mostrar");
                botAux.setClave(strClave);
                botAux.setBounds(280,140+(contadorY*40),30,30);
                botAux.addActionListener(new ActionListener() {
					@SuppressWarnings("deprecation")
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						System.out.println(botAux.getClave());
						System.out.println(Crearpedido.countComponents());
						if(Crearpedido.countComponents()<20) {
										try {
											CrearpedidoDel(Crearpedido);Crearpedido.repaint();
								            Connection conexion = conectar();
								            Statement statement = conexion.createStatement();
								            String numeroString = botAux.getClave();
								            int numeroInt = Integer.parseInt(numeroString);
								            String query = "SELECT * FROM pedidos WHERE clave = " + numeroInt;
								            ResultSet resultSet = statement.executeQuery(query);
								            if (resultSet.next()) {
								                int pedidoClave = resultSet.getInt("clave");
								                String ticket = resultSet.getString("ticket");
								                String informacion=("Clave: " + pedidoClave + "\n\nTicket: " + ticket);
								                int maxLength = 45; // Longitud máxima para cada subcadena
								                int totalLabels = (int) Math.ceil((double) informacion.length() / maxLength);
								                for (int i = 0; i < totalLabels; i++) {
								                    int startIndex = i * maxLength;
								                    int endIndex = Math.min((i + 1) * maxLength, informacion.length());
								                    String subString = informacion.substring(startIndex, endIndex);
								                    JLabel labelTicket = new JLabel(subString);
								                    labelTicket.setBounds(450, 100 + (i * 20), 500, 20);
								                    labelTicket.setOpaque(true);
								                    labelTicket.setBackground(Color.WHITE);
								                    Crearpedido.add(labelTicket);
								                }
								                Crearpedido.repaint();
								            } else {
								                System.out.println("No se encontró el pedido con la clave especificada.");
								            }
								            resultSet.close();
								            statement.close();
								            conexion.close();
								        } catch (SQLException e1) {
								            System.out.println("Error en la conexión");
								            e1.printStackTrace();
								        }
						}else {CrearpedidoDel(Crearpedido);Crearpedido.repaint();
						try {
				            Connection conexion = conectar();
				            Statement statement = conexion.createStatement();
				            String numeroString = botAux.getClave();
				            int numeroInt = Integer.parseInt(numeroString);
				            String query = "SELECT * FROM pedidos WHERE clave = " + numeroInt;
				            ResultSet resultSet = statement.executeQuery(query);
				            if (resultSet.next()) {
				                int pedidoClave = resultSet.getInt("clave");
				                String ticket = resultSet.getString("ticket");
				                String informacion=("Clave: " + pedidoClave + "\n\nTicket: " + ticket);
				                int maxLength = 45; // Longitud máxima para cada subcadena
				                int totalLabels = (int) Math.ceil((double) informacion.length() / maxLength);
				                for (int i = 0; i < totalLabels; i++) {
				                    int startIndex = i * maxLength;
				                    int endIndex = Math.min((i + 1) * maxLength, informacion.length());
				                    String subString = informacion.substring(startIndex, endIndex);
				                    JLabel labelTicket = new JLabel(subString);
				                    labelTicket.setBounds(450, 100 + (i * 20), 500, 20);
				                    labelTicket.setOpaque(true);
				                    labelTicket.setBackground(Color.WHITE);
				                    Crearpedido.add(labelTicket);
				                }
				                Crearpedido.repaint();
				            } else {
				                System.out.println("No se encontró el pedido con la clave especificada.");
				            }
				            resultSet.close();
				            statement.close();
				            conexion.close();
				        } catch (SQLException e1) {
				            System.out.println("Error en la conexión");
				            e1.printStackTrace();
				        }}
					}});
                contadorY++;
                Crearpedido.add(labelAux);
                Crearpedido.add(botAux);
            }

            resultSet.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error en la conexión");
            e.printStackTrace();
        }
		
		JLabel tagProveedor1 = new JLabel("BIENVENIDO A LA SESION DE PEDIDOS");
		tagProveedor1.setBackground(Color.BLACK);
		tagProveedor1.setHorizontalAlignment(SwingConstants.CENTER);
		tagProveedor1.setSize(454, 45);
		tagProveedor1.setFont(new Font("Arial", Font.BOLD, 20));
		tagProveedor1.setForeground(Color.PINK);
		tagProveedor1.setLocation(208, 41);
		Crearpedido.add(tagProveedor1);
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
		regresar.setBounds(700, 400, 100, 100);
		regresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (subPanelPedidos == "loby") {
					anterior = actual;
					actual = "Inicio";
					route();
				} else if (subPanelPedidos == "eliminar") {
					subPanelPedidos = "loby";
					CrearpedidoLoby(Crearpedido);
					frame.repaint();
				}
			}
		});
		Crearpedido.add(regresar);
	}

	public void CrearpedidoBus(JPanel Crearpedido) {
		Crearpedido.removeAll();
		JLabel tagProveedor1 = new JLabel("BIENVENIDO A LA SESION DE PEDIDOS");
		tagProveedor1.setBackground(Color.BLACK);
		tagProveedor1.setHorizontalAlignment(SwingConstants.CENTER);
		tagProveedor1.setSize(454, 45);
		tagProveedor1.setFont(new Font("Arial", Font.BOLD, 20));
		tagProveedor1.setForeground(Color.PINK);
		tagProveedor1.setLocation(208, 41);
		Crearpedido.add(tagProveedor1);
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
		
		
		JLabel IngreseNombre = new JLabel("Ingrese la clave del pedido a Eliminar: ");
		IngreseNombre.setBounds(300, 120, 358, 18);
		Crearpedido.add(IngreseNombre);
		IngreseNombre.setFont(new Font("Arial", Font.BOLD, 15));
		IngreseNombre.setForeground(Color.white);
		Crearpedido.add(IngreseNombre);
		JTextField tfProveedor = new JTextField();
		tfProveedor.setBounds(300, 160, 210, 31);
		Crearpedido.add(tfProveedor);
		JButton jbnDel = new JButton("ELIMINAR");
		jbnDel.setSize(122, 60);
		jbnDel.setLocation(420, 424);
		jbnDel.setForeground(Color.decode("#FFFFFF"));
		jbnDel.setBackground(Color.red);
		Crearpedido.add(jbnDel);
		jbnDel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				   try {
			            Connection conexion = conectar();
			            String query = "DELETE FROM pedidos WHERE clave = ?";
			            PreparedStatement statement = (PreparedStatement) conexion.prepareStatement(query);
			            
			            String numeroString = tfProveedor.getText();
			            int numeroInt = Integer.parseInt(numeroString);
			            
			            statement.setInt(1, numeroInt);
			            statement.executeUpdate();

			            System.out.println("Pedido eliminado correctamente.");

			            conexion.close();

			        } catch (SQLException e1) {
			            System.out.println("Error en la conexión");
			            e1.printStackTrace();
			        }
			}} );
		
		
		ImageIcon imgRegresar = new ImageIcon("regresar.png");
		JButton regresar = new JButton(imgRegresar);
		regresar.setBounds(700, 400, 100, 100);
		regresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (subPanelPedidos == "loby") {
					anterior = actual;
					actual = "Inicio";
					route();
				} else if (subPanelPedidos == "buscar") {
					subPanelPedidos = "loby";
					CrearpedidoLoby(Crearpedido);
					frame.repaint();
				}
			}
		});
		Crearpedido.add(regresar);
	}

	JPanel Crearprovedor() {
		JPanel Crearprovedor = new JPanel();
		Crearprovedor.setBackground(Color.RED);
		frame.getContentPane().add(Crearprovedor, "name_389654215556400");
		Crearprovedor.setLayout(null);
		if (subPanelProvedor == "loby") {
			CrearprovedorLoby(Crearprovedor);
		}
		return Crearprovedor;
	}

	public void CrearprovedorLoby(JPanel Crearprovedor) {
		Crearprovedor.removeAll();
		////// TITULO DE CREAR PERSONA
		JLabel tagProveedor2 = new JLabel("BIENVENIDO A LA SESION DE PROVEEDORES");
		tagProveedor2.setBackground(Color.BLACK);
		tagProveedor2.setHorizontalAlignment(SwingConstants.CENTER);
		tagProveedor2.setSize(387, 45);
		tagProveedor2.setFont(new Font("Arial", Font.BOLD, 20));
		tagProveedor2.setForeground(Color.WHITE);
		tagProveedor2.setLocation(245, 35);
		Crearprovedor.add(tagProveedor2);
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
				subPanelProvedor = "crear";
				CrearprovedorCrear(Crearprovedor);
				frame.repaint();
			}
		});
		añadir.setBounds(100, 300, 30, 30);
		JButton eliminar = new JButton(img14);
		eliminar.setBounds(100, 350, 30, 30);
		eliminar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				subPanelProvedor = "eliminar";
				CrearprovedorDel(Crearprovedor);
				frame.repaint();
			}
		});
		JButton buscar = new JButton(img15);
		buscar.setBounds(100, 400, 30, 30);
		buscar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				subPanelProvedor = "buscar";
				CrearprovedorBuscar(Crearprovedor);
				frame.repaint();
			}
		});
		ImageIcon imgRegresar = new ImageIcon("regresar.png");
		JButton regresar = new JButton(imgRegresar);
		regresar.setBounds(700, 400, 100, 100);
		regresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (subPanelProvedor == "loby") {
					anterior = actual;
					actual = "Inicio";
					route();
				}
			}
		});
		Crearprovedor.add(añadirjl);
		Crearprovedor.add(iconjl);
		Crearprovedor.add(buscarjl);
		Crearprovedor.add(añadir);
		Crearprovedor.add(eliminar);
		Crearprovedor.add(buscar);
		Crearprovedor.add(regresar);
	}

	public void CrearprovedorCrear(JPanel Crearprovedor) {
		Crearprovedor.removeAll();
		////// TITULO DE CREAR PERSONA
		JLabel tagProveedor2 = new JLabel("BIENVENIDO A LA SESION DE PEDIDO");
		tagProveedor2.setBackground(Color.BLACK);
		tagProveedor2.setHorizontalAlignment(SwingConstants.CENTER);
		tagProveedor2.setSize(387, 45);
		tagProveedor2.setFont(new Font("Arial", Font.BOLD, 20));
		tagProveedor2.setForeground(Color.WHITE);
		tagProveedor2.setLocation(245, 35);
		Crearprovedor.add(tagProveedor2);

		//// LOGOS DEL SUPER
		JLabel tagCodigo = new JLabel("Ingrese su Dirrecion: ");
		tagCodigo.setBounds(300, 345, 358, 18);
		Crearprovedor.add(tagCodigo);
		tagCodigo.setFont(new Font("Arial", Font.BOLD, 15));
		tagCodigo.setForeground(Color.white);

		JLabel tagProveedor = new JLabel("Ingrese Sus Apellidos: ");
		tagProveedor.setBounds(300, 202, 302, 20);
		Crearprovedor.add(tagProveedor);
		tagProveedor.setFont(new Font("comic sans", Font.BOLD, 15));
		tagProveedor.setForeground(Color.white);

		JLabel tagFecha = new JLabel("Ingrese El Nombre De La Empresa ");
		tagFecha.setBounds(300, 269, 250, 18);
		Crearprovedor.add(tagFecha);
		tagFecha.setFont(new Font("Arial", Font.BOLD, 15));
		tagFecha.setForeground(Color.white);

		JLabel tagProducto = new JLabel("Ingrese Su Nombre:");
		tagProducto.setBounds(300, 125, 193, 20);
		Crearprovedor.add(tagProducto);
		tagProducto.setFont(new Font("comic sans", Font.BOLD, 15));
		tagProducto.setForeground(Color.white);

		JTextField tfProveedor = new JTextField();
		tfProveedor.setBounds(300, 223, 210, 26);
		Crearprovedor.add(tfProveedor);

		tfProveedor.setFont(new Font("Comic sans ", Font.ITALIC, 15));

		JTextField tfNombre = new JTextField();
		tfNombre.setBounds(300, 160, 210, 31);
		Crearprovedor.add(tfNombre);

		tfNombre.setFont(new Font("Comic sans ", Font.ITALIC, 15));

		JTextField tfCodigo = new JTextField();
		tfCodigo.setBounds(300, 298, 210, 32);
		Crearprovedor.add(tfCodigo);

		tfCodigo.setFont(new Font("Comic sans ", Font.ITALIC, 15));

		JTextField tfFecha = new JTextField();
		tfFecha.setBounds(300, 370, 210, 32);
		Crearprovedor.add(tfFecha);

		tfFecha.setFont(new Font("Comic sans ", Font.ITALIC, 15));

		JButton cancelar = new JButton("CANCELAR");
		cancelar.setSize(132, 60);
		cancelar.setLocation(270, 424);
		cancelar.setForeground(Color.decode("#FFFFFF"));
		cancelar.setBackground(Color.decode("#BF110B"));
		Crearprovedor.add(cancelar);

		JButton jbnAccess = new JButton("ACCEDER");
		jbnAccess.setSize(122, 60);
		jbnAccess.setLocation(420, 424);
		jbnAccess.setForeground(Color.decode("#FFFFFF"));
		jbnAccess.setBackground(Color.decode("#4491F4"));
		Crearprovedor.add(jbnAccess);
		jbnAccess.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 try {
					 Random random = new Random();
			            int key=( (9999999)* (random.nextInt() * (9999999 - 0 + 1)));
			            String k =String.valueOf(key);
			            Connection conexion = conectar();
			            String query = "INSERT INTO proveedores (Nombre, Apellido, Cedula, Telefono, Direccion, Empresa) VALUES (?, ?, ?, ?, ?,?)";
			            PreparedStatement statement = (PreparedStatement) conexion.prepareStatement(query);
			            statement.setString(1,tfNombre.getText());
			            statement.setString(2,tfProveedor.getText());
			            statement.setString(3,k);
			            statement.setString(4,"666");
			            statement.setString(5, tfFecha.getText());
			            statement.setString(6,tfCodigo.getText());
			            statement.executeUpdate();

			            System.out.println("Proveedor agregado correctamente.");

			            conexion.close();

			        } catch (SQLException e1) {
			            System.out.println("Error en la conexión");
			            e1.printStackTrace();
			        }				
			}});
		
		
		
		
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
		regresar.setBounds(700, 400, 100, 100);
		regresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (subPanelProvedor == "loby") {
					anterior = actual;
					actual = "Inicio";
					route();
				} else if (subPanelProvedor == "crear") {
					CrearprovedorLoby(Crearprovedor);
					subPanelProvedor = "loby";
					frame.repaint();
				}
			}
		});
		Crearprovedor.add(regresar);
	}

	public void CrearprovedorDel(JPanel Crearprovedor) {
		Crearprovedor.removeAll();
		////// TITULO DE CREAR PERSONA
		JLabel tagProveedor2 = new JLabel("BIENVENIDO A LA SESION DE PROVEEDORES");
		tagProveedor2.setBackground(Color.BLACK);
		tagProveedor2.setHorizontalAlignment(SwingConstants.CENTER);
		tagProveedor2.setSize(420, 45);
		tagProveedor2.setFont(new Font("Arial", Font.BOLD, 20));
		tagProveedor2.setForeground(Color.WHITE);
		tagProveedor2.setLocation(245, 35);
		Crearprovedor.add(tagProveedor2);
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
		regresar.setBounds(700, 400, 100, 100);
		JLabel IngreseNombre = new JLabel("Ingrese el nombre del proveedor a Eliminar: ");
		IngreseNombre.setBounds(300, 120, 358, 18);
		IngreseNombre.setFont(new Font("Arial", Font.BOLD, 15));
		IngreseNombre.setForeground(Color.white);
		Crearprovedor.add(IngreseNombre);
		JTextField tfProveedor = new JTextField();
		tfProveedor.setBounds(300, 160, 210, 31);
		Crearprovedor.add(tfProveedor);
		JButton jbnDel = new JButton("ELIMINAR");
		jbnDel.setSize(122, 60);
		jbnDel.setLocation(420, 424);
		jbnDel.setForeground(Color.decode("#FFFFFF"));
		jbnDel.setBackground(Color.red);
		Crearprovedor.add(jbnDel);
		jbnDel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
		            Connection conexion = conectar();
		            String query = "DELETE FROM proveedores WHERE Nombre = ?";
		            PreparedStatement statement = (PreparedStatement) conexion.prepareStatement(query);
		            statement.setString(1, tfProveedor.getText());
		            statement.executeUpdate();

		            System.out.println("Proveedor eliminado correctamente.");

		            conexion.close();

		        } catch (SQLException e1) {
		            System.out.println("Error en la conexión");
		            e1.printStackTrace();
		        }				
			}});
		
		regresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (subPanelProvedor == "loby") {
					anterior = actual;
					actual = "Inicio";
					route();
				} else if (subPanelProvedor == "eliminar") {
					CrearprovedorLoby(Crearprovedor);
					subPanelProvedor = "loby";
					frame.repaint();
				}
			}
		});
		Crearprovedor.add(regresar);
	}

	public void CrearprovedorBuscar(JPanel Crearprovedor) {
		Crearprovedor.removeAll();
		////// TITULO DE CREAR PERSONA
		try {
            Connection conexion = conectar();
            Statement statement = conexion.createStatement();
            String query = "SELECT * FROM proveedores";
            ResultSet resultSet = statement.executeQuery(query);
            int contadorY=0;
            while (resultSet.next()) {
                String nombre = resultSet.getString("Nombre");
                String apellido = resultSet.getString("Apellido");
                String cedula = resultSet.getString("Cedula");
                String telefono = resultSet.getString("Telefono");
                String direccion = resultSet.getString("Direccion");
                String empresa = resultSet.getString("Empresa");

                Proveedor proveedor = new Proveedor(nombre, apellido, cedula, telefono, direccion,empresa);
                JLabel labelAux= new JLabel(proveedor.toString());
                labelAux.setBounds(140,140+(contadorY*40),680,20);
                labelAux.setOpaque(true);
                labelAux.setBackground(Color.red);
                contadorY++;
                Crearprovedor.add(labelAux);
//                System.out.println(proveedor.toString());
            }

            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error en la conexión");
            e.printStackTrace();
        }
		JLabel tagProveedor2 = new JLabel("BIENVENIDO A LA SESION DE PEDIDO");
		tagProveedor2.setBackground(Color.BLACK);
		tagProveedor2.setHorizontalAlignment(SwingConstants.CENTER);
		tagProveedor2.setSize(387, 45);
		tagProveedor2.setFont(new Font("Arial", Font.BOLD, 20));
		tagProveedor2.setForeground(Color.WHITE);
		tagProveedor2.setLocation(245, 35);
		Crearprovedor.add(tagProveedor2);
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
		regresar.setBounds(700, 400, 100, 100);
		regresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (subPanelProvedor == "loby") {
					anterior = actual;
					actual = "Inicio";
					route();
				} else if (subPanelProvedor == "buscar") {
					CrearprovedorLoby(Crearprovedor);
					subPanelProvedor = "loby";
					frame.repaint();
				}
			}
		});
		Crearprovedor.add(regresar);
	}

	public JPanel Crearempleado() {
		JPanel Crearempleado = new JPanel();
		Crearempleado.setBackground(Color.BLACK);
		frame.getContentPane().add(Crearempleado, "name_389654229685100");
		Crearempleado.setLayout(null);
		if (subPanelEmpleados == "loby") {
			CrearempleadoLoby(Crearempleado);
		}
		return Crearempleado;
	}

	public void CrearempleadoLoby(JPanel Crearempleado) {
		Crearempleado.removeAll();
		////// TITULO DE CREAR EMPLEADO
		JLabel tagProveedor3 = new JLabel("BIEVENIDO A LA SESION DE EMPLEADO");
		tagProveedor3.setBackground(Color.BLACK);
		tagProveedor3.setHorizontalAlignment(SwingConstants.CENTER);
		tagProveedor3.setSize(429, 45);
		tagProveedor3.setFont(new Font("Arial", Font.BOLD, 20));
		tagProveedor3.setForeground(Color.WHITE);
		tagProveedor3.setLocation(229, 36);
		Crearempleado.add(tagProveedor3);
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
				subPanelEmpleados = "crear";
				frame.repaint();
			}
		});
		JButton eliminar = new JButton(img14);
		eliminar.setBounds(100, 350, 30, 30);
		eliminar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CrearempleadoDel(Crearempleado);
				subPanelEmpleados = "eliminar";
				frame.repaint();
			}
		});
		JButton buscar = new JButton(img15);
		buscar.setBounds(100, 400, 30, 30);
		buscar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CrearempleadoBuscar(Crearempleado);
				subPanelEmpleados = "buscar";
				frame.repaint();
			}
		});
		ImageIcon imgRegresar = new ImageIcon("regresar.png");
		JButton regresar = new JButton(imgRegresar);
		regresar.setBounds(700, 400, 100, 100);
		regresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (subPanelEmpleados == "loby") {
					anterior = actual;
					actual = "Inicio";
					route();
				}
			}
		});
		Crearempleado.add(añadirjl);
		Crearempleado.add(buscarjl);
		Crearempleado.add(iconjl);
		Crearempleado.add(regresar);
		Crearempleado.add(añadir);
		Crearempleado.add(eliminar);
		Crearempleado.add(buscar);
	}

	public void CrearempleadoCrear(JPanel Crearempleado) {
		Crearempleado.removeAll();
		////// TITULO DE CREAR EMPLEADO
		JLabel tagProveedor3 = new JLabel("BIEVENIDO A LA SESION DE EMPLEADO");
		tagProveedor3.setBackground(Color.BLACK);
		tagProveedor3.setHorizontalAlignment(SwingConstants.CENTER);
		tagProveedor3.setSize(429, 45);
		tagProveedor3.setFont(new Font("Arial", Font.BOLD, 20));
		tagProveedor3.setForeground(Color.WHITE);
		tagProveedor3.setLocation(229, 36);
		Crearempleado.add(tagProveedor3);
		
		
		
		//// LOGOS DEL SUPER
		JLabel tagCodigo = new JLabel("Ingrese su Direccion: ");
		tagCodigo.setBounds(300, 345, 358, 18);
		Crearempleado.add(tagCodigo);
		tagCodigo.setFont(new Font("Arial", Font.BOLD, 15));
		tagCodigo.setForeground(Color.white);

		JLabel tagProveedor = new JLabel("Ingrese Sus Apellidos: ");
		tagProveedor.setBounds(300, 202, 302, 20);
		Crearempleado.add(tagProveedor);
		tagProveedor.setFont(new Font("comic sans", Font.BOLD, 15));
		tagProveedor.setForeground(Color.white);

		JLabel tagFecha = new JLabel("Ingrese Su Numero De Telefono ");
		tagFecha.setBounds(300, 269, 250, 18);
		Crearempleado.add(tagFecha);
		tagFecha.setFont(new Font("Arial", Font.BOLD, 15));
		tagFecha.setForeground(Color.white);

		JLabel tagProducto = new JLabel("Ingrese Su Nombre:");
		tagProducto.setBounds(300, 125, 193, 20);
		Crearempleado.add(tagProducto);
		tagProducto.setFont(new Font("comic sans", Font.BOLD, 15));
		tagProducto.setForeground(Color.white);

		JTextField tfApellido = new JTextField();
		tfApellido.setBounds(300, 223, 210, 26);
		Crearempleado.add(tfApellido);

		tfApellido.setFont(new Font("Comic sans ", Font.ITALIC, 15));

		JTextField tfProveedor = new JTextField();
		tfProveedor.setBounds(300, 160, 210, 31);
		Crearempleado.add(tfProveedor);

		tfProveedor.setFont(new Font("Comic sans ", Font.ITALIC, 15));

		JTextField tfNumero = new JTextField();
		tfNumero.setBounds(300,298, 210, 32);
		Crearempleado.add(tfNumero);

		tfNumero.setFont(new Font("Comic sans ", Font.ITALIC, 15));

		JTextField tfDireccion = new JTextField();
		tfDireccion.setBounds(300,370  , 210, 32);
		Crearempleado.add(tfDireccion);

		tfDireccion.setFont(new Font("Comic sans ", Font.ITALIC, 15));

		JButton cancelar = new JButton("CANCELAR");
		cancelar.setSize(132, 60);
		cancelar.setLocation(270, 424);
		cancelar.setForeground(Color.decode("#FFFFFF"));
		cancelar.setBackground(Color.decode("#BF110B"));
		Crearempleado.add(cancelar);

		JButton jbnAccess = new JButton("ACCEDER");
		jbnAccess.setSize(122, 60);
		jbnAccess.setLocation(420, 424);
		jbnAccess.setForeground(Color.decode("#FFFFFF"));
		jbnAccess.setBackground(Color.decode("#4491F4"));
		Crearempleado.add(jbnAccess);
		
		jbnAccess.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
		            Connection conexion = conectar();
		            String query = "INSERT INTO empleados (Cedula, Nombre, Apellido, Direccion, Cargo, Telefono) VALUES (?, ?, ?, ?, ?, ?)";
		            PreparedStatement statement = (PreparedStatement) conexion.prepareStatement(query);
		            Random random = new Random();
		            int key=( (999999999)* (random.nextInt() * (999999999 - 0 + 1)));
		            statement.setInt(1, key);
		            statement.setString(2, tfProveedor.getText());
		            statement.setString(3, tfApellido.getText());
		            statement.setString(4, tfDireccion.getText());
		            statement.setString(5, "Cajero");
		            statement.setString(6,tfNumero.getText());
		            int filasAfectadas = statement.executeUpdate();

		            if (filasAfectadas > 0) {
		                System.out.println("Empleado agregado exitosamente");
		            } else {
		                System.out.println("Error al agregar el empleado");
		            }

		            conexion.close();

		        } catch (SQLException e1) {
		            System.out.println("Error en la conexión");
		            e1.printStackTrace();
		        }
			}});
	
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
		regresar.setBounds(700, 400, 100, 100);
		regresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (subPanelEmpleados == "loby") {
					anterior = actual;
					actual = "Inicio";
					route();
				} else if (subPanelEmpleados == "crear") {
					CrearempleadoLoby(Crearempleado);
					subPanelEmpleados = "loby";
					frame.repaint();
				}
			}
		});
		Crearempleado.add(regresar);
	}

	public void CrearempleadoDel(JPanel Crearempleado) {
		Crearempleado.removeAll();
		////// TITULO DE CREAR EMPLEADO
		JLabel tagProveedor3 = new JLabel("BIEVENIDO A LA SESION DE EMPLEADO");
		tagProveedor3.setBackground(Color.BLACK);
		tagProveedor3.setHorizontalAlignment(SwingConstants.CENTER);
		tagProveedor3.setSize(429, 45);
		tagProveedor3.setFont(new Font("Arial", Font.BOLD, 20));
		tagProveedor3.setForeground(Color.WHITE);
		tagProveedor3.setLocation(229, 36);
		Crearempleado.add(tagProveedor3);
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
		JLabel IngreseNombre = new JLabel("Ingrese el nombre del empleado a Eliminar: ");
		IngreseNombre.setBounds(300, 120, 358, 18);
		Crearempleado.add(IngreseNombre);
		IngreseNombre.setFont(new Font("Arial", Font.BOLD, 15));
		IngreseNombre.setForeground(Color.white);
		Crearempleado.add(IngreseNombre);
		JTextField tfProveedor = new JTextField();
		tfProveedor.setBounds(300, 160, 210, 31);
		Crearempleado.add(tfProveedor);
		JButton jbnDel = new JButton("ELIMINAR");
		jbnDel.setSize(122, 60);
		jbnDel.setLocation(420, 424);
		jbnDel.setForeground(Color.decode("#FFFFFF"));
		jbnDel.setBackground(Color.red);
		Crearempleado.add(jbnDel);
		ImageIcon imgRegresar = new ImageIcon("regresar.png");
		JButton regresar = new JButton(imgRegresar);
		
		
		jbnDel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
		            Connection conexion = conectar();
		            String query = "DELETE FROM empleados WHERE Nombre = ?";
		            PreparedStatement statement = (PreparedStatement) conexion.prepareStatement(query);
		            statement.setString(1, tfProveedor.getText());
		            int filasAfectadas = statement.executeUpdate();

		            if (filasAfectadas > 0) {
		                System.out.println("Empleado eliminado exitosamente");
		            } else {
		                System.out.println("Error al eliminar el empleado");
		            }

		            conexion.close();

		        } catch (SQLException e1) {
		            System.out.println("Error en la conexión");
		            e1.printStackTrace();
		        }			}});
		
		
		regresar.setBounds(700, 400, 100, 100);
		regresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (subPanelEmpleados == "loby") {
					anterior = actual;
					actual = "Inicio";
					route();
				} else if (subPanelEmpleados == "eliminar") {
					CrearempleadoLoby(Crearempleado);
					subPanelEmpleados = "loby";
					frame.repaint();
				}
			}
		});
		Crearempleado.add(regresar);
	}

	public void CrearempleadoBuscar(JPanel Crearempleado) {
		Crearempleado.removeAll();
		
		try {
            Connection conexion = conectar();
            Statement statement = conexion.createStatement();
            String query = "SELECT * FROM empleados";
            ResultSet resultSet = statement.executeQuery(query);
            int contadorY=0;
            while (resultSet.next()) {
                int cedula = resultSet.getInt("Cedula");
                String nombre = resultSet.getString("Nombre");
                String apellido = resultSet.getString("Apellido");
                String direccion = resultSet.getString("Direccion");
                String cargo = resultSet.getString("Cargo");
                String telefono = resultSet.getString("Telefono");
                String StrEmpleado=("Cedula: " + cedula+"  Nombre: " + nombre+"  Apellido: " + apellido+
                		"  Direccion: " + direccion+"	  Cargo: " + cargo+"  Telefono: " + telefono);
                JLabel labelAux= new JLabel(StrEmpleado);
                labelAux.setBounds(140,140+(contadorY*40),680,20);
                labelAux.setOpaque(true);
                labelAux.setBackground(Color.white);
                contadorY++;
                Crearempleado.add(labelAux);
//                System.out.println(StrEmpleado);
            }

            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error en la conexión");
            e.printStackTrace();
        }

		
		
		////// TITULO DE CREAR EMPLEADO
		JLabel tagProveedor3 = new JLabel("BIEVENIDO A LA SESION DE EMPLEADO");
		tagProveedor3.setBackground(Color.BLACK);
		tagProveedor3.setHorizontalAlignment(SwingConstants.CENTER);
		tagProveedor3.setSize(429, 45);
		tagProveedor3.setFont(new Font("Arial", Font.BOLD, 20));
		tagProveedor3.setForeground(Color.WHITE);
		tagProveedor3.setLocation(229, 36);
		Crearempleado.add(tagProveedor3);
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
		regresar.setBounds(700, 400, 100, 100);
		regresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (subPanelEmpleados == "loby") {
					anterior = actual;
					actual = "Inicio";
					route();
				} else if (subPanelEmpleados == "buscar") {
					CrearempleadoLoby(Crearempleado);
					subPanelEmpleados = "loby";
					frame.repaint();
				}
			}
		});
		
		
		
		Crearempleado.add(regresar);
	}

	public JPanel Crearproducto() {
		JPanel Crearproducto = new JPanel();
		Crearproducto.setBackground(Color.RED);
		frame.getContentPane().add(Crearproducto, "name_389654242683100");
		Crearproducto.setLayout(null);
		if (subPanelProductos == "loby") {
			CrearproductoLoby(Crearproducto);
		}
		return Crearproducto;
	}

	public void CrearproductoLoby(JPanel Crearproducto) {
		Crearproducto.removeAll();
		////// TITULO DE CREAR EMPLEADO
		////// TITULO DE CREAR COMPRA
		JLabel tagProveedor4 = new JLabel("BIEVENIDO A LA SECCION DE PRODUCTOS");
		tagProveedor4.setBackground(Color.BLACK);
		tagProveedor4.setHorizontalAlignment(SwingConstants.CENTER);
		tagProveedor4.setSize(429, 45);
		tagProveedor4.setFont(new Font("Arial", Font.BOLD, 20));
		tagProveedor4.setForeground(Color.WHITE);
		tagProveedor4.setLocation(229, 36);
		Crearproducto.add(tagProveedor4);
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
				subPanelProductos = "crear";
				frame.repaint();
			}
		});
		JButton eliminar = new JButton(img14);
		eliminar.setBounds(100, 350, 30, 30);
		eliminar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CrearproductoLobyDel(Crearproducto);
				subPanelProductos = "eliminar";
				frame.repaint();
			}
		});
		JButton buscar = new JButton(img15);
		buscar.setBounds(100, 400, 30, 30);
		buscar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CrearproductoLobyBuscar(Crearproducto);
				subPanelProductos = "buscar";
				frame.repaint();
			}
		});
		JButton regresar = new JButton(imgRegresar);
		regresar.setBounds(700, 400, 100, 100);
		regresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (subPanelProductos == "loby") {
					anterior = actual;
					actual = "Inicio";
					route();
				}
			}
		});
		Crearproducto.add(buscarjl);
		Crearproducto.add(añadirjl);
		Crearproducto.add(iconjl);
		Crearproducto.add(añadir);
		Crearproducto.add(eliminar);
		Crearproducto.add(buscar);
		Crearproducto.add(regresar);
	}

	public void CrearproductoLobyCrear(JPanel Crearproducto) {
		Crearproducto.removeAll();
		////// TITULO DE CREAR EMPLEADO
		////// TITULO DE CREAR COMPRA
		
	
		JLabel tagProveedor4 = new JLabel("BIEVENIDO A LA SECCION DE PRODUCTOS");
		tagProveedor4.setBackground(Color.BLACK);
		tagProveedor4.setHorizontalAlignment(SwingConstants.CENTER);
		tagProveedor4.setSize(429, 45);
		tagProveedor4.setFont(new Font("Arial", Font.BOLD, 20));
		tagProveedor4.setForeground(Color.WHITE);
		tagProveedor4.setLocation(229, 36);
		Crearproducto.add(tagProveedor4);
		//// LOGOS DEL SUPER
		JLabel tagCodigo = new JLabel("Ingrese El Codigo Del Producto: ");
		tagCodigo.setBounds(300, 345, 358, 18);
		Crearproducto.add(tagCodigo);
		tagCodigo.setFont(new Font("Arial", Font.BOLD, 15));
		tagCodigo.setForeground(Color.white);

		JLabel tagProveedor = new JLabel("Ingrese El Nombre Del Proveedor: ");
		tagProveedor.setBounds(300, 202, 302, 20);
		Crearproducto.add(tagProveedor);
		tagProveedor.setFont(new Font("comic sans", Font.BOLD, 15));
		tagProveedor.setForeground(Color.white);

		JLabel tagFecha = new JLabel("Ingrese La Fecha De Caducidad ");
		tagFecha.setBounds(300, 269, 250, 18);
		Crearproducto.add(tagFecha);
		tagFecha.setFont(new Font("Arial", Font.BOLD, 15));
		tagFecha.setForeground(Color.white);

		JLabel tagProducto = new JLabel("Ingrese El Nombre Del Producto:");
		tagProducto.setBounds(300, 125, 393, 20);
		Crearproducto.add(tagProducto);
		tagProducto.setFont(new Font("comic sans", Font.BOLD, 15));
		tagProducto.setForeground(Color.white);

		JTextField tfProveedor = new JTextField();
		tfProveedor.setBounds(300, 223, 210, 26);
		Crearproducto.add(tfProveedor);

		tfProveedor.setFont(new Font("Comic sans ", Font.ITALIC, 15));

		JTextField tfNombre = new JTextField();
		tfNombre.setBounds(300, 160, 210, 31);
		Crearproducto.add(tfNombre);

		tfNombre.setFont(new Font("Comic sans ", Font.ITALIC, 15));

		JTextField tfCodigo = new JTextField();
		tfCodigo.setBounds(300, 298, 210, 32);
		Crearproducto.add(tfCodigo);

		tfCodigo.setFont(new Font("Comic sans ", Font.ITALIC, 15));

		JTextField tfFecha = new JTextField();
		tfFecha.setBounds(300, 370, 210, 32);
		Crearproducto.add(tfFecha);

		tfFecha.setFont(new Font("Comic sans ", Font.ITALIC, 15));

		JButton cancelar = new JButton("CANCELAR");
		cancelar.setSize(132, 60);
		cancelar.setLocation(270, 424);
		cancelar.setForeground(Color.decode("#FFFFFF"));
		cancelar.setBackground(Color.decode("#BF110B"));
		Crearproducto.add(cancelar);

		JButton jbnAccess = new JButton("ACCEDER");
		jbnAccess.setSize(122, 60);
		jbnAccess.setLocation(420, 424);
		jbnAccess.setForeground(Color.decode("#FFFFFF"));
		jbnAccess.setBackground(Color.decode("#4491F4"));
		Crearproducto.add(jbnAccess);
		jbnAccess.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
		            Connection conexion = conectar();
		            String code = tfCodigo.getText();String dat= tfFecha.getText();
		            double cod=Integer.parseInt(code);int datee = Integer.parseInt(dat);
		            Producto producto = new Producto(cod,"producto general",tfNombre.getText(),datee,tfProveedor.getText(),300.40);
		            
		            String query = "INSERT INTO productos (Codigo, Tipo, Nombre, Fecha_caducidad, Proveedor,Precio) VALUES (?, ?, ?, ?, ?, ?)";
		            PreparedStatement preparedStatement = (PreparedStatement) conexion.prepareStatement(query);
		            preparedStatement.setDouble(1, producto.getCodigo());
		            preparedStatement.setString(2, producto.getTipo());
		            preparedStatement.setString(3, producto.getNombre());
		            preparedStatement.setInt(4, producto.getFechaCaducidad());
		            preparedStatement.setString(5, producto.getProveedor());
		            preparedStatement.setDouble(6, producto.getPrecio());

		            
		            int filasAfectadas = preparedStatement.executeUpdate();

		            if (filasAfectadas > 0) {
		                System.out.println("Producto agregado con éxito");
		            } else {
		                System.out.println("No se pudo agregar el producto");
		            }

		            conexion.close();

		        } catch (SQLException e1) {
		            System.out.println("Error en la conexión");
		            e1.printStackTrace();
		        }
			}});
		
		
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
		regresar.setBounds(700, 400, 100, 100);
		regresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (subPanelProductos == "loby") {
					anterior = actual;
					actual = "Inicio";
					route();
				} else if (subPanelProductos == "crear") {
					CrearproductoLoby(Crearproducto);
					subPanelProductos = "loby";
					frame.repaint();
				}
			}
		});
		Crearproducto.add(regresar);
	}

	public void CrearproductoLobyDel(JPanel Crearproducto) {
		Crearproducto.removeAll();
		////// TITULO DE CREAR EMPLEADO
		////// TITULO DE CREAR COMPRA
		JLabel tagProveedor4 = new JLabel("BIEVENIDO A LA SECCION DE PRODUCTOS");
		tagProveedor4.setBackground(Color.BLACK);
		tagProveedor4.setHorizontalAlignment(SwingConstants.CENTER);
		tagProveedor4.setSize(429, 45);
		tagProveedor4.setFont(new Font("Arial", Font.BOLD, 20));
		tagProveedor4.setForeground(Color.WHITE);
		tagProveedor4.setLocation(229, 36);
		Crearproducto.add(tagProveedor4);
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
		JLabel IngreseNombre = new JLabel("Ingrese el nombre del empleado a Eliminar: ");
		IngreseNombre.setBounds(300, 120, 358, 18);
		IngreseNombre.setFont(new Font("Arial", Font.BOLD, 15));
		IngreseNombre.setForeground(Color.white);
		Crearproducto.add(IngreseNombre);
		JTextField tfProveedor = new JTextField();
		tfProveedor.setBounds(300, 160, 210, 31);
		Crearproducto.add(tfProveedor);
		JButton jbnDel = new JButton("ELIMINAR");
		jbnDel.setSize(122, 60);
		jbnDel.setLocation(420, 424);
		jbnDel.setForeground(Color.decode("#FFFFFF"));
		jbnDel.setBackground(Color.red);
		Crearproducto.add(jbnDel);
		
		jbnDel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
		            Connection conexion = conectar();
		            String query = "DELETE FROM productos WHERE Nombre = ?";
		            PreparedStatement preparedStatement = (PreparedStatement) conexion.prepareStatement(query);
		            preparedStatement.setString(1, tfProveedor.getText());

		            int filasAfectadas = preparedStatement.executeUpdate();

		            if (filasAfectadas > 0) {
		                System.out.println("Empleado eliminado con éxito");
		            } else {
		                System.out.println("No se pudo eliminar el empleado");
		            }

		            conexion.close();

		        } catch (SQLException e1) {
		            System.out.println("Error en la conexión");
		            e1.printStackTrace();
		        }
			}});
		
		regresar.setBounds(700, 400, 100, 100);
		regresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (subPanelProductos == "loby") {
					anterior = actual;
					actual = "Inicio";
					route();
				} else if (subPanelProductos == "eliminar") {
					CrearproductoLoby(Crearproducto);
					subPanelProductos = "loby";
					frame.repaint();
				}
			}
		});
		Crearproducto.add(regresar);
	}

	public void CrearproductoLobyBuscar(JPanel Crearproducto) {
		Crearproducto.removeAll();
		////// TITULO DE CREAR EMPLEADO
		////// TITULO DE CREAR COMPRA
		
		try {
            Connection conexion = conectar();
            Statement statement = conexion.createStatement();
            String query = "SELECT * FROM productos";
            ResultSet resultSet = statement.executeQuery(query);
            int contadorY=0;
            while (resultSet.next()) {
                double codigo = resultSet.getDouble("Codigo");
                String tipo = resultSet.getString("Tipo");
                String nombre = resultSet.getString("Nombre");
                int fechaCaducidad = resultSet.getInt("Fecha_caducidad");
                String proveedor = resultSet.getString("Proveedor");
                double precio = resultSet.getDouble("Precio");

                Producto producto = new Producto(codigo, tipo, nombre, fechaCaducidad, proveedor,precio);
//                System.out.println(producto.toString());
                JLabel labelAux= new JLabel(producto.toString());
                labelAux.setBounds(200,140+(contadorY*40),540,20);
                labelAux.setOpaque(true);
                labelAux.setBackground(Color.red);
                contadorY++;
                Crearproducto.add(labelAux);
            }

            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error en la conexión");
            e.printStackTrace();
        }
		
		JLabel tagProveedor4 = new JLabel("BIEVENIDO A LA SECCION DE PRODUCTOS");
		tagProveedor4.setBackground(Color.BLACK);
		tagProveedor4.setHorizontalAlignment(SwingConstants.CENTER);
		tagProveedor4.setSize(429, 45);
		tagProveedor4.setFont(new Font("Arial", Font.BOLD, 20));
		tagProveedor4.setForeground(Color.WHITE);
		tagProveedor4.setLocation(229, 36);
		Crearproducto.add(tagProveedor4);
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
		regresar.setBounds(700, 400, 100, 100);
		regresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (subPanelProductos == "loby") {
					anterior = actual;
					actual = "Inicio";
					route();
				} else if (subPanelProductos == "buscar") {
					CrearproductoLoby(Crearproducto);
					subPanelProductos = "loby";
					frame.repaint();
				}
			}
		});
		Crearproducto.add(regresar);
	}

	public void route() {

		if (gran_panel != null) {
			frame.remove(gran_panel);
		}

		if (actual.equals("Inicio")) {
			gran_panel = Inicio();
		}
		if (actual.equals("Crearpedido")) {
			gran_panel = Crearpedido();
		}
		if (actual.equals("Crearprovedor")) {
			gran_panel = Crearprovedor();
		}
		if (actual.equals("Crearempleado")) {
			gran_panel = Crearempleado();
		}
		if (actual.equals("Crearproducto")) {
			gran_panel = Crearproducto();
		}

		frame.add(gran_panel);
		frame.revalidate();
		frame.repaint();
	}
	public Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName(CONTROLADOR);
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("Conexión OK");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error en la conexión");
            e.printStackTrace();
        }
        return conexion;
    }
}
