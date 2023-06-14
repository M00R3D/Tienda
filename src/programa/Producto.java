
package programa;
import java.util.ArrayList;

public class Producto {
	double codigo;
	String nombre,proveedor,tipo;
	int fechaCaducidad;
	double precio;
	public Producto(double codigo, String tipo, String nombre, int fechaCaducidad,String proveedor,double precio) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.nombre = nombre;
		this.fechaCaducidad = fechaCaducidad;
		this.proveedor=proveedor;
		this.precio=precio;
	}
	
	
	public double getCodigo() {return codigo;}
	public void setCodigo(double codigo) {this.codigo = codigo;}
	public String getTipo() {return tipo;}
	public void setTipo(String tipo) {this.tipo = tipo;}
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public int getFechaCaducidad() {return fechaCaducidad;}
	public void setFechaCaducidad(int fechaCaducidad) {this.fechaCaducidad = fechaCaducidad;}
	public String getProveedor() {return proveedor;}
	public void setProveedor(String proveedor) {this.proveedor = proveedor;}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return codigo + "    " + nombre + "    " + proveedor +"    " + tipo
				+ "    " + fechaCaducidad + "          $"+precio;
	}
	
	
	
}
