package ladder;

import ladder.domain.GameManager;
import ladder.system.ObjectFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        GameManager gameManager = ObjectFactory.gameManager;
        gameManager.startGame();
    }
}
