package programa;

public class Producto {
	double codigo,numero;
	String nombre;
	Fecha fechaCaducidad;
	public Producto(double codigo, double numero, String nombre, Fecha fechaCaducidad) {
		super();
		this.codigo = codigo;
		this.numero = numero;
		this.nombre = nombre;
		this.fechaCaducidad = fechaCaducidad;
	}
	public double getCodigo() {return codigo;}
	public void setCodigo(double codigo) {this.codigo = codigo;}
	public double getNumero() {return numero;}
	public void setNumero(double numero) {this.numero = numero;}
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public Fecha getFechaCaducidad() {return fechaCaducidad;}
	public void setFechaCaducidad(Fecha fechaCaducidad) {this.fechaCaducidad = fechaCaducidad;}
	
}
