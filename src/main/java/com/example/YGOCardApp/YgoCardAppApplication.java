package com.example.YGOCardApp;

import com.example.YGOCardApp.entities.Monstruo.MonstruosBuilders.MonstruoPenduloConNivelBuilder;
import com.example.YGOCardApp.entities.Monstruo.MonstruosBuilders.MonstruoPenduloXyzBuilder;
import com.example.YGOCardApp.entities.Monstruo.MonstruosBuilders.MonstruoXyzBuilder;
import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoFusion;
import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoPenduloConNivel;
import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoPenduloXyz;
import com.example.YGOCardApp.entities.Monstruo.MonstruosConcretos.MonstruoXyz;
import com.example.YGOCardApp.entities.Monstruo.enums.Atributo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YgoCardAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(YgoCardAppApplication.class, args);
	}
}
