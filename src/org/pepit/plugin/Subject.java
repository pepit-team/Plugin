/**
 * @file org/pepit/plugin/Subject.java
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

public enum Subject {
    FRENCH, MATHEMATICS, MISCELLANEOUS, CONJUGATION, SECONDARY1, SECONDARY2;

    public String toName() {
	switch (this) {
	case FRENCH: // Français
	    return ("francais");
	case MATHEMATICS: // Mathématiques
	    return ("maths");
	case MISCELLANEOUS: // Divers
	    return ("divers");
	case CONJUGATION: // Conjugaison
	    return ("conjugaison");
	case SECONDARY1: // 1ère Secondaire
	    return ("premieresecondaire");
	case SECONDARY2: // 2ème Secondaire
	    return ("deuxiemesecondaire");
	}
	assert false; // should never reach this line!
	return ("");
    }
}
