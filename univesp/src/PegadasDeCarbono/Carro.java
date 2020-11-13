package PegadasDeCarbono;

public class Carro implements CarbonEmissionCost{
	private double weight;
	private double kms; 
	private double emission_factor; // in some random units
	
	public Carro(double weight, double kms,double emission_factor) {
		this.weight = weight;
		this.kms = kms;
		this.emission_factor = emission_factor;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getKms() {
		return kms;
	}

	public void setKms(double kms) {
		this.kms = kms;
	}

	public double getEmission_factor() {
		return emission_factor;
	}

	public void setEmission_factor(double emission_factor) {
		this.emission_factor = emission_factor;
	}

	public double getCarbonEmission(){
		return emission_factor*kms*weight;
	}

	@Override
	public String toString() {
		return "Carro [weight=" + weight + ", kms=" + kms + ", emission_factor=" + emission_factor + "]";
	}
	
	
}
