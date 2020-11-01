package Controlador;

import Modelo.Modelo;
import Vista.Vista;

public class Controlador {

	private Modelo modelo;
	private Vista vista;
	private ControladorPanelBienvenida controladorPanelBienvenida;
	private ControladorPanelGeneros controladorPanelGeneros;
	
	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		this.controladorPanelBienvenida = new ControladorPanelBienvenida(this.modelo, this.vista, this);
		this.navegarPanelBienvenida();
		//this.controladorPanelGeneros = new ControladorPanelGeneros(this.modelo, this.vista, this);
	}
	
	public void navegarPanelBienvenida() {
		System.out.println("Navegar panel Bienvenida");
		this.controladorPanelBienvenida.mostrarPanelBienvenida();
	}
	
	/*ControladorPanelBienvenida makeControladorBienvenida(Modelo modelo, Vista vista, Controlador controlador) {
		return new ControladorPanelBienvenida(this.modelo, this.vista, this);
	}*/
}
