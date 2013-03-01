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

    public String toName() {
	switch (this) {
	case M: // Maternelles (à partir de 4 ans)
	    return ("m");
	case P1: // Niveau 1 (à partir de 7 ans)
	    return ("p1");
	case P2: // Niveau 2 (à partir de 8 ans)
	    return ("p2)");
	case P3: // Niveau 3 (à partir de 9 ans)
	    return ("p3");
	case P4: // Niveau 4 (à partir de 10 ans)
	    return ("p4");
	case P5: // Niveau 5 (à partir de 11 ans)
	    return ("p5");
	case P6: // Niveau 6 (à partir de 12 ans)
	    return ("p6");
	case C: // Conjugaison (à partir de 8 ans)
	    return ("c");
	case T: // Tables Mult. (à partir de 8 ans)
	    return ("t");
	case ES: // ES Ens. Spécial (Pour tous)
	    return ("es");
	case PT: // PT Pour tous ! (de 5 à 75 ans et plus !)
	    return ("pt");
	case S: // S Secondaire (à partir de 12 ans)
	    return ("s");
	}
	assert false; // should never reach this line!
	return ("");
    }
}
