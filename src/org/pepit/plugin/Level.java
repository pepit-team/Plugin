package org.pepit.plugin;

public enum Level {
	M,
	P1,
	P2,
	P3,
	P4,
	P5,
	P6,
	C,
	T,
	ES,
	PT,
	S;
	
	public String toFullName() {
		switch(this) {
			case M:
				return("Maternelles (à partir de 4 ans)");
			case P1:
				return("Niveau 1 (à partir de 7 ans)");
			case P2:
				return("Niveau 2 (à partir de 8 ans)");
			case P3:
				return("Niveau 3 (à partir de 9 ans)");
			case P4:
				return("Niveau 4 (à partir de 10 ans)");
			case P5:
				return("Niveau 5 (à partir de 11 ans)");
			case P6:
				return("Niveau 6 (à partir de 12 ans)");
			case C:
				return("Conjugaison (à partir de 8 ans)");
			case T:
				return("Tables Mult. (à partir de 8 ans)");
			case ES:
				return("ES Ens. Spécial (Pour tous)");
			case PT:
				return("PT Pour tous ! (de 5 à 75 ans et plus !)");
			case S:
				return("S Secondaire (à partir de 12 ans)");
		}
		assert false; // should never reach this line!
		return("");
	}
}
