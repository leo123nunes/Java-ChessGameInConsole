package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.ChessPosition;
import chess.Color;

public class Knight extends ChessPiece {

	public Knight(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "N";
	}

	boolean canMove(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);

		if (p == null || p.getColor() != getColor()) {
			return true;
		}

		return false;
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		p.setValues(position.getRow() - 2, position.getColumn()-1);

		if (getBoard().positionExists(p.getRow(), p.getColumn()) == true && canMove(p) == true) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		p.setValues(position.getRow() - 1, position.getColumn()-2);

		if (getBoard().positionExists(p.getRow(), p.getColumn()) == true && canMove(p) == true) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		p.setValues(position.getRow()+1, position.getColumn() - 2);

		if (getBoard().positionExists(p.getRow(), p.getColumn()) == true && canMove(p) == true) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		p.setValues(position.getRow()+2, position.getColumn() -1);

		if (getBoard().positionExists(p.getRow(), p.getColumn()) == true && canMove(p) == true) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		p.setValues(position.getRow() + 2, position.getColumn() +1);

		if (getBoard().positionExists(p.getRow(), p.getColumn()) == true && canMove(p) == true) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		p.setValues(position.getRow() + 1, position.getColumn() + 2);

		if (getBoard().positionExists(p.getRow(), p.getColumn()) == true && canMove(p) == true) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		p.setValues(position.getRow() -1, position.getColumn() + 2);

		if (getBoard().positionExists(p.getRow(), p.getColumn()) == true && canMove(p) == true) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		p.setValues(position.getRow() -2, position.getColumn() +1);

		if (getBoard().positionExists(p.getRow(), p.getColumn()) == true && canMove(p) == true) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		return mat;
	}
}
