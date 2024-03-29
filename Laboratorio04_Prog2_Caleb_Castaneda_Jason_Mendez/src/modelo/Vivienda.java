package modelo;

public class Vivienda {//clase final donde se integran todos los elementos necesarios para el funcionamiento del programa
	
	Persona p = new Persona();//agregacion de la clase persona
	GComida comida = new GComida();//agregacion del gasto de comida
	GOcio ocio = new GOcio();//agregacion del gasto en ocio
	GServiciosBasicos sb = new GServiciosBasicos();//agregacion del gasto de servcios basicos 
	int indiceGuia;//utilizado para asignar un numero a los registros que se llevan
	
	
	///////////////sets y gets//////////////////
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
	
	public void ingresaP (String nombre, int ingreso) {//metodo de ingresa persona para utilizar en la gui
		
		p.setNombre(nombre);
		p.setIngreso(ingreso);
	}
	
	public void ingresaC (int superm, int carne, int verdu) {//metodo de ingresa comida para utilizar en la gui

		comida.setSupermercado(superm);
		comida.setCarniceria(carne);
		comida.setVerduleria(verdu);
		
	}
	
	public void ingresaO(int stream, int salidas) {//metodo de ingresa ocio para utilizar en la gui
		ocio.setSalidas(salidas);
		ocio.setStreaming(stream);
		
	}
	
	public void ingresaSB (int agua, int luz, int ci, int trans) {//metodo de ingresa servicios basicos para utilizar en la gui
		
		sb.setAgua(agua);
		sb.setLuz(luz);
		sb.setCableInternet(ci);
		sb.setTransporte(trans);
		
		}
	
	public void calculaTotal() {//metodo para sumar el total de gastos
		int total=0;
		
		total=(comida.calculoGasto()+ocio.calculoGasto()+sb.calculoGasto());
		setGastoTotal(total);
		
	}
	
	public String diferencia() {//metodo para saber si sobro dinero en el mes en base al gasto y al ingreso
		
		String mensaje="";
		
		if (p.getIngreso()-getGastoTotal()>0) {
			
			mensaje="Este mes te sobr�: �"+(p.getIngreso()-getGastoTotal());
			
		}else {
			mensaje="Este mes no hubo ahorros";
		}
		
		return mensaje;
	}
	public String mostrar() {//metodo para mostrar todo los datos registrados
		
		calculaTotal();
		String mensaje="";
		mensaje="Control de gastos \n\n"
			   +p.muestraPersona()
			   +sb.mostrar()
			   +comida.mostrar()
			   +ocio.mostrar()
			   +"Total de gastos: �"+getGastoTotal()+"\n"
			   +diferencia()+"\n"+
			   "----------------------------------\n\n";
				
		return mensaje;
	}
	
	

}//fin de esta clase
