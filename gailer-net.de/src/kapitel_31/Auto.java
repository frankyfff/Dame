package kapitel_31;

public class Auto {
	
	private double startMeilen;
	private double endMeilen;
	private double gallonen;
	



	
	
	public Auto(double startMeilen, double endMeilen, double gallonen) {
		this.startMeilen = startMeilen;
		this.endMeilen = endMeilen;
		this.gallonen = gallonen;
	}
	
	public double berechneMPG() {
		
		double gefahreKM =  endMeilen - startMeilen;  
		double meilen = gefahreKM / gallonen;
		return meilen;
	}
	
}
