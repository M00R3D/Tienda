package programa;

public class Persona {

	public String nombre,apellido;//direccion
	public double cedula,telefono;
	public Direccion direccion;
	public Persona(String nombre, String apellido, double cedula, double telefono, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.telefono = telefono;
		this.direccion = direccion;}
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public String getApellido() {return apellido;}
	public void setApellido(String apellido) {this.apellido = apellido;}
	public double getCedula() {return cedula;}public void setCedula(double cedula) {this.cedula = cedula;}
	public double getTelefono() {return telefono;}
	public void setTelefono(double telefono) {this.telefono = telefono;}
	public Direccion getDireccion() {return direccion;}
	public void setDireccion(Direccion direccion) {this.direccion = direccion;	}

}
