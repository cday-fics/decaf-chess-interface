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

package decaf.gui.event;

import decaf.event.Event;
import decaf.event.Filter;
import decaf.messaging.inboundevent.game.GameEvent;

public class GameEndEventFilter implements Filter {

	private int gameId;

	public GameEndEventFilter(int gameId) {
		this.gameId = gameId;
	}

	public boolean apply(Event event) {

		GameEvent gameEvent = (GameEvent) event;
		return gameEvent.getGameId() == gameId;
	}
}