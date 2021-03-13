package taller3.televisores;

public class TV {
	
	private Marca marca;
	public int canal = 1;
	private int precio = 500;
	public boolean estado;
	public int volumen = 1;
	public Control control;
	public static int numTV;
	
	//constructor
	
	public TV(Marca marca, boolean estado) {
		
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	// get estado & numtv
	
	public boolean getEstado() {
		return estado;
	}
	public void setNumTV(int numTV) {
		this.numTV = numTV;
	}
	public int getNumTV() {
		return numTV;
	}
	public void volumenUp() {
		if (this.estado) {
			if (volumen >= 0 && volumen <7) {
				volumen++;
			}
		}else {
			return;
		}
		
	}
	public void volumenDown() {
		if (estado) {
			if (volumen > 0 && volumen <=7) {
				volumen--;
			}
		}else {
			return;
		}
	}
	
	// Canal up & Canal down
	
	public void canalUp() {
		if (estado) {
			if (canal >= 1 && canal < 120) {
				canal++;
			}
		}else {
			return;
		}
	}
	public void canalDown() {
		if (estado) {
			if (canal > 1 && canal <= 120) {
				canal--;
			}
		}else {
			return;
		}
	}
	
	public void turnOn() {
		if (!this.estado) {
			estado = true;
		}else {
			return;
		}
	}
	
	public void turnOff() {
		if (estado) {
			estado = false;
		}else {
			return;
		}
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	//set's & get's
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Marca getMarca() {
		return marca;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPrecio() {
		return precio;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public int getVolumen() {
		return volumen;
	}
	
	public int getCanal() {
		return canal;
	}

}
