	package modelo;
	
	import java.awt.BorderLayout;
	import java.awt.EventQueue;
	
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	
	//import controlador.Arbol;
	//import controlador.Lista;
	
	import javax.swing.JToolBar;
	import javax.swing.SwingConstants;
	import javax.swing.JMenuBar;
	import javax.swing.JMenuItem;
	import javax.swing.JOptionPane;
	
	import java.awt.CardLayout;
	import javax.swing.JLabel;
	import javax.swing.JTextArea;
	import java.awt.Button;
	import java.awt.Color;
	
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import java.awt.Font;
	import javax.swing.JScrollPane;
	import javax.swing.ScrollPaneConstants;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import javax.swing.JRadioButtonMenuItem;
	import java.awt.SystemColor;
	
	import java.awt.Canvas;
	import javax.swing.UIManager;
	import java.awt.event.KeyAdapter;
	import java.awt.event.KeyEvent;
	import java.util.Iterator;
	
	import javax.swing.JTextField;
	import javax.swing.JList;
	import javax.swing.JComboBox;
	import java.awt.Insets;
	import javax.swing.DefaultComboBoxModel;
	import java.awt.Toolkit;
	import java.awt.Window.Type;
	import javax.swing.border.LineBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.border.CompoundBorder;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.Frame;
import java.awt.Point;
import javax.swing.border.MatteBorder;
import java.awt.Component;
	
	public class Menu extends JFrame {
	
		private JPanel contentPane;
		private JPanel menuInserta;
		private JPanel menuMuestra;
	
		String nombre;
		String dni;
		String lugarResidencia;
		int indiceModificar=1;
		
		//Lista lista = new Lista();
		
		private JPanel bienvenida;
		JPanel pPrueba = new JPanel();
		JTextArea tDatosBuscar = new JTextArea();
		JTextArea tResi = new JTextArea();
		JTextArea datos = new JTextArea();
		JTextArea tInfoEliminar = new JTextArea();
		JTextArea tDireccionExacta = new JTextArea();
		JComboBox boxTipoAveria = new JComboBox();
		JComboBox boxAveriaEspecifica = new JComboBox();
		JComboBox boxLugar = new JComboBox();
		
		
		/////////////ACTUALIZA///////////////////
		JPanel panelDetalleAveria = new JPanel();
		JTextArea tNombreAc = new JTextArea();
		JTextArea tCedulaAc = new JTextArea();
		JTextArea tNisAc = new JTextArea();
		JTextArea tResidenciaAC = new JTextArea();
		JTextArea tAveriaReportadaAc = new JTextArea();
		JTextArea tArchivadas = new JTextArea();
		JComboBox boxAveriaAc = new JComboBox();
		JComboBox boxTipoAveriaAc = new JComboBox();
		JComboBox boxLugarAc = new JComboBox();
		JTextArea tDireccionExactaAc = new JTextArea();
		
		/////BOTON HOME/////
		
		JButton btnHomeShorCut = new JButton("");
		
		
		private JPanel menuElimina;
		private JPanel menuBusca;
		private JPanel panelActulizaDatosGenerales;
		private JTextField tBuscaReporte;
		private JTextField txtIngreseContrasena;
		private JTextField txtAdmin;
		
		/**
		 * Launch the application.
		 */
		
	
		/**
		 * Create the frame.
		 */
		public Menu() {
			setLocationByPlatform(true);
			setVisible(true);
			setFont(new Font("Palatino Linotype", Font.BOLD, 15));
			setTitle("Reporto mi aver\u00EDa.");
			setResizable(false);
			setForeground(Color.DARK_GRAY);
			setBackground(Color.DARK_GRAY);
			setIconImage(Toolkit.getDefaultToolkit().getImage("\\\\Mac\\Home\\Downloads\\Basic_set\\Basic_set_Png\\Basic_set_Png\\home_48.png"));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 737, 489);;;
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(new CardLayout(0, 0));
			
			
			JPanel inicioApp = new JPanel();
			contentPane.add(inicioApp, "Ingreso");
			inicioApp.setLayout(null);
			
			JPanel panelLoginMade = new JPanel();
			panelLoginMade.setBackground(Color.WHITE);
			panelLoginMade.setBounds(364, 29, 243, 376);
			inicioApp.add(panelLoginMade);
			panelLoginMade.setLayout(null);
			
			txtIngreseContrasena = new JTextField();
			txtIngreseContrasena.setForeground(new Color(47, 79, 79));
			txtIngreseContrasena.setBackground(Color.WHITE);
			txtIngreseContrasena.setHorizontalAlignment(SwingConstants.LEFT);
			txtIngreseContrasena.setFont(new Font("Palatino Linotype", Font.PLAIN, 13));
			txtIngreseContrasena.setEditable(false);
			txtIngreseContrasena.setText("********");
			txtIngreseContrasena.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(95, 158, 160)));
			txtIngreseContrasena.setBounds(10, 231, 216, 26);
			panelLoginMade.add(txtIngreseContrasena);
			txtIngreseContrasena.setColumns(10);
			
			txtAdmin = new JTextField();
			txtAdmin.setForeground(new Color(47, 79, 79));
			txtAdmin.setFont(new Font("Palatino Linotype", Font.PLAIN, 13));
			txtAdmin.setBackground(Color.WHITE);
			txtAdmin.setEditable(false);
			txtAdmin.setText("admin@UCR.com");
			txtAdmin.setColumns(10);
			txtAdmin.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(95, 158, 160)));
			txtAdmin.setBounds(10, 163, 216, 26);
			panelLoginMade.add(txtAdmin);
			
			JLabel lblNewLabel_3 = new JLabel("Login");
			lblNewLabel_3.setForeground(new Color(47, 79, 79));
			lblNewLabel_3.setFont(new Font("Palatino Linotype", Font.BOLD, 17));
			lblNewLabel_3.setBounds(94, 100, 86, 45);
			panelLoginMade.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/login.png")));
			lblNewLabel_4.setBounds(84, 28, 64, 64);
			panelLoginMade.add(lblNewLabel_4);
			
			JButton btnNewButton_1 = new JButton("Ingresar");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CardLayout c = (CardLayout)(contentPane.getLayout());
					//inicioApp.setVisible(false);
					c.show(contentPane, "MenuPrincipal");
					

				}
			});
			btnNewButton_1.setBackground(new Color(95, 158, 160));
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnNewButton_1.setForeground(Color.WHITE);
			btnNewButton_1.setBorder(null);
			btnNewButton_1.setAlignmentX(Component.CENTER_ALIGNMENT);
			btnNewButton_1.setBounds(73, 306, 96, 26);
			panelLoginMade.add(btnNewButton_1);
			
			JLabel lblWelcomeImage = new JLabel("");
			lblWelcomeImage.setHorizontalAlignment(SwingConstants.TRAILING);
			lblWelcomeImage.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/bgInicio.jpeg")));
			lblWelcomeImage.setBounds(0, 0, 721, 450);
			inicioApp.add(lblWelcomeImage);
			
			bienvenida = new JPanel();
			
			bienvenida.setBackground(Color.WHITE);
			
			contentPane.add(bienvenida, "MenuPrincipal");
			
			
			
			
			bienvenida.setLayout(null);
			//btnActualiza.setIcon(new ImageIcon(Menu.class.getResource("/vista/iconsImages/save_16.png")));
			
			JButton btnbusca = new JButton("Buscar");
			btnbusca.setHorizontalAlignment(SwingConstants.LEFT);
			btnbusca.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/buscar.png")));
			btnbusca.setForeground(Color.WHITE);
			
			btnbusca.setContentAreaFilled(false);
			btnbusca.setOpaque(false);
			btnbusca.setBackground(new Color (0, 0, 0, 50));
			
			btnbusca.setBounds(0, 162, 185, 51);
			bienvenida.add(btnbusca);
			btnbusca.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CardLayout c = (CardLayout)(contentPane.getLayout());
					c.show(contentPane, "t3");
					//tDatosBuscar.setText(arbol.acumulaDatos());
					
				}
			});
			
			
			btnbusca.setFont(new Font("SimSun", Font.BOLD, 15));
			
			
			
			JButton btnSalir = new JButton("Salir");
			btnSalir.setHorizontalAlignment(SwingConstants.LEFT);
			btnSalir.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/salir.png")));
			btnSalir.setForeground(Color.WHITE);
			
			btnSalir.setContentAreaFilled(false);
			btnSalir.setOpaque(false);
			btnSalir.setBackground(new Color (0, 0, 0, 50));
			
			btnSalir.setBounds(0, 348, 185, 51);
			bienvenida.add(btnSalir);
			
			btnSalir.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {//FINALIZACION DEL PROGRAMA CONTROLADA
					
					if (JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir?", "Alerta",//SE PREGUNRTA SI DESEA SALIR REALMENTE POR SI SE APRETO EL BOTON POR ERROR
					        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {	
						System.exit(0);//SI NO HAY DATOS DEL TODO EL PROGRAMA SOLO SE CIERRA SIN PREGUNTAR SI DESEA GUARDAR DATOS
					} else {
					}
				}
			});
			
			btnSalir.setFont(new Font("SimSun", Font.BOLD, 15));
			//btnSalir.setIcon(new ImageIcon(Menu.class.getResource("/vista/iconsImages/right_16.png")));
			
			JButton btnElimina = new JButton("Eliminar");
			btnElimina.setHorizontalAlignment(SwingConstants.LEFT);
			btnElimina.setForeground(Color.WHITE);
			
			btnElimina.setContentAreaFilled(false);
			btnElimina.setOpaque(false);
			btnElimina.setBackground(new Color (0, 0, 0, 50));
			
			
			btnElimina.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/eliminar.png")));
			btnElimina.setBounds(0, 286, 185, 51);
			bienvenida.add(btnElimina);
			btnElimina.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CardLayout c = (CardLayout)(contentPane.getLayout());
					c.show(contentPane, "t4");
					//tInfoEliminar.setText(arbol.acumulaDatos());
					
				}
			});
			
			btnElimina.setFont(new Font("SimSun", Font.BOLD, 15));
	
			JButton btnMostrar = new JButton("Mostrar");
			btnMostrar.setHorizontalAlignment(SwingConstants.LEFT);
			btnMostrar.setForeground(Color.WHITE);
			btnMostrar.setContentAreaFilled(false);
			btnMostrar.setOpaque(false);
			btnMostrar.setBackground(new Color (0, 0, 0, 50));
			btnMostrar.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/mostrar.png")));
			btnMostrar.setBounds(0, 100, 185, 51);
			bienvenida.add(btnMostrar);
			btnMostrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CardLayout c = (CardLayout)(contentPane.getLayout());
					c.show(contentPane, "t2");
					
					datos.setText("");
					
					
				}
			});
			
			btnMostrar.setFont(new Font("SimSun", Font.BOLD, 15));
			//btnMostrar.setIcon(new ImageIcon(Menu.class.getResource("/vista/iconsImages/monitor_16.png")));
			
			JButton btnInsertar = new JButton("Inserta");
			btnInsertar.setHorizontalAlignment(SwingConstants.LEFT);
			btnInsertar.setForeground(Color.WHITE);
			btnInsertar.setContentAreaFilled(false);
			btnInsertar.setOpaque(false);
			btnInsertar.setBackground(new Color (0, 0, 0, 50));
			btnInsertar.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/add.png")));
			btnInsertar.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					
				}
			});
			btnInsertar.setSize(new Dimension(5, 6));
			
			btnInsertar.setSelected(true);
			btnInsertar.setPreferredSize(new Dimension(68, 23));
			btnInsertar.setCursor(Cursor.getPredefinedCursor(Cursor.NW_RESIZE_CURSOR));
			btnInsertar.setBounds(0, 38, 185, 51);
			bienvenida.add(btnInsertar);
			
			//PARA QUE SE CREE UN NUEVO REPORTE EN ORDEN?
			btnInsertar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CardLayout c = (CardLayout)(contentPane.getLayout());
					c.show(contentPane, "t1");
					
				}
			});
			btnInsertar.setFont(new Font("SimSun", Font.BOLD, 15));
			//btnElimina.setIcon(new ImageIcon(Menu.class.getResource("/vista/iconsImages/delete_16.png")));
			
			JButton btnActualiza = new JButton("Actualizar");
			btnActualiza.setHorizontalAlignment(SwingConstants.LEFT);
			btnActualiza.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/actualizar.png")));
			
			btnActualiza.setContentAreaFilled(false);
			btnActualiza.setOpaque(false);
			btnActualiza.setBackground(new Color (0, 0, 0, 50));
			
			btnActualiza.setForeground(Color.WHITE);
			btnActualiza.setBounds(0, 224, 185, 51);
			bienvenida.add(btnActualiza);
			btnActualiza.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CardLayout c = (CardLayout)(contentPane.getLayout());
					c.show(contentPane, "t5");
					indiceModificar=1;
					
					//tArchivadas.setText(arbol.acumulaDatos());
					
					
				}
			});
			
			btnActualiza.setFont(new Font("SimSun", Font.BOLD, 15));
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/340461.jpg")));
			lblNewLabel_1.setBounds(0, 0, 741, 450);
			bienvenida.add(lblNewLabel_1);
			
			
			btnActualiza.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CardLayout c = (CardLayout)(contentPane.getLayout());
					c.show(contentPane, "t5");
					//tInfoEliminar.setText(arbol.acumulaDatos());
					
				}
			});
			
			menuMuestra = new JPanel();
			menuMuestra.setBackground(SystemColor.activeCaption);
			contentPane.add(menuMuestra, "t2");
			menuMuestra.setLayout(null);
			
			JLabel label = new JLabel("New label");
			label.setBounds(301, 29, 35, -4);
			menuMuestra.add(label);
			
			JLabel lDatos = new JLabel("Datos");
			lDatos.setFont(new Font("Milkshake", Font.ITALIC, 18));
			lDatos.setBounds(311, 6, 129, 35);
			menuMuestra.add(lDatos);
			
			datos.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 13));
			
			JScrollPane scroll;
			//datos.setBounds(182, 67, 276, 204);
			datos.setEditable(false);
			//datos.setText(lista.mostrar());
			datos.setForeground(new Color(0, 0, 0));
			datos.setBackground(new Color(211, 211, 211));
			scroll= new JScrollPane(datos);
			scroll.setBounds(93, 67, 498, 262);
			menuMuestra.add(scroll);
			
			//JButton btnHomeShorCut = new JButton("");
			btnHomeShorCut.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					menuMuestra.setVisible(false);
					bienvenida.setVisible(true);
				
					
					
				}
			});
			btnHomeShorCut.setContentAreaFilled(false);
			btnHomeShorCut.setBorder(null);
			btnHomeShorCut.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/home.png")));
			btnHomeShorCut.setBounds(302, 399, 101, 40);
			menuMuestra.add(btnHomeShorCut);
			
			
			
			menuInserta = new JPanel();
			menuInserta.setBackground(new Color(102, 102, 153));
			
			
			contentPane.add(menuInserta, "t1");
			menuInserta.setLayout(null);
			
			
			
			
			JLabel lblCedula = new JLabel("Cedula:");
			lblCedula.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 15));
			lblCedula.setBounds(10, 38, 61, 16);
			menuInserta.add(lblCedula);
			
			JLabel lblResidencia = new JLabel("Residencia:");
			lblResidencia.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 15));
			lblResidencia.setBounds(10, 102, 122, 29);
			menuInserta.add(lblResidencia);
			
			JTextArea tNombre = new JTextArea();
			tNombre.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 13));
			
			tNombre.addKeyListener(new KeyAdapter() { //PARA UTILIZAR TAP AL MOMENTO DE NAVEGAR POR LOS TEXT'SAREAS
				@Override
				public void keyPressed(KeyEvent e) {
					 if (e.getKeyCode() == KeyEvent.VK_TAB) {
		                    if (e.getModifiersEx() > 0) {
		                        tNombre.transferFocusBackward();
		                    } else {
		                    	//tNombre.setFocusable(tNombre.getDragEnabled());
		                    	tNombre.transferFocus();
		                    	
		                    }
		                    e.consume();
		                }
		            }
		        });
		
			tNombre.setLineWrap(true);
			tNombre.setBounds(93, 6, 114, 21);
			menuInserta.add(tNombre);
			
			JTextArea tCed = new JTextArea();
			tCed.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 13));
			tCed.addKeyListener(new KeyAdapter() { //PARA UTILIZAR TAP AL MOMENTO DE NAVEGAR POR LOS TEXT'SAREAS
				@Override
				public void keyPressed(KeyEvent e) {
					 if (e.getKeyCode() == KeyEvent.VK_TAB) {
		                    if (e.getModifiersEx() > 0) {
		                        tCed.transferFocusBackward();
		                    } else {
		                    	tCed.transferFocus();
		                    }
		                    e.consume();
		                }
		            }
		        });
			
			tCed.setLineWrap(true);
			tCed.setBounds(93, 38, 114, 23);
			menuInserta.add(tCed);
			
			JTextArea tNis = new JTextArea();
			tNis.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 13));
			
			tNis.addKeyListener(new KeyAdapter() { //PARA UTILIZAR TAP AL MOMENTO DE NAVEGAR POR LOS TEXT'SAREAS
				@Override
				public void keyPressed(KeyEvent e) {
					 if (e.getKeyCode() == KeyEvent.VK_TAB) {
		                    if (e.getModifiersEx() > 0) {
		                        tNis.transferFocusBackward();
		                    } else {
		                    	tNis.transferFocus();
		                    }
		                    e.consume();
		                }
		            }
		        });
			
			tNis.setLineWrap(true);
			tNis.setBounds(93, 72, 114, 23);
			menuInserta.add(tNis);
			
			JLabel lblNis = new JLabel("NIS:");
			lblNis.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 15));
			lblNis.setBounds(10, 70, 82, 16);
			menuInserta.add(lblNis);
			
			JButton listo = new JButton("Listo!");
			//listo.setIcon(new ImageIcon(Menu.class.getResource("/vista/iconsImages/tick_16.png")));
			listo.setSelectedIcon(new ImageIcon("\\\\Mac\\Home\\Downloads\\Basic_set\\Basic_set_Png\\Basic_set_Png\\tick_16.png"));
			listo.setToolTipText("Ingresa los datos correspondiente");
			listo.setFont(new Font("Dialog", Font.BOLD, 13));
			listo.setBounds(168, 340, 122, 29);
			
			listo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(tNombre.getText().isEmpty()) {
					//	lista.mensajeTemporizado("Agregue su nombre", 1000);
						
					
					}else if(tNis.getText().isEmpty()) {
					//lista.mensajeTemporizado("Ingrese su numero NIS!", 1000);
						
					}
						 
					else {
							
					//	p = new Acueducto();
						
							//indiceModificar=+1;
						
							if(boxTipoAveria.getSelectedItem().toString().equalsIgnoreCase("residencial")) {
							//	p.setCliente(tNombre.getText(),tCed.getText(),tNis.getText(),tResi.getText(), boxTipoAveria.getSelectedItem().toString());
								
								
							}else {
								/*p.setLugar(boxLugar.getSelectedItem().toString());
								//p.setDireccionExacta( "\n" 
										
								//+	"***" + tDireccionExacta.getText() + "***" );
								//p.setDetalleA(boxAveriaEspecifica.getSelectedItem().toString());
								//p.setCliente(tNombre.getText(),tCed.getText(),tNis.getText(),tResi.getText(), boxTipoAveria.getSelectedItem().toString());
								*/
							}
						
							
						//	p.setIndice(indiceModificar);
							
							
						//	arbol.insertar(p);
							
						//	arbol.mensajeTemporizado("Datos agregados!", 1200);
							
							
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
								tNombre.setText("");
								tCed.setText("");
								tNis.setText("");
								tResi.setText("");
								tDireccionExacta.setText("");
								boxTipoAveria.setSelectedIndex(0);
								boxLugar.setSelectedIndex(0);
								boxAveriaEspecifica.setSelectedIndex(0);
								pPrueba.setVisible(false);
								
								
						}
					}	   	 
						
			});
			
			
			menuInserta.add(listo);
			
			JButton btnBorraD = new JButton("Borrar Datos");
			btnBorraD.setIcon(null);
			btnBorraD.setFont(new Font("Dialog", Font.BOLD, 13));
			btnBorraD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					tNombre.setText("");
					tCed.setText("");
					tNis.setText("");
					tResi.setText("");
				
					tDireccionExacta.setText("");
					boxTipoAveria.setSelectedIndex(0);
					
					
				}
			});
			btnBorraD.setBounds(336, 340, 192, 29);
			
			menuInserta.add(btnBorraD);
			
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 15));
			lblNombre.setBounds(10, 6, 61, 16);
			menuInserta.add(lblNombre);
			
			
			pPrueba.setBorder(new LineBorder(Color.DARK_GRAY, 4, true));
			pPrueba.setBackground(new Color(128, 128, 128));
															//pPrueba.setBackground(new Color(0,0,0,x));//BAJAR LA OPACIDAD DEL PANEL CON LA CORDENADA "X"-> última coordenada
			pPrueba.setBounds(302, 55, 342, 258);
			menuInserta.add(pPrueba);
			pPrueba.setLayout(null);
			
			JLabel lDireccion = new JLabel("Direccion exacta:");
			lDireccion.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
			lDireccion.setBounds(115, 135, 106, 16);
			pPrueba.add(lDireccion);
			
			
			boxAveriaEspecifica.setModel(new DefaultComboBoxModel(new String[] {"Fuga en acera", "Fuga en calle", "Fuga de hidrante"}));
			boxAveriaEspecifica.setBounds(47, 38, 256, 26);
			pPrueba.add(boxAveriaEspecifica);
			
			boxLugar.setModel(new DefaultComboBoxModel(new String[] {"Liberia", "Palmira", "Sardinal"}));
			boxLugar.setBounds(47, 97, 256, 26);
			pPrueba.add(boxLugar);
			
			JScrollPane scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(47, 152, 247, 83);
			pPrueba.add(scrollPane_2);
			
			
			tDireccionExacta.setWrapStyleWord(true);
			tDireccionExacta.setLineWrap(true);
			scrollPane_2.setViewportView(tDireccionExacta);
			
			JLabel lTipoAv = new JLabel("Tipo de averia");
			lTipoAv.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
			lTipoAv.setBounds(115, 10, 89, 16);
			pPrueba.add(lTipoAv);
			
			JLabel lLugar = new JLabel("Lugar");
			lLugar.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
			lLugar.setBounds(135, 76, 89, 16);
			pPrueba.add(lLugar);
			pPrueba.setVisible(false);
			
		
			boxTipoAveria.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(boxTipoAveria.getSelectedItem().toString().equals("Publica")) {
						
						pPrueba.setVisible(true);
						
					}else {
						pPrueba.setVisible(false);
					}
					
				}
			});
			boxTipoAveria.setModel(new DefaultComboBoxModel(new String[] {"Residencial", "Publica"}));
			boxTipoAveria.setBounds(336, 17, 275, 26);
			menuInserta.add(boxTipoAveria);
			
			JScrollPane scrollPane_3 = new JScrollPane();
			scrollPane_3.setBounds(93, 105, 114, 26);
			menuInserta.add(scrollPane_3);
			
			
			//JTextArea tResi = new JTextArea();
			tResi.setWrapStyleWord(true);
			tResi.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 13));
			scrollPane_3.setViewportView(tResi);
			
			tResi.addKeyListener(new KeyAdapter() {  //PARA UTILIZAR TAP AL MOMENTO DE NAVEGAR POR LOS TEXT'SAREAS
				@Override
				public void keyPressed(KeyEvent e) {
					 if (e.getKeyCode() == KeyEvent.VK_TAB) {
		                    if (e.getModifiersEx() > 0) {
		                        tResi.transferFocusBackward();
		                    } else {
		                    	tResi.transferFocus();
		                    }
		                    e.consume();
		                }
		            }
		        });
			
			tResi.setLineWrap(true);
			
			
			 btnHomeShorCut = new JButton("");
			btnHomeShorCut.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					menuInserta.setVisible(false);
					bienvenida.setVisible(true);
				
					
					
				}
			});
			btnHomeShorCut.setContentAreaFilled(false);
			btnHomeShorCut.setBorder(null);
			btnHomeShorCut.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/home.png")));
			btnHomeShorCut.setBounds(302, 399, 101, 40);
			menuInserta.add(btnHomeShorCut);
			
			
			
			menuBusca = new JPanel();
			menuBusca.setBackground(new Color(188, 143, 143));
			menuBusca.setToolTipText("");
			contentPane.add(menuBusca, "t3");
			menuBusca.setLayout(null);
			
			JLabel lBuscando = new JLabel("Buscando.");
			lBuscando.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
			lBuscando.setBounds(287, 6, 140, 30);
			menuBusca.add(lBuscando);
			
			JTextArea tDigito = new JTextArea(); //TOMA EL DIGITO PARA BUSCAR EL PACIENTE
			tDigito.setToolTipText("Ingresa el digito entre corchetes \"[ ]\"");
			tDigito.setBounds(287, 48, 71, 28);
			menuBusca.add(tDigito);
			
			JLabel lblDigitaPacienteA = new JLabel("Digita paciente a buscar:");
			lblDigitaPacienteA.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
			lblDigitaPacienteA.setBounds(103, 46, 182, 30);
			menuBusca.add(lblDigitaPacienteA);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(171, 110, 312, 170);
			menuBusca.add(scrollPane);
			
			scrollPane.setViewportView(tDatosBuscar);
			
			JButton btnBuscar = new JButton("Buscar");
			btnBuscar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(Integer.parseInt(tDigito.getText())<0) {
					//	lista.mensajeTemporizado("Ingresa numero de paciente", 1000);
					}else {
						
						
					//	arbol.buscar(Integer.parseInt(tDigito.getText()));
						tDigito.setText("");
					}
				
					
				}
			});
			
			btnBuscar.setToolTipText("Presiona para mostrar informacion.");
			btnBuscar.setBounds(370, 48, 90, 28);
			menuBusca.add(btnBuscar);
			
			btnHomeShorCut = new JButton("");
			btnHomeShorCut.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					menuBusca.setVisible(false);
					bienvenida.setVisible(true);
				
					
					
				}
			});
			btnHomeShorCut.setContentAreaFilled(false);
			btnHomeShorCut.setBorder(null);
			btnHomeShorCut.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/home.png")));
			btnHomeShorCut.setBounds(302, 399, 101, 40);
			menuBusca.add(btnHomeShorCut);
			
			menuElimina = new JPanel();
			menuElimina.setBackground(new Color(119, 136, 153));
			contentPane.add(menuElimina, "t4");
			menuElimina.setLayout(null);
			
			JLabel lEliminando = new JLabel("Eliminando.");
			lEliminando.setForeground(new Color(0, 0, 0));
			lEliminando.setBackground(new Color(245, 255, 250));
			lEliminando.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lEliminando.setBounds(312, 6, 140, 30);
			menuElimina.add(lEliminando);
			
			JTextArea tDigitoEliminar = new JTextArea();
			tDigitoEliminar.setBackground(new Color(245, 245, 220));
			tDigitoEliminar.setToolTipText("Ingresa el digito entre corchetes \"[ ]\" del n\u00FAmero de paciente a eliminar...");
			tDigitoEliminar.setBounds(284, 84, 48, 28);
			menuElimina.add(tDigitoEliminar);
			
			JLabel lPacienteEliminar = new JLabel("Digita paciente a eliminar:");
			lPacienteEliminar.setToolTipText("");
			lPacienteEliminar.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
			lPacienteEliminar.setBounds(81, 82, 199, 30);
			menuElimina.add(lPacienteEliminar);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(81, 146, 483, 224);
			menuElimina.add(scrollPane_1);
			tInfoEliminar.setBackground(new Color(245, 245, 220));
			
			
			scrollPane_1.setViewportView(tInfoEliminar);
			
			JButton btnEliminar = new JButton("Eliminar");
			//btnEliminar.setIcon(new ImageIcon(Menu.class.getResource("/vista/iconsImages/trash_32.png")));
			btnEliminar.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 14));
			btnEliminar.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent arg0) {
					
					//	arbol.eliminar(Integer.parseInt(tDigitoEliminar.getText()));
						tInfoEliminar.setText("");
					//	tInfoEliminar.setText(arbol.acumulaDatos());
						
						
				}
				
			});
			
			btnEliminar.setToolTipText("Presiona para mostrar informacion.");
			btnEliminar.setBounds(389, 65, 122, 64);
			menuElimina.add(btnEliminar);
			
			
			 btnHomeShorCut = new JButton("");
			btnHomeShorCut.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					menuElimina.setVisible(false);
					bienvenida.setVisible(true);
				
					
					
				}
			});
			btnHomeShorCut.setContentAreaFilled(false);
			btnHomeShorCut.setBorder(null);
			btnHomeShorCut.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/home.png")));
			btnHomeShorCut.setBounds(302, 399, 101, 40);
			menuElimina.add(btnHomeShorCut);
			
			
			JPanel menuActualiza = new JPanel();
			menuActualiza.setBackground(new Color(95, 158, 160));
			contentPane.add(menuActualiza, "t5");
			menuActualiza.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("AVERIAS ARCHIVADAS");
			lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
			lblNewLabel.setBounds(10, 14, 165, 18);
			menuActualiza.add(lblNewLabel);
			
			
			
			panelActulizaDatosGenerales = new JPanel();
			panelActulizaDatosGenerales.setBackground(new Color(233, 150, 122));
			panelActulizaDatosGenerales.setBounds(0, 54, 724, 367);
			menuActualiza.add(panelActulizaDatosGenerales);
			panelActulizaDatosGenerales.setLayout(null);
			
			JLabel lblNombreAc = new JLabel("NOMBRE:");
			lblNombreAc.setBounds(10, 11, 70, 14);
			panelActulizaDatosGenerales.add(lblNombreAc);
			
			JLabel lblCedulaAc = new JLabel("CEDULA:");
			lblCedulaAc.setBounds(10, 42, 70, 14);
			panelActulizaDatosGenerales.add(lblCedulaAc);
			
			JLabel lblNisAc = new JLabel("NIS:");
			lblNisAc.setBounds(10, 67, 66, 14);
			panelActulizaDatosGenerales.add(lblNisAc);
			
			JLabel lblNewLabel_1_3 = new JLabel("RESIDENCIA:");
			lblNewLabel_1_3.setBounds(10, 98, 81, 14);
			panelActulizaDatosGenerales.add(lblNewLabel_1_3);
			
			tCedulaAc.setBounds(86, 37, 132, 19);
			panelActulizaDatosGenerales.add(tCedulaAc);
			
			
			tNisAc.setBounds(86, 62, 132, 19);
			panelActulizaDatosGenerales.add(tNisAc);
			
			JScrollPane scrollPane_4 = new JScrollPane();
			scrollPane_4.setBounds(86, 92, 132, 24);
			panelActulizaDatosGenerales.add(scrollPane_4);
			
			tResidenciaAC.setWrapStyleWord(true);
			tResidenciaAC.setLineWrap(true);
			scrollPane_4.setViewportView(tResidenciaAC);
			
			JScrollPane scrollPane_5 = new JScrollPane();
			scrollPane_5.setBounds(86, 5, 132, 24);
			panelActulizaDatosGenerales.add(scrollPane_5);
			
			tNombreAc.setLineWrap(true);
			tNombreAc.setWrapStyleWord(true);
			scrollPane_5.setViewportView(tNombreAc);
			
			JLabel lblAveriaAc = new JLabel("AVERIA REPORTADA:");
			lblAveriaAc.setBounds(10, 153, 111, 14);
			panelActulizaDatosGenerales.add(lblAveriaAc);
			
			JScrollPane scrollPaneAveriaAc = new JScrollPane();
			scrollPaneAveriaAc.setBounds(10, 171, 337, 110);
			panelActulizaDatosGenerales.add(scrollPaneAveriaAc);
			
			
			scrollPaneAveriaAc.setViewportView(tAveriaReportadaAc);
			
			
			boxAveriaAc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(boxAveriaAc.getSelectedItem().toString().equals("Publica")) {
						
						panelDetalleAveria.setVisible(true);
						
					}else {
						panelDetalleAveria.setVisible(false);
					}
					
				}
			});
			
			boxAveriaAc.setModel(new DefaultComboBoxModel(new String[] {"Selecciona averia", "Residencial", "Publica"}));
			boxAveriaAc.setBounds(10, 292, 132, 24);
			panelActulizaDatosGenerales.add(boxAveriaAc);
			
			
			panelDetalleAveria.setBackground(new Color(147, 112, 219));
			panelDetalleAveria.setBounds(357, 0, 367, 367);
			panelActulizaDatosGenerales.add(panelDetalleAveria);
			panelDetalleAveria.setLayout(null);
			
			JLabel lblDetalleAc = new JLabel("DETALLA AVERIA PUBLICA");
			lblDetalleAc.setBounds(109, 11, 178, 26);
			panelDetalleAveria.add(lblDetalleAc);
			
			boxTipoAveriaAc.setModel(new DefaultComboBoxModel(new String[] {"Escoge tipo de averia", "Fuga en acera", "Fuga en calle", "Fuga de hidrante"}));
			boxTipoAveriaAc.setBounds(109, 77, 166, 26);
			panelDetalleAveria.add(boxTipoAveriaAc);
			
			boxLugarAc.setModel(new DefaultComboBoxModel(new String[] {"Escoge lugar de averia", "Liberia", "Palmira", "Sardinal"}));
			boxLugarAc.setBounds(109, 161, 166, 26);
			panelDetalleAveria.add(boxLugarAc);
			
			JScrollPane scrollDireccionExactaAc = new JScrollPane();
			scrollDireccionExactaAc.setBounds(63, 269, 245, 71);
			panelDetalleAveria.add(scrollDireccionExactaAc);
			
			tDireccionExactaAc.setLineWrap(true);
			tDireccionExactaAc.setWrapStyleWord(true);
			scrollDireccionExactaAc.setViewportView(tDireccionExactaAc);
			
			JLabel lblDireccionExactaAc = new JLabel("NUEVA DIRECCION EXACTA");
			lblDireccionExactaAc.setBounds(121, 232, 166, 26);
			panelDetalleAveria.add(lblDireccionExactaAc);
			
			JButton btnlistoAc = new JButton("LISTO");
			btnlistoAc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				//	arbol.eliminar(Integer.parseInt(tBuscaReporte.getText()));
					
			//		p = new Acueducto();
					
					
					if(boxTipoAveriaAc.getSelectedItem().toString().equalsIgnoreCase("residencial")) {
						
				//		p.setCliente(tNombreAc.getText(),tCedulaAc.getText(),tNisAc.getText(),tResidenciaAC.getText(), boxTipoAveriaAc.getSelectedItem().toString());
						
					}else {
					/*	p.setLugar(boxLugarAc.getSelectedItem().toString());
						p.setDireccionExacta( "\n" 
								
						+	"***" + tDireccionExactaAc.getText() + "***" );
					p.setDetalleA(boxTipoAveriaAc.getSelectedItem().toString());
						//p.setCliente(tNombreAc.getText(),tCedulaAc.getText(),tNisAc.getText(),tResidenciaAC.getText(), boxTipoAveriaAc.getSelectedItem().toString());
						*/
					}
					
				//	arbol.insertar(p);
					
					tNombreAc.setText("");
					tCedulaAc.setText("");
					tNisAc.setText("");
					tResidenciaAC.setText("");
					boxTipoAveriaAc.setSelectedIndex(0);
					boxAveriaAc.setSelectedIndex(0);
					boxLugarAc.setSelectedIndex(0);
					//tArchivadas.setText(arbol.acumulaDatos());
					panelDetalleAveria.setVisible(false);
					
					
					
					
					
				}
			});
			btnlistoAc.setBounds(238, 333, 89, 23);
			panelActulizaDatosGenerales.add(btnlistoAc);
			
			tBuscaReporte = new JTextField();
			tBuscaReporte.setBounds(462, 11, 40, 32);
			menuActualiza.add(tBuscaReporte);
			tBuscaReporte.setColumns(10);
			
			JLabel lblReporte = new JLabel("REPORTE:");
			lblReporte.setBounds(382, 17, 70, 14);
			menuActualiza.add(lblReporte);
			
			JButton btnNewButton = new JButton("MOSTRAR");
			btnNewButton.addActionListener(new ActionListener() {
				
				
				public void actionPerformed(ActionEvent e) {
					
				//	p = arbol.buscarActualizar(Integer.parseInt(tBuscaReporte.getText()));
					
				/*	
					tNombreAc.setText(p.c.getNombre());
					tCedulaAc.setText(p.c.getCedula());
					tNisAc.setText(p.c.getNis());
					tResidenciaAC.setText(p.c.getlResidencia());
					tAveriaReportadaAc.setText(p.muestraCliente());
					if(p.getTipoAveria().equalsIgnoreCase("residencial")) {
						boxAveriaAc.setSelectedIndex(1);
					}else if(p.getTipoAveria().equalsIgnoreCase("publica")) {
						boxAveriaAc.setSelectedIndex(2);
						
						
						if(p.getDetalleA().equalsIgnoreCase("fuga en acera")) {
							boxTipoAveriaAc.setSelectedIndex(1);
							
						}else if (p.getDetalleA().equalsIgnoreCase("fuga en calle")){
							boxTipoAveriaAc.setSelectedIndex(2);
						}else if (p.getDetalleA().equalsIgnoreCase("fuga de hidrante")){
							boxTipoAveriaAc.setSelectedIndex(3);
							
						}
						
						if(p.getLugar().equalsIgnoreCase("liberia")) {
							boxLugarAc.setSelectedIndex(1);
							
						}else if (p.getLugar().equalsIgnoreCase("palmira")){
							boxLugarAc.setSelectedIndex(2);
						}else if (p.getLugar().equalsIgnoreCase("sardinal")){
							
							boxLugarAc.setSelectedIndex(3);
						}
						
						tDireccionExactaAc.setText(p.getDireccionExacta());
					}
					
					*/
					
				}
			});
			btnNewButton.setBounds(535, 13, 89, 23);
			menuActualiza.add(btnNewButton);
			
			JScrollPane scrollPane_6 = new JScrollPane();
			scrollPane_6.setBounds(165, 11, 210, 42);
			menuActualiza.add(scrollPane_6);
			
			
			tArchivadas.setEditable(false);
			scrollPane_6.setViewportView(tArchivadas);
			
			
			
			
			
			
			/*
			JTextArea tPas = new JTextArea();
			tPas.setBounds(144, 152, 114, 16);
			menuInserta.add(tPas);
			
			JLabel lblPeso_1 = new JLabel("Peso:");
			lblPeso_1.setBounds(10, 114, 82, 16);
			menuInserta.add(lblPeso_1);
			
			JTextArea tPad = new JTextArea();
			tPad.setBounds(144, 182, 114, 16);
			menuInserta.add(tPad);
			
			JLabel lblPresionDiastolica = new JLabel("Presion Diastolica:");
			lblPresionDiastolica.setBounds(10, 182, 122, 16);
			menuInserta.add(lblPresionDiastolica);
			*/
		}
	}
