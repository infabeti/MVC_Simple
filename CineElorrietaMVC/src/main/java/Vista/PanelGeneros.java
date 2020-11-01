package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlador.ControladorPanelGeneros;

@SuppressWarnings("serial")
public class PanelGeneros extends JPanel {

	private JButton btnVolver;
	private JLabel lblGeneros;
	private ControladorPanelGeneros controladorPanelGeneros;
	
	public PanelGeneros(ControladorPanelGeneros controladorPanelGeneros)
	{
		this.controladorPanelGeneros = controladorPanelGeneros;
		
		setLayout(null);
		
		lblGeneros = new JLabel("Panel Generos");
		lblGeneros.setBounds(58, 35, 115, 14);
		add(lblGeneros);
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(58, 62, 89, 23);
		add(btnVolver);
	}
}
