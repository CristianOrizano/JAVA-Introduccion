package Ejemplo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class AcercaTienda extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AcercaTienda dialog = new AcercaTienda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AcercaTienda() {
		setModal(true);
		setTitle("Autor");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(64, 224, 208));
		contentPanel.setBorder(new LineBorder(new Color(0, 128, 128), 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblAutor = new JLabel("Autor");
			lblAutor.setForeground(new Color(255, 0, 0));
			lblAutor.setFont(new Font("Sylfaen", Font.BOLD, 26));
			lblAutor.setBounds(169, 36, 89, 32);
			contentPanel.add(lblAutor);
		}
		{
			JLabel lblCristianOrizanoHuhua = new JLabel("CRISTIAN ORIZANO HUYHUA");
			lblCristianOrizanoHuhua.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
			lblCristianOrizanoHuhua.setBounds(101, 109, 239, 14);
			contentPanel.add(lblCristianOrizanoHuhua);
		}
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCerrar.setForeground(Color.YELLOW);
		btnCerrar.setBackground(Color.RED);
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(169, 179, 89, 32);
		contentPanel.add(btnCerrar);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
}
