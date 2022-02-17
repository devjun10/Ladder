package ladder.model.ladder;

import ladder.model.Direction;
import ladder.model.strategy.PointFactory;

public class Point {

    private static final int NEXT = 1;

    private final int index;
    private final Direction direction;

    public Point(int index, Direction direction) {
        this.index = index;
        this.direction = direction;
    }

    public int getIndex() {
        return index;
    }

    public int move() {
        if (this.direction.isRight()) {
            return this.index + NEXT;
        }
        return this.index;
    }

    public Point next() {
        return getNextPoint();
    }

    private Point getNextPoint() {
        return PointFactory.getNextPoint(this);
    }

    public Point last() {
        return PointFactory.getLastPoint(this);
    }

    public Direction getDirection() {
        return direction;
    }
}
