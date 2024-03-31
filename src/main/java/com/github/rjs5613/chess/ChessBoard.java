package com.github.rjs5613.chess;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChessBoard {

    private final Map<Position, ChessPiece> chessPieces;


    public ChessBoard() {
        chessPieces = new HashMap<>();
    }

    public void init() {

    }

    public ChessPiece move(Position start, Position end) {
        ChessPiece currentPiece = chessPieces.get(start);
        currentPiece.move(end);
        chessPieces.put(end, currentPiece);
        chessPieces.remove(start);
        return currentPiece;
    }

    public Map<Position, ChessPiece> getPieceMap() {
        return Collections.unmodifiableMap(chessPieces);
    }
}
