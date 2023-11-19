package edu.monmouth.problemset4;

import java.util.ArrayList;
import java.util.Arrays;

public class MusicalInstrument {
	private String name = null;
	private String type = null;
	private int numberOfKeysorStrings = -1;
	private double instrumentPrice = -9;
	
	final String UNKNOWNNAME = "UNKNOWNNAME";
	final String UNKNOWNTYPE = "UNKNOWNTYPE";
	final int UNKNOWNKEYSORSTRINGS = -1;
	final double UNKNOWNPRICE = -9;
	
	final int MAXKEYSORSTRINGS = 100;
	final int MINKEYSORSTRINGS = 0;
	
	final double MINPRICE = 0;
	
	ArrayList<String> types = new ArrayList<>(Arrays.asList("woodwind", "brass", "string", "percussion", "keyboard"));
	final static int size = 10; 

	public MusicalInstrument() {
		setName(UNKNOWNNAME);
		setType(UNKNOWNTYPE);
		setNumberOfKeysorStrings(UNKNOWNKEYSORSTRINGS);
		setInstrumentPrice(UNKNOWNPRICE);
	}
	
	public MusicalInstrument(String name, String type, int numberOfKeysorStrings) {
		setName(name);
		setType(type);
		setNumberOfKeysorStrings(numberOfKeysorStrings);
		setInstrumentPrice(instrumentPrice);
	}
	
	public MusicalInstrument(String name, String type, int numberOfKeysorStrings, double instrumentPrice) {
		setName(name);
		setType(type);
		setNumberOfKeysorStrings(numberOfKeysorStrings);
		setInstrumentPrice(instrumentPrice);
	}
	
	
		public String getName() {
			return name.toLowerCase();
		}
	public void setName(String name) {
		if (name == null || name == UNKNOWNNAME || name.length() == 0 ) {
			this.name = UNKNOWNNAME;
		} else {
			this.name = name.toLowerCase();
		}
		
	}
	public String getType() {
		return type.toLowerCase();
	}
	public void setType(String type) {
		for (int x =0; x <types.size(); x++) {
			String element = types.get(x);
			type = type.toLowerCase();
			if (type.equals(element)) {
				this.type = type;
				break;
			}
			else {
				this.type = UNKNOWNTYPE;
			}
		}
	}
	public int getNumberOfKeysorStrings() {
		return numberOfKeysorStrings;
	}
	public void setNumberOfKeysorStrings(int numberOfKeysorStrings) {
		if (numberOfKeysorStrings > MINKEYSORSTRINGS && numberOfKeysorStrings < MAXKEYSORSTRINGS) {
			this.numberOfKeysorStrings = numberOfKeysorStrings;
		} else {
			this.numberOfKeysorStrings = UNKNOWNKEYSORSTRINGS;
		}	
	}
	
	public double getInstrumentPrice() {
		return instrumentPrice;
		}
	public void setInstrumentPrice(double instrumentPrice) {
		if (instrumentPrice > MINPRICE) {
			this.instrumentPrice = instrumentPrice;
		} else {
			this.instrumentPrice = UNKNOWNPRICE;
		}
	}
	
	
	ArrayList<MusicalInstrument> instrument = new ArrayList<MusicalInstrument>(size);

	@Override
	public String toString() {
		return "[Name= " + name + ", Type= " + type + ", Keys/Strings= " + numberOfKeysorStrings
				+ ", Price= " + instrumentPrice + "]";
	}

	
	
	
		
		
	
	
}