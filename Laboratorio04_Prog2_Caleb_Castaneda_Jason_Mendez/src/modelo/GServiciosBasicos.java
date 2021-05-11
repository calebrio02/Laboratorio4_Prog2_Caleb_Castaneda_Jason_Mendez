package modelo;

public class GServiciosBasicos extends Gasto{

	private int agua =0;//gatos en agua
	
	private int luz =0;//gastos en electricidad
	
	private int cableInternet=0;//gastos en television e internet
	
	private int transporte=0;//gastos en transporte, gasolina

	///////////////sets y gets///////////////
	public int getAgua() {
		return agua;
	}

	public void setAgua(int agua) {
		this.agua = agua;
	}

	public int getLuz() {
		return luz;
	}

	public void setLuz(int luz) {
		this.luz = luz;
	}

	public int getCableInternet() {
		return cableInternet;
	}

	public void setCableInternet(int cableInternet) {
		this.cableInternet = cableInternet;
	}

	public int getTransporte() {
		return transporte;
	}

	public void setTransporte(int transporte) {
		this.transporte = transporte;
	}
	
	
	@Override
	public int calculoGasto() {//Metodo abstracto de la clase gasto
		
		int total=0;
		
		total = (getAgua()+getCableInternet()+getLuz()+getTransporte());
		
		return total;
	}
	@Override
	public String mostrar() {//Metodo abstracto de la clase gasto
		// TODO Auto-generated method stub
		
		String mensaje="";
		
		mensaje+="Gastos servicios básicos \n\n"
				+"Electricidad: ¢"+getLuz()+"\n"
				+"Agua: ¢"+getAgua()+"\n"
				+"Cable e internet ¢"+getCableInternet()+"\n"
				+"Transporte: ¢" +getTransporte()+"\n"
				+"Total: ¢"+calculoGasto()+"\n\n";
		return mensaje;
	}


	public void ingresar(int agua,int luz, int internet, int transporte) {//metodo para ingresar desde la interfaz
		
		setAgua(agua);
		setLuz(luz);
		setCableInternet(internet);
		setTransporte(transporte);
	}


	
}//fin de esta clase
