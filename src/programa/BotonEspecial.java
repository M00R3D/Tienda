package programa;

import javax.swing.JButton;

public class BotonEspecial extends JButton{
	public String tipo;
	public String clave;
	public Producto producto;
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
		switch(tipo) 
		{
		case "Eliminar":
			break;
		case "Anadir":
			break;
		case "Mostrar":
			this.setText("mostrar");
			this.setSize(40,20);
			break;
		}
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

}