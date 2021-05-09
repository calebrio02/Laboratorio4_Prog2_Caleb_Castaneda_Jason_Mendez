package modelo;

public class GComida  extends Vivienda{
	
	private int supermercado;
	
	private int carniceria;
	
	private int verduleria;
	
	

	public GComida() {
	
	}

	public int getSupermercado() {
		return supermercado;
	}

	public void setSupermercado(int supermercado) {
		this.supermercado = supermercado;
	}

	public int getCarniceria() {
		return carniceria;
	}

	public void setCarniceria(int carniceria) {
		this.carniceria = carniceria;
	}

	public int getVerduleria() {
		return verduleria;
	}

	public void setVerduleria(int verduleria) {
		this.verduleria = verduleria;
	}
	
	
	public int calculoGasto() {
		
		int total=0;
		
		total=(getSupermercado()+getCarniceria()+getVerduleria());
		return total;
	}
	@Override
	public String mostrar() {
		
		String mensaje ="";
		
		 mensaje+="Gastos en comida /n/n"
		 		+ "Supermercado: �"+ getSupermercado()+"/n"
		 		+ "Carniceria: �"+getCarniceria()+"/n"
		 		+ "Verduleria: �"+getVerduleria()+"/n"
		 		+ "Total: � "+calculoGasto()+"/n/n";
		
		return mensaje;
	}


	public void ingresar(int supermercado, int carne, int verdu) {

		setSupermercado(supermercado);
		setCarniceria(carne);
		setVerduleria(verdu);
	}
	
	
	

}
