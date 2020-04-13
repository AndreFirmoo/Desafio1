package br.com.itau;

import java.util.List;

import br.com.itau.modelo.Lancamento;
import br.com.itau.service.LancamentoService;

public class Exercicio {

	public static void main(String[] args) {
		List<Lancamento> lancamentos = new LancamentoService().listarLancamentos();
		
		//TODO: continue daqui
		System.out.println("Hello");
	}

}
