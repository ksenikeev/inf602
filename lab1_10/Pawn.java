/** Пешка */
public class Pawn extends Figure {

    public boolean isPossibleStep(char c, int pos) {
        int row = pos - 1;
        int column = convertCharToColumnIndex(c);

        if (color.equals("white")) {
            if (this.column == column && this.row == row + 1) return true;
            if (this.row == 1 && row == 3) return true;
            if ((this.column == column + 1 || this.column == column - 1)
                    && this.row == row + 1) return true;
        } else {
            if (this.column == column && this.row == row - 1) return true;
            if (this.row == 6 && row == 4) return true;
            if ((this.column == column + 1 || this.column == column - 1)
                    && this.row == row - 1) return true;
        }
        return false;
    }
}