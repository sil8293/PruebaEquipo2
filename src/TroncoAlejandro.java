import java.awt.Color;

import acm.graphics.GImage;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;

public class TroncoAlejandro extends GraphicsProgram{



	private static int ANCHO_PANTALLA=650;
	private static int ALTO_PANTALLA=900;

	private static final int ANCHO_TORSO = 150;
	private static final int ALTO_TORSO = 150;
	
	private static final int ANCHO_BRAZO = 50;
	private static final int ALTO_BRAZO = 185;
	
	private static final int ALTO_CABEZA = 175;


	public void init(){
		setSize(ANCHO_PANTALLA, ALTO_PANTALLA);

		pintaTorso();
		pintaBrazoIzquierdo();
		pintaBrazoDerecho();

	}


	private void pintaTorso(){

		GRect torso = new GRect (ANCHO_TORSO, ALTO_TORSO);
		torso.setFilled(true);
		torso.setFillColor(Color.cyan);
		add(torso, ANCHO_PANTALLA/2 - ANCHO_TORSO/2, ALTO_CABEZA);

	}


	private void pintaBrazoIzquierdo(){
		
		GRect brazoIzquierdo = new GRect (ANCHO_BRAZO, ALTO_BRAZO);
		brazoIzquierdo.setFilled(true);
		brazoIzquierdo.setFillColor(Color.gray);
		add(brazoIzquierdo, ANCHO_PANTALLA/2 + ANCHO_TORSO/2, ALTO_CABEZA);

		
	}

	
	private void pintaBrazoDerecho(){
		
		GRect brazoDerecho = new GRect (ANCHO_BRAZO, ALTO_BRAZO);
		brazoDerecho.setFilled(true);
		brazoDerecho.setFillColor(Color.gray);
		add(brazoDerecho, ANCHO_PANTALLA/2 - ANCHO_TORSO/2 - 50, ALTO_CABEZA);
		
		
	}


}
