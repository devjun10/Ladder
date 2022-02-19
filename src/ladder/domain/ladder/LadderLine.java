package ladder.domain.ladder;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static ladder.utils.CopyUtils.copy;

public class LadderLine {

    private final List<Point> points;
    private static final String INDEX_OUT_OF_RANGE = "최소 1이상, 최대 15이하의 숫자만 입력하실 수 있습니다.";

    public LadderLine(List<Point> points) {
        validateLadderLine(points);
        this.points = copy(points);
    }

    private void validateLadderLine(List<Point> points) {
        Objects.requireNonNull(points);
        validateDrawable(points);
    }

    private void validateDrawable(List<Point> points) {
        for(Point point : points){
            Direction direction = point.getDirection();
            direction.validateDirection();
        }
    }

    public int trace(int index) {
        validateIndex(index);
        return points.get(index).move();
    }

    private void validateIndex(int index) {
        if (index > this.points.size()) {
            throw new IndexOutOfBoundsException(INDEX_OUT_OF_RANGE);
        }
    }

    public List<Point> getPoints() {
        if (this.points.isEmpty()) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(copy(this.points));
    }
}