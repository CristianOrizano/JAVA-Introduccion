package Ejemplo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class ConfigurarObsequio extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCantidad;
	private JTextField txtObsequio;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarObsequio dialog = new ConfigurarObsequio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarObsequio() {
		setModal(true);
		setTitle("Configurar Obsequio");
		setBounds(100, 100, 490, 251);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 206, 209));
		contentPanel.setBorder(new LineBorder(new Color(0, 139, 139), 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCantidadMinimaDe = new JLabel("Cantidad minima de colchones adquiridos");
			lblCantidadMinimaDe.setForeground(new Color(255, 0, 0));
			lblCantidadMinimaDe.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblCantidadMinimaDe.setBounds(10, 43, 267, 14);
			contentPanel.add(lblCantidadMinimaDe);
		}
		{
			txtCantidad = new JTextField();
			txtCantidad.setBounds(287, 40, 117, 20);
			contentPanel.add(txtCantidad);
			txtCantidad.setColumns(10);
		}
		{
			JLabel lblObsequio = new JLabel("Obsequio");
			lblObsequio.setForeground(new Color(255, 0, 0));
			lblObsequio.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblObsequio.setBounds(154, 85, 100, 14);
			contentPanel.add(lblObsequio);
		}
		{
			txtObsequio = new JTextField();
			txtObsequio.setBounds(287, 83, 117, 20);
			contentPanel.add(txtObsequio);
			txtObsequio.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.setBorder(new LineBorder(new Color(255, 255, 0), 2));
			btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnAceptar.setBackground(new Color(255, 0, 0));
			btnAceptar.setForeground(new Color(255, 255, 0));
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(100, 137, 89, 33);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setBorder(new LineBorder(new Color(255, 255, 0), 2));
			btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnCancelar.setBackground(new Color(255, 0, 0));
			btnCancelar.setForeground(new Color(255, 255, 0));
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(233, 137, 89, 33);
			contentPanel.add(btnCancelar);
		}
		
		txtCantidad.setText(String.valueOf(Proyecto_ciclo01.cantidadMinimaObsequiable));
		txtObsequio.setText(String.valueOf(Proyecto_ciclo01.obsequio));
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(arg0);
		}
		if (arg0.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(arg0);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent arg0) {
		
		Proyecto_ciclo01.cantidadMinimaObsequiable= Integer.parseInt(txtCantidad.getText());
		Proyecto_ciclo01.obsequio= txtObsequio.getText();
		dispose();
		
	}
	protected void actionPerformedBtnCancelar(ActionEvent arg0) {
		dispose();
	}
}
