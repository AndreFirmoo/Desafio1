package br.com.itau;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.itau.modelo.Lancamento;
import br.com.itau.service.LancamentoService;


public class Exercicio {

	public static void main(String[] args) {
		List<Lancamento> lancamentos = new LancamentoService().listarLancamentos();
		
		//TODO: continue daqui
		System.out.println("Hello");


		// Listagem de gastos ordenados por mes
		lancamentos.stream().sorted(Comparator.comparing(Lancamento::getMes))
				.collect(Collectors.toList())
				.forEach(list -> System.out.println(list));

		//listagem de mes

		lancamentos.stream()
				.filter( c -> c.getMes().equals(1) )
				.sorted( Comparator.comparing(Lancamento::getMes))
				.collect(Collectors.toList() )
				.forEach( l -> System.out.println( "lancamentos do mes " + l ) );
		//soma da listagem do mes
		double soma = lancamentos.stream()
				.filter( c -> c.getMes().equals(1) )
				.mapToDouble(Lancamento::getValor)
				.sum();
		System.out.println("Soma do mes "+soma);

		// listagem de categoria
		lancamentos.stream()
				.filter( c -> c.getCategoria().equals(1) )
				.sorted( Comparator.comparing(Lancamento::getMes))
				.collect(Collectors.toList() )
				.forEach( l -> System.out.println( "categoria " + l ) );


	}


}
