package ladder.domain;

import ladder.domain.ladder.Height;
import ladder.domain.ladder.Ladder;
import ladder.domain.ladder.LadderLines;
import ladder.domain.user.Names;
import ladder.system.ObjectFactory;

public class LadderGame {

    private Ladder ladder;

    private LadderGame (){
        this.ladder = ObjectFactory.ladder;
    }

    private static final LadderGame instance = new LadderGame();

    public static LadderGame getInstance() {
        if(instance == null){
            return new LadderGame();
        }
        return instance;
    }

    public LadderLines drawLadder(Names names, Height height) {
        return ladder.getLadderLines(names, height);
    }
}
