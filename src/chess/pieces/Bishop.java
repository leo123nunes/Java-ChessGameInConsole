package chess.pieces;

import boardgame.Board;
import boardgame.BoardGameException;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {

	public Bishop(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "B";
	}

	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// ne
		p.setValues(position.getRow() - 1, position.getColumn()+1);

		while (getBoard().positionExists(p.getRow(), p.getColumn()) && getBoard().thereIsAPiece(p) == false) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1);
			p.setColumn(p.getColumn() + 1);
		}
		if (getBoard().positionExists(p.getRow(), p.getColumn()) && isThereOpponentPiece(p) == true) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// nw
		p.setValues(position.getRow() - 1, position.getColumn() - 1);

		while (getBoard().positionExists(p.getRow(), p.getColumn()) && getBoard().thereIsAPiece(p) == false) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1);
			p.setColumn(p.getColumn() - 1);
		}
		if (getBoard().positionExists(p.getRow(), p.getColumn()) && isThereOpponentPiece(p) == true) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// sw
		p.setValues(position.getRow() + 1, position.getColumn() - 1);

		while (getBoard().positionExists(p.getRow(), p.getColumn()) && getBoard().thereIsAPiece(p) == false) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() - 1);
			p.setRow(p.getRow()+1);
		}

		if (getBoard().positionExists(p.getRow(), p.getColumn()) && isThereOpponentPiece(p) == true) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// se
		p.setValues(position.getRow()+1, position.getColumn() + 1);

		while (getBoard().positionExists(p.getRow(), p.getColumn()) && getBoard().thereIsAPiece(p) == false) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() + 1);
			p.setRow(p.getRow()+1);
		}
		if (getBoard().positionExists(p.getRow(), p.getColumn()) && isThereOpponentPiece(p) == true) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		return mat;
	}
}
