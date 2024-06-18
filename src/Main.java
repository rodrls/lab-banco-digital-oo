import java.util.ArrayList;
import java.util.List;
import java.lang.*;

public class Main {

	public static void main(String[] args) {
		// cria novo Cliente
		Cliente cliente = new Cliente(null);

		// seta o nome do cliente 
		cliente.setNome("Cliente 1");
		
		//cria conta conrrente
		Conta cc = new ContaCorrente(cliente);

		//cria conta poupanca
		Conta poupanca = new ContaPoupanca(cliente);

		//deposita 100 na cc
		cc.depositar(100);

		cc.transferir(100, poupanca);
		cc.imprimirExtrato();

		poupanca.imprimirExtrato();


		Cliente cliente2 = new Cliente(null);
		cliente2.setNome("Cliente 2");
		cc = new ContaCorrente(cliente2);
		poupanca = new ContaPoupanca(cliente2);

		cc.depositar(300);

		cc.transferir(150, poupanca);

		cc.imprimirExtrato();

		poupanca.imprimirExtrato();


		Cliente cliente3 = new Cliente(null);
		cliente3.setNome("Cliente 3");
		cc = new ContaCorrente(cliente3);
		poupanca = new ContaPoupanca(cliente3);

		cc.depositar(1000);

		cc.transferir(500, poupanca);
		
		cc.imprimirExtrato();

		poupanca.imprimirExtrato();
		

		
		
		
	}
	
}
