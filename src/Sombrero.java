import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Sombrero extends GraphicsProgram{
	private static int ANCHO_PANTALLA = 650;
	private static int ALTO_PANTALLA = 900;
	private static int ANCHO_SOMBRERO = 100;
	private static int ALTO_SOMBRERO = 50;
	private static int ANCHO_VISERA = 125;
	private static int ALTO_VISERA = 5;
	private static double HUECO = (ANCHO_VISERA - ANCHO_SOMBRERO)/2;
			
	GRect visera;
	GRect sombrero;
	
	public void init(){
		setSize(ANCHO_PANTALLA, ALTO_PANTALLA);
		GRect visera = new GRect (ANCHO_VISERA, ALTO_VISERA);
		visera.setFilled(true);
		visera.setFillColor(Color.BLACK);
		visera.setLocation(ANCHO_PANTALLA/2 - ANCHO_VISERA/2, 10 + ALTO_SOMBRERO);
		add(visera);
		
		GRect sombrero = new GRect (ANCHO_SOMBRERO, ALTO_SOMBRERO);
		sombrero.setFilled(true);
		sombrero.setFillColor(Color.BLACK);
		sombrero.setLocation(ANCHO_PANTALLA/2 - ANCHO_VISERA/2 + HUECO, 10);
		add(sombrero);
	}
}
