package programa;
import java.util.Scanner;

public class Main {


	
	
	
	
	
	
	
	
	
	
	private static Fecha crearFecha(Scanner scanner) {
		// Pedir los datos de la fecha al usuario
        System.out.println("Ingrese el día: ");
        int dia = scanner.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el año: ");
        int anio = scanner.nextInt();
        // Crear un objeto de la clase Fecha
        return new Fecha(dia, mes, anio);
	}	
	public static Direccion crearDireccion(Scanner scanner) {
        // Pedir los datos de la dirección al usuario
        System.out.println("Ingrese el número de la dirección: ");
        int numeroDireccion = scanner.nextInt();
        System.out.println("Ingrese el código postal: ");
        int cp = scanner.nextInt();
        System.out.println("Ingrese el nombre de la calle: ");
        scanner.nextLine(); // Limpiar el buffer antes de leer la línea
        String calle = scanner.nextLine();
        System.out.println("Ingrese el nombre de la primera calle transversal: ");
        String eCalle1 = scanner.nextLine();
        System.out.println("Ingrese el nombre de la segunda calle transversal: ");
        String eCalle2 = scanner.nextLine();
        // Crear un objeto de la clase Direccion
        return new Direccion(numeroDireccion, cp, calle, eCalle1, eCalle2);
    }
	public static void crearPersona() 
	{
		try (Scanner scanner = new Scanner(System.in)) {
			// Pedir los datos de la persona al usuario
			System.out.println("Ingrese el nombre: ");
			String nombre = scanner.nextLine();
			System.out.println("Ingrese el apellido: ");
			String apellido = scanner.nextLine();
			System.out.println("Ingrese la cédula: ");
			double cedula = scanner.nextDouble();
			System.out.println("Ingrese el teléfono: ");
			double telefono = scanner.nextDouble();
			// Pedir los datos de la dirección al usuario
						System.out.println("Ingrese el número de la dirección: ");
						int numeroDireccion = scanner.nextInt();
						System.out.println("Ingrese el código postal: ");
						int cp = scanner.nextInt();
						System.out.println("Ingrese el nombre de la calle: ");
						scanner.nextLine(); // Limpiar el buffer antes de leer la línea
						String calle = scanner.nextLine();
						System.out.println("Ingrese el nombre de la primera calle transversal: ");
						String eCalle1 = scanner.nextLine();
						System.out.println("Ingrese el nombre de la segunda calle transversal: ");
						String eCalle2 = scanner.nextLine();
						// Crear un objeto de la clase Direccion
						Direccion direccion = new Direccion(numeroDireccion, cp, calle, eCalle1, eCalle2);
			// Crear un objeto de la clase Persona
			Persona persona = new Persona(nombre, apellido, cedula, telefono, direccion);
			// Imprimir los datos de la persona creada
			System.out.println("\nDatos de la persona:");
			System.out.println("Nombre: " + persona.getNombre());
			System.out.println("Apellido: " + persona.getApellido());
			System.out.println("Cédula: " + persona.getCedula());
			System.out.println("Teléfono: " + persona.getTelefono());
			System.out.println("Dirección:");
			System.out.println("Número: " + persona.getDireccion().getNumero());
			System.out.println("Código Postal: " + persona.getDireccion().getCp());
			System.out.println("Calle: " + persona.getDireccion().getCalle());
			System.out.println("Primera calle transversal: " + persona.getDireccion().geteCalle1());
			System.out.println("Segunda calle transversal: " + persona.getDireccion().geteCalle2());}
	}
	public static void crearProveedor() 
	{
		Scanner scanner = new Scanner(System.in);

        // Pedir los datos de la persona al usuario
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese la cédula: ");
        double cedula = scanner.nextDouble();
        System.out.println("Ingrese el teléfono: ");
        double telefono = scanner.nextDouble();
        // Crear un objeto de la clase Direccion
        Direccion direccion = crearDireccion(scanner);
        // Pedir los datos específicos del proveedor
        System.out.println("Ingrese el nombre de la empresa: ");
        scanner.nextLine(); // Limpiar el buffer antes de leer la línea
        String empresa = scanner.nextLine();
        // Crear un objeto de la clase Proveedor
        Proveedor proveedor = new Proveedor(nombre, apellido, cedula, telefono, direccion, empresa);
        // Imprimir los datos del proveedor creado
        System.out.println("\nDatos del proveedor:");
        System.out.println("Nombre: " + proveedor.getNombre());
        System.out.println("Apellido: " + proveedor.getApellido());
        System.out.println("Cédula: " + proveedor.getCedula());
        System.out.println("Teléfono: " + proveedor.getTelefono());
        System.out.println("Dirección:");
        System.out.println("Número: " + proveedor.getDireccion().getNumero());
        System.out.println("Código Postal: " + proveedor.getDireccion().getCp());
        System.out.println("Calle: " + proveedor.getDireccion().getCalle());
        System.out.println("Primera calle transversal: " + proveedor.getDireccion().geteCalle1());
        System.out.println("Segunda calle transversal: " + proveedor.getDireccion().geteCalle2());
        System.out.println("Empresa: " + proveedor.getEmpresa());
	}
	
	
	public static void crearEmpleado() 
	{
		Scanner scanner = new Scanner(System.in);

        // Pedir los datos de la persona al usuario
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese la cédula: ");
        double cedula = scanner.nextDouble();
        System.out.println("Ingrese el teléfono: ");
        double telefono = scanner.nextDouble();
        // Crear un objeto de la clase Direccion
        Direccion direccion = crearDireccion(scanner);
        // Pedir los datos específicos del empleado
        System.out.println("Ingrese el cargo: ");
        scanner.nextLine(); // Limpiar el buffer antes de leer la línea
        String cargo = scanner.nextLine();
        // Crear un objeto de la clase Empleado
        Empleado empleado = new Empleado(nombre, apellido, cedula, telefono, direccion, cargo);
        // Imprimir los datos del empleado creado
        System.out.println("\nDatos del empleado:");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Apellido: " + empleado.getApellido());
        System.out.println("Cédula: " + empleado.getCedula());
        System.out.println("Teléfono: " + empleado.getTelefono());
        System.out.println("Dirección:");
        System.out.println("Número: " + empleado.getDireccion().getNumero());
        System.out.println("Código Postal: " + empleado.getDireccion().getCp());
        System.out.println("Calle: " + empleado.getDireccion().getCalle());
        System.out.println("Primera calle transversal: " + empleado.getDireccion().geteCalle1());
        System.out.println("Segunda calle transversal: " + empleado.getDireccion().geteCalle2());
        System.out.println("Cargo: " + empleado.getCargar());
	}
	public static void crearOrdenCompra() 
	{
		Scanner scanner = new Scanner(System.in);
        // Pedir los datos de la orden de compra al usuario
        System.out.println("Ingrese el número de la orden de compra: ");
        double numero = scanner.nextDouble();
        System.out.println("Ingrese el precio: ");
        double precio = scanner.nextDouble();
        System.out.println("Ingrese el precio total: ");
        double precioTotal = scanner.nextDouble();
        System.out.println("Ingrese el estado: ");
        scanner.nextLine(); // Limpiar el buffer antes de leer la línea
        String estado = scanner.nextLine();
        // Crear un objeto de la clase Fecha
        Fecha fecha = crearFecha(scanner);
        // Crear un objeto de la clase OrdenCompra
        OrdenCompra ordenCompra = new OrdenCompra(numero, precio, precioTotal, estado, fecha);
        // Imprimir los datos de la orden de compra creada
        System.out.println("\nDatos de la orden de compra:");
        System.out.println("Número: " + ordenCompra.getNumero());
        System.out.println("Precio: " + ordenCompra.getPrecio());
        System.out.println("Precio Total: " + ordenCompra.getPrecioTotal());
        System.out.println("Estado: " + ordenCompra.getEstado());
        System.out.println("Fecha: " + ordenCompra.getFecha().getDia() + "/" + ordenCompra.getFecha().getMes() + "/" + ordenCompra.getFecha().getYear());

	}
	public static void crearProducto() 
	{
		Scanner scanner = new Scanner(System.in);

        // Pedir los datos del producto al usuario
        System.out.println("Ingrese el código del producto: ");
        double codigo = scanner.nextDouble();
        System.out.println("Ingrese el número del producto: ");
        double numero = scanner.nextDouble();
        System.out.println("Ingrese el nombre del producto: ");
        scanner.nextLine(); // Limpiar el buffer antes de leer la línea
        String nombre = scanner.nextLine();
        // Crear un objeto de la clase Fecha
        Fecha fechaCaducidad = crearFecha(scanner);
        // Crear un objeto de la clase Producto
        Producto producto = new Producto(codigo, numero, nombre, fechaCaducidad);
        // Imprimir los datos del producto creado
        System.out.println("\nDatos del producto:");
        System.out.println("Código: " + producto.getCodigo());
        System.out.println("Número: " + producto.getNumero());
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Fecha de Caducidad: " + producto.getFechaCaducidad().getDia() + "/" + producto.getFechaCaducidad().getMes() + "/" + producto.getFechaCaducidad().getYear());

	}
	public static void crearLocal() 
	{
		// Pedir los datos del local al usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del local: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el número de la dirección: ");
        int numeroDireccion = scanner.nextInt();

        System.out.println("Ingrese el código postal: ");
        int codigoPostal = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después del número entero

        System.out.println("Ingrese el nombre de la calle: ");
        String calle = scanner.nextLine();

        System.out.println("Ingrese el nombre de la calle adicional (opcional): ");
        String calleAdicional = scanner.nextLine();

        System.out.println("Ingrese el nombre de la segunda calle adicional (opcional): ");
        String segundaCalleAdicional = scanner.nextLine();

        System.out.println("Ingrese el teléfono: ");
        int telefono = scanner.nextInt();

        // Crear un objeto de la clase Direccion
        Direccion direccion = new Direccion(numeroDireccion, codigoPostal, calle, calleAdicional, segundaCalleAdicional);

        // Crear un objeto de la clase Local
        Local local = new Local(nombre, direccion, codigoPostal, telefono);

        // Imprimir los datos del local creado
        System.out.println("\nDatos del local:");
        System.out.println("Nombre: " + local.getNombre());
        System.out.println("Dirección: " + local.getDireccion().getNumero() + " " + local.getDireccion().getCalle());
        System.out.println("Código Postal: " + local.getCodigoPostal());
        System.out.println("Teléfono: " + local.getTelefono());
	}
}
