package br.qualiti.qib.gui;

import java.util.Scanner;

import br.qualiti.qib.entidades.Cliente;
import br.qualiti.qib.entidades.Conta;
import br.qualiti.qib.util.SenhaUtil;

public class ContaBuilder {
	
	public static Conta build(Scanner leTeclado) {
		Cliente cliente = ClienteBuilder.build(leTeclado);

		System.out.println("Digite a sua senha");
		String senha = leTeclado.next();
		String senhaHash = SenhaUtil.geraHash(senha);

		System.out.println("Digite valor do deposito inicial");
		double saldoInicial = leTeclado.nextDouble();

		String numero = Conta.gerarNumero();

		Conta conta = new Conta(numero, saldoInicial, cliente, senhaHash);
		return conta;
	}


}
