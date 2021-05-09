package modelo;

public abstract class Vivienda {
	
	Persona p = new Persona();
	Gasto g = new Gasto();
	
	
	public Persona getP() {
		return p;
	}
	public void setP(Persona p) {
		this.p = p;
	}
	public Gasto getG() {
		return g;
	}
	public void setG(Gasto g) {
		this.g = g;
	}
	
	public abstract String mostrar();
	
	

}
