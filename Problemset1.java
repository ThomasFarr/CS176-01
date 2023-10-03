package edu.monmouth.problemset1;

public class Problemset1 {
	
	public static void main(String[] args) {
		
		System.out.println("           Musical Instruments           ");
		System.out.println("-----------------------------------------");
		
		// base information 
		MusicalInstrument guitar = new MusicalInstrument();
		System.out.println("Instrument Name: " + guitar.getName());
		System.out.println("Instrument Type: " + guitar.getType());
		System.out.println("Number of keys/strings: " + guitar.getNumberOfKeysorStrings());
		
		System.out.println("-----------------------------------------");
		
		// 1st instrument
		
		guitar.setName("Guitar");
		guitar.setType("String");
		guitar.setNumberOfKeysorStrings(6);
		
		System.out.println("Instrument Name: " + guitar.getName());
		System.out.println("Instrument Type: " + guitar.getType());
		System.out.println("Number of keys/strings: " + guitar.getNumberOfKeysorStrings());
		
		System.out.println("-----------------------------------------");
		
		//2nd instrument
		
		MusicalInstrument piano = new MusicalInstrument("Piano", "Percussion", 88);
		
		System.out.println("Instrument Name: " + piano.getName());
		System.out.println("Instrument Type: " + piano.getType());
		System.out.println("Number of keys/strings: " + piano.getNumberOfKeysorStrings());
		
		System.out.println("-----------------------------------------");
		
	}

}
