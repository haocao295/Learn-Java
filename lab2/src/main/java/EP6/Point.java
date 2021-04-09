
package EP6;

import java.util.ArrayList;
import java.util.List;

public class Point {
    List<Line> lines = new ArrayList<>();

    public List<Line> getLines() {
        return lines;
    }

    public void setLines(List<Line> lines) {
        this.lines = lines;
    }
    
    public void addLine(Line b){
        lines.add(b);
        b.setPoint(null);
    }
    
    public void removeLine(Line b){
        lines.remove(b);
        b.setPoint(null);
    }
}
