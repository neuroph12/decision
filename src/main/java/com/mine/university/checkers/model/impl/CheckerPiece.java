package com.mine.university.checkers.model.impl;

import com.mine.university.checkers.model.Piece;
import com.mine.university.checkers.model.Point;

public class CheckerPiece implements Piece<Point> {

    private final Point position;

    private final double weight;

    public CheckerPiece(Point position, double weight) {
        this.position = position;
        this.weight = weight;
    }

    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}