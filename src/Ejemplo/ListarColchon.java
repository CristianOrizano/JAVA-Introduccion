package Ejemplo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

public class ListarColchon extends JDialog implements ActionListener, WindowListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnCerrar;
	private JButton btnListar;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListarColchon dialog = new ListarColchon();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListarColchon() {
		setModal(true);
		addWindowListener(this);
		setTitle("Listar Colchon");
		setBounds(100, 100, 585, 532);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 206, 209));
		contentPanel.setBorder(new LineBorder(new Color(0, 128, 128), 6));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(53, 21, 453, 351);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		txtS.setBorder(new LineBorder(new Color(255, 0, 0), 3));
		txtS.setBackground(new Color(255, 255, 240));
		txtS.setForeground(new Color(0, 0, 0));
		txtS.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 14));
		scrollPane.setViewportView(txtS);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnCerrar.setBackground(new Color(255, 0, 0));
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCerrar.setForeground(new Color(255, 255, 0));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(134, 402, 89, 34);
		contentPanel.add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnListar.setBackground(new Color(255, 0, 0));
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnListar.setForeground(new Color(255, 255, 0));
		btnListar.addActionListener(this);
		btnListar.setBounds(295, 402, 89, 34);
		contentPanel.add(btnListar);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		
		dispose();
	}
	protected void actionPerformedBtnListar(ActionEvent arg0) {
		
		
		txtS.setText("Listado de Colchones\n");
		txtS.append("\n");
		txtS.append("Marca   : "+Proyecto_ciclo01.marca0+"\n");
		txtS.append("Precio  : "+Proyecto_ciclo01.precio0+"\n");
		txtS.append("Garantia: "+Proyecto_ciclo01.garantia0+"\n");
		txtS.append("Tamaño  : "+Proyecto_ciclo01.tamaño0+"\n");
		txtS.append("Material: "+Proyecto_ciclo01.material0+"\n");
		txtS.append("\n");
		txtS.append("Marca   : "+Proyecto_ciclo01.marca1+"\n");
		txtS.append("Precio  : "+Proyecto_ciclo01.precio1+"\n");
		txtS.append("Garantia: "+Proyecto_ciclo01.garantia1+"\n");
		txtS.append("Tamaño  : "+Proyecto_ciclo01.tamaño1+"\n");
		txtS.append("Material: "+Proyecto_ciclo01.material1+"\n");
		txtS.append("\n");
		txtS.append("Marca   : "+Proyecto_ciclo01.marca2+"\n");
		txtS.append("Precio  : "+Proyecto_ciclo01.precio2+"\n");
		txtS.append("Garantia: "+Proyecto_ciclo01.garantia2+"\n");
		txtS.append("Tamaño  : "+Proyecto_ciclo01.tamaño2+"\n");
		txtS.append("Material: "+Proyecto_ciclo01.material2+"\n");
		txtS.append("\n");
		txtS.append("Marca   : "+Proyecto_ciclo01.marca3+"\n");
		txtS.append("Precio  : "+Proyecto_ciclo01.precio3+"\n");
		txtS.append("Garantia: "+Proyecto_ciclo01.garantia3+"\n");
		txtS.append("Tamaño  : "+Proyecto_ciclo01.tamaño3+"\n");
		txtS.append("Material: "+Proyecto_ciclo01.material3+"\n");
		txtS.append("\n");
		txtS.append("Marca   : "+Proyecto_ciclo01.marca4+"\n");
		txtS.append("Precio  : "+Proyecto_ciclo01.precio4+"\n");
		txtS.append("Garantia: "+Proyecto_ciclo01.garantia4+"\n");
		txtS.append("Tamaño  : "+Proyecto_ciclo01.tamaño4+"\n");
		txtS.append("Material: "+Proyecto_ciclo01.material4+"\n");
		
		
		
	}
	public void windowActivated(WindowEvent arg0) {
		if (arg0.getSource() == this) {
			windowActivatedThis(arg0);
		}
	}
	public void windowClosed(WindowEvent arg0) {
	}
	public void windowClosing(WindowEvent arg0) {
	}
	public void windowDeactivated(WindowEvent arg0) {
	}
	public void windowDeiconified(WindowEvent arg0) {
	}
	public void windowIconified(WindowEvent arg0) {
	}
	public void windowOpened(WindowEvent arg0) {
	}
	protected void windowActivatedThis(WindowEvent arg0) {
		
		ListarColchon chon= new ListarColchon();
		chon.setLocationRelativeTo(this);
	}
}
