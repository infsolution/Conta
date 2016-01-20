package br.com.infsolution.conta.aplication;
import br.com.infsolution.conta.modelo.*;


public class TestAccount {

	public static void main(String[] args) {
		Conta conta = new Conta();
		Conta conCorr = new ContaCorrente();
		Conta conCorr1 = new ContaCorrente();
		Conta conCorr2 = new ContaCorrente();
		Conta conCorr3 = new ContaCorrente();
		Conta conPou = new ContaPoupanca();
		Conta conPou1 = new ContaPoupanca();
		Conta conPou2 = new ContaPoupanca();
		Conta conPou3 = new ContaPoupanca();
		AtualizadorDeContas updaterAccount = new AtualizadorDeContas(0.07);
		Banco cicBanc = new Banco();
		
		conta.depositar(1000);
		conCorr.depositar(1000);
		conCorr1.depositar(1000);
		conCorr2.depositar(1000);
		conCorr3.depositar(1000);
		conPou.depositar(1000);
		conPou1.depositar(1000);
		conPou2.depositar(1000);
		conPou3.depositar(1000);
		
		conta.atualiza(0.01);
		conCorr.atualiza(0.01);
		conCorr1.atualiza(0.01);
		conCorr2.atualiza(0.01);
		conCorr3.atualiza(0.01);
		conPou.atualiza(0.01);
		conPou1.atualiza(0.01);
		conPou2.atualiza(0.01);
		conPou3.atualiza(0.01);
		System.out.println(conta.getSaldo());
		System.out.println(conCorr.getSaldo());
		System.out.println(conPou.getSaldo());
		updaterAccount.roda(conta);
		updaterAccount.roda(conCorr);
		updaterAccount.roda(conPou);
		System.out.println("Saldo Total: "+updaterAccount.getSaldoTotal());
		
		cicBanc.addAccount(conta);
		cicBanc.addAccount(conPou);
		cicBanc.addAccount(conPou1);
		cicBanc.addAccount(conCorr);
		cicBanc.addAccount(conCorr1);
		cicBanc.addAccount(conCorr2);
		
		System.out.println("Total de contas: "+cicBanc.totalAccounts());
		System.out.println(cicBanc.getConta(2));
		System.out.println(cicBanc);
		for(int i = 0;i<cicBanc.totalAccounts();i++){
			cicBanc.getAccounts()[i].atualiza(0.01);
		}
		System.out.println("Saldo Total: "+updaterAccount.getSaldoTotal());
	}
}
