package array;

import java.awt.Font;

public class TwoDem {

	int[][] myTestArray = new int[5][5];

	public void init() {
		for (int z = 0; z < myTestArray.length; z++) {
			for (int sp = 0; sp < myTestArray[z].length; sp++) {
				System.out.println("Array Index f�r z: " + z + " |--------| Array Index f�r sp: " + sp);
			}
		}
	}

	public static void main(String[] args) {
		TwoDem dem = new TwoDem();
		dem.init();
	}
}
