package edu.monmouth.problemset2;

public class MusicalInstrumentRefined {
	private String name = null;
	private String type = null;
	private int numberOfKeysorStrings = -1;
	
	final String UNKNOWNNAME = "UNKNOWNNAME";
	final String UNKNOWNTYPE = "UNKNOWNTYPE";
	final int UNKNOWNKEYSORSTRINGS = -1;
	
	final int MAXKEYSORSTRINGS = 100;
	final int MINKEYSORSTRINGS = 0;

	public MusicalInstrumentRefined() {
		setName(UNKNOWNNAME);
		setType(UNKNOWNTYPE);
		setNumberOfKeysorStrings(UNKNOWNKEYSORSTRINGS);
	}
	public MusicalInstrumentRefined(String name, String type, int numberOfKeysorStrings) {
		setName(name);
		setType(type);
		setNumberOfKeysorStrings(numberOfKeysorStrings);
	}
		public String getName() {
			return name;
		}
	public void setName(String name) {
		if (name == null || name == UNKNOWNNAME || name.length() == 0 ) {
			this.name = UNKNOWNNAME;
		} else {
			this.name = name.toLowerCase();
		}
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		if (type.equalsIgnoreCase("woodwind") || type.equalsIgnoreCase("string") || type.equalsIgnoreCase("brass") || type.equalsIgnoreCase("keyboard") || type.equalsIgnoreCase("percussion")) {
			this.type = type.toLowerCase();
		} else {
			this.type = UNKNOWNTYPE;
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

}

