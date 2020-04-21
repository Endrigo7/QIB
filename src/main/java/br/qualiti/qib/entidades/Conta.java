package br.qualiti.qib.entidades;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conta {

	private String numero;
	private double saldo;
	private Cliente cliente;
	private String senha;
	
	public static String gerarNumero() {
		return UUID.randomUUID().toString();
	}
	
	public void creditar(double valor) {
		saldo += valor;
	}

	public void debitar(double valor) {
		saldo -= valor;
	}

	public void transferir(Conta contaDestino, double valor) {
		debitar(valor);
		contaDestino.creditar(valor);
	}
}
