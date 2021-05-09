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
import java.awt.event.KeyListener;
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
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.MouseAdapter;
	
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
		private JButton btnHomeShorCut_2;
		private JButton btnHomeShorCut_1;
		
		
		private JPanel menuElimina;
		private JPanel menuBusca;
		private JPanel panelActulizaDatosGenerales;
		private JTextField tBuscaReporte;
		private JTextField txtIngreseContrasena;
		private JTextField txtAdmin;
		
		
		//////PANEL COMIDA/////
		JTextArea txtrIngreseGastoCarniceria = new JTextArea();
		JTextArea txtrSupermercado = new JTextArea();
		JTextArea tGastoVerduleria = new JTextArea();
		
		
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
			
			
			
			
			//CREACION DEL PRIMER PANEL, INGRESO//LOGIN.
			//CONSISTE BASICAMENTE EN EL BOTON INGRESA PARA INICIAR EL APP
			
			
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
			
			
			txtIngreseContrasena.setText("********");//SIMULANDO UNA CLAVE YA CREADA 
			
			txtIngreseContrasena.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(95, 158, 160)));
			txtIngreseContrasena.setBounds(10, 231, 216, 26);
			panelLoginMade.add(txtIngreseContrasena);
			txtIngreseContrasena.setColumns(10);
			
			txtAdmin = new JTextField();
			txtAdmin.setForeground(new Color(47, 79, 79));
			txtAdmin.setFont(new Font("Palatino Linotype", Font.PLAIN, 13));
			txtAdmin.setBackground(Color.WHITE);
			txtAdmin.setEditable(false);
			txtAdmin.setText("admin@UCR.com");//SIMULANDO UN USUARIO YA CREADO O ANTERIOMENTE LOGUEADO.
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
			btnNewButton_1.setToolTipText("Ingresa a la aplicacion");
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
			
			contentPane.add(bienvenida, "MenuPrincipal");//NOMBRE DEL PANEL PARA SER LLAMADO 
			
			
			
			
			bienvenida.setLayout(null);
			
			
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
			
			
			btnHomeShorCut = new JButton("");
			btnHomeShorCut.setToolTipText("Regresar a menu prinicipal");
			btnHomeShorCut.setOpaque(false);
			btnHomeShorCut.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					menuMuestra.setVisible(false);
					bienvenida.setVisible(true);
				
					
					
				}
			});
			
			btnHomeShorCut.setContentAreaFilled(false);
			btnHomeShorCut.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/home.png")));
			btnHomeShorCut.setBounds(311, 378, 65, 41);
			menuMuestra.add(btnHomeShorCut);
			
			JLabel lDatos = new JLabel("Datos");
			lDatos.setForeground(new Color(47, 79, 79));
			lDatos.setHorizontalAlignment(SwingConstants.CENTER);
			lDatos.setFont(new Font("SimSun", Font.BOLD, 20));
			lDatos.setBounds(274, 21, 129, 35);
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
			
			JLabel lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/gradientMostrar.jpeg")));
			lblNewLabel_5.setBounds(0, 0, 721, 450);
			menuMuestra.add(lblNewLabel_5);
			
			
			
			menuInserta = new JPanel();
			menuInserta.setBackground(new Color(102, 102, 153));
			
			
			contentPane.add(menuInserta, "t1");
			menuInserta.setLayout(null);
			
			JPanel pComida = new JPanel();
			pComida.setBackground(SystemColor.info);
			pComida.setBounds(302, 55, 340, 154);
			menuInserta.add(pComida);
			pComida.setLayout(null);
			
			
			
			txtrSupermercado.setOpaque(false);
			txtrSupermercado.setText("Ingrese gasto Supermercado");
			txtrSupermercado.setForeground(Color.LIGHT_GRAY);
			txtrSupermercado.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			txtrSupermercado.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			txtrSupermercado.setBounds(75, 11, 221, 21);
			
			txtrSupermercado.addKeyListener(new KeyAdapter() { //PARA UTILIZAR TAP AL MOMENTO DE NAVEGAR POR LOS TEXT'SAREAS
				@Override
				public void keyPressed(KeyEvent e) {
					 if (e.getKeyCode() == KeyEvent.VK_TAB) {
		                    if (e.getModifiersEx() > 0) {
		                    	txtrSupermercado.transferFocusBackward();
		                    } else {
		                    	//tNombre.setFocusable(tNombre.getDragEnabled());
		                    	txtrIngreseGastoCarniceria.setText("");
		                    	txtrSupermercado.transferFocus();
		                    	
		                    	
		                    }
		                    e.consume();
		                }
		            }
		        });
			
			
			txtrSupermercado.addMouseListener(new MouseAdapter() {// SE BORRA EL MENSAJE GUIA DEL TXT AREA PARA INGRESAR EL VALOR PERTINENTE POR HACER CLICK
				@Override
				public void mouseClicked(MouseEvent e) {
					
					
					if(txtrSupermercado.getText().equalsIgnoreCase("ingrese gasto supermercado")) {
			    		txtrSupermercado.setText("");
			    	}
					
				}
			});
			
			txtrSupermercado.addKeyListener(new KeyAdapter() // SE BORRA EL MENSAJE GUIA DEL TXT AREA PARA INGRESAR EL VALOR PERTINENTE POR CUALQUIER ENTRADA DEL TECLADO
			{
				public void keyTyped(KeyEvent e)
				{
					
					if(txtrSupermercado.getText().equalsIgnoreCase("ingrese gasto supermercado")) {
						txtrSupermercado.setText("");
					}else if(e.getKeyCode()== KeyEvent.VK_TAB) {
							txtrSupermercado.setText("");
					}
				}
			});
			
			
			
			txtrSupermercado.addKeyListener(new KeyAdapter()// Verificar si la tecla pulsada no es un digito/NUMERO
			    {
			    	public void keyTyped(KeyEvent e)
			    	{
			    		char caracter = e.getKeyChar();
			    		
			    		
			    		if(((caracter < '0') ||
			    				(caracter > '9')) &&
			    				(caracter != '\b' /*corresponde a BACK_SPACE*/))
			    		{
			    			e.consume();  // ignorar el evento de teclado
			    			//lista.mensajeTemporizado("Ingrese solo numeros", 1000); 	//HALAR ESTE MENSAJE DESDE LISTA PARA PODER USARLO
			    		}
			    	}
			    });
			
			
			
			
			txtrSupermercado.addKeyListener(new KeyListener(){ //PARA LIMITAR QUE USUARIO NO INGRESE UN GASTO MAYOR A 6 CIFRAS O DIGITOS
		    	 
		    	public void keyTyped(KeyEvent e)
		    	 
		    	{if (txtrSupermercado.getText().length()== 6)
		    	 
		    	     e.consume();
		    	}
		    	 
		    	public void keyPressed(KeyEvent arg0) {
		    	}
		    	 
		    	public void keyReleased(KeyEvent arg0) {
		    	}
		    	});
			
			
			pComida.add(txtrSupermercado);
			
			
			txtrIngreseGastoCarniceria.setText("Ingrese gasto Carniceria");
			txtrIngreseGastoCarniceria.setOpaque(false);
			txtrIngreseGastoCarniceria.setForeground(Color.LIGHT_GRAY);
			txtrIngreseGastoCarniceria.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			txtrIngreseGastoCarniceria.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			txtrIngreseGastoCarniceria.setBounds(75, 50, 221, 21);
			
			
			txtrIngreseGastoCarniceria.addKeyListener(new KeyAdapter() { //PARA UTILIZAR TAP AL MOMENTO DE NAVEGAR POR LOS TEXT'SAREAS
				@Override
				public void keyPressed(KeyEvent e) {
					 if (e.getKeyCode() == KeyEvent.VK_TAB) {
		                    if (e.getModifiersEx() > 0) {
		                    	txtrIngreseGastoCarniceria.transferFocusBackward();
		                    } else {
		                    	//tNombre.setFocusable(tNombre.getDragEnabled());
		                    	tGastoVerduleria.setText("");
		                    	txtrIngreseGastoCarniceria.transferFocus();
		                    	
		                    	
		                    }
		                    e.consume();
		                }
		            }
		        });
			
			
			
			txtrIngreseGastoCarniceria.addMouseListener(new MouseAdapter() {// SE BORRA EL MENSAJE GUIA DEL TXT AREA PARA INGRESAR EL VALOR PERTINENTE POR HACER CLICK
				@Override
				public void mouseClicked(MouseEvent e) {
					
					
					if(txtrIngreseGastoCarniceria.getText().equalsIgnoreCase("ingrese gasto carniceria")) {
						txtrIngreseGastoCarniceria.setText("");
			    	}
					
				}
			});
			
			txtrIngreseGastoCarniceria.addKeyListener(new KeyAdapter() // SE BORRA EL MENSAJE GUIA DEL TXT AREA PARA INGRESAR EL VALOR PERTINENTE POR CUALQUIER ENTRADA DEL TECLADO
			{
				public void keyTyped(KeyEvent e)
				{
					
					if(txtrIngreseGastoCarniceria.getText().equalsIgnoreCase("ingrese gasto carniceria")) {
						txtrIngreseGastoCarniceria.setText("");
					}
				}
			});

			
			txtrIngreseGastoCarniceria.addKeyListener(new KeyAdapter()
		    {
		    	public void keyTyped(KeyEvent e)
		    	{
		    		char caracter = e.getKeyChar();
		    		
		    		// Verificar si la tecla pulsada no es un digito
		    		if(((caracter < '0') ||
		    				(caracter > '9')) &&
		    				(caracter != '\b' /*corresponde a BACK_SPACE*/))
		    		{
		    			e.consume();  // ignorar el evento de teclado
		    			//lista.mensajeTemporizado("Ingrese solo numeros", 1000); 	//HALAR ESTE MENSAJE DESDE LISTA PARA PODER USARLO
		    		}
		    	}
		    });
		
			txtrIngreseGastoCarniceria.addKeyListener(new KeyListener(){ //PARA LIMITAR QUE USUARIO NO INGRESE UN GASTO MAYOR A 6 CIFRAS O DIGITOS
	    	 
	    	public void keyTyped(KeyEvent e)
	    	 
	    	{if (txtrIngreseGastoCarniceria.getText().length()== 6)
	    	 
	    	     e.consume();
	    	}
	    	 
	    	public void keyPressed(KeyEvent arg0) {
	    	}
	    	 
	    	public void keyReleased(KeyEvent arg0) {
	    	}
	    	});
			
			pComida.add(txtrIngreseGastoCarniceria);
			
			
			
			
			
			tGastoVerduleria.setText("Ingrese gasto Verduleria");
			tGastoVerduleria.setOpaque(false);
			tGastoVerduleria.setForeground(Color.LIGHT_GRAY);
			tGastoVerduleria.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tGastoVerduleria.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tGastoVerduleria.setBounds(75, 93, 221, 21);
			
			
			
			tGastoVerduleria.addKeyListener(new KeyAdapter()
		    {
		    	public void keyTyped(KeyEvent e)
		    	{
		    		char caracter = e.getKeyChar();
		    		
		    		// Verificar si la tecla pulsada no es un digito
		    		if(((caracter < '0') ||
		    				(caracter > '9')) &&
		    				(caracter != '\b' /*corresponde a BACK_SPACE*/))
		    		{
		    			e.consume();  // ignorar el evento de teclado
		    			//lista.mensajeTemporizado("Ingrese solo numeros", 1000); 	//HALAR ESTE MENSAJE DESDE LISTA PARA PODER USARLO
		    		}
		    	}
		    });
		
			tGastoVerduleria.addKeyListener(new KeyListener(){ //PARA LIMITAR QUE USUARIO NO INGRESE UN GASTO MAYOR A 6 CIFRAS O DIGITOS
	    	 
	    	public void keyTyped(KeyEvent e)
	    	 
	    	{if (tGastoVerduleria.getText().length()== 6)
	    	 
	    	     e.consume();
	    	}
	    	 
	    	public void keyPressed(KeyEvent arg0) {
	    	}
	    	 
	    	public void keyReleased(KeyEvent arg0) {
	    	}
	    	});
			
			
			pComida.add(tGastoVerduleria);
			
			JTextArea tIngreso = new JTextArea();
			tIngreso.setOpaque(false);
			tIngreso.setForeground(new Color(47, 79, 79));
			tIngreso.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tIngreso.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tIngreso.setBounds(101, 145, 161, 21);
			menuInserta.add(tIngreso);
			
			JTextArea tContacto = new JTextArea();
			tContacto.setForeground(new Color(47, 79, 79));
			tContacto.setOpaque(false);
			tContacto.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tContacto.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tContacto.setBounds(101, 100, 161, 21);
			menuInserta.add(tContacto);
			
			JTextArea tCed = new JTextArea();
			tCed.setForeground(new Color(47, 79, 79));
			tCed.setOpaque(false);
			tCed.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tCed.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tCed.setBounds(101, 62, 161, 21);
			menuInserta.add(tCed);
			
			
			
			
			JLabel lblCedula = new JLabel("Cedula:");
			lblCedula.setForeground(new Color(47, 79, 79));
			lblCedula.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblCedula.setBounds(10, 68, 61, 16);
			menuInserta.add(lblCedula);
			
			JLabel lblResidencia = new JLabel("Ingreso:");
			lblResidencia.setForeground(new Color(47, 79, 79));
			lblResidencia.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblResidencia.setBounds(10, 145, 122, 29);
			menuInserta.add(lblResidencia);
			
			JTextArea tNombre = new JTextArea();
			tNombre.setForeground(new Color(47, 79, 79));
			tNombre.setOpaque(false);
			tNombre.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tNombre.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			
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
			tNombre.setBounds(101, 26, 161, 21);
			menuInserta.add(tNombre);
			
			JLabel lblContacto = new JLabel("Contacto:");
			lblContacto.setForeground(new Color(47, 79, 79));
			lblContacto.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblContacto.setBounds(10, 105, 97, 16);
			menuInserta.add(lblContacto);
			
			JButton listo = new JButton("Listo!");
			//listo.setIcon(new ImageIcon(Menu.class.getResource("/vista/iconsImages/tick_16.png")));
			listo.setSelectedIcon(new ImageIcon("\\\\Mac\\Home\\Downloads\\Basic_set\\Basic_set_Png\\Basic_set_Png\\tick_16.png"));
			listo.setToolTipText("Ingresa los datos correspondiente");
			listo.setFont(new Font("Dialog", Font.BOLD, 13));
			listo.setBounds(93, 324, 122, 29);
			
			listo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(tNombre.getText().isEmpty()) {
					//	lista.mensajeTemporizado("Agregue su nombre", 1000);
						
					
					}else if(tContacto.getText().isEmpty()) {
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
								tContacto.setText("");
								tIngreso.setText("");
								
								tDireccionExacta.setText("");
								boxTipoAveria.setSelectedIndex(0);
								boxLugar.setSelectedIndex(0);
								boxAveriaEspecifica.setSelectedIndex(0);
								pPrueba.setVisible(false);
								
								
						}
					}	   	 
						
			});
			
			
			menuInserta.add(listo);
			
			JButton btnBorraD = new JButton("Borrar Datos");//PROBABLEMENTE ESTE BOTON SE DESECHARÁ
			btnBorraD.setIcon(null);
			btnBorraD.setFont(new Font("Dialog", Font.BOLD, 13));
			btnBorraD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					tNombre.setText("");
					tCed.setText("");
					tContacto.setText("");
					tIngreso.setText("");
				
					tDireccionExacta.setText("");
					boxTipoAveria.setSelectedIndex(0);
					
					
				}
			});
			btnBorraD.setBounds(450, 324, 192, 29);
			
			menuInserta.add(btnBorraD);
			
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setForeground(new Color(47, 79, 79));
			lblNombre.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblNombre.setBounds(10, 36, 81, 16);
			menuInserta.add(lblNombre);
			
		
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
			
			
			
			 btnHomeShorCut = new JButton("");
			 btnHomeShorCut.setToolTipText("Regresar a menu prinicipal");
			 btnHomeShorCut.setOpaque(false);
			btnHomeShorCut.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					menuInserta.setVisible(false);
					bienvenida.setVisible(true);
				
					
					
				}
			});
			btnHomeShorCut.setContentAreaFilled(false);
			btnHomeShorCut.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/home.png")));
			btnHomeShorCut.setBounds(323, 353, 61, 53);
			menuInserta.add(btnHomeShorCut);
			
			JLabel lblImageInserta = new JLabel("");
			lblImageInserta.setHorizontalAlignment(SwingConstants.RIGHT);
			lblImageInserta.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/gradientInsertar.jpeg")));
			lblImageInserta.setBounds(0, 0, 721, 450);
			menuInserta.add(lblImageInserta);
			
			JTextArea tNis = new JTextArea();
			tNis.setOpaque(false);
			tNis.setForeground(new Color(47, 79, 79));
			tNis.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
			tNis.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(47, 79, 79)));
			tNis.setBounds(0, 0, 161, 21);
			menuInserta.add(tNis);
			pPrueba.setBackground(new Color (0, 0, 0, 50));
			pPrueba.setBackground(new Color(128, 128, 128));
			//pPrueba.setBackground(new Color(0,0,0,x));//BAJAR LA OPACIDAD DEL PANEL CON LA CORDENADA "X"-> última coordenada
			pPrueba.setBounds(302, 55, 342, 258);
			menuInserta.add(pPrueba);
			pPrueba.setLayout(null);
			
			JLabel lDireccion = new JLabel("Direccion exacta:");
			lDireccion.setForeground(new Color(47, 79, 79));
			lDireccion.setFont(new Font("Sitka Text", Font.BOLD, 13));
			lDireccion.setBounds(115, 135, 124, 16);
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
			lTipoAv.setForeground(new Color(47, 79, 79));
			lTipoAv.setFont(new Font("Sitka Text", Font.BOLD, 13));
			lTipoAv.setBounds(115, 10, 124, 16);
			pPrueba.add(lTipoAv);
			
			JLabel lLugar = new JLabel("Lugar");
			lLugar.setForeground(new Color(47, 79, 79));
			lLugar.setFont(new Font("Sitka Text", Font.BOLD, 13));
			lLugar.setBounds(135, 76, 104, 16);
			pPrueba.add(lLugar);
			pPrueba.setVisible(false);
			
			
			
			menuBusca = new JPanel();
			menuBusca.setBackground(new Color(188, 143, 143));
			menuBusca.setToolTipText("");
			contentPane.add(menuBusca, "t3");
			menuBusca.setLayout(null);
			
			JLabel lBuscando = new JLabel("Buscando.");
			lBuscando.setForeground(new Color(0, 51, 102));
			lBuscando.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lBuscando.setBounds(287, 6, 140, 30);
			menuBusca.add(lBuscando);
			
			JTextArea tDigito = new JTextArea(); //TOMA EL DIGITO PARA BUSCAR EL PACIENTE
			tDigito.setOpaque(false);
			tDigito.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 51, 102)));
			tDigito.setBackground(new Color(153, 153, 153));
			tDigito.setToolTipText("Ingresa el digito entre corchetes \"[ ]\"");
			tDigito.setBounds(287, 47, 71, 28);
			menuBusca.add(tDigito);
			
			JLabel lblDigitaPacienteA = new JLabel("Digita paciente a buscar:");
			lblDigitaPacienteA.setForeground(new Color(0, 51, 102));
			lblDigitaPacienteA.setFont(new Font("Sitka Text", Font.BOLD, 15));
			lblDigitaPacienteA.setBounds(85, 49, 191, 30);
			menuBusca.add(lblDigitaPacienteA);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(159, 110, 408, 193);
			menuBusca.add(scrollPane);
			tDatosBuscar.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			tDatosBuscar.setBackground(new Color(153, 153, 153));
			
			scrollPane.setViewportView(tDatosBuscar);
			
			JButton btnBuscar = new JButton("Buscar");
			btnBuscar.setContentAreaFilled(false);
			btnBuscar.setIgnoreRepaint(true);
			btnBuscar.setFont(new Font("Sitka Text", Font.BOLD, 12));
			btnBuscar.setForeground(Color.WHITE);
			btnBuscar.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/buscarBusqueda.png")));
			
			btnBuscar.setOpaque(false);
			btnBuscar.setContentAreaFilled(false);
			btnBuscar.setBackground(new Color (0, 0, 0, 100));
			
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
			btnBuscar.setBounds(368, 33, 121, 52);
			menuBusca.add(btnBuscar);
			
			btnHomeShorCut_2 = new JButton("");
			btnHomeShorCut_2.setToolTipText("Menu principal");
			btnHomeShorCut_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					menuBusca.setVisible(false);
					bienvenida.setVisible(true);
				
					
					
				}
			});
			btnHomeShorCut_2.setContentAreaFilled(false);
			btnHomeShorCut_2.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/home.png")));
			btnHomeShorCut_2.setBounds(301, 365, 82, 52);
			menuBusca.add(btnHomeShorCut_2);
			
			JLabel lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setForeground(new Color(51, 51, 0));
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/gradientBuscar.jpg")));
			lblNewLabel_2.setBounds(-58, -43, 841, 538);
			menuBusca.add(lblNewLabel_2);
			
			menuElimina = new JPanel();
			menuElimina.setBackground(new Color(119, 136, 153));
			contentPane.add(menuElimina, "t4");
			menuElimina.setLayout(null);
			
			JLabel lEliminando = new JLabel("Eliminando.");
			lEliminando.setForeground(SystemColor.scrollbar);
			lEliminando.setBackground(new Color(245, 255, 250));
			lEliminando.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lEliminando.setBounds(312, 11, 140, 30);
			menuElimina.add(lEliminando);
			
			JTextArea tDigitoEliminar = new JTextArea();
			tDigitoEliminar.setForeground(SystemColor.scrollbar);
			tDigitoEliminar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
			tDigitoEliminar.setOpaque(false);
			tDigitoEliminar.setBorder(new MatteBorder(0, 0, 3, 0, (Color) SystemColor.activeCaption));
			tDigitoEliminar.setBackground(SystemColor.activeCaption);
			tDigitoEliminar.setToolTipText("Ingresa el digito entre corchetes \"[ ]\" del n\u00FAmero de paciente a eliminar...");
			tDigitoEliminar.setBounds(390, 84, 48, 28);
			menuElimina.add(tDigitoEliminar);
			
			JLabel lPacienteEliminar = new JLabel("Digita paciente a eliminar:");
			lPacienteEliminar.setForeground(SystemColor.scrollbar);
			lPacienteEliminar.setToolTipText("");
			lPacienteEliminar.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
			lPacienteEliminar.setBounds(194, 77, 199, 30);
			menuElimina.add(lPacienteEliminar);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(81, 133, 579, 224);
			menuElimina.add(scrollPane_1);
			tInfoEliminar.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			tInfoEliminar.setBackground(SystemColor.activeCaption);
			
			
			scrollPane_1.setViewportView(tInfoEliminar);
			
			JButton btnEliminar = new JButton("");
			btnEliminar.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/borrarBorrado.png")));
			btnEliminar.setContentAreaFilled(false);
			//btnEliminar.setIcon(new ImageIcon(Menu.class.getResource("/vista/iconsImages/trash_32.png")));
			btnEliminar.setFont(new Font("Sitka Text", Font.BOLD, 15));
			btnEliminar.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent arg0) {
					
					//	arbol.eliminar(Integer.parseInt(tDigitoEliminar.getText()));
						tInfoEliminar.setText("");
					//	tInfoEliminar.setText(arbol.acumulaDatos());
						
						
				}
				
			});
			
			btnEliminar.setToolTipText("Presiona para eliminar");
			btnEliminar.setBounds(459, 77, 48, 38);
			menuElimina.add(btnEliminar);
			
			
			 btnHomeShorCut_1 = new JButton("");
			 btnHomeShorCut_1.setToolTipText("Regresa a menu principal");
			btnHomeShorCut_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					menuElimina.setVisible(false);
					bienvenida.setVisible(true);
				
					
					
				}
			});
			btnHomeShorCut_1.setContentAreaFilled(false);
			btnHomeShorCut_1.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/home.png")));
			btnHomeShorCut_1.setBounds(328, 381, 65, 49);
			menuElimina.add(btnHomeShorCut_1);
			
			JLabel lblNewLabel_6 = new JLabel("");
			lblNewLabel_6.setHorizontalTextPosition(SwingConstants.RIGHT);
			lblNewLabel_6.setIcon(new ImageIcon(Menu.class.getResource("/modelo/images/gradientEliminar.jpeg")));
			lblNewLabel_6.setBounds(0, 0, 721, 450);
			menuElimina.add(lblNewLabel_6);
			
			
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
