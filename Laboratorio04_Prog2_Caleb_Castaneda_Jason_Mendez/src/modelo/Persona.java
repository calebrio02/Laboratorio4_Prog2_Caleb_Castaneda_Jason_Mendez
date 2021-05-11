package modelo;

public class Persona {//clase de los datos basicos de persona
	
	private String nombre;//nombre de la persona
	
	private int ingreso=0;//cantida de ingreso de la persona

	///////////////////////sets y gets////////////////
	public int getIngreso() {
		return ingreso;
	}

	public void setIngreso(int ingreso) {
		this.ingreso = ingreso;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String muestraPersona() {//muestra de esta clase
		String mensaje;
		mensaje = "Nombre: " + getNombre() + "\n"
			    + "Ingreso: ¢ " + getIngreso() + "\n\n";
				
		return mensaje;
	}
	
	

}//fin de esta clase
