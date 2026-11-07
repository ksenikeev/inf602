/**
 * Поле игры морской бой. Создать класс корабль (размер, координаты начала, конца).
 * import java.util.Random;
 * Random random = new Random();
 * int i = random.nextInt(10);
 *
 * Расставить корабли на поле случайным образом.
 *
 * 1 - 4
 * 2 - 3
 * 3 - 2
 * 4 - 1
 */
public class Battle {

    public SeaBattleField seaBattleField;

    public Battle() {
        System.out.println("Battle");
        seaBattleField = new SeaBattleField();

        seaBattleField.showField();
    }

}