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
package decaf.gui.widgets.movelist;

import decaf.moveengine.Position;

public class MoveListModelMove {
	private String algebraicDescription;

	private Position position;

	private long timeTakenMillis;

	public MoveListModelMove(String description, Position position,
			long timeTakenMillis) {
		this.position = position;
		this.timeTakenMillis = timeTakenMillis;
		this.algebraicDescription = description;
	}

	public String getAlgebraicDescription() {
		return algebraicDescription;
	}

	public Position getPosition() {
		return position;
	}

	public long getTimeTakenMillis() {
		return timeTakenMillis;
	}

}
