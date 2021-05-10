package controlador;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import modelo.Vivienda;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;




public class Lista {

	
	LinkedList<Vivienda> l = new LinkedList<Vivienda>();
		
		public String mostrar(int i) {
			
			String info= "";
			
			for (int j = 0; j < l.size(); j++) {
				
				info += l.get(j).mostrar() + "\n\n";
			}
			
			
			
			return info;
		}
		
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		

		

			
			
			JTextArea jtxt_area;//se usa para el muestra
			FileNameExtensionFilter filtro;//el filtro de extension de archivos 
			String ruta = "";//para conseguir la ruta del archivo
			JScrollPane scroll;//para el metodo muestra que sea posible ahcer scroll
			
			int size=0;
			int numPaciente=0; //servirÃ¡ para eliminar pacientes de la lista.

			
			
			public void insertar(Vivienda v) {//METODO PARA AGREGAR A LOS PACIENTES
				l.add(v);
				size++;
			}
			
			
			
			public void consultar(int d) {//metodo para buscar un cliente en especifico
				//la variable "d" se utiliza para recibir el dato del JTxtField
				//boolean encontrado= false;
				
					
					try {
						if(l.isEmpty()) {///Si esta vacia se despliega el memnsaje
							mensajeTemporizado("Lista Vacia", 800);
						}else {
					
							JOptionPane.showMessageDialog(null, l.get(d-1).mostrar()); 
						}
						}catch (Exception e) {
							mensajeTemporizado("Paciente no existe", 800);

						}
					
			}
			
			public Vivienda buscar(int d) {//metodo para buscar un cliente en especifico
				//la variable "d" se utiliza para recibir el dato del JTxtField
				
				
				Vivienda v = new Vivienda();
					
					try {
						if(l.isEmpty()) {///Si esta vacia se despliega el memnsaje
							mensajeTemporizado("Lista Vacia", 800);
							v = null;
						}else{
							v = l.get(d-1);

							
						}
						}catch (Exception e) {
							mensajeTemporizado("Paciente no existe", 800);
							
						}
					
					
					
					return v;
					
			}
			
			public void actualizar(int indice, Vivienda v) {//metodo para buscar un cliente en especifico
				//la variable "d" se utiliza para recibir el dato del JTxtField
				
				l.set((indice-1), v);
				
			}
			
				
			
			
						
			
			
			public void suprimir(int d) {//funciona igual que el mostrar, con la diferencia que el dato se elimina y se le hace saber al user de lo acontecido 
				//la variable d sirve para tomar el dato del jtxtfield en la interfaz, CORRESPONDIENTE AL INDICE QUE CONTIENE AL OBJETO
				
				
				try {
					if(l.isEmpty()){///Si esta vacia se despliega el memnsaje
						mensajeTemporizado("Lista Vacia", 800);
					}else {
						
						l.remove((d-1));
						mensajeTemporizado("Paciente [" + d + "]" + "eliminado", 800);
						size--;
					}
					
					}catch (Exception e) {
						mensajeTemporizado("Paciente no existe", 800);
					}
				
				
			
			}
			
			
			
			public String mostrar() {//metodo para mostrar todos los datos que haya hasta ese momento
				
				String mensaje="";
				if(l.isEmpty()) {
					mensajeTemporizado("Lista Vacia", 800);//si esta vacia se hace uso del metodo correspondiente y se devuelve este mensaje
				}else {
					//Datos para ver los datos de forma dinamica
					
					//String texto="";
					for (int i = 0; i < l.size(); i++) {
						mensaje+=l.get(i).mostrar()+ "\n\n";
						
					}
					//texto+= mensaje;
					
					//De lo contrario se devuelve el mensaje con lo que contenga
				}
				return mensaje;
			}
			
			public boolean elementosLista() {// PARA VER SI HAY ELEMENTOS EN LISTA 
				
				boolean hayElementos= false;
				
				if (l.isEmpty()==true) {
					 hayElementos = false; // si vacia, no hay elementos en lista
					
					
				}else {// de lo contrario, contiene elementos
					hayElementos = true;
				}
				
				
				return hayElementos;
			}
			
			
			public boolean existeElemento(int d) {//metodo para buscar un cliente en especifico
				
				
				//la variable "d" se utiliza para recibir el dato del JTxtField
				boolean existe= false;
				
					
					try {
						if(l.isEmpty()) {///Si esta vacia se despliega el mensaje
							mensajeTemporizado("Lista Vacia", 800);
						}else {
							existe = true;
							
						}
						}catch (Exception e) {
							mensajeTemporizado("Paciente no existe", 800);
							existe = false;
						}
					return existe;
					
			}
			
			
			public String acumulaDatos() {//ACUMULA LA INFO DE LA LISTA, DESPLEGANDO AL FINAL SOLAMENTE EL NOMBRE E IDENTIFICACION DEL PACIENTE.
											//ESTO HACE MÃ�S PRATICO, EL ELIMINAR, BUSCAR Y ACTUALIZAR, PARA EL USER 
				
				
				String mensaje="";
				if(l.isEmpty()) {
				}else {
					
					//Datos para ver los datos de forma dinamica
					for (int i = 0; i < size; i++) {
					mensaje+= "Persona [" + (i+1) + "]" + ": " + l.get(i).getP().getNombre() + "\n";
						
					}	
				}
				
				return mensaje;//retorna solo el nombre y el dni
			}
			
			
				
			public void mensajeTemporizado(String s, int t) {//METODO PARA HACER MENSAJES TEMPORIZADOS, ES MUY UTIL PARA LA GUI Y ADEMAS FACIL DE USAR
				JOptionPane opt = new JOptionPane(s, JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{});
				  final JDialog dlg = opt.createDialog("Aviso");
				  new Thread(new Runnable()
				        {
				          public void run()
				          {
				            try
				            {
				              Thread.sleep(t);//Duracion de un segundo para que el mensaje desaparezca
				              dlg.dispose();

				            }
				            catch ( Throwable th )
				            {
				          
				            }
				          }
				        }).start();
				  dlg.setVisible(true);
			}
		}

		
		
