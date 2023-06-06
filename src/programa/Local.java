package programa;

public class Local {
	String nombre;
	Direccion direccion;
	double codigoPostal;
	int telefono;
	public Local(String nombre, Direccion direccion, double codigoPostal, int telefono) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.telefono = telefono;
	}
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public Direccion getDireccion() {return direccion;}
	public void setDireccion(Direccion direccion) {this.direccion = direccion;}
	public double getCodigoPostal() {return codigoPostal;}
	public void setCodigoPostal(double codigoPostal) {this.codigoPostal = codigoPostal;}
	public int getTelefono() {return telefono;}
	public void setTelefono(int telefono) {this.telefono = telefono;}
	
}
