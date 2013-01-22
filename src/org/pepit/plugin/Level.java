/**
 * @file org/pepit/plugin/Level.java
 * 
 * PepitMobil: an educational software
 * This file is a part of the PepitMobil environment
 * http://pepit.be
 *
 * Copyright (C) 2012-2013 Pepit Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.pepit.plugin;

public enum Level {
    M, P1, P2, P3, P4, P5, P6, C, T, ES, PT, S;

    public String toFullName() {
	switch (this) {
	case M:
	    return ("Maternelles (à partir de 4 ans)");
	case P1:
	    return ("Niveau 1 (à partir de 7 ans)");
	case P2:
	    return ("Niveau 2 (à partir de 8 ans)");
	case P3:
	    return ("Niveau 3 (à partir de 9 ans)");
	case P4:
	    return ("Niveau 4 (à partir de 10 ans)");
	case P5:
	    return ("Niveau 5 (à partir de 11 ans)");
	case P6:
	    return ("Niveau 6 (à partir de 12 ans)");
	case C:
	    return ("Conjugaison (à partir de 8 ans)");
	case T:
	    return ("Tables Mult. (à partir de 8 ans)");
	case ES:
	    return ("ES Ens. Spécial (Pour tous)");
	case PT:
	    return ("PT Pour tous ! (de 5 à 75 ans et plus !)");
	case S:
	    return ("S Secondaire (à partir de 12 ans)");
	}
	assert false; // should never reach this line!
	return ("");
    }

    public String toShortName() {
	switch (this) {
	case M:
	    return ("m");
	case P1:
	    return ("p1");
	case P2:
	    return ("p2)");
	case P3:
	    return ("p3");
	case P4:
	    return ("p4");
	case P5:
	    return ("p5");
	case P6:
	    return ("p6");
	case C:
	    return ("c");
	case T:
	    return ("t");
	case ES:
	    return ("es");
	case PT:
	    return ("pt");
	case S:
	    return ("s");
	}
	assert false; // should never reach this line!
	return ("");
    }
}
