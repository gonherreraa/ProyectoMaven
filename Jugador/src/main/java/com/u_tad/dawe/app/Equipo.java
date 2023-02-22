package com.u_tad.dawe.app;

import com.u_tad.dawe.model.*;

public class Equipo {

	public static void main(String[] args) {
		
		//Creamos los dos objetos
		JugadorBalonMano primerJugador = new JugadorBalonMano("Doncic",77);
		JugadorBalonMano segundoJugador = new JugadorBalonMano("Lebron",6);
		
		//Llamamos al metodo estadisticas
		System.out.println("Jugador 1:");
		primerJugador.estadisticas();
		System.out.println("Jugador 2:");
		segundoJugador.estadisticas();
		
	}		
}