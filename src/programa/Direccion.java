package programa;

public class Direccion {
	public int numero,cp;
	public String calle,eCalle1,eCalle2;
	public Direccion(int numero, int cp, String calle, String eCalle1, String eCalle2) {
		super();
		this.numero = numero;
		this.cp = cp;
		this.calle = calle;
		this.eCalle1 = eCalle1;
		this.eCalle2 = eCalle2;
	}
	public int getNumero() {return numero;}
	public void setNumero(int numero) {this.numero = numero;}
	public int getCp() {return cp;}
	public void setCp(int cp) {this.cp = cp;}
	public String getCalle() {return calle;}
	public void setCalle(String calle) {this.calle = calle;}
	public String geteCalle1() {return eCalle1;}
	public void seteCalle1(String eCalle1) {this.eCalle1 = eCalle1;}
	public String geteCalle2() {return eCalle2;}
	public void seteCalle2(String eCalle2) {this.eCalle2 = eCalle2;}
	public String getCiudad() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
