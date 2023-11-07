package edu.monmouth.problemSet3;


public class ProblemSet3 {
	public static void main(String[] args) {
		MusicalInstrument instrument1 = new MusicalInstrument();
		System.out.println("Instrument Name: " + instrument1.getName());
		System.out.println("Instrument Type: " + instrument1.getType());
		System.out.println("Number of keys/strings: " + instrument1.getNumberOfKeysorStrings());
		System.out.println("Price of Instrument: $" + instrument1.getInstrumentPrice());
		System.out.println("-----------------------------------------");
		
		
		MusicalInstrument instrument2 = new MusicalInstrument("GuiTar", "STRIng", 6);
		System.out.println("Instrument Name: " + instrument2.getName());
		System.out.println("Instrument Type: " + instrument2.getType());
		System.out.println("Number of keys/strings: " + instrument2.getNumberOfKeysorStrings());
		System.out.println("Price of Instrument: $" + instrument2.getInstrumentPrice());
		System.out.println("-----------------------------------------");
		
		
		MusicalInstrument instrument3 = new MusicalInstrument("Trumpet", "brass", 3, 109.99);
		System.out.println("Instrument Name: " + instrument3.getName());
		System.out.println("Instrument Type: " + instrument3.getType());
		System.out.println("Number of keys/strings: " + instrument3.getNumberOfKeysorStrings());
		System.out.println("Price of Instrument: $" + instrument3.getInstrumentPrice());
		System.out.println("-----------------------------------------");
		
		
		MusicalInstrument instrument4 = new MusicalInstrument("", "BRAss", -14, 109.99);
		System.out.println("Instrument Name: " + instrument4.getName());
		System.out.println("Instrument Type: " + instrument4.getType());
		System.out.println("Number of keys/strings: " + instrument4.getNumberOfKeysorStrings());
		System.out.println("Price of Instrument: $" + instrument4.getInstrumentPrice());
		System.out.println("-----------------------------------------");
		
		
		MusicalInstrument instrument5 = new MusicalInstrument("CLARINET", "Wooodwid", 10, 89.99);
		System.out.println("Instrument Name: " + instrument5.getName());
		System.out.println("Instrument Type: " + instrument5.getType());
		System.out.println("Number of keys/strings: " + instrument5.getNumberOfKeysorStrings());
		System.out.println("Price of Instrument: $" + instrument5.getInstrumentPrice());
		System.out.println("-----------------------------------------");
		
		MusicalInstrument instrument6 = new MusicalInstrument("Oboe", "Woodwind", 12, 79.99);
		System.out.println("Instrument Name: " + instrument6.getName());
		System.out.println("Instrument Type: " + instrument6.getType());
		System.out.println("Number of keys/strings: " + instrument6.getNumberOfKeysorStrings());
		System.out.println("Price of Instrument: $" + instrument6.getInstrumentPrice());
		System.out.println("-----------------------------------------");
		
		MusicalInstrument instrument7 = new MusicalInstrument("tuba", "Brass", 3, 189.99);
		System.out.println("Instrument Name: " + instrument7.getName());
		System.out.println("Instrument Type: " + instrument7.getType());
		System.out.println("Number of keys/strings: " + instrument7.getNumberOfKeysorStrings());
		System.out.println("Price of Instrument: $" + instrument7.getInstrumentPrice());
		System.out.println("-----------------------------------------");
		
		MusicalInstrument instrument8 = new MusicalInstrument("trianGle", "percussion", 0, 49.99);
		System.out.println("Instrument Name: " + instrument8.getName());
		System.out.println("Instrument Type: " + instrument8.getType());
		System.out.println("Number of keys/strings: " + instrument8.getNumberOfKeysorStrings());
		System.out.println("Price of Instrument: $" + instrument8.getInstrumentPrice());
		System.out.println("-----------------------------------------");
		
		
		double price5 = instrument5.getInstrumentPrice();
		double price6 = instrument6.getInstrumentPrice();
		double price7 = instrument7.getInstrumentPrice();
		double price8 = instrument8.getInstrumentPrice();
		
		if (price5 > price6 && price5 > price7 && price5 > price8) {
			System.out.println("The highest price between instruments 5-8 is instrument 5 at $"+ price5);
		} else if (price6 > price5 && price6 > price7 && price6 > price8) {
			System.out.println("The highest price between instruments 5-8 is instrument 6 at $"+ price6);
		} else if (price7 > price5 && price7 > price6 && price7 > price8) {
			System.out.println("The highest price between instruments 5-8 is instrument 7 at $"+ price7);
		} else {
			System.out.println("The highest price between instruments 5-8 is instrument 8 at $" + price8);
		}
		System.out.println("-----------------------------------------");
		
		
		String isType = "woodwind";
		if (instrument5.getType().equals(isType)) {
			System.out.println("Instrument 5 is a "+ isType);
		} 
		if (instrument6.getType().equals(isType)) {
			System.out.println("Instrument 6 is a "+ isType);
		} 
		if (instrument7.getType().equals(isType)) {
			System.out.println("Instrument 7 is a "+ isType);
		} 
		if (instrument8.getType().equals(isType)) {
			System.out.println("Instrument 8 is a "+ isType);
		} 
		System.out.println("-----------------------------------------");
		
		
		int higherThan = 6;
		if (instrument5.getNumberOfKeysorStrings() > higherThan) {
			System.out.println("Instrument 5 is greater than "+ higherThan);
		} 
		if (instrument6.getNumberOfKeysorStrings() > higherThan) {
			System.out.println("Instrument 6 is greater than "+ higherThan);
		} 
		if (instrument7.getNumberOfKeysorStrings() > higherThan) {
			System.out.println("Instrument 7 is greater than "+ higherThan);
		} 
		if (instrument8.getNumberOfKeysorStrings() > higherThan) {
			System.out.println("Instrument 8 is greater than "+ higherThan);
		} 
		System.out.println("-----------------------------------------");
		
	}

}
