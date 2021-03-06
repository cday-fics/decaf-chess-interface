/**
 *   Decaf/Decaffeinate ICS server interface
 *   Copyright (C) 2008  Carson Day (carsonday@gmail.com)
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
package decaf.messaging.ics.nongameparser;

import java.util.StringTokenizer;

import decaf.messaging.inboundevent.chat.IcsNonGameEvent;
import decaf.messaging.inboundevent.chat.PartnerTellEvent;

public class PartnerTellEventParser extends NonGameEventParser {
	private static final String PTELL_IDENTIFIER = "(your partner) tells you: ";

	public PartnerTellEventParser(int icsId) {
		super(icsId);
	}

	/**
	 * Returns null if text does not match the event this class produces.
	 */
	@Override
	public IcsNonGameEvent parse(String text) {
		if (text.length() < 1500) {
			int i = text.indexOf(PTELL_IDENTIFIER);
			if (i != -1) {
				StringTokenizer stringtokenizer = new StringTokenizer(text, " ");
				String s1 = stringtokenizer.nextToken();
				if (stringtokenizer.nextToken().equals("(your"))
					return new PartnerTellEvent(getIcsId(), text, ParserUtil
							.removeTitles(s1), text.substring(i
							+ PTELL_IDENTIFIER.length(), text.length()));
			}
			return null;
		}
		return null;
	}
}