package com.u_tad.dawe.model;

public class JugadorBalonMano {

	private String nombre;
	private int dorsal;
	private int anotacion;
	private int bloqueo;
	private int tiempoJugado;

	public JugadorBalonMano(String nombre, int dorsal) {
		this.nombre=nombre;
		this.dorsal=dorsal;
	}

	public void setAnotacion(int anotacion) {
		this.anotacion = anotacion;
	}

	public void setBloqueo(int bloqueo) {
		this.bloqueo = bloqueo;
	}

	public void setTiempoJugado(int tiempoJugado) {
		this.tiempoJugado = tiempoJugado;
	}

	@Override
	public String toString() {
		return "JugadorBalonMano [nombre=" + nombre + ", dorsal=" + dorsal + ", anotacion=" + anotacion + ", bloqueo="
				+ bloqueo + ", tiempoJugado=" + tiempoJugado + "]";
	}
	
	public void estadisticas() {
		
		int est_anotaciones=0;
		int est_bloqueo=0;
		int est_minutos=0;
		int cont=0;
		
		for (int i = 0; i < 10; i++) {
			
			int aleatorios_anotaciones = (int)(Math.random()*100);
			int aleatorios_bloqueos = (int)(Math.random()*10);
			int aleatorios_minutos = (int)(Math.random()*100);
			
			est_anotaciones=est_anotaciones+aleatorios_anotaciones;
		
			est_bloqueo=est_bloqueo+aleatorios_bloqueos;
			
			est_minutos=est_minutos+aleatorios_minutos;
			
			cont ++;
			
			if (cont==5) {
				System.out.println("Media de anotaciones en 5 partidos: " + (est_anotaciones/5) + " puntos");
				System.out.println("Media de bloqueos en 5 partidos: " + (est_bloqueo/5) + " bloqueos");
				System.out.println("Media de minutos en 5 partidos: " + (est_minutos/5) + " minutos");
				System.out.println("---------------------------------------------");
			}
		}
		
		System.out.println("Media de anotaciones en 10 partidos: " + (est_anotaciones/10)  + " puntos");
		System.out.println("Media de bloqueos en 10 partidos: " + (est_bloqueo/10)  + " bloqueos");
		System.out.println("Media de minutos en 10 partidos: " + (est_minutos/10) + " minutos");
		
	}
	
}

