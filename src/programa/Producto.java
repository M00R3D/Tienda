package programa;

public class Producto {
	double codigo;
	String nombre,proveedor,tipo;
	int fechaCaducidad;
	public Producto(double codigo, String tipo, String nombre, int fechaCaducidad,String proveedor) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.nombre = nombre;
		this.fechaCaducidad = fechaCaducidad;
		this.proveedor=proveedor;
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
	@Override
	public String toString() {
		return codigo + "    " + nombre + "    " + proveedor +"    " + tipo
				+ "    " + fechaCaducidad ;
	}
	
	
	
}
