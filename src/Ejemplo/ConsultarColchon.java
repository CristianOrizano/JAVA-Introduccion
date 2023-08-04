package Ejemplo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class ConsultarColchon extends JDialog implements ItemListener, ActionListener {

	
	
	private final JPanel contentPanel = new JPanel();
	private JTextField txtMaterial;
	private JTextField txtTamaño;
	private JTextField txtGarantia;
	private JTextField txtPrecio;
	private JComboBox cboMarca;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConsultarColchon dialog = new ConsultarColchon();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConsultarColchon() {
		setModal(true);
		setTitle("Consultar Colchon");
		setBounds(100, 100, 487, 280);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setToolTipText("");
		contentPanel.setBackground(new Color(0, 206, 209));
		contentPanel.setBorder(new LineBorder(new Color(0, 128, 128), 6, true));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("Marca");
		label.setForeground(new Color(255, 0, 0));
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		label.setBounds(26, 33, 77, 14);
		contentPanel.add(label);
		
		JLabel label_1 = new JLabel("Precio (s/)");
		label_1.setForeground(new Color(255, 0, 0));
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		label_1.setBounds(26, 71, 77, 14);
		contentPanel.add(label_1);
		
		JLabel label_2 = new JLabel("Garant\u00EDa");
		label_2.setForeground(new Color(255, 0, 0));
		label_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		label_2.setBounds(26, 96, 77, 22);
		contentPanel.add(label_2);
		
		JLabel label_3 = new JLabel("Tama\u00F1o");
		label_3.setForeground(new Color(255, 0, 0));
		label_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		label_3.setBounds(26, 133, 77, 14);
		contentPanel.add(label_3);
		
		JLabel label_4 = new JLabel("Material");
		label_4.setForeground(new Color(255, 0, 0));
		label_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		label_4.setBounds(26, 164, 77, 14);
		contentPanel.add(label_4);
		
		txtMaterial = new JTextField();
		txtMaterial.setBackground(new Color(255, 248, 220));
		txtMaterial.setEditable(false);
		txtMaterial.setColumns(10);
		txtMaterial.setBounds(113, 161, 281, 20);
		contentPanel.add(txtMaterial);
		
		txtTamaño = new JTextField();
		txtTamaño.setBackground(new Color(255, 248, 220));
		txtTamaño.setEditable(false);
		txtTamaño.setColumns(10);
		txtTamaño.setBounds(113, 130, 100, 20);
		contentPanel.add(txtTamaño);
		
		txtGarantia = new JTextField();
		txtGarantia.setBackground(new Color(255, 248, 220));
		txtGarantia.setEditable(false);
		txtGarantia.setColumns(10);
		txtGarantia.setBounds(113, 99, 100, 20);
		contentPanel.add(txtGarantia);
		
		txtPrecio = new JTextField();
		txtPrecio.setBackground(new Color(255, 248, 220));
		txtPrecio.setEditable(false);
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(113, 68, 100, 20);
		contentPanel.add(txtPrecio);
		
		cboMarca = new JComboBox();
		cboMarca.setFont(new Font("Tahoma", Font.BOLD, 12));
		cboMarca.setForeground(new Color(220, 20, 60));
		cboMarca.setBackground(new Color(255, 218, 185));
		cboMarca.addActionListener(this);
		cboMarca.addItemListener(this);
		cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Suavestar", "Springwall", "Paraiso", "Drimer", "Cisne"}));
		cboMarca.setBounds(113, 30, 100, 22);
		contentPanel.add(cboMarca);
		
		button = new JButton("Cerrar");
		button.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		button.setBackground(new Color(255, 0, 0));
		button.setForeground(new Color(255, 255, 0));
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.addActionListener(this);
		button.setBounds(279, 67, 89, 30);
		contentPanel.add(button);
		
		
	   cboMarca.setSelectedIndex(0);
	}
	
	public void itemStateChanged(ItemEvent arg0) {
		if (arg0.getSource() == cboMarca) {
			itemStateChangedCboMarca(arg0);
		}
	}
	protected void itemStateChangedCboMarca(ItemEvent arg0) {
		
		
		
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cboMarca) {
			actionPerformedCboMarca(arg0);
		}
		if (arg0.getSource() == button) {
			actionPerformedButton(arg0);
		}
	}
	protected void actionPerformedButton(ActionEvent arg0) {
		dispose();
	}
	protected void actionPerformedCboMarca(ActionEvent arg0) {
		
		int marca;
		marca=cboMarca.getSelectedIndex();
		 
		if(marca==0) {
			txtPrecio.setText(String.valueOf(Proyecto_ciclo01.precio0));
		    txtGarantia.setText(String.valueOf(Proyecto_ciclo01.garantia0));
		    txtTamaño.setText(Proyecto_ciclo01.tamaño0);
		    txtMaterial.setText(Proyecto_ciclo01.material0);
		}
		 else if(marca==1) {
			 txtPrecio.setText(String.valueOf(Proyecto_ciclo01.precio1));
	         txtGarantia.setText(String.valueOf(Proyecto_ciclo01.garantia1));
	         txtTamaño.setText(Proyecto_ciclo01.tamaño1);
	         txtMaterial.setText(Proyecto_ciclo01.material1);
		 }
	      else if(marca==2) {
	        	 txtPrecio.setText(String.valueOf(Proyecto_ciclo01.precio2));
                 txtGarantia.setText(String.valueOf(Proyecto_ciclo01.garantia2));
                 txtTamaño.setText(Proyecto_ciclo01.tamaño2);
                 txtMaterial.setText(Proyecto_ciclo01.material2);
	      }
           else if(marca==3) {
     	         txtPrecio.setText(String.valueOf(Proyecto_ciclo01.precio3));
                 txtGarantia.setText(String.valueOf(Proyecto_ciclo01.garantia3));
                 txtTamaño.setText(Proyecto_ciclo01.tamaño3);
                 txtMaterial.setText(Proyecto_ciclo01.material3);
           }
           else if(marca==4) {
          	      txtPrecio.setText(String.valueOf(Proyecto_ciclo01.precio4));
                  txtGarantia.setText(String.valueOf(Proyecto_ciclo01.garantia4));
                   txtTamaño.setText(Proyecto_ciclo01.tamaño4);
                   txtMaterial.setText(Proyecto_ciclo01.material4);
           }
		
	}
}
