package com.github.rjs5613.chess;

import java.util.Collections;
import java.util.Set;

public sealed abstract class ChessPiece permits Queen, King, Rook, Bishop, Knight, Pawn {

    private Position currentPosition;
    private final Position initialPosition;
    private final PieceType pieceType;
    private Set<Position> validMoves;

    protected ChessPiece(Position initialPosition, PieceType pieceType) {
        this.initialPosition = initialPosition;
        this.pieceType = pieceType;
    }

    public abstract void updateValidMoves();

    private boolean isValidMove(Position destination) {
        return validMoves.contains(destination);
    }

    Position currentPosition() {
        return currentPosition;
    }

    public void move(Position newPosition) {
        if (isValidMove(newPosition)) {
            this.currentPosition = newPosition;
            this.updateValidMoves();
        }
    }

    protected void setValidMoves(Set<Position> validMoves) {
        this.validMoves = Collections.unmodifiableSet(validMoves);
    }

    public PieceType pieceType() {
        return this.pieceType;
    }

    public Set<Position> validMoves() {
        return this.validMoves;
    }

    public Position initialPosition() {
        return initialPosition;
    }
}
