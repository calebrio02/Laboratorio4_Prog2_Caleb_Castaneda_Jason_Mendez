package modelo;

public class GOcio extends Vivienda{
	
	private int streaming; //Gastos en servicios online
	
	private int salidas; //Salidas a restaurantes, cine, etc

	public int getStreaming() {
		return streaming;
	}

	public void setStreaming(int streaming) {
		this.streaming = streaming;
	}

	public int getSalidas() {
		return salidas;
	}

	public void setSalidas(int salidas) {
		this.salidas = salidas;
	}
	

}
