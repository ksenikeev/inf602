public class ChessDesk {

    private Figure[][] desk = new Figure[8][8];

    /**
     * Поставить фигуру на клетку доски
     * @param figure - фигура
     * @param c - колонка 'A' - 'H', 'a' - 'h'
     * @param pos - строка 1 - 8
     * @return 0 - фигура поставлена, 1 - поле занято, 2 - невозможно поставить,
     * клетка бьется
     */
    public int setFigure(Figure figure, char c, int pos) {
        int row = pos - 1;
        int column = figure.convertCharToColumnIndex(c);
        if (desk[row][column] == null) {
            desk[row][column] = figure;
            return 0;
        }

        return 1;
    }
}