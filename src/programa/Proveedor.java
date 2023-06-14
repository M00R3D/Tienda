package programa;

public class Proveedor {
	public String empresa,nombre,apellido,cedula,telefono,direccion;
	
	public Proveedor(String nombre, String apellido, String cedula, String telefono, String direccion , String empresa) {
		this.empresa = empresa;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return  empresa + "   nombre:" + nombre + "   apellido:" + apellido + "   cedula:" + cedula
				+ "   telefono:" + telefono + "   direccion:" + direccion ;
	}

}
