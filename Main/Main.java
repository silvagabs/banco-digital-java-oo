package Main;

import Main.Contas.Cliente;
import Main.Contas.Conta;
import Main.Contas.ContaCorrente;
import Main.Contas.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(150);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		Cliente gabriel = new Cliente();
		gabriel.setNome("Gabriel");


		Conta cc2= new ContaCorrente(gabriel);
		Conta poupanca2= new ContaPoupanca(gabriel);

		cc2.depositar(400);
		cc2.transferir(100, poupanca2);
		cc2.transferir(40, cc);

	   
		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();

		cc.imprimirExtrato();

			System.out.println("Venilton recebeu uma transferência!");
			

	}

}