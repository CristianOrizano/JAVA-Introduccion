package Ejemplo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class GenerarReporte extends JDialog implements ActionListener, ItemListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnCerrar;
	private JComboBox cboReporte;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GenerarReporte dialog = new GenerarReporte();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GenerarReporte() {
		setModal(true);
		setTitle("Generar Reporte");
		setBounds(100, 100, 608, 512);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 206, 209));
		contentPanel.setBorder(new LineBorder(new Color(0, 139, 139), 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblTipoDeReporte = new JLabel("Tipo de Reporte");
		lblTipoDeReporte.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblTipoDeReporte.setBounds(20, 56, 119, 14);
		contentPanel.add(lblTipoDeReporte);
		
		cboReporte = new JComboBox();
		cboReporte.setBackground(new Color(102, 205, 170));
		cboReporte.setFont(new Font("Tahoma", Font.BOLD, 11));
		cboReporte.addActionListener(this);
		cboReporte.addItemListener(this);
		cboReporte.setModel(new DefaultComboBoxModel(new String[] {"Ventas por marca", "Marcas con venta \u00F3ptima", "Precios en relaci\u00F3n al promedio", "Precio promedio, mayor y menor"}));
		cboReporte.setBounds(149, 46, 242, 29);
		contentPanel.add(cboReporte);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCerrar.setBackground(new Color(255, 0, 0));
		btnCerrar.setForeground(new Color(255, 255, 0));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(421, 46, 89, 34);
		contentPanel.add(btnCerrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 102, 528, 360);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		txtS.setBackground(new Color(255, 255, 240));
		txtS.setFont(new Font("Monospaced", Font.BOLD, 13));
		scrollPane.setViewportView(txtS);
		
		cboReporte.setSelectedIndex(0);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cboReporte) {
			actionPerformedCboReporte(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
	public void itemStateChanged(ItemEvent arg0) {
		if (arg0.getSource() == cboReporte) {
			itemStateChangedCboReporte(arg0);
		}
	}
	protected void itemStateChangedCboReporte(ItemEvent arg0) {

	}
	protected void actionPerformedCboReporte(ActionEvent arg0) {
		int op;
		double pro;
		String con,con1,con2,con3,con4;
		pro= (Proyecto_ciclo01.precio0+Proyecto_ciclo01.precio1+Proyecto_ciclo01.precio2+
				Proyecto_ciclo01.precio3+Proyecto_ciclo01.precio4)/5;
		double mayor= Proyecto_ciclo01.precio4,menor=Proyecto_ciclo01.precio4;
		
		op=cboReporte.getSelectedIndex();
		
		if(op==0) {
		txtS.setText("Ventas Por Colchon\n");
		txtS.append("\n");
		txtS.append("Marca                              : "+Proyecto_ciclo01.marca0+"\n");
		txtS.append("Cantidad de ventas                 : "+Proyecto_ciclo01.cantidadventas0+"\n");
		txtS.append("Cantidad total de unidades vendidas: "+Proyecto_ciclo01.cantidadTotal0+"\n");
		txtS.append("Importe Total Acumulado            : S/."+Proyecto_ciclo01.ImporteTotal0+"\n");
		txtS.append("--------------------------------------------------------------------------\n");
		txtS.append("Marca                              : "+Proyecto_ciclo01.marca1+"\n");
		txtS.append("Cantidad de ventas                 : "+Proyecto_ciclo01.cantidadventas1+"\n");
		txtS.append("Cantidad total de unidades vendidas: "+Proyecto_ciclo01.cantidadTotal1+"\n");
		txtS.append("Importe Total Acumulado            : S/."+Proyecto_ciclo01.ImporteTotal1+"\n");
		txtS.append("--------------------------------------------------------------------------\n");
		txtS.append("Marca                              : "+Proyecto_ciclo01.marca2+"\n");
		txtS.append("Cantidad de ventas                 : "+Proyecto_ciclo01.cantidadventas2+"\n");
		txtS.append("Cantidad total de unidades vendidas: "+Proyecto_ciclo01.cantidadTotal2+"\n");
		txtS.append("Importe Total Acumulado            : S/."+Proyecto_ciclo01.ImporteTotal2+"\n");
		txtS.append("--------------------------------------------------------------------------\n");
		txtS.append("Marca                              : "+Proyecto_ciclo01.marca3+"\n");
		txtS.append("Cantidad de ventas                 : "+Proyecto_ciclo01.cantidadventas3+"\n");
		txtS.append("Cantidad total de unidades vendidas: "+Proyecto_ciclo01.cantidadTotal3+"\n");
		txtS.append("Importe Total Acumulado            : S/."+Proyecto_ciclo01.ImporteTotal3+"\n");
		txtS.append("--------------------------------------------------------------------------\n");
		txtS.append("Marca                              : "+Proyecto_ciclo01.marca4+"\n");
		txtS.append("Cantidad de ventas                 : "+Proyecto_ciclo01.cantidadventas4+"\n");
		txtS.append("Cantidad total de unidades vendidas: "+Proyecto_ciclo01.cantidadTotal4+"\n");
		txtS.append("Importe Total Acumulado            : S/."+Proyecto_ciclo01.ImporteTotal4+"\n");
		txtS.append("--------------------------------\n");
		txtS.append(">>>>> Importe total general acumulado    : S/."+Proyecto_ciclo01.importegeneral+"\n");
		txtS.append(">>>>> Cantidad total general de ventas   : "+Proyecto_ciclo01.cantidadGeneral+"\n"+"\n");
		
		}else if(op==1) {
			txtS.setText("COLCHONES CON VENTA OPTIMA\n");
			txtS.append("\n");
			if (Proyecto_ciclo01.cantidadTotal0>=Proyecto_ciclo01.cantidadOptima) { 
				int pr;
				pr= Proyecto_ciclo01.cantidadTotal0-Proyecto_ciclo01.cantidadOptima;
			 txtS.append("Marca                              : "+Proyecto_ciclo01.marca0+"\n");
			 txtS.append("Cantidad total de Unidades Vendidas: "+Proyecto_ciclo01.cantidadTotal0+"( "+pr+" mas que la cantidad optima)"+"\n");
			 txtS.append("----------------------------------------------------------------------------------------------------------\n");
			 
			 
			}  if(Proyecto_ciclo01.cantidadTotal1>=Proyecto_ciclo01.cantidadOptima) {
				int pr;
				pr= Proyecto_ciclo01.cantidadTotal1-Proyecto_ciclo01.cantidadOptima;
			 txtS.append("Marca                              : "+Proyecto_ciclo01.marca1+"\n");
			 txtS.append("Cantidad total de Unidades Vendidas: "+Proyecto_ciclo01.cantidadTotal1+"( "+pr+" mas que la cantidad optima)"+"\n");
			 txtS.append("----------------------------------------------------------------------------------------------------------\n");
			 
			} if(Proyecto_ciclo01.cantidadTotal2>=Proyecto_ciclo01.cantidadOptima) {
				int pr;
				pr= Proyecto_ciclo01.cantidadTotal2-Proyecto_ciclo01.cantidadOptima;
			 txtS.append("Marca                              : "+Proyecto_ciclo01.marca2+"\n");
			 txtS.append("Cantidad total de Unidades Vendidas: "+Proyecto_ciclo01.cantidadTotal2+"( "+pr+" mas que la cantidad optima)"+"\n");
			 txtS.append("----------------------------------------------------------------------------------------------------------\n");
			 
			}  if(Proyecto_ciclo01.cantidadTotal3>=Proyecto_ciclo01.cantidadOptima) {
				int pr;
				pr= Proyecto_ciclo01.cantidadTotal3-Proyecto_ciclo01.cantidadOptima;
			 txtS.append("Marca                              : "+Proyecto_ciclo01.marca3+"\n");
			 txtS.append("Cantidad total de Unidades Vendidas: "+Proyecto_ciclo01.cantidadTotal3+"( "+pr+" mas que la cantidad optima)"+"\n");
			 txtS.append("----------------------------------------------------------------------------------------------------------\n");
			 
			} if(Proyecto_ciclo01.cantidadTotal4>=Proyecto_ciclo01.cantidadOptima){
				int pr;
				pr= Proyecto_ciclo01.cantidadTotal4-Proyecto_ciclo01.cantidadOptima;
			 txtS.append("Marca                              : "+Proyecto_ciclo01.marca4+"\n");
			 txtS.append("Cantidad total de Unidades Vendidas: "+Proyecto_ciclo01.cantidadTotal4+"( "+pr+" mas que la cantidad optima)"+"\n");
			 txtS.append("----------------------------------------------------------------------------------------------------------\n");
			} 
			 
		}else if(op==2) {
		
			  if(Proyecto_ciclo01.precio0>pro)
				  con= "mayor al promedio";				  
			  else if(Proyecto_ciclo01.precio0<pro)				  
				  con="menor al promedio";
			  else
				  con="igual al promedio";
			  
			  if(Proyecto_ciclo01.precio1>pro)
				  con1= "mayor al promedio";
			  else if(Proyecto_ciclo01.precio1<pro)
				  con1="menor al promedio";
			  else
				  con1="Igual al promedio";
			  
			  if(Proyecto_ciclo01.precio2>pro)
				  con2= "mayor al promedio";
			  else if(Proyecto_ciclo01.precio2<pro)
				  con2="menor al promedio";
			  else
				  con2="Igual al promedio";
			  
			  if(Proyecto_ciclo01.precio3>pro)
				  con3= "mayor al promedio";
			  else if(Proyecto_ciclo01.precio3<pro)
				  con3="menor al promedio";
			  else
				  con3="Igual al promedio";
			  
			  if(Proyecto_ciclo01.precio4>pro)
				  con4= "mayor al promedio";
			  else if(Proyecto_ciclo01.precio4<pro)
				  con4="menor al promedio";
			  else
				  con4="Igual al promedio";
			  
			  
			 txtS.setText("Precios en relacion al promedio\n");
			 txtS.append("\n");
			 txtS.append("Nombre : "+Proyecto_ciclo01.marca0+"\n");
			 txtS.append("Precio : "+Proyecto_ciclo01.precio0+" ("+con+")"+"\n");
			 txtS.append("\n");
			 txtS.append("Nombre : "+Proyecto_ciclo01.marca1+"\n");
			 txtS.append("Precio : "+Proyecto_ciclo01.precio1+" ("+con1+")"+"\n");
			 txtS.append("\n");
			 txtS.append("Nombre : "+Proyecto_ciclo01.marca2+"\n");
			 txtS.append("Precio : "+Proyecto_ciclo01.precio2+" ("+con2+")"+"\n");
			 txtS.append("\n");
			 txtS.append("Nombre : "+Proyecto_ciclo01.marca3+"\n");
			 txtS.append("Precio : "+Proyecto_ciclo01.precio3+" ("+con3+")"+"\n");
			 txtS.append("\n");
			 txtS.append("Nombre : "+Proyecto_ciclo01.marca4+"\n");
			 txtS.append("Precio : "+Proyecto_ciclo01.precio4+" ("+con4+")"+"\n");
			 txtS.append("\n");
			 
			 txtS.append("Precio promedio: S/."+pro);
			 
	 
		}else {
			
			if(menor>Proyecto_ciclo01.precio1)
				menor= Proyecto_ciclo01.precio1;
			if(menor>Proyecto_ciclo01.precio2)
			 menor= Proyecto_ciclo01.precio2;
			if(menor> Proyecto_ciclo01.precio3)
				menor= Proyecto_ciclo01.precio3;
			if (menor>Proyecto_ciclo01.precio0)
				menor= Proyecto_ciclo01.precio0;
			//if(menor>Proyecto_ciclo01.precio4)
				//menor= Proyecto_ciclo01.precio4;
			
			if(mayor<Proyecto_ciclo01.precio1)
				mayor= Proyecto_ciclo01.precio1;
			 if(mayor<Proyecto_ciclo01.precio2)
				mayor= Proyecto_ciclo01.precio2;
			 if(mayor< Proyecto_ciclo01.precio3)
				mayor= Proyecto_ciclo01.precio3;
			 if (mayor<Proyecto_ciclo01.precio0)
				mayor= Proyecto_ciclo01.precio0;
			
			 txtS.setText("Precio promedio,menor,mayor\n");
			 txtS.append("\n");
			 txtS.append("Precio promedio   : S/."+pro+"\n");
			 txtS.append("Precio menor      : S/."+menor+"\n");
			 txtS.append("Precio mayor      : S/:"+mayor);
			
			
		}
		
		
		
		
	}
}
