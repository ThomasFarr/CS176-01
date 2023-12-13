package edu.monmouth.ProblemSet6;

import edu.monmouth.MusicalInstrument.MusicalInstrument;
import edu.monmouth.MusicalInstrument.MusicalInstrumentException;

public class ProblemSet6 {

	public static void main(String[] args) {
		try {
			MusicalInstrument instrument1 = new MusicalInstrument("Guitar", "string", 6, 389.99);
			System.out.println("Instrument 1: "+ instrument1.toString());
		} catch (MusicalInstrumentException e){
			System.out.println("Invalid Instrument " + e.getMessage());
			e.printStackTrace();
		}
		
		try {
			MusicalInstrument instrument2 = new MusicalInstrument("Clarinet", "woodwind", 10);
			System.out.println("Instrument 2: "+ instrument2.toString());
		} catch (MusicalInstrumentException e){
			System.out.println("Invalid Instrument " + e.getMessage());
			e.printStackTrace();
		}
		
		try {
			MusicalInstrument instrument3 = new MusicalInstrument("Piano", "board", 88, 5850.00);
			System.out.println("Instrument 3: "+ instrument3.toString());
		} catch (MusicalInstrumentException e){
			System.out.println("Invalid Instrument: " + e.getMessage());
			e.printStackTrace();
		}
		
		try {
			MusicalInstrument instrument4 = new MusicalInstrument(null, "brass", 3, 149.99);
			System.out.println("Instrument 4: "+ instrument4.toString());
		} catch (MusicalInstrumentException e){
			System.out.println("Invalid Instrument: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
