public class Figure {
    /* black, white */
    protected String color;

    protected int row;
    protected int column;

    public void setColor(String color) {
        this.color = color.toLowerCase();
    }

    public void setRow(int row) {
        this.row = row - 1;
    }

    public void setColumn(char column) {
        this.column = convertCharToColumnIndex(column);
    }

    public int getRow() {
        return row + 1;
    }

    public char getColumn() {
        return (char)(column + 'a');
    }

    public boolean isPossibleStep(char c, int pos) {
        return false;
    }

    public int convertCharToColumnIndex(char c) {
        if ('A' <= c && c <= 'H') return c - 'A';
        else if ('a' <= c && c <= 'h') return c - 'a';
        else return -1;

/*
        return switch (c) {
            case 'A', 'a' -> 0;
            case 'B', 'b' -> 1;
            case 'C', 'c' -> 2;
            case 'D', 'd' -> 3;
            case 'E', 'e' -> 4;
            case 'F', 'f' -> 5;
            case 'G', 'g' -> 6;
            case 'H', 'h' -> 7;
            default -> -1;
        };
*/
    }

}