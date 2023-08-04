package Ejemplo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Vender extends JDialog implements ItemListener, ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCantidad;
	private JTextField txtPrecio;
	private JComboBox cboMarca;
	private JButton btnCerrar;
	private JButton btnVender;
	private JTextArea txtS;
	
	
	int sor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Vender dialog = new Vender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Vender() {
		setModal(true);
		setTitle("Vender Colchon");
		setBounds(100, 100, 574, 450);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 206, 209));
		contentPanel.setBorder(new LineBorder(new Color(0, 139, 139), 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblMarca = new JLabel("Marca");
			lblMarca.setForeground(new Color(255, 0, 0));
			lblMarca.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
			lblMarca.setBounds(28, 40, 86, 14);
			contentPanel.add(lblMarca);
		}
		{
			JLabel lblPrecio = new JLabel("Precio (S/.)");
			lblPrecio.setForeground(new Color(255, 0, 0));
			lblPrecio.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
			lblPrecio.setBounds(27, 88, 87, 14);
			contentPanel.add(lblPrecio);
		}
		{
			JLabel lblCantidad = new JLabel("Cantidad");
			lblCantidad.setForeground(new Color(255, 0, 0));
			lblCantidad.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
			lblCantidad.setBounds(27, 137, 87, 14);
			contentPanel.add(lblCantidad);
		}
		{
			txtCantidad = new JTextField();
			txtCantidad.setBounds(124, 135, 109, 20);
			contentPanel.add(txtCantidad);
			txtCantidad.setColumns(10);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setEditable(false);
			txtPrecio.setBounds(124, 88, 109, 23);
			contentPanel.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			cboMarca = new JComboBox();
			cboMarca.addActionListener(this);
			cboMarca.addItemListener(this);
			cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Suavestar", "Springwall", "Paraiso", "Drimer", "Cisne"}));
			cboMarca.setBounds(124, 38, 109, 23);
			contentPanel.add(cboMarca);
		}
		{
			btnVender = new JButton("Vender");
			btnVender.setBorder(new LineBorder(new Color(255, 222, 173), 2));
			btnVender.setBackground(new Color(255, 0, 0));
			btnVender.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnVender.setForeground(new Color(255, 255, 0));
			btnVender.addActionListener(this);
			btnVender.setBounds(311, 55, 89, 30);
			contentPanel.add(btnVender);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.setBorder(new LineBorder(new Color(255, 255, 0), 2));
			btnCerrar.setBackground(new Color(255, 0, 0));
			btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnCerrar.setForeground(new Color(255, 255, 0));
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(311, 109, 89, 30);
			contentPanel.add(btnCerrar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(40, 173, 476, 216);
			contentPanel.add(scrollPane);
			{
				txtS = new JTextArea();
				txtS.setBorder(new LineBorder(new Color(220, 20, 60), 2));
				txtS.setForeground(new Color(0, 0, 0));
				txtS.setBackground(new Color(255, 255, 240));
				txtS.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 13));
				scrollPane.setViewportView(txtS);
			}
		}
		
		txtPrecio.setText(String.valueOf(Proyecto_ciclo01.precio0));
	}

	public void itemStateChanged(ItemEvent arg0) {
		if (arg0.getSource() == cboMarca) {
			itemStateChangedCboMarca(arg0);
		}
	}
	protected void itemStateChangedCboMarca(ItemEvent arg0) {
		
		int marca;
		marca=cboMarca.getSelectedIndex();
		
		if(marca==0) {
			txtPrecio.setText(String.valueOf(Proyecto_ciclo01.precio0));
		  
		}
		 else if(marca==1) {
			 txtPrecio.setText(String.valueOf(Proyecto_ciclo01.precio1));
	        
		 }
	      else if(marca==2) {
	        	 txtPrecio.setText(String.valueOf(Proyecto_ciclo01.precio2));
                
	      }
           else if(marca==3) {
     	         txtPrecio.setText(String.valueOf(Proyecto_ciclo01.precio3));
                
           }
           else {
          	      txtPrecio.setText(String.valueOf(Proyecto_ciclo01.precio4));
           }
		
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cboMarca) {
			actionPerformedCboMarca(arg0);
		}
		if (arg0.getSource() == btnVender) {
			actionPerformedBtnVender(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
	public void mensaje(String s) {
		JOptionPane.showMessageDialog(null, s);
	}
	protected void actionPerformedBtnVender(ActionEvent arg0) {
		
		String cantidad;
		cantidad = txtCantidad.getText();
		if(cantidad.trim().length()==0) {
			mensaje("Campo cantidad obligatorio");
			txtCantidad.requestFocus();
		}else if(cantidad.matches("\\d||\\d{2}")==false) {
			mensaje("Cantidad Incorrecta");
			txtCantidad.requestFocus();
		}else {
			
	
		String marc,obs,sorpre;
		double pre,impcom,impdes,imppag;
		int marca,can;
		
		can= Integer.parseInt(txtCantidad.getText());
		pre= Double.parseDouble(txtPrecio.getText());
		marca=cboMarca.getSelectedIndex();
		marc= cboMarca.getSelectedItem().toString();
		
			sor++;
		
			//Proceso
			impcom= pre * can;
			if(can>=1 && can<=5)
				impdes= (Proyecto_ciclo01.porcentaje1/100)*impcom;
			else if(can>=6 && can<=10)
				impdes= (Proyecto_ciclo01.porcentaje2/100)*impcom;
			else if(can>=11 && can<=15)
				impdes= (Proyecto_ciclo01.porcentaje3/100)*impcom;
			else
				impdes= (Proyecto_ciclo01.porcentaje4/100)*impcom;
			
			imppag=impcom-impdes;
			
			if(can>=Proyecto_ciclo01.cantidadMinimaObsequiable)
				obs= Proyecto_ciclo01.obsequio;
			else
				obs="No hay Premio";
			
			if(sor == Proyecto_ciclo01.numeroClienteSorpresa)
				sorpre= Proyecto_ciclo01.premioSorpresa;
			else
				sorpre="No hay premio";
			
			marca=cboMarca.getSelectedIndex();
			
			if(marca==0) {
				
				Proyecto_ciclo01.cantidadventas0++;
				Proyecto_ciclo01.cantidadTotal0+=can;
				Proyecto_ciclo01.ImporteTotal0+=imppag; 
				Proyecto_ciclo01.importegeneral+=imppag;
				Proyecto_ciclo01.cantidadGeneral++;
			}
			 else if(marca==1) {
				Proyecto_ciclo01.cantidadventas1++;
				Proyecto_ciclo01.cantidadTotal1+=can;
				Proyecto_ciclo01.ImporteTotal1+=imppag; 
				Proyecto_ciclo01.importegeneral+=imppag;
				Proyecto_ciclo01.cantidadGeneral++;
			 }
		      else if(marca==2) {
		    	  Proyecto_ciclo01.cantidadventas2++;
					Proyecto_ciclo01.cantidadTotal2+=can;
					Proyecto_ciclo01.ImporteTotal2+=imppag; 
					Proyecto_ciclo01.importegeneral+=imppag;
					Proyecto_ciclo01.cantidadGeneral++;
		      }
	           else if(marca==3) {
	     	        
	        	   Proyecto_ciclo01.cantidadventas3++;
					Proyecto_ciclo01.cantidadTotal3+=can;
					Proyecto_ciclo01.ImporteTotal3+=imppag; 
					Proyecto_ciclo01.importegeneral+=imppag;
					Proyecto_ciclo01.cantidadGeneral++;
	           }
	           else {
	        	    Proyecto_ciclo01.cantidadventas4++;
					Proyecto_ciclo01.cantidadTotal4+=can;
					Proyecto_ciclo01.ImporteTotal4+=imppag; 
					Proyecto_ciclo01.importegeneral+=imppag;
					Proyecto_ciclo01.cantidadGeneral++;
	           }


		
		    txtS.setText("\n");
		    txtS.append("Marca del Colchon              : "+marc+"\n");
		    txtS.append("Precio Unitario                : "+pre+"\n");
		    txtS.append("Cantidad de unidades adquiridas: "+can+"\n");
		    txtS.append("Importe de Compra              : "+impcom+"\n");
		    txtS.append("Importe de Descuento           : "+impdes+"\n");
		    txtS.append("Importe a Pagar                : "+imppag+"\n");
		    txtS.append("Obsequio                       : "+obs+"\n");
		    txtS.append("Premio Sorpresa                : "+sorpre+"\n");
		    txtS.append("Numero de cliente              : "+sor);
		}
		  
	}
		
		 
	
	protected void actionPerformedCboMarca(ActionEvent arg0) {
	}
}
