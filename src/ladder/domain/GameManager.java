package ladder.domain;

import ladder.domain.ladder.Height;
import ladder.domain.ladder.LadderLines;
import ladder.domain.user.Names;
import ladder.system.ObjectFactory;
import ladder.view.InputView;
import ladder.view.OutputView;

public class GameManager {

    private static InputView inputView;
    private static OutputView outputView;
    private static LadderGame ladderGame;

    private static final GameManager instance = new GameManager();

    private GameManager() {
        inputView = ObjectFactory.inputView;
        outputView = ObjectFactory.outputView;
        ladderGame = ObjectFactory.ladderGame;
    }

    public static GameManager getInstance() {
        if (instance == null) {
            return new GameManager();
        }
        return instance;
    }

    public void startGame() throws Exception {
        while (true) {
            Names names = inputView.getPlayerNames();
            Height height = inputView.getHeight();
            LadderLines ladderLines = ObjectFactory.ladder.getLadderLines(names, height);
            outputView.print(ladderLines, names);
        }
    }
}
