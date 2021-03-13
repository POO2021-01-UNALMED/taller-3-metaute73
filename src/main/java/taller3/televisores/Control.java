package taller3.televisores;

public class Control {
	TV tv;
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.control = this;
		
		// volume up & volume down
	}	
	public void volumenUp() {
		
		if (tv.estado) {
			if (tv.volumen >= 0 && tv.volumen <7) {
				tv.volumen++;
			}
		}else {
			return;
		}
		
	}
	public void volumenDown() {
		if (tv.estado) {
			if (tv.volumen > 0 && tv.volumen <=7) {
				tv.volumen--;
			}
		}else {
			return;
		}
	}
	
	// Canal up & Canal down
	
	public void canalUp() {
		if (tv.estado) {
			if (tv.canal >= 0 && tv.canal < 120) {
				tv.canal++;
			}
		}else {
			return;
		}
	}
	public void canalDown() {
		if (tv.estado) {
			if (tv.canal > 0 && tv.canal <= 120) {
				tv.canal--;
			}
		}else {
			return;
		}
	}
	
	public void turnOn() {
		if (!tv.estado) {
			tv.estado = true;
		}else {
			return;
		}
	}
	
	public void turnOff() {
		if (tv.estado) {
			tv.estado = false;
		}else {
			return;
		}
	}
	
	public void setCanal(int canal) {
		tv.canal = canal;
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
	}
	public TV getTv() {
		return tv;
	}
}
