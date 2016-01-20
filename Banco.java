package br.com.infsolution.conta.modelo;

public class Banco {
	private int maxLeng=10;
	private Conta[] accounts = new Conta[maxLeng];
	private int curLeng=0;

public void addAccount(Conta account){
		if(this.curLeng<maxLeng){
			this.accounts[curLeng]=account;
			curLeng++;
		}
	}

public int totalAccounts(){
	int leng=0;
	for(int i=0;i < maxLeng;i++){
		if(this.accounts[i] != null){
			leng++;
		}
	}
	return leng;
}
public Conta getConta(int x){
	return accounts[x];
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "CicBanc:\nTotal de Contas ativas: "+totalAccounts();
}

public Conta[] getAccounts() {
	return accounts;
}
}
