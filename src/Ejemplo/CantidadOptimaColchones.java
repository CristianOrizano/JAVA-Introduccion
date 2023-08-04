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

public class CantidadOptimaColchones extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtOptima;
	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CantidadOptimaColchones dialog = new CantidadOptimaColchones();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CantidadOptimaColchones() {
		setModal(true);
		setTitle("configurar colchones optimos");
		setBounds(100, 100, 450, 255);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 206, 209));
		contentPanel.setBorder(new LineBorder(new Color(0, 139, 139), 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCantidadOptimaDe = new JLabel("Cantidad Optima de colchones Vendidos");
			lblCantidadOptimaDe.setForeground(new Color(255, 0, 0));
			lblCantidadOptimaDe.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
			lblCantidadOptimaDe.setBounds(20, 37, 229, 14);
			contentPanel.add(lblCantidadOptimaDe);
		}
		{
			txtOptima = new JTextField();
			txtOptima.setBounds(264, 34, 86, 20);
			contentPanel.add(txtOptima);
			txtOptima.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.setForeground(new Color(255, 255, 0));
			btnAceptar.setBackground(new Color(255, 0, 0));
			btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(72, 112, 89, 33);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setForeground(new Color(255, 255, 0));
			btnCancelar.setBackground(new Color(255, 0, 0));
			btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(235, 112, 89, 33);
			contentPanel.add(btnCancelar);
		}
		
		txtOptima.setText(String.valueOf(Proyecto_ciclo01.cantidadOptima));
		
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
		
		Proyecto_ciclo01.cantidadOptima = Integer.parseInt(txtOptima.getText());
		dispose();
	}
}
