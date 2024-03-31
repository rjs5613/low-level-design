package com.github.rjs5613.chess;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ChessGame {

    private final ChessBoard chessBoard;
    private final Player blackPiecePlayer;
    private final Player whitePiecePlayer;
    private final List<MoveLog> moveLog;

    public ChessGame(ChessBoard chessBoard, Player whitePiecePlayer, Player blackPiecePlayer) {
        this.chessBoard = chessBoard;
        this.blackPiecePlayer = blackPiecePlayer;
        this.whitePiecePlayer = whitePiecePlayer;
        this.moveLog = new LinkedList<>();
    }

    public void move(Player player, Position start, Position end) {
        ChessPiece piece = chessBoard.move(start, end);
        moveLog.add(new MoveLog(player, piece, start, end));
    }

    public List<MoveLog> moveLog() {
        return Collections.unmodifiableList(moveLog);
    }

}
