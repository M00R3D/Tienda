package programa;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		crearPersona();
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
	
}
