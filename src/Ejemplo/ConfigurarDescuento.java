package Ejemplo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class ConfigurarDescuento extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPor1;
	private JTextField txtPor2;
	private JTextField txtPor3;
	private JTextField txtPor4;
	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarDescuento dialog = new ConfigurarDescuento();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarDescuento() {
		setModal(true);
		setTitle("Confugurar Descuento");
		setBounds(100, 100, 480, 310);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 206, 209));
		contentPanel.setBorder(new LineBorder(new Color(0, 128, 128), 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblA = new JLabel("1 a 5 Unidades");
		lblA.setForeground(new Color(255, 0, 0));
		lblA.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		lblA.setBounds(35, 52, 118, 14);
		contentPanel.add(lblA);
		
		JLabel lblA_1 = new JLabel("6 a 10 Unidades");
		lblA_1.setForeground(new Color(255, 0, 0));
		lblA_1.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		lblA_1.setBounds(35, 102, 118, 14);
		contentPanel.add(lblA_1);
		
		JLabel lblA_2 = new JLabel("11 a 15 Unidades");
		lblA_2.setForeground(new Color(255, 0, 0));
		lblA_2.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		lblA_2.setBounds(35, 152, 118, 14);
		contentPanel.add(lblA_2);
		
		JLabel lblMasDe = new JLabel("Mas de 15 unidades");
		lblMasDe.setForeground(new Color(255, 0, 0));
		lblMasDe.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		lblMasDe.setBounds(35, 202, 133, 14);
		contentPanel.add(lblMasDe);
		
		txtPor1 = new JTextField();
		txtPor1.setBounds(182, 49, 64, 20);
		contentPanel.add(txtPor1);
		txtPor1.setColumns(10);
		
		txtPor2 = new JTextField();
		txtPor2.setBounds(182, 99, 64, 20);
		contentPanel.add(txtPor2);
		txtPor2.setColumns(10);
		
		txtPor3 = new JTextField();
		txtPor3.setBounds(182, 149, 64, 20);
		contentPanel.add(txtPor3);
		txtPor3.setColumns(10);
		
		txtPor4 = new JTextField();
		txtPor4.setBounds(182, 199, 64, 20);
		contentPanel.add(txtPor4);
		txtPor4.setColumns(10);
		
		JLabel label = new JLabel("%");
		label.setBounds(256, 52, 46, 14);
		contentPanel.add(label);
		
		JLabel label_1 = new JLabel("%");
		label_1.setBounds(256, 102, 46, 14);
		contentPanel.add(label_1);
		
		JLabel label_2 = new JLabel("%");
		label_2.setBounds(256, 152, 46, 14);
		contentPanel.add(label_2);
		
		JLabel label_3 = new JLabel("%");
		label_3.setBounds(256, 202, 46, 14);
		contentPanel.add(label_3);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		btnAceptar.addActionListener(this);
		btnAceptar.setBackground(new Color(255, 0, 0));
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnAceptar.setForeground(new Color(255, 255, 0));
		btnAceptar.setBounds(326, 48, 89, 23);
		contentPanel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		btnCancelar.addActionListener(this);
		btnCancelar.setBackground(new Color(255, 0, 0));
		btnCancelar.setForeground(new Color(255, 255, 0));
		btnCancelar.setBounds(326, 98, 89, 23);
		contentPanel.add(btnCancelar);
		
		//Asignar alos texbox
		txtPor1.setText(String.valueOf(Proyecto_ciclo01.porcentaje1));
		txtPor2.setText(String.valueOf(Proyecto_ciclo01.porcentaje2));
		txtPor3.setText(String.valueOf(Proyecto_ciclo01.porcentaje3));
		txtPor4.setText(String.valueOf(Proyecto_ciclo01.porcentaje4));
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(arg0);
		}
		if (arg0.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(arg0);
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent arg0) {
		dispose();
	}
	protected void actionPerformedBtnAceptar(ActionEvent arg0) {
		
		Proyecto_ciclo01.porcentaje1= Double.parseDouble(txtPor1.getText());
		Proyecto_ciclo01.porcentaje2= Double.parseDouble(txtPor2.getText());
		Proyecto_ciclo01.porcentaje3= Double.parseDouble(txtPor3.getText());
		Proyecto_ciclo01.porcentaje4= Double.parseDouble(txtPor4.getText());
		dispose();
	}
}
