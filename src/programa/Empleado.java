package programa;

public class Empleado extends Persona{
	public String cargar;
	public Empleado(String nombre, String apellido, double cedula, double telefono, Direccion direccion,String cargar)
	{super(nombre, apellido, cedula, telefono, direccion);this.cargar=cargar;}
	public String getCargar() {return cargar;}
	public void setCargar(String cargar) {this.cargar = cargar;}

}
