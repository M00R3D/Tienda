package programa;

public class Fecha {
	public int dia,mes,year;
	public Fecha(int dia, int mes, int year) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.year = year;
	}
	public int getDia() {return dia;}
	public void setDia(int dia) {this.dia = dia;}
	public int getMes() {return mes;}
	public void setMes(int mes) {this.mes = mes;}
	public int getYear() {return year;}
	public void setYear(int year) {this.year = year;}
}
