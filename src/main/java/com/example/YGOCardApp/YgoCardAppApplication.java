package com.example.YGOCardApp;

import com.example.YGOCardApp.Monstruo.MonstruosBuilders.MonstruoPenduloConNivelBuilder;
import com.example.YGOCardApp.Monstruo.MonstruosBuilders.MonstruoPenduloXyzBuilder;
import com.example.YGOCardApp.Monstruo.MonstruosBuilders.MonstruoXyzBuilder;
import com.example.YGOCardApp.Monstruo.enums.Atributo;
import com.example.YGOCardApp.Monstruo.MonstruosConcretos.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YgoCardAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(YgoCardAppApplication.class, args);

		MonstruoXyzBuilder xyzBuilder = new MonstruoXyzBuilder();
		MonstruoXyz number39;

		number39 = xyzBuilder.setAtaque(2500).setAtributo(Atributo.LUZ).setDefensa(2000).setRango(4).build();

		MonstruoPenduloConNivelBuilder<MonstruoFusion> penduloFusionBuilder = new MonstruoPenduloConNivelBuilder<>();

		MonstruoPenduloConNivel<MonstruoFusion> odd_eyes_venom_dragon;

		odd_eyes_venom_dragon = penduloFusionBuilder.setAtaque(2500).
		setEscala(1).setNombre("Odd-Eyes Venom Dragon").build();

		MonstruoPenduloXyzBuilder monstruoPenduloxyzBuilder = new MonstruoPenduloXyzBuilder();
		MonstruoPenduloXyz odd_eyes_rebellion_dragon;

		odd_eyes_rebellion_dragon = monstruoPenduloxyzBuilder.
				setRango(7).setDefensa(2000).
				setEscala(4).setEfectoPendulo("holaaa").build();
	}
}
