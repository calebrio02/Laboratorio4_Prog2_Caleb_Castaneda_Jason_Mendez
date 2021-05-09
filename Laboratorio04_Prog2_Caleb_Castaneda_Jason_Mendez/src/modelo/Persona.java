package modelo;

public class Persona {
	
	private String nombre;
	
	private String id;
	
	private String numTel;

	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	
	
	public String muestraPersona() {
		String mensaje;
		mensaje = "Nombre: " + getNombre() + "\n"
				+  "Cedula: " + getId() + "\n"
				+ 	"Contacto: " + getNumTel() + "\n";
				
		
		
		
		return mensaje;
	}
	
	

}
