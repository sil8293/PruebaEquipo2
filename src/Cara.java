
import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class Cara extends acm.program.GraphicsProgram {
	
	private static final int ANCHO_CARA = 100;
	private static final int ANCHO_BOCA = 30;
	private static final int ALTO_BOCA = 10;
	private static final int ANCHO_PANTALLA = 650;
	private static final int ALTO_PANTALLA= 900;
	private static final int OJOS = 30;
	private static final int PUPILAS = 10;
	private static final int ANCHO_CUELLO = 45;
	private static final int ALTO_CUELLO = 10;
	private static final int ALTO_SOMBRERO = 65;
	private static final int ANCHO_OREJAS = 9;
	private static final int ALTO_OREJAS = 25;
	
	
	public void init(){
		setSize(ANCHO_PANTALLA, ALTO_PANTALLA);
	}
		
	
public void run(){

		GRect cara = new GRect(ANCHO_CARA,ANCHO_CARA);
		cara.setFillColor(Color.lightGray);
		cara.setFilled(true);
		cara.setLocation(ANCHO_PANTALLA/2-ANCHO_CARA/2,ALTO_SOMBRERO);
		
		add(cara);
		
		
		
		
		GRect boca = new GRect(ANCHO_BOCA,ALTO_BOCA);
		boca.setFillColor(Color.red);
		boca.setFilled(true);
		boca.setLocation(ANCHO_PANTALLA/2-ANCHO_BOCA/2, ALTO_SOMBRERO+ANCHO_CARA-ANCHO_CARA/4);
		
		add(boca);
		
		GRect oreja = new GRect(ANCHO_OREJAS,ALTO_OREJAS);
		oreja.setFillColor(Color.lightGray);
		oreja.setFilled(true);
		oreja.setLocation(ANCHO_PANTALLA/2-ANCHO_CARA/2-ANCHO_OREJAS, ALTO_SOMBRERO+ANCHO_CARA-ANCHO_CARA/2-ALTO_OREJAS/2);
		
		add(oreja);
		
		
		GRect oreja2 = new GRect(ANCHO_OREJAS,ALTO_OREJAS);
		oreja2.setFillColor(Color.lightGray);
		oreja2.setFilled(true);
		oreja2.setLocation(ANCHO_PANTALLA/2+ANCHO_CARA/2, ALTO_SOMBRERO+ANCHO_CARA-ANCHO_CARA/2-ALTO_OREJAS/2);
		
		add(oreja2);
		
		GOval ojo = new GOval(OJOS,OJOS);
		ojo.setFillColor(Color.white);
		ojo.setFilled(true);
		ojo.setLocation(ANCHO_PANTALLA/2-OJOS-4,ALTO_SOMBRERO+ANCHO_CARA-ANCHO_CARA+20);
		
		add(ojo);
		
		
		
		GOval ojo2 = new GOval(OJOS,OJOS);
		ojo2.setFillColor(Color.white);
		ojo2.setFilled(true);
		ojo2.setLocation(ANCHO_PANTALLA/2+4,ALTO_SOMBRERO+ANCHO_CARA-ANCHO_CARA+20);
		
		add(ojo2);
		
		
		
		GOval pupila1 = new GOval(PUPILAS,PUPILAS);
		pupila1.setFilled(true);
		pupila1.setLocation(ANCHO_PANTALLA/2-PUPILAS-4,ALTO_SOMBRERO+ANCHO_CARA-ANCHO_CARA+30);
		
		add(pupila1);
		
		
		
		GOval pupila2 = new GOval(PUPILAS,PUPILAS);
		pupila2.setFilled(true);
		pupila2.setLocation(ANCHO_PANTALLA/2+4,ALTO_SOMBRERO+ANCHO_CARA-ANCHO_CARA+30);
		
		add(pupila2);
		
		GRect cuello = new GRect(ANCHO_CUELLO,ALTO_CUELLO);
		cuello.setFillColor(Color.lightGray);
		cuello.setFilled(true);
		cuello.setLocation(ANCHO_PANTALLA/2-ANCHO_CUELLO/2,ANCHO_CARA+ALTO_SOMBRERO);
		
		add(cuello);
		
	}

}


