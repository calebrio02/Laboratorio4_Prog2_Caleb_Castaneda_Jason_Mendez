package modelo;

public class GOcio extends Gasto{//Hereda de la clase abstracta gasto
	
	private int streaming=0; //Gastos en servicios online
	
	private int salidas=0; //Salidas a restaurantes, cine, etc

	
	/////////////////////sets y gets/////////////////
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
	public int calculoGasto(){//Metodo abstracto de la clase Gasto
		
		int total=0;
		
		total=(getSalidas()+getStreaming());
		return total;
	}
	@Override
	public String mostrar() {//Metodo abstracto de la clase gasto
		// TODO Auto-generated method stub
		
		String mensaje="";
		
		mensaje+="Gastos en Ocio \n\n"
				+"Online (Netflix, juegos, etc): ¢"+getStreaming()+"\n"
				+"Salidas: ¢" +getSalidas()+"\n"
				+"Total: ¢" +calculoGasto()+"\n\n";
		
		return mensaje;
	}


	public void ingresar(int streaming, int salidas) {//metodo para ingresar los datos desde la interfaz

			setStreaming(streaming);
			setSalidas(salidas);
	}
	

}//fin de esta clase
