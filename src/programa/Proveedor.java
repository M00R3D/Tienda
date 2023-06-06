package programa;

public class Proveedor extends Persona {
	public String empresa;
	public Proveedor(String nombre, String apellido, double cedula, double telefono, Direccion direccion) {
		super(nombre, apellido, cedula, telefono, direccion);
	}
	public Proveedor(String nombre, String apellido, double cedula, double telefono, Direccion direccion,String empresa) {
		super(nombre, apellido, cedula, telefono, direccion);
		this.empresa=empresa;
	}
	public String getEmpresa() {return empresa;}
	public void setEmpresa(String empresa) {this.empresa = empresa;}

}
