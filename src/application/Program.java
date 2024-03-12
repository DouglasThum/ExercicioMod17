package application;

import java.util.ArrayList;
import java.util.List;

import domain.Carro;
import domain.Chevrolet;
import domain.Fiat;
import domain.Honda;

public class Program {

	public static void main(String[] args) {
		
		List<Carro> lista = new ArrayList<>();
		
		Carro honda = new Honda("HR-V", 2019, "Bordo");
		Carro chevrolet = new Chevrolet("Tracker", 2023, "Preto");
		Carro fiat = new Fiat("Strada", 2021, "Branco");
		
		lista.add(honda);
		lista.add(chevrolet);
		lista.add(fiat);
		for (Carro carro : lista) {
			carro.imprimirCarro();
		}
	}
}
