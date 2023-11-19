package edu.monmouth.problemset4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class ProblemSet4 {
	
	

	public static void main(String[] args) {
		final int SIZE = 10;
		MusicalInstrument[] instrumentList = new MusicalInstrument[SIZE];
		ArrayList<Integer> numberOfKeysorStrings = new ArrayList<>(SIZE);
		
		instrumentList[0] = new MusicalInstrument("Guitar", "STring", 6 , 389.99);
		instrumentList[1] = new MusicalInstrument("TRumpet", "BrASS", 3 , 149.99);
		instrumentList[2] = new MusicalInstrument("Tuba", "bRass", 4 , 1299.99);
		instrumentList[3] = new MusicalInstrument("Clarinet", "woodwind", 10 , 249.99);
		instrumentList[4] = new MusicalInstrument("triangle", "percussion", 1 , 36.45);
		instrumentList[5] = new MusicalInstrument("harpsichord", "keyboard", 60 , 5599.99);
		instrumentList[6] = new MusicalInstrument("piano", "string", 88 , 5850.00);
		instrumentList[7] = new MusicalInstrument("drumset", "percussion", 5 , 5649.99);
		instrumentList[8] = new MusicalInstrument("xylophone", "percussion", 28 , 1610.99);
		instrumentList[9] = new MusicalInstrument("Oboe", "WOODwind", 25 , 4599.99);
		
		// All Attributes 
		System.out.println("All instruments with all Attributes");
		for (MusicalInstrument instrument : instrumentList) {
			System.out.println(instrument);
		}
		System.out.println("-----------------------------------------------------------------");
		
		
		//Attributes of least key/string instrument
		System.out.println("Instrument with least number of keys/strings");
		int least = Integer.MAX_VALUE;
		MusicalInstrument leastKeys = null;
		for (MusicalInstrument instrument : instrumentList) {
			int keysOrStrings = instrument.getNumberOfKeysorStrings();
			if (keysOrStrings < least) {
				least = keysOrStrings;
				leastKeys = instrument;
			}
		}
		System.out.println(leastKeys);
		System.out.println("-----------------------------------------------------------------");

		
		//Attributes of brass types
		System.out.println("Attributes of brass type instruments");
		for (MusicalInstrument instrument : instrumentList){
			if (instrument.getType().equals("brass")) {
				System.out.println(instrument);
			}
		}
		System.out.println("-----------------------------------------------------------------");

		
		//Instrument with greatest price
		double greatestPrice = Integer.MIN_VALUE;
		MusicalInstrument greatestInstrumentPrice = null;
		System.out.println("Instrument with highest price");
		for (MusicalInstrument instrument : instrumentList) {
			double instrumentPrice = instrument.getInstrumentPrice();
			if (instrumentPrice > greatestPrice) {
				greatestPrice = instrumentPrice;
				greatestInstrumentPrice = instrument;
			}
		}
		System.out.println(greatestInstrumentPrice);
		System.out.println("-----------------------------------------------------------------");

		
		//New Array of brass type Instruments
		MusicalInstrument[] brassType = new MusicalInstrument[SIZE];
		int brassCounter = 0;
		
		for (MusicalInstrument instrument : instrumentList) {
			if (instrument.getType().equals("brass")) {
				brassType[brassCounter] = instrument;
				brassCounter ++;
			}
		}
		
		System.out.println("Brass types in new Array");
		for (int x=0; x < brassCounter; x++) {
			System.out.println(brassType[x]);
		}
		
	}

}
