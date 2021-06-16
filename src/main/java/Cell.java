import java.util.Map;

public enum Cell {

    A, B, C;

    private static Cell[] vals = values();

    public Cell next() {
        return vals[(this.ordinal()+1) % vals.length];
    }

}
