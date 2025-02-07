package br.com.plgs;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import br.com.plgs.exception.LimiteCreditoExcedidoException;
import br.com.plgs.model.Aluno;
import br.com.plgs.model.ContaBancaria;
import br.com.plgs.model.Disciplina;
import br.com.plgs.model.Professor;
import br.com.plgs.model.Pessoa;


public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Hello Pessoal!");
		System.out.println("---------------");
		System.out.println(":: OPERADORES LÓGICOS:");
		
		// validação de operadores lógicos
		boolean condicao = true;
		if(condicao == true) {
			System.out.println("* Minha condição é Verdadeira!");
		} else {
			System.out.println("* Minha condição é Falsa!");
		}
		
		int idade = 11;
		if(idade < 10) {
			System.out.println("* Filme Infantil (" + idade + ")");
		} else if (idade >=10 && idade < 18) {
			System.out.println("* Filme Juvenil (" + idade + ")");
		} else {
			System.out.println("* Filme Adulto (" + idade + ")");
		}
		
		idade = 4;
		switch(idade) {
			case 2:
				System.out.println("- Idade igual a 2");
			case 3:
			case 4:
				System.out.println("- Idade igual a 4");
			case 5:
			case 10: 
				System.out.println("- Idade igual a 10");
				break;
			case 11:
				System.out.println("- Idade igual a 11");
				break;
			case 20:
				System.out.println("- Idade igual a 20");
				break;
			default:
				System.out.println("- Outra idade");
				break;
		}
		
		// trabalhando com looppings:
		// criar uma contagem de 0 até 10
		int max = 21;
		for(int numero = 0; numero < max; numero++) {
			//System.out.print(numero);
			// se o numero for par, exibe um * entre o numero, caso não
			// exibe somente o número
			if(numero % 2 == 0) {
				System.out.print("*" + numero + "*");
			} else {
				System.out.print(numero);				
			}
			
			if (numero < (max - 1)) {
				System.out.print(", ");
			}
		}
		
		//while
		int i = 0;
		while (i <= 10) {
			System.out.println("Escrevendo i: " + i);
			
			switch(i) {
				case 1:
					System.out.println("Achei o 1 !!!");
					break;
				default:
					System.out.println("----");
			}
			
			i++;
		}
		
		System.out.println("-----------------------------------");
		System.out.println(":: PROGRAMAÇÃO ORIENTADA A OBJETOS:");
		
		/*
		Carro carroJao = new Carro();
		carroJao.cor = "Branca";
		carroJao.marca = "Chevrolet";
		carroJao.modelo = "Onix";
		carroJao.andar();
		
		Carro carroTiao = new Carro(); // Instanciando uma classe
		carroTiao.cor = "Azul";
		carroTiao.marca = "BYD";
		carroTiao.modelo = "Delphin";
		carroTiao.parar();
		*/
		Carro carroJao = new Carro("Branca", "Chevrolet", "Onix");
		carroJao.andar();
		
		Carro carroTiao = new Carro("Azul", "BYD", "Delphin", true);
		carroTiao.parar();
		
		Carro carroZe = new Carro("Vermelho", "VW", "Fusca", false);
		System.out.println("Carro fulano: " + carroZe.toString()); 	
		carroZe.andar();
		
		Carro carroFulano = new Carro();
		carroFulano.setCor("Verde");
		System.out.println("A cor do carro de Fulano é " + carroFulano.getCor());
		carroFulano.andar();
		System.out.println("Carro fulano: " + carroFulano.toString()); 
		
		
		System.out.println("-----------------------------------");
		System.out.println(":: PROGRAMAÇÃO ORIENTADA A OBJETOS - HERANÇA/POLIMORFISMO:");
		Pessoa pessoa1 = new Aluno("3333", 2024, "Nome pessoa1", "Telefone pessoa 1", "pessoa1@a.com"); // criar uma pessoa implementando aluno
		
		Pessoa pessoa2 = new Professor("Prog web", "Doutor", 2, "Pessoa 2", "421412414", "prof2@a.com"); // criar uma pessoa implementando professor
		
		System.out.println("Pessoa1: " + pessoa1.toString());
		System.out.println("Pessoa1: " + pessoa2.toString());

		
		Aluno aluno1 = new Aluno("123456", 2024, "Nome Aluno", "Telefone 32131", "aluno1@a.com");
		System.out.println("Aluno1: " + aluno1.toString());
		
		Professor professor1 = new Professor("POO", "Mestre", 1, "Professor 1", "321312312", "prof1@a.com");
		System.out.println("Professor1: " + professor1.toString());
		
		Professor prof2 = new Professor("Banco de dados", "Mestre", 2, "Professor2", "32131231231", "prof2@a.com", "http://linkedin.com");
		System.out.println("Professor1: " + prof2.toString());
	
		System.out.println("-----------------------------------");
		System.out.println(":: TRATAMENTO DE ERROS:");
		try {
			System.out.println("Vou fazer a conta....");
			int valor = 10 / 1;
			System.out.println("Fiz a conta....");
			
			int[] numeros = {0,1,2};
			for(int y = 0; y < 4; y++) 
				System.out.println(numeros[y]);
			
		} catch (ArithmeticException e) {
			System.out.println(" - Erro: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" - Erro: " + e.getMessage());
		}
		System.out.println("-----------------------------------");	
		Funcao funcao = new Funcao();
		try {
			funcao.lerArquivo("Principal.class");
		} catch (FileNotFoundException e) {
			System.out.println(" - Erro: " + e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("-----------------------------------");	
		System.out.println("-----------------------------------");	
		ContaBancaria contaBancaria = new ContaBancaria(15000);
		try {
			contaBancaria.fazerPix(20000);
		} catch (LimiteCreditoExcedidoException e) {
			System.out.println(" - Erro: " + e.getMessage());
		}
				
		System.out.println("-----------------------------------");
		System.out.println(":: COLEÇÕES - LIST:");
		List<String> nomes = new ArrayList<String>();
		nomes.add("Maria");
		nomes.add("Joao");
		nomes.add("Jose");
		
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		System.out.println("-----------------------------------");
		nomes.add("Pedro");
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		System.out.println("-----------------------------------");
		/*nomes.remove(2);
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		*/
		Collections.sort(nomes);		
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		System.out.println("-----------------------------------");

		List<Carro> carros = new ArrayList<Carro>();
		carros.add(carroZe);
		carros.add(carroJao);
		carros.add(carroTiao);
		carros.add(carroFulano);
		
		for(Carro c : carros) {
			System.out.println(c.toString());
		}
		System.out.println("-----------------------------------");
		nomes.add("Arthur");		
		nomes.add("Gabriel");	
		Collections.sort(nomes);		
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		
		System.out.println("-----------------------------------");
		
		List<String> nomesFiltrados = nomes.stream().filter(nome2 -> nome2.startsWith("J")).collect(Collectors.toList());
		for(String nome : nomesFiltrados) {
			System.out.println("Nome filtro: " + nome);
		}	
		
		System.out.println("-----------------------------------");
		System.out.println(":: COLEÇÕES - SET:");
		Set<String> cores = new HashSet<String>();
		cores.add("Azul");
		cores.add("Vermelho");
		cores.add("Verde");
		for(String cor : cores) {
			System.out.println(cor);
		}
		
		System.out.println("-----------------------------------");
		System.out.println(":: COLEÇÕES - HASH MAP:");
		Map<String, String> paises = new HashMap<String, String>();
		paises.put("Brasil", "Brasília");
		paises.put("França", "Paris");
		paises.put("Portugal", "Lisboa");
		
		for(Map.Entry<String, String> entrada : paises.entrySet()) {
			System.out.println("Capitais: " + entrada.getValue());
		}
		paises.put("Espanha", "Madrid");
		System.out.println("Capital de Portugal: " + paises.get("Portugal"));
		
		System.out.println("-----------------------------------");
		
		Map<Integer, Carro> estacionamento = new HashMap<Integer, Carro>();
		estacionamento.put(0, carroZe);
		estacionamento.put(1, carroFulano);
		estacionamento.put(2, carroJao);
		estacionamento.put(3, carroTiao);
		
		System.out.println("Carro do Jão: " + estacionamento.get(2));
		
		System.out.println("F-----------------------------------");	
		System.out.println(":: BUILDER");	
		Disciplina disciplina1 = new Disciplina("POO", "2p", 300);
		System.out.println("Disciplina1: " + disciplina1);
		
		Disciplina disciplina2 = Disciplina.builder()
				.setNome("Banco de dados")
				.setPeriodo("3p")
				.setCargaHoraria(300)
				.build();
		System.out.println("Disciplina1: " + disciplina2);

		
		System.out.println("F-----------------------------------");	
		
		
		
		
	}
}
