package BankServices;

public class ContaPoupanca extends Conta{
	public ContaPoupanca(int nroConta, Data dataApertura,
			Correntista [] correntistas, double monto ) {
		super(nroConta, dataApertura, correntistas, monto);
	}

}
