package programa;

public class OrdenCompra {
	double numero,precio,precioTotal;
	String estado;
	Fecha fecha;
	public OrdenCompra(double numero, double precio, double precioTotal, String estado, Fecha fecha) {
		super();
		this.numero = numero;
		this.precio = precio;
		this.precioTotal = precioTotal;
		this.estado = estado;
		this.fecha = fecha;
	}
	public double getNumero() {return numero;}
	public void setNumero(double numero) {this.numero = numero;}
	public double getPrecio() {return precio;}
	public void setPrecio(double precio) {this.precio = precio;}
	public double getPrecioTotal() {return precioTotal;}
	public void setPrecioTotal(double precioTotal) {this.precioTotal = precioTotal;}
	public String getEstado() {return estado;}
	public void setEstado(String estado) {this.estado = estado;}
	public Fecha getFecha() {return fecha;}
	public void setFecha(Fecha fecha) {this.fecha = fecha;}
	
}
