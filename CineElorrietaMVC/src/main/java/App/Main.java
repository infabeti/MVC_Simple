package App;
import Controlador.Controlador;
import Modelo.*;
import Modelo.Modelo;
import Vista.Vista;

public class Main {
	
	private static Modelo modelo;
	private static Vista vista;
	@SuppressWarnings("unused")
	private static Controlador controlador;
	
	public static void main(String[] args) {
		modelo = new Modelo();    
		vista = new Vista();
                
		controlador = new Controlador(modelo, vista);
	}

}
