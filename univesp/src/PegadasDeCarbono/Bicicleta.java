package PegadasDeCarbono;

public class Bicicleta implements CarbonEmissionCost{
	private String tipodemarco; 
	private String tipodefreios; 
	public double getCarbonEmission(){
		return 0;
	}

	@Override
	public String toString() {
		return "Bicicleta []";
	}
}
