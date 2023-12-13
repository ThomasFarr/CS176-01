package edu.monmouth.MusicalInstrument;

public class MusicalInstrument {
	private String name;
	private String type;
	private int numberOfKeysorStrings;
	private double instrumentPrice;
	
	final String UNKNOWNNAME = "UNKNOWNNAME";
	final String UNKNOWNTYPE = "UNKNOWNTYPE";
	final int UNKNOWNKEYSORSTRINGS = -1;
	final double UNKNOWNPRICE = -9;
	
	final int MAXKEYSORSTRINGS = 100;
	final int MINKEYSORSTRINGS = 0;
	
	final double MINPRICE = 0;
	
	public MusicalInstrument() throws MusicalInstrumentException {
		setName(UNKNOWNNAME);
		setType(UNKNOWNTYPE);
		setNumberOfKeysorStrings(UNKNOWNKEYSORSTRINGS);
		setInstrumentPrice(UNKNOWNPRICE);
	}
	
	public MusicalInstrument(String name, String type, int numberOfKeysorStrings) throws MusicalInstrumentException {
		setName(name);
		setType(type);
		setNumberOfKeysorStrings(numberOfKeysorStrings);
		setInstrumentPrice(UNKNOWNPRICE);
	}
	
	public MusicalInstrument(String name, String type, int numberOfKeysorStrings, double instrumentPrice) throws MusicalInstrumentException {
		setName(name);
		setType(type);
		setNumberOfKeysorStrings(numberOfKeysorStrings);
		setInstrumentPrice(instrumentPrice);
	}
	
	
	public String getName() {
		return name.toLowerCase();
	}
	public void setName(String name) throws MusicalInstrumentException {
		if (name != null && !name.isEmpty()) {
			this.name = name.toLowerCase();
		} else {
			throw new MusicalInstrumentException("Invalid name for Instrument: " + name);
		}
		
	}
	
	
	public String getType() {
		return type.toLowerCase();
	}
	public void setType(String type) throws MusicalInstrumentException {
		String[] validTypes = {"woodwind", "brass", "string", "percussion", "keyboard"};
		type = type.toLowerCase();
		for (String validType : validTypes) {
			if (type.equals(validType)) {
				this.type = type;
				return;
			}
			else {
				this.type = UNKNOWNTYPE;
			}
		}
		throw new MusicalInstrumentException("Invalid type of Instrument: " +  type);
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
	
	
	@Override
	public String toString() {
		return "[Name= " + name + ", Type= " + type + ", Keys/Strings= " + numberOfKeysorStrings
				+ ", Price= " + instrumentPrice + "]";
	}

	
	
	
		
		
	
	
}