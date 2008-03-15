/**
 *   Decaf/Decaffeinate ICS server interface
 *   Copyright (C) 2007  Carson Day (carsonday@gmail.com)
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package decaf.com.ics.parser;

import decaf.com.inboundevent.InboundEvent;
import decaf.com.inboundevent.game.IllegalMoveEvent;

public class IllegalMoveEventParser extends InboundEventParser {
	public IllegalMoveEventParser(Object source) {
		super(source, true, false);
	}

	/**
	 * Returns null if text does not match the event this class produces.
	 */
	public InboundEvent parse(String text) {

		if (text.length() < 600) {
			int i = text.indexOf(IDENTIFIER);
			if (i != -1) {
				String s1 = text.substring(i);
				int j = s1.indexOf(")");
				if (j != -1)
					return new IllegalMoveEvent(getSource(), "" + id++, text
							.substring(i, j + 1), s1.substring(IDENTIFIER
							.length(), j));
			}
		}
		return null;
	}

	private static final String IDENTIFIER = "Illegal move (";

	private static int id;
}