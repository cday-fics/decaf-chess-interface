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

package decaf.moveengine;

/**
 * An illegal move exception.
 */
public class IllegalMoveException extends Exception {
	private Position position;

	private Move move;

	private String reason;

	public IllegalMoveException(Move move, Position position, String message,
			Exception exception) {
		super();
		reason = message + " " + move.toString()
				+ (position == null ? "" : position.toString())
				+ (exception == null ? "" : "\n\t" + exception.toString());
		this.move = move;
		this.position = position;
	}

	@Override
	public String getMessage() {
		return reason;
	}

	public Move getMove() {
		return move;
	}

	public Position getPosition() {
		return position;
	}

	@Override
	public String toString() {
		return getClass().getName() + ": " + reason;
	}
}