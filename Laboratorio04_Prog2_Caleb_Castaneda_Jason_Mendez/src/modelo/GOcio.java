package modelo;

public class GOcio extends Gasto{
	
	private int streaming=0; //Gastos en servicios online
	
	private int salidas=0; //Salidas a restaurantes, cine, etc

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
	@Override
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
