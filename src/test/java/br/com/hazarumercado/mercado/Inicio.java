package br.com.hazarumercado.mercado;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/teste")
public class Inicio {

	@GetMapping
	public static String mostraQueDaCerto() {
		String a = "";

		if (a.isEmpty() || a.isBlank()) {
			return "OK";
		} else {
			return "Não está vazio";
		}
	}

	public static void main(String[] args) {
		String a = mostraQueDaCerto();
		
		System.out.println(a);
	}
}
