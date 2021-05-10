package modelo;

public class Persona {
	
	private String nombre;
	
	private int ingreso=0;

	
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

	public String muestraPersona() {
		String mensaje;
		mensaje = "Nombre: " + getNombre() + "\n"
			    + "Ingreso: ¢ " + getIngreso() + "\n/n";
				
		
		
		
		return mensaje;
	}
	
	

}
