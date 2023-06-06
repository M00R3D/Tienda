package programa;

public class OrdenPedido {
	Fecha fecha;
	int cantidad;
	double numero;
	public OrdenPedido(Fecha fecha, int cantidad, double numero) {
		super();
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.numero = numero;
	}
	public Fecha getFecha() {return fecha;}
	public void setFecha(Fecha fecha) {this.fecha = fecha;}
	public int getCantidad() {return cantidad;}
	public void setCantidad(int cantidad) {this.cantidad = cantidad;}
	public double getNumero() {return numero;}
	public void setNumero(double numero) {this.numero = numero;}
	
}
