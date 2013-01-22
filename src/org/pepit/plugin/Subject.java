package org.pepit.plugin;

public enum Subject {
	FRENCH,
	MATHEMATICS,
	MISCELLANEOUS,
	CONJUGATION,
	SECONDARY1,
	SECONDARY2;
	
	public String toFullName() {
		switch(this) {
			case FRENCH:
				return("Français");
			case MATHEMATICS:
				return("Mathématiques");
			case MISCELLANEOUS:
				return("Divers");
			case CONJUGATION:
				return("Conjugaison");
			case SECONDARY1:
				return("1ère Secondaire");
			case SECONDARY2:
				return("2ème Secondaire");
		}
		assert false; // should never reach this line!
		return("");
	}
	
	public String toShortName() {
		switch(this) {
			case FRENCH:
				return("francais");
			case MATHEMATICS:
				return("maths");
			case MISCELLANEOUS:
				return("divers");
			case CONJUGATION:
				return("conjugaison");
			case SECONDARY1:
				return("premieresecondaire");
			case SECONDARY2:
				return("deuxiemesecondaire");
		}
		assert false; // should never reach this line!
		return("");
	}
}
