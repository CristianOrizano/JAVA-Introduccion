package Ejemplo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class ConfigurarPremioSorpresa extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCliente;
	private JTextField txtSorpresa;
	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarPremioSorpresa dialog = new ConfigurarPremioSorpresa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarPremioSorpresa() {
		setModal(true);
		setTitle("Configurar premio sorpresa");
		setBounds(100, 100, 450, 215);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 206, 209));
		contentPanel.setBorder(new LineBorder(new Color(0, 139, 139), 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNumeroDeCliente = new JLabel("Numero de Cliente");
			lblNumeroDeCliente.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNumeroDeCliente.setForeground(new Color(255, 0, 0));
			lblNumeroDeCliente.setBounds(16, 53, 128, 14);
			contentPanel.add(lblNumeroDeCliente);
		}
		{
			JLabel lblPremioSorpresa = new JLabel("Premio Sorpresa");
			lblPremioSorpresa.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblPremioSorpresa.setForeground(new Color(255, 0, 0));
			lblPremioSorpresa.setBounds(16, 104, 128, 14);
			contentPanel.add(lblPremioSorpresa);
		}
		{
			txtCliente = new JTextField();
			txtCliente.setBounds(154, 51, 118, 20);
			contentPanel.add(txtCliente);
			txtCliente.setColumns(10);
		}
		{
			txtSorpresa = new JTextField();
			txtSorpresa.setBounds(154, 102, 118, 20);
			contentPanel.add(txtSorpresa);
			txtSorpresa.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.setBackground(new Color(255, 0, 0));
			btnAceptar.setBorder(new LineBorder(new Color(255, 255, 0), 2));
			btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnAceptar.setForeground(new Color(255, 255, 0));
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(310, 49, 89, 31);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setBackground(new Color(255, 0, 0));
			btnCancelar.setBorder(new LineBorder(new Color(255, 255, 0), 2));
			btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnCancelar.setForeground(new Color(255, 255, 0));
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(310, 100, 89, 31);
			contentPanel.add(btnCancelar);
		}
		
		txtCliente.setText(String.valueOf(Proyecto_ciclo01.numeroClienteSorpresa));
		txtSorpresa.setText(String.valueOf(Proyecto_ciclo01.premioSorpresa));
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
		
		Proyecto_ciclo01.numeroClienteSorpresa= Integer.parseInt(txtCliente.getText());
		Proyecto_ciclo01.premioSorpresa= txtSorpresa.getText();
		dispose();
	}
}
