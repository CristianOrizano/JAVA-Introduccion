package Ejemplo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

public class Proyecto_ciclo01 extends JFrame implements ActionListener, FocusListener, WindowListener {
	
    	// Datos mínimos del primer colchón

		public static String marca0 = "Suavestar";
		public static double precio0 = 499.0;
		public static int garantia0 = 7;
		public static String tamaño0 = "1 1/2 Plaza list";
		public static String material0 = "Tela Tricot Acolchada";
		public static int cantidadventas0;
		public static int cantidadTotal0;
		public static double ImporteTotal0;
		public static int optima0;
		
		// Datos mínimos del segundo colchón
		
		
		public static String marca1 = "Springwall";
		public static double precio1 = 679.0;
		public static int garantia1 = 10;
		public static String tamaño1 = "2 Plazas";
		public static String material1 = "Tejido de Punto con Algodón Orgánico";
		public static int cantidadventas1;
		public static int cantidadTotal1;
		public static double ImporteTotal1;
		public static int optima1;
		
		// Datos mínimos del tercer colchón
		
		
		public static String marca2 = "Paraiso";
		public static double precio2 = 479.0;
		public static int garantia2 = 5;
		public static String tamaño2 = "1 1/2 Plazas";
		public static String material2 = "Tejido de Punto";
		public static int cantidadventas2;
		public static int cantidadTotal2;
		public static double ImporteTotal2;
		public static int optima2;
		// Datos mínimos del cuarto colchón
		
		
		public static String marca3 = "Drimer";
		public static double precio3 = 749.0;
		public static int garantia3 = 4;
		public static String tamaño3 = "Queen";
		public static String material3 = "Jacquard";
		public static int cantidadventas3;
		public static int cantidadTotal3;
		public static double ImporteTotal3;
		public static int optima3;
		// Datos mínimos del quinto colchón
		
		
		public static String marca4 = "Cisne";
		public static double precio4 = 389.0;
		public static int garantia4 = 2;
		public static String tamaño4 = "1 1/2 Plazas";
		public static String material4 = "Tejido de Punto";
		public static int cantidadventas4;
		public static int cantidadTotal4;
		public static double ImporteTotal4;
		public static int optima4;
		
		// Porcentajes de descuento
		public static double porcentaje1 = 7.5;
		public static double porcentaje2 = 10.0;
		public static double porcentaje3 = 12.5;
		public static double porcentaje4 = 15.0;
		
		//importe general acumulado
		public static double importegeneral;
		//Cantidad general
		public static int cantidadGeneral;
		
		// Cantidad óptima de colchones vendidos
		public static int cantidadOptima = 10;
		// Cantidad mínima de colchones adquiridos para acceder al obsequio
		public static int cantidadMinimaObsequiable = 3;
		// Obsequio por cantidad mínima de colchones adquiridos
		public static String obsequio = "USB";
		// Número de cliente que recibe el premio sorpresa
		public static int numeroClienteSorpresa = 5;
		// Premio sorpresa
		public static String premioSorpresa = "Un polo";
		
		
	private JPanel contentPane;
	private JMenuItem mntmSalir;
	private JMenuItem mntmModificarColchon;
	private JMenuItem mntmListarColchon;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmAcercaDeTienda;
	private JMenuItem mntmConfiguirarDescuento;
	private JMenuItem mntmConfigurarObsequio;
	private JMenuItem mntmConfigurarCantidadOptima;
	private JMenuItem mntmConfigurarPremioSorpresa;
	private JMenuBar menuBar;
	private JMenuItem mntmPrueba;
	private JMenuItem mntmConsultarColchon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proyecto_ciclo01 frame = new Proyecto_ciclo01();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Proyecto_ciclo01() {
		addWindowListener(this);
	   
		
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(0, 206, 209));
		setTitle("Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 972, 684);
		
		menuBar = new JMenuBar();
		menuBar.setBorder(new LineBorder(new Color(255, 255, 0), 3));
		menuBar.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		menuBar.addFocusListener(this);
		menuBar.setForeground(new Color(220, 20, 60));
		menuBar.setBackground(new Color(0, 255, 255));
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		mnArchivo.setIcon(new ImageIcon(Proyecto_ciclo01.class.getResource("/Imagen/exit (2).png")));
		mnArchivo.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 16));
		mnArchivo.setBackground(new Color(0, 139, 139));
		mnArchivo.setForeground(new Color(255, 0, 0));
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.setBackground(new Color(255, 255, 224));
		mntmSalir.setIcon(new ImageIcon(Proyecto_ciclo01.class.getResource("/Imagen/salir.png")));
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setAlignmentX(Component.LEFT_ALIGNMENT);
		mnMantenimiento.setIcon(new ImageIcon(Proyecto_ciclo01.class.getResource("/Imagen/iconoConsultar.png")));
		mnMantenimiento.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 16));
		mnMantenimiento.setHorizontalTextPosition(SwingConstants.RIGHT);
		mnMantenimiento.setHorizontalAlignment(SwingConstants.RIGHT);
		mnMantenimiento.setBackground(new Color(255, 0, 255));
		mnMantenimiento.setForeground(new Color(255, 0, 0));
		menuBar.add(mnMantenimiento);
		
		mntmModificarColchon = new JMenuItem("Modificar Colchon");
		mntmModificarColchon.setIcon(new ImageIcon(Proyecto_ciclo01.class.getResource("/Imagen/edit.gif")));
		mntmModificarColchon.setBackground(new Color(255, 255, 224));
		mntmModificarColchon.addActionListener(this);
		
		mntmConsultarColchon = new JMenuItem("Consultar Colchon");
		mntmConsultarColchon.setBackground(new Color(255, 255, 224));
		mntmConsultarColchon.addActionListener(this);
		mntmConsultarColchon.setIcon(new ImageIcon(Proyecto_ciclo01.class.getResource("/Imagen/orden.png")));
		mnMantenimiento.add(mntmConsultarColchon);
		mnMantenimiento.add(mntmModificarColchon);
		
		mntmListarColchon = new JMenuItem("Listar Colchon");
		mntmListarColchon.setIcon(new ImageIcon(Proyecto_ciclo01.class.getResource("/Imagen/i-proyectoresolucion.png")));
		mntmListarColchon.setBackground(new Color(255, 255, 224));
		mntmListarColchon.addActionListener(this);
		mnMantenimiento.add(mntmListarColchon);
		
		JMenu mnVentas = new JMenu("Ventas");
		mnVentas.setBackground(new Color(255, 255, 224));
		mnVentas.setIcon(new ImageIcon(Proyecto_ciclo01.class.getResource("/Imagen/Shopping Cart.png")));
		mnVentas.setForeground(new Color(255, 0, 0));
		mnVentas.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 16));
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.setBackground(new Color(255, 255, 224));
		mntmVender.setIcon(new ImageIcon(Proyecto_ciclo01.class.getResource("/Imagen/i-presupuesto.png")));
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar Reportes");
		mntmGenerarReportes.setBackground(new Color(255, 255, 224));
		mntmGenerarReportes.setIcon(new ImageIcon(Proyecto_ciclo01.class.getResource("/Imagen/copy_selected.png")));
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);
		
		JMenu mnConfiguracion = new JMenu("Configuracion");
		mnConfiguracion.setBackground(new Color(255, 255, 224));
		mnConfiguracion.setIcon(new ImageIcon(Proyecto_ciclo01.class.getResource("/Imagen/baseline_settings_black_24dp.png")));
		mnConfiguracion.setForeground(new Color(255, 0, 0));
		mnConfiguracion.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 16));
		menuBar.add(mnConfiguracion);
		
		mntmConfiguirarDescuento = new JMenuItem("Configurar descuento");
		mntmConfiguirarDescuento.setBackground(new Color(255, 255, 224));
		mntmConfiguirarDescuento.setIcon(new ImageIcon(Proyecto_ciclo01.class.getResource("/Imagen/Symbol Configuration 2.png")));
		mntmConfiguirarDescuento.addActionListener(this);
		mnConfiguracion.add(mntmConfiguirarDescuento);
		
		mntmConfigurarObsequio = new JMenuItem("Configurar obsequio");
		mntmConfigurarObsequio.setBackground(new Color(255, 255, 224));
		mntmConfigurarObsequio.setIcon(new ImageIcon(Proyecto_ciclo01.class.getResource("/Imagen/Symbol Configuration 2.png")));
		mntmConfigurarObsequio.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarObsequio);
		
		mntmConfigurarCantidadOptima = new JMenuItem("Configurar cantidad optima de colchones vendidos");
		mntmConfigurarCantidadOptima.setBackground(new Color(255, 255, 224));
		mntmConfigurarCantidadOptima.setIcon(new ImageIcon(Proyecto_ciclo01.class.getResource("/Imagen/Symbol Configuration 2.png")));
		mntmConfigurarCantidadOptima.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarCantidadOptima);
		
		mntmConfigurarPremioSorpresa = new JMenuItem("Configurar premio sorpresa");
		mntmConfigurarPremioSorpresa.setBackground(new Color(255, 255, 224));
		mntmConfigurarPremioSorpresa.setIcon(new ImageIcon(Proyecto_ciclo01.class.getResource("/Imagen/Symbol Configuration 2.png")));
		mntmConfigurarPremioSorpresa.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarPremioSorpresa);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		mnAyuda.setBackground(new Color(255, 255, 224));
		mnAyuda.setIcon(new ImageIcon(Proyecto_ciclo01.class.getResource("/Imagen/ayuda.png")));
		mnAyuda.setForeground(new Color(255, 0, 0));
		mnAyuda.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 16));
		menuBar.add(mnAyuda);
		
		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercaDeTienda.setBackground(new Color(255, 255, 224));
		mntmAcercaDeTienda.setIcon(new ImageIcon(Proyecto_ciclo01.class.getResource("/Imagen/iconoayuda.png")));
		mntmAcercaDeTienda.addActionListener(this);
		mnAyuda.add(mntmAcercaDeTienda);
		
		mntmPrueba = new JMenuItem("Prueba");
		mntmPrueba.addActionListener(this);
		mnAyuda.add(mntmPrueba);
		contentPane = new JPanel();
		contentPane.setEnabled(false);
		contentPane.setBorder(new LineBorder(new Color(255, 165, 0), 5, true));
		contentPane.setMinimumSize(new Dimension(13, 11));
		contentPane.setBackground(new Color(255, 51, 102));
		contentPane.setForeground(new Color(255, 51, 102));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBorder(new LineBorder(new Color(127, 255, 212), 6, true));
		label.setBackground(new Color(127, 255, 212));
		label.setIcon(new ImageIcon(Proyecto_ciclo01.class.getResource("/Imagen/jjj.jpg")));
		label.setBounds(53, 39, 843, 462);
		contentPane.add(label);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmConsultarColchon) {
			actionPerformedMntmConsultarColchon(arg0);
		}
		if (arg0.getSource() == mntmPrueba) {
			actionPerformedMntmPrueba(arg0);
		}
		if (arg0.getSource() == mntmConfigurarPremioSorpresa) {
			actionPerformedMntmConfigurarPremioSorpresa(arg0);
		}
		if (arg0.getSource() == mntmConfigurarCantidadOptima) {
			actionPerformedMntmConfigurarCantidadOptima(arg0);
		}
		if (arg0.getSource() == mntmConfigurarObsequio) {
			actionPerformedMntmConfigurarObsequio(arg0);
		}
		if (arg0.getSource() == mntmConfiguirarDescuento) {
			actionPerformedMntmConfiguirarDescuento(arg0);
		}
		if (arg0.getSource() == mntmAcercaDeTienda) {
			actionPerformedMntmAcercaDeTienda(arg0);
		}
		if (arg0.getSource() == mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(arg0);
		}
		if (arg0.getSource() == mntmVender) {
			actionPerformedMntmVender(arg0);
		}
		if (arg0.getSource() == mntmListarColchon) {
			actionPerformedMntmListarColchon(arg0);
		}
		if (arg0.getSource() == mntmModificarColchon) {
			actionPerformedMntmModificarColchon(arg0);
		}
		if (arg0.getSource() == mntmSalir) {
			actionPerformedMntmSalir(arg0);
		}
	}
	protected void actionPerformedMntmSalir(ActionEvent arg0) {
		dispose();
		
	}
	protected void actionPerformedMntmModificarColchon(ActionEvent arg0) {
		ModificarColchon mh = new ModificarColchon();
		
		mh.setLocationRelativeTo(this);
		mh.setVisible(true);
		
	}
	protected void actionPerformedMntmListarColchon(ActionEvent arg0) {
		
		ListarColchon lc= new ListarColchon();
		
		lc.setLocationRelativeTo(this);
		lc.setVisible(true);
		
	}
	protected void actionPerformedMntmVender(ActionEvent arg0) {
		Vender ve = new Vender();
		
		ve.setLocationRelativeTo(this);
		ve.setVisible(true);
	}
	protected void actionPerformedMntmGenerarReportes(ActionEvent arg0) {
		GenerarReporte gn = new GenerarReporte();
		gn.setLocationRelativeTo(this);
		gn.setVisible(true);
	}
	protected void actionPerformedMntmAcercaDeTienda(ActionEvent arg0) {
		AcercaTienda ac= new AcercaTienda();
		
		ac.setLocationRelativeTo(this);
		ac.setVisible(true);
	}
	protected void actionPerformedMntmConfiguirarDescuento(ActionEvent arg0) {
		ConfigurarDescuento cd = new ConfigurarDescuento();
		
		
		cd.setLocationRelativeTo(this);
		cd.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarObsequio(ActionEvent arg0) {
		ConfigurarObsequio co = new ConfigurarObsequio();
		co.setLocationRelativeTo(this);
		co.setVisible(true);
		
	}
	protected void actionPerformedMntmConfigurarCantidadOptima(ActionEvent arg0) {
		
		CantidadOptimaColchones can= new CantidadOptimaColchones();
		can.setLocationRelativeTo(this);
		can.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarPremioSorpresa(ActionEvent arg0) {
		ConfigurarPremioSorpresa cs= new ConfigurarPremioSorpresa();
		cs.setLocationRelativeTo(this);
		cs.setVisible(true);
	}
	public void focusGained(FocusEvent arg0) {
		if (arg0.getSource() == menuBar) {
			focusGainedMenuBar(arg0);
		}
	}
	public void focusLost(FocusEvent arg0) {
	}
	protected void focusGainedMenuBar(FocusEvent arg0) {
		
	}
	protected void actionPerformedMntmPrueba(ActionEvent arg0) {
		prueba p = new prueba();
		p.setLocationRelativeTo(this);
		p.setVisible(true);
	}
	protected void actionPerformedMntmConsultarColchon(ActionEvent arg0) {
		ConsultarColchon c = new ConsultarColchon();
		c.setLocationRelativeTo(this);
		c.setVisible(true);
	}
	public void windowActivated(WindowEvent arg0) {
	}
	public void windowClosed(WindowEvent arg0) {
	}
	public void windowClosing(WindowEvent arg0) {
		if (arg0.getSource() == this) {
			windowClosingThis(arg0);
		}
	}
	public void windowDeactivated(WindowEvent arg0) {
	}
	public void windowDeiconified(WindowEvent arg0) {
	}
	public void windowIconified(WindowEvent arg0) {
	}
	public void windowOpened(WindowEvent arg0) {
		JOptionPane.showMessageDialog(this, "Bienvenido Cristian");
	}
	protected void windowClosingThis(WindowEvent arg0) {
		JOptionPane.showMessageDialog(this, "Gracias Por su Compra");
	}
}
