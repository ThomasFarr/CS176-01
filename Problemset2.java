package edu.monmouth.problemset2;

public class Problemset2 {

public static void main(String[] args) {
		
		System.out.println("           Musical Instruments           ");
		System.out.println("-----------------------------------------");
		
		// invalid information input/output
		MusicalInstrumentRefined guitar = new MusicalInstrumentRefined();
		System.out.println("Instrument Name: " + guitar.getName());
		System.out.println("Instrument Type: " + guitar.getType());
		System.out.println("Number of keys/strings: " + guitar.getNumberOfKeysorStrings());
		
		System.out.println("-----------------------------------------");
		
		// 1st instrument information fixed
		
		guitar.setName("Guitar");
		guitar.setType("String");
		guitar.setNumberOfKeysorStrings(6);
		
		System.out.println("Instrument Name: " + guitar.getName());
		System.out.println("Instrument Type: " + guitar.getType());
		System.out.println("Number of keys/strings: " + guitar.getNumberOfKeysorStrings());
		
		System.out.println("-----------------------------------------");
		
		// 2nd instrument valid information input/output
		
		MusicalInstrumentRefined piano = new MusicalInstrumentRefined("Piano", "percussion", 88);
		
		System.out.println("Instrument Name: " + piano.getName());
		System.out.println("Instrument Type: " + piano.getType());
		System.out.println("Number of keys/strings: " + piano.getNumberOfKeysorStrings());
		
		System.out.println("-----------------------------------------");
		
		// 2nd instrument changed information
		
		piano.setName("snare drum");
		piano.setType("percussion");
		piano.setNumberOfKeysorStrings(0);
		
		System.out.println("Instrument Name: " + piano.getName());
		System.out.println("Instrument Type: " + piano.getType());
		System.out.println("Number of keys/strings: " + piano.getNumberOfKeysorStrings());
		
		System.out.println("-----------------------------------------");
		
		// 3rd instrument -- all invalid inputs
		
		MusicalInstrumentRefined tuba = new MusicalInstrumentRefined("", "wind", 197);
		
		System.out.println("Instrument Name: " + tuba.getName());
		System.out.println("Instrument Type: " + tuba.getType());
		System.out.println("Number of keys/strings: " + tuba.getNumberOfKeysorStrings());
		
		System.out.println("-----------------------------------------");
		
		//3rd instrument -- Case does not matter
		
		tuba.setName("SAxaPHonE");
		tuba.setType("wOOdWinD");
		tuba.setNumberOfKeysorStrings(4);
		
		System.out.println("Instrument Name: " + tuba.getName());
		System.out.println("Instrument Type: " + tuba.getType());
		System.out.println("Number of keys/strings: " + tuba.getNumberOfKeysorStrings());
		
		System.out.println("-----------------------------------------");
	}

}
