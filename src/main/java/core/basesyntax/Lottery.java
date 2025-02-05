package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE_OF_THE_BALL = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),random.nextInt(MAX_VALUE_OF_THE_BALL));
    }
}
