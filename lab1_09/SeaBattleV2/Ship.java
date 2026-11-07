public class Ship {
    private byte size;
    /**
     * система координат от 0
     */
    private byte xStart;
    private byte yStart;
    private byte xEnd;
    private byte yEnd;

    /* 0 - целый, 1 - ранен, 2 - подбит */
    //private byte state;
    /* 0 - целый, 1 - ранен, 2 - подбит */
    private byte[] statePart;

    /*
        создать конструктор с аргументами:
        размер корабля, координаты нос, координаты кормы
        проинициализировать statePart
     */
    public Ship(byte size, byte xStart, byte yStart, byte xEnd, byte yEnd) {
        this.size = size;
        this.xStart = xStart;
        this.yStart = yStart;
        this.xEnd = xEnd;
        this.yEnd = yEnd;
    }

    public byte getSize() {
        return size;
    }

    public byte getState() {
        for (int i = 0; i < statePart.length; ++i) {
            if (statePart[i] == 1) return 1;
            if (statePart[i] == 2) return 2;
        }

        return 0;
    }

    public byte getxStart() {
        return this.xStart;
    }

    public byte getyStart() {
        return yStart;
    }

    public byte getxEnd() {
        return xEnd;
    }

    public byte getyEnd() {
        return yEnd;
    }

    public byte[] getStatePart() {
        return statePart;
    }

    public void setState(byte state) {
        if (state == 1) return;
        for (int i = 0; i < statePart.length; ++i) {
            statePart[i] == state;
        }
    }

    public void setState(byte x, byte y) {
        if (yStart == yEnd) {
            statePart[x - xStart] = 1;
        } else {
            statePart[y - yStart] = 1;
        }
    }
}
/*

Добавить методы:
выстрел (x,y) - изменение в статусах кораблей, если попали, или отметки на игровом поле о выстреле
 */