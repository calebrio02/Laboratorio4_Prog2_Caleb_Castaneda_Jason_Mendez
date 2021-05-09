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
	
	public int calculoGasto(){
		
		int total=0;
		
		total=(getSalidas()+getSalidas());
		return total;
	}
	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		
		String mensaje="";
		
		mensaje+="Gastos en Ocio /n/n"
				+"Online (Netflix, juegos, etc): ¢"+getStreaming()+"/n"
				+"Salidas: ¢" +getSalidas()+"/n"
				+"Total: ¢" +calculoGasto()+"/n/n";
		
		return mensaje;
	}


	public void ingresar(int streaming, int salidas) {

			setStreaming(streaming);
			setSalidas(salidas);
	}
	

}
