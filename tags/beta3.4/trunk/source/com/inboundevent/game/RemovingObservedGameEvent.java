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

package decaf.com.inboundevent.game;

/**
 * This event is generated when a game is starting or it is being observed.
 */
public class RemovingObservedGameEvent extends GameEvent {
	public String toString() {
		return "<RemovingObservedGameEvent>" + super.toString()
				+ "</RemovingObservedGameEvent>";
	}

	/**
	 * This constructor uses board1GameEndEvent.getGameId() for its gameId.
	 */
	public RemovingObservedGameEvent(Object source, String messageId,
			String text, int gameId) {
		super(source, messageId, text, gameId);
	}

}