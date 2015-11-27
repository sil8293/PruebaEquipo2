import java.awt.Color;

import acm.graphics.GCompound;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;


public class Piernas extends GCompound {

	private static final int ALTO_PIERNA = 180;
	private static final int ANCHO_PIERNA = 75;
	
	private static final int ALTO_ZAPATO = 70;
	private static final int ANCHO_ZAPATO = 130;
	
	private static final int AJUSTE = 325;
	
	 GRect pierna = new GRect(ANCHO_PIERNA, ALTO_PIERNA);
	 GRect pierna2 = new GRect(ANCHO_PIERNA, ALTO_PIERNA);
	 
	 GRect zapato = new GRect(ANCHO_ZAPATO, ALTO_ZAPATO);
	 GRect zapato2 = new GRect(ANCHO_ZAPATO, ALTO_ZAPATO);
	 
	
	public void run(){
		
		add(pierna, getWidth()/2, AJUSTE);
		pierna.setFilled(true);
		pierna.setFillColor(Color.lightGray);
		add(pierna2,getWidth()/2 + pierna.getWidth(), AJUSTE);
		pierna2.setFilled(true);
		pierna2.setFillColor(Color.lightGray);
		add(zapato,getWidth()/2 + pierna.getWidth()/2 + ANCHO_PIERNA/2 + 1,ALTO_PIERNA + AJUSTE);
		zapato.setFilled(true);
		zapato.setFillColor(Color.BLACK);
		add(zapato2,getWidth()/2 + pierna.getWidth()/2 + ANCHO_PIERNA/2-ANCHO_ZAPATO - 1 ,ALTO_PIERNA + AJUSTE);
		zapato2.setFilled(true);
		zapato2.setFillColor(Color.BLACK);
		
	
	}
	
	
	
	
}
