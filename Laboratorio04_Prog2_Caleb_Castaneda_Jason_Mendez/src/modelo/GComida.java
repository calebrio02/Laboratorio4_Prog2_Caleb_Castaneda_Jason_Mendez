package modelo;

public class GComida  extends Gasto{//hereda de la clase abstracta Gasto
	
	private int supermercado=0;//Gastos de supermercado
	
	private int carniceria=0;//Gastos de Carniceria
	
	private int verduleria=0;//Gastos de verduras
	
	

	public GComida() {//Constructor de esta clase
	
	}
//////////////////// sets y gets//////////////////////
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
	
	@Override
	public int calculoGasto() {//Metodo abstracto de la clase gasto
		
		int total=0;
		
		total=(getSupermercado()+getCarniceria()+getVerduleria());
		return total;
	}
	
	@Override
	public String mostrar() {//Metodo abstracto de la clase gasto
		
		String mensaje ="";
		
		 mensaje+="Gastos en comida \n\n"
		 		+ "Supermercado: ¢"+ getSupermercado()+"\n"
		 		+ "Carniceria: ¢"+getCarniceria()+"\n"
		 		+ "Verduleria: ¢"+getVerduleria()+"\n"
		 		+ "Total: ¢ "+calculoGasto()+"\n\n";
		
		return mensaje;
	}


	public void ingresar(int supermercado, int carne, int verdu) {//Metodo para ingresar los datos de esta clase en la interfaz

		setSupermercado(supermercado);
		setCarniceria(carne);
		setVerduleria(verdu);
	}
	
	
	

}//fin de la clase
