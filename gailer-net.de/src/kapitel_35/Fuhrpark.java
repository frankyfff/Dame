package kapitel_35;

public class Fuhrpark {
	
	private Auto stadtWagen;
	private Auto gelaendeWagen;
	
	public Fuhrpark(int start1, int end1, double gal1, int start2, int end2, double gal2) {
		stadtWagen = new Auto(start1, end1, gal1);
		gelaendeWagen = new Auto(start2, end2, gal2);
	}
	
	public double berechneMPG() {
		double summeMPG;
		summeMPG = stadtWagen.berechneMPG() + gelaendeWagen.berechneMPG();
		return (summeMPG)/(2);
	}
	
	public void auftanken(int standtTacho, double stadtGalls, int geleandeTacho, double geleandeGalls) {
		stadtWagen.auftanken(standtTacho, stadtGalls);
		gelaendeWagen.auftanken(geleandeTacho, geleandeGalls);
	}
}


class Auto {
	
	private int startMeilen;
	private int endMeilen;
	private double gallonen;

	public Auto(int startTacho, int endTacho, double galls) {
		this.startMeilen = startTacho;
		this.endMeilen = endTacho;
		this.gallonen = galls;
	}
	
	public double berechneMPG() {
		return (endMeilen - startMeilen) / gallonen;
	}
	
	public void auftanken(int aktuellerTacho,double getankteGalls) {
		
		startMeilen = endMeilen;
		endMeilen = aktuellerTacho;
		gallonen = getankteGalls;
	}
}


class FuhrparkTester {
	
	public static void main(String[] args) {
		Fuhrpark meineAutos = new Fuhrpark(1000, 1234, 10, 777, 999, 20);
		System.out.println("Fuhrpark durchschnittliche MPG = "+meineAutos.berechneMPG());
	}
}