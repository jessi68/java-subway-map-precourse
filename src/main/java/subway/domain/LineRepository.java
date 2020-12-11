package subway.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class LineRepository {
    private static final List<Line> lines = new ArrayList<>();

    public static List<Line> lines() {
        return Collections.unmodifiableList(lines);
    }

    public static void addLine(Line line) {
        lines.add(line);
    }

    public static boolean deleteLineByName(String name) {
        return lines.removeIf(line -> Objects.equals(line.getName(), name));
    }

    public boolean isContaining(Station station) {
        for(Line line: lines) {
            if (line.isContaining(station)) {
                return true;
            }
        }
        return false;
    }

    public boolean isRepeatedName(String Name) {
        for(Line line: lines) {
            if(line.equalName(Name)) {
                return true;
            }
        }
        return false;
    }
}
