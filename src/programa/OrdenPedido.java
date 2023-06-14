package programa;
import java.util.ArrayList;

public class OrdenPedido {
    String fecha, clave, empleado, fecha_caducidad, Sucursal, precio_total;
    ArrayList<Producto> productos = new ArrayList<>();

    public OrdenPedido(String fecha, String clave, String empleado, String fecha_caducidad, String sucursal, String precio_total) {
        this.fecha = fecha;
        this.clave = clave;
        this.empleado = empleado;
        this.fecha_caducidad = fecha_caducidad;
        Sucursal = sucursal;
        this.precio_total = precio_total;
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public String generarTicket() {
        StringBuilder ticket = new StringBuilder();

        ticket.append("///Fecha: ").append(fecha).append("");
        ticket.append("///Clave: ").append(clave).append("");
        ticket.append("///Empleado: ").append(empleado).append("");
        ticket.append("///Sucursal: ").append(Sucursal).append("");
        ticket.append("------------------------------");
        // Calcula el precio total
        double precioTotal = calcularPrecioTotal();

        for (Producto producto : productos) {
            ticket.append("///Producto: ").append(producto.getNombre());
            ticket.append("///Fecha de caducidad: ").append(producto.getFechaCaducidad());
            ticket.append("///Precio unitario: ").append(producto.getPrecio());
            ticket.append("------------------------------");

        }

        ticket.append("Precio total: ").append(precioTotal).append("\n");

        return ticket.toString();
    }

    private double calcularPrecioTotal() {
        double precioTotal = 0.0;

        // Contador para contar la cantidad de veces que se repite un producto
        int contadorProductos = 0;

        for (Producto producto : productos) {
            precioTotal += producto.getPrecio();
            contadorProductos++;
        }

        // Realiza la operación del precio total en base a la cantidad de productos repetidos
        if (contadorProductos > 1) {
            precioTotal = precioTotal * contadorProductos;
        }

        return precioTotal;
    }

    // Agrega los demás getters y setters según sea necesario
}