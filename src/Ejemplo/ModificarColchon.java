package Ejemplo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class ModificarColchon extends JDialog implements ItemListener, ActionListener {
	
	

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtGarantia;
	private JTextField txtTamaño;
	private JTextField txtMaterial;
	private JComboBox cboMarca;
	private JButton btnGrabar;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ModificarColchon dialog = new ModificarColchon();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ModificarColchon() {
		setModal(true);
		setTitle("Modificar Colchon");
		setBounds(100, 100, 476, 275);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 206, 209));
		contentPanel.setBorder(new LineBorder(new Color(0, 139, 139), 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("Marca");
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		label.setForeground(new Color(255, 0, 0));
		label.setBounds(10, 40, 79, 14);
		contentPanel.add(label);
		
		cboMarca = new JComboBox();
		cboMarca.addActionListener(this);
		cboMarca.addItemListener(this);
		cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Suavestar", "Springwall", "Paraiso", "Drimer", "Cisne"}));
		cboMarca.setBounds(99, 37, 100, 22);
		contentPanel.add(cboMarca);
		
		JLabel label_1 = new JLabel("Precio (s/)");
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		label_1.setForeground(new Color(255, 0, 0));
		label_1.setBounds(10, 72, 79, 14);
		contentPanel.add(label_1);
		
		txtPrecio = new JTextField();
		txtPrecio.setText("499.0");
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(99, 70, 100, 20);
		contentPanel.add(txtPrecio);
		
		JLabel label_2 = new JLabel("Garant\u00EDa");
		label_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		label_2.setForeground(new Color(255, 0, 0));
		label_2.setBounds(10, 107, 79, 14);
		contentPanel.add(label_2);
		
		txtGarantia = new JTextField();
		txtGarantia.setText("7");
		txtGarantia.setColumns(10);
		txtGarantia.setBounds(99, 101, 100, 20);
		contentPanel.add(txtGarantia);
		
		JLabel label_3 = new JLabel("Tama\u00F1o");
		label_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		label_3.setForeground(new Color(255, 0, 0));
		label_3.setBounds(10, 134, 79, 14);
		contentPanel.add(label_3);
		
		txtTamaño = new JTextField();
		txtTamaño.setText("1 1/2 Plaza");
		txtTamaño.setColumns(10);
		txtTamaño.setBounds(99, 132, 100, 20);
		contentPanel.add(txtTamaño);
		
		JLabel label_4 = new JLabel("Material");
		label_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		label_4.setForeground(new Color(255, 0, 0));
		label_4.setBounds(10, 171, 79, 14);
		contentPanel.add(label_4);
		
		txtMaterial = new JTextField();
		txtMaterial.setText("Tela Tricot Acolchada");
		txtMaterial.setColumns(10);
		txtMaterial.setBounds(99, 169, 281, 20);
		contentPanel.add(txtMaterial);
		
		button = new JButton("Cerrar");
		button.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		button.setBackground(new Color(255, 0, 0));
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setForeground(new Color(255, 255, 0));
		button.addActionListener(this);
		button.setBounds(260, 58, 89, 28);
		contentPanel.add(button);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		btnGrabar.setBackground(new Color(255, 0, 0));
		btnGrabar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGrabar.setForeground(new Color(255, 255, 0));
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(260, 104, 89, 28);
		contentPanel.add(btnGrabar);
		
		
		//listar en los texbox
		txtPrecio.setText(String.valueOf(Proyecto_ciclo01.precio0));
		txtGarantia.setText(String.valueOf(Proyecto_ciclo01.garantia0));
		txtTamaño.setText(Proyecto_ciclo01.tamaño0);
		txtMaterial.setText(Proyecto_ciclo01.material0);
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
           else  {
          	      txtPrecio.setText(String.valueOf(Proyecto_ciclo01.precio4));
                  txtGarantia.setText(String.valueOf(Proyecto_ciclo01.garantia4));
                   txtTamaño.setText(Proyecto_ciclo01.tamaño4);
                   txtMaterial.setText(Proyecto_ciclo01.material4);
           }
		
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cboMarca) {
			actionPerformedCboMarca(arg0);
		}
		if (arg0.getSource() == button) {
			actionPerformedButton(arg0);
		}
		if (arg0.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(arg0);
		}
	}
	protected void actionPerformedBtnGrabar(ActionEvent arg0) {
		
		int marca;
		marca=cboMarca.getSelectedIndex();
		
		if(marca==0) {
			Proyecto_ciclo01.precio0 = Double.parseDouble(txtPrecio.getText());
			Proyecto_ciclo01.garantia0 = Integer.parseInt(txtGarantia.getText());
			Proyecto_ciclo01.tamaño0 = txtTamaño.getText();
			Proyecto_ciclo01.material0 = txtMaterial.getText();
		}
		 else if(marca==1) {
			 Proyecto_ciclo01.precio1 = Double.parseDouble(txtPrecio.getText());
				Proyecto_ciclo01.garantia1 = Integer.parseInt(txtGarantia.getText());
				Proyecto_ciclo01.tamaño1 = txtTamaño.getText();
				Proyecto_ciclo01.material1 = txtMaterial.getText();
		 }
	      else if(marca==2) {
	    	  Proyecto_ciclo01.precio2 = Double.parseDouble(txtPrecio.getText());
				Proyecto_ciclo01.garantia2 = Integer.parseInt(txtGarantia.getText());
				Proyecto_ciclo01.tamaño2 = txtTamaño.getText();
				Proyecto_ciclo01.material2 = txtMaterial.getText();
	      }
           else if(marca==3) {
        	Proyecto_ciclo01.precio3 = Double.parseDouble(txtPrecio.getText());
   			Proyecto_ciclo01.garantia3 = Integer.parseInt(txtGarantia.getText());
   			Proyecto_ciclo01.tamaño3 = txtTamaño.getText();
   			Proyecto_ciclo01.material3 = txtMaterial.getText();
           }
           else {
        	   Proyecto_ciclo01.precio4 = Double.parseDouble(txtPrecio.getText());
   			Proyecto_ciclo01.garantia4 = Integer.parseInt(txtGarantia.getText());
   			Proyecto_ciclo01.tamaño4 = txtTamaño.getText();
   			Proyecto_ciclo01.material4 = txtMaterial.getText();
           }
		
		dispose();
		
		
	}
	protected void actionPerformedButton(ActionEvent arg0) {
		
		dispose();
	}
	protected void actionPerformedCboMarca(ActionEvent arg0) {
	}
}
