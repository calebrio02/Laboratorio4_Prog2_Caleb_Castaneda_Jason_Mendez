package modelo;

public class GServiciosBasicos extends Gasto{

	private int agua =0;
	
	private int luz =0;
	
	private int cableInternet=0;
	
	private int transporte=0;

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
	public int calculoGasto() {
		
		int total=0;
		
		total = (getAgua()+getCableInternet()+getLuz()+getTransporte());
		
		return total;
	}
	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		
		String mensaje="";
		
		mensaje+="Gastos servicios b�sicos /n"
				+"Electricidad: �"+getLuz()+"/n"
				+"Agua: �"+getAgua()+"/n"
				+"Cable e internet �"+getCableInternet()+"/n"
				+"Transporte: �" +getTransporte()+"/n"
				+"Total: �"+calculoGasto()+"/n/n";
		return mensaje;
	}


	public void ingresar(int agua,int luz, int internet, int transporte) {
		
	
		
		setAgua(agua);
		setLuz(luz);
		setCableInternet(internet);
		setTransporte(transporte);
	}


	
}
