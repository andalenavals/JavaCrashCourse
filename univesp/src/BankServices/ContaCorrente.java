package BankServices;

public class ContaCorrente extends Conta{
	double taxaMovimentacao;
	public ContaCorrente(int nroConta, Data dataApertura, 
			Correntista [] correntistas, double monto, double taxaMovimentacao) {
		super(nroConta, dataApertura, correntistas, monto);
		this.taxaMovimentacao = taxaMovimentacao;
	}

	public boolean fazerDeposito(double monto) {
		System.out.println("Será cobrada taxa de movimentacao de:"+taxaMovimentacao);
		return super.fazerDeposito(monto-taxaMovimentacao);
	}
	
	public boolean fazerSaque(double monto) {
		System.out.println("Será cobrada taxa de movimentacao de:"+taxaMovimentacao);
		return super.fazerSaque(monto-taxaMovimentacao);
	}

}
