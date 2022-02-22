package ladder.domain;

import java.util.ArrayList;
import java.util.List;

public class LadderLine {

    private List<String> lines;

    public LadderLine(List<String> lines) {
        this.lines = lines;
    }

    public static void main(String[] args) throws Exception {
        List<String> eachLines = new ArrayList<>();
        eachLines.add("-");
        eachLines.add("-");
        eachLines.add("-");
        eachLines.add("|");
        eachLines.add("|");
        eachLines.add("-");

        LadderLine ladderLine = new LadderLine(eachLines);

        List<String> lines = ladderLine.getLines();

        for(int index=0; index<lines.size()-1; index++){
            if(lines.get(index).equals("|")&& lines.get(index+1).equals("|")){
                System.out.println("이 선은 그릴 수 없습니다. ");
            }
            System.out.print(lines.get(index));
        }
    }

    public List<String> getLines() {
        return lines;
    }
}
