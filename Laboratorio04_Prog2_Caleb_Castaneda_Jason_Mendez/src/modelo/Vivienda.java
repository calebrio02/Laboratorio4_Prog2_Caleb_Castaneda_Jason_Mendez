package modelo;

public class Vivienda {
	


	Persona p = new Persona();
	GComida comida = new GComida();
	GOcio ocio = new GOcio();
	GServiciosBasicos sb = new GServiciosBasicos();
	int indiceGuia;
	
	
	
	public int getIndiceGuia() {
		return indiceGuia;
	}
	public void setIndiceGuia(int indiceGuia) {
		this.indiceGuia = indiceGuia;
	}
	public int gastoTotal=0;
	
	public int getGastoTotal() {
		return gastoTotal;
	}
	public void setGastoTotal(int gastoTotal) {
		this.gastoTotal = gastoTotal;
	}
	public GComida getComida() {
		return comida;
	}
	public void setComida(GComida comida) {
		this.comida = comida;
	}
	public GOcio getOcio() {
		return ocio;
	}
	public void setOcio(GOcio ocio) {
		this.ocio = ocio;
	}
	public GServiciosBasicos getSb() {
		return sb;
	}
	public void setSb(GServiciosBasicos sb) {
		this.sb = sb;
	}
	
	public Persona getP() {
		return p;
	}
	public void setP(Persona p) {
		this.p = p;
	}
	
	public void ingresaP (String nombre, int ingreso) {
		
		p.setNombre(nombre);
		p.setIngreso(ingreso);
	}
	
	public void ingresaC (int superm, int carne, int verdu) {

		comida.setSupermercado(superm);
		comida.setCarniceria(carne);
		comida.setVerduleria(verdu);
		
	}
	
	public void ingresaO(int stream, int salidas) {
		ocio.setSalidas(salidas);
		ocio.setStreaming(stream);
		
	}
	
	public void ingresaSB (int agua, int luz, int ci, int trans) {
		
		sb.setAgua(agua);
		sb.setLuz(luz);
		sb.setCableInternet(ci);
		sb.setTransporte(trans);
		
		}
	
	public void calculaTotal() {
		int total=0;
		
		total=(comida.calculoGasto()+ocio.calculoGasto()+sb.calculoGasto());
		setGastoTotal(total);
		
	}
	
	public String diferencia() {
		
		String mensaje="";
		
		if (p.getIngreso()-getGastoTotal()>0) {
			
			mensaje="Este mes te sobró: ¢"+(p.getIngreso()-getGastoTotal());
			
		}else {
			mensaje="Este mes no hubo ahorros";
		}
		
		return mensaje;
	}
	public String mostrar() {
		
		calculaTotal();
		String mensaje="";
		mensaje="Control de gastos \n\n"
			   +p.muestraPersona()
			   +sb.mostrar()
			   +comida.mostrar()
			   +ocio.mostrar()
			   +"Total de gastos: ¢"+getGastoTotal()+"\n"
			   +diferencia()+"\n"+
			   "----------------------------------\n\n";
				
		return mensaje;
	}
	
	

}
