package ru.geekbrains.javaone.lesson_g.online;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Map;
import java.util.Random;

/*
Очень много демотиваторов - хватит ли мозгов, времени, сил... Особенно когда слышишь, что кто-то уже ИИ дописывает к крестикам-ноликам, а ты ещё логику проверки ходов не придумал. Поэтому, от Вас хотелось бы наставления: на что обратить внимание, на что-то может быть наоборот сейчас не смотреть, стоит ли вообще за это браться или в моем возрасте уже без шансов. Покажите, пожалуйста, Вашу логику проверки выигрышной комбинации.

1)Как быстро менять размер шрифта программы в идее?
2)Не до конца понял разницу между for и while.

Пункт 1.
1.1 Вначале было понятно,но чем дальше пишется программа,тем сложнее удерживать фокус внимания за всеми объектами.
1.2 При создания слайдера уже окончательно запутался.
Пункт 2.
2.1 По моему мнению на домашке ,когда надо было дописать крестики нолики был резкий скачок по сложности,который я так и не смог преодолеть.
2.2 Самый понятный вебинар был на 5 уроке и домашнее задание сразу стало понятнее выполнять.
2.3 В ходе выполнения всех ДЗ была понятна логика,что надо сделать,но в реализации чувствовалось, что плаваю при создании методов.Сложные циклы
при выполнении ДЗ урока 5,6 сложно выполнялись,понял для себя ,что надо их лучше изучить.

В чем отличие возвращающего метода и метода void?
Какой логический оператор лучше использовать & или &&?
Чем отличаются геттеры и сеттеры и как их применять правильно?
Чем отличется обычный класс от абстрактного?
Инициализация нового конструктора и его использование?
Правила идеального написания метода.
Правила «читаемого» и красивого кода.
Как правильно обратится к определенному обьекту массива.
Как в IDEA вернуть удаленный кусок кода или строку?
Какими полезными фишками IDEA необходимо владеть?
Пожалуйста скажите как прокачать скил решения алгоритмов, какой вообще должен быть подход

Пожалуйста, еще раз рассказать про инкапсуляцию, геттеры и сеттеры

Расскажите подробнее про «@Override». Может ли модификатор доступа у переопределенного метода отличаться от «оригинального»? Можно ли, например, private метод переопределить как protected?
Читала, что в java нет множественного наследования. Предположим, у нас есть BigCat, он наследует от Cat, который в свою очередь наследует от Animals. Это не является множественным наследованием?


Как делать поиск в файлах с кириллицей?
Как работать с graphic?

На 6ом уроке мы рассматривали код метода equals, где сравнивается два стринга. И там есть строчка, где мы в массив чар записываем некий value. Как мы без кастов из стринг сделали массив чаров и что за value, вообщем хотелось бы понять это место.
Можно ли из чар 'ddfgg',например, сделать массив чар где каждый символ разложим по ячейкам. Видимо плохо гуглил,ответа не нашел.
Как закрепить понимание ООП? Теорию я знаю, но пока полного понимания как это работате нет.

Код переписывала пересматривая лекцию, так больше стало понятно, посмотрела варианты метод paintComponent для решения 3го пункта ДЗ, но очень плохо разобралась с реальзацией данного метода, вариантов как можно это сделать несколько, надеюсь разобраться на уроке.
Воспросы: Хотелось бы по подробнее узнать для чего нам пригодится фронтэнд на Джаве, на сколько я знаю Джава все таки по большому счету бэк-энд язык, для общего понимания?
В какие области Джавы лучше углубиться при подготовке ко 2му курсу , на что стоит обратить внимание?
В какие области Джавы лучше углубиться при подготовке к реальной работе, на что стоит больше обратить внимание?
1. Есть ли принципиальная разница в использовании try с ресурсами и ручного закрытия потоков?
2. В каких случаях на практике используются Buffered Input Stream и Buffered Output Stream? Каковы их преимущества и недостатки (если есть)?
3. Чем лучше пользоваться File Input Stream или File Reader (аналогично File Output Stream vs File Writer)? Есть ли между ними какая-либо существенная разница?


1. Классы.  Когда дело касается кошечек и собачек, все понятно. Понятно и в прошлом уроке, 3 окна - три объекта -три класса. Но есть такое ощущение, что не все так просто. Вот например, если Крестики-нолики писать без интерфейсов и не в одном классе, то сразу задумываешься какие здесь объекты и как это все построить и написать.
2. Java для тестировщиков. Понимание, что придется заниматься автоматизацией тестирования неких приложений и как вариант писать на Java. Хотелось бы узнать поподробней какие области в Java стоит заранее более глубже изучить и понять.
3. public static void main(String[] args) String[] args - это массив строк, понятно.  Но зачем он здесь нужен, и как этим можно воспользоваться?
4. В третьей домашней работе вы мне посоветовали  не пользоваться метками. Все забываю спросить, а почему?

1. Что целесообразно выносить в методы из конструктора? Мы выносили добавление элементов на панель, а стоит ли выносить, например, центровку окна Settings относительно GameWindow? Хочется побольше всего вынести из конструктора, не нравится нагромождение
2. Не получилось сделать, чтобы окно Settings закрывалось при нажатии кнопки Start a game.
3. Можете еще раз рассказать про StringBuilder и где его лучше применять, а где нет?

Все дело заключается в том, что если возникают непонимания какие-то- лезешь в книги\интернет и начинаешь изучать тему(разностороннее мнение лучше), а поскольку темы обширные- пытаешься понять больше ну и тд.
С JFrame начал только читать. То что было на выбинаре- немного для меня запутанно, потому как не понимал для чего столько много объектов и что их друг с другом связывает и для чего(вот когда смотришь вебинар- вроде нить видна, потому как вы нас по ней ведете, а самомунаписать-пока запутываюсь))) Мне кажется что при просмотре любого вебинара, где говорят что-то новое- так всегда. Необходимо время разобраться и осознать.

1) Можно ли прояснить насчет того, как реализовать ввод текста пользователем через Scanner (с позапрошлого урока ДЗ)?
После вашего замечания я написал это таким образом:
StringBuilder sb = new StringBuilder();
String s;
while (!(s = sc.nextLine()).isEmpty()) { sb.append(s); }
// while (!(s = sc.nextLine()).equals(".")) { sb.append(s); }
System.out.println(sb.toString());
sc.close();
String searchQuery = sb.toString();
Однако здесь программа отказывается опознавать переносы строк, хотя в переменной sb текст склеивается адекватно содержимому файла.
Хотел бы разобраться, почему это так.

2) Всегда лучше какие-либо вариативные параметры задавать в качестве глобальных констант с численным значением?
Как было в примерах с зоопарком и модусом игры в "крестиках-ноликах"?

3) Хотел бы удостовериться, что правильно понимаю логику работы в плане вызова окон "крестиков-ноликов".
При старте запускается игровое окно (GameWindow) из основного класса игры. Окно настроек есть, но скрыто; при клике на кнопку "Старт" окно настроек становится видимым.
Окно настроек и окно игры связаны между собой тем, что при вызове окна настроек ему передается (this), а в конструкторе настроек на этом месте стоит GameWindow,
что дает Настройкам, как классу, возможность видеть параметры GameWindow и подстраиваться под них.
Настройки передаются через вызов метода gameWindow.startNewGame(gameMode, fieldSize, fieldSize, winLength), который уже вызывает метод с тем же названием у GameMap.
Настройки снова делаются невидмым окном при вызове метода, стартующего игру, но при этом само окно еще существует.

(Можно ли в таком случае модифицировать игру так, чтобы вызывать настройки "посередине" игры? По логике так. По идее, если игру захочется прервать/перезапустить, это было бы полезно.
Тогда в Настройки добавляется ActionListener для определенной кнопки на клавиатуре, и ему назначается действие SetVisible?).

4) При расчерчивании игрового поля оно будет расчерчиваться на квадраты соответственно тому, какой выбран размер? Панель (которой является GameMap)
делится с помощью того же Layout'а. Или функционал у ячеек отличается от кнопок?

Что такое паттерны
 Среди основных принципов ООП упоминают - абстракцию, что этот такое?
 equals - метод сравнения строк, есть ли метод сравнения двух классов(объектов) - унаследованных от одного родителя
 что такое - интерфейс, отличаеться ли он от объекта или класса?

 1) можно ли в крестиках-ноликах сделать проверку линий методом поиска в массиве Строковых значений?
Например, если в массиве найдется "XXXX"(слепленные буквы Х) после перебора со смещениями, и заданная длина победной линии 4, то это найденное значение вернет true и выведет победу? И как такое реализовать при поиске в массиве?
2) Как при написании программы систематизировать переменные и методы, как понимать что за чем должно идти и как понимать какие параметры делать в классе (а какие можно и по ходу в методе прописать)

Как работает сборщик мусора? Что такое Выжившая куча?
* */

public class GameMap extends JPanel {
    public static final int GM_HVH = 0;
    public static final int GM_HVA = 1;

    private static final int DOT_EMPTY = 0;
    private static final int DOT_HUMAN = 1;
    private static final int DOT_AI = 2;

    private static final int DOT_PADDING = 5;

    private int stateGameOver;
    private static final int STATE_DRAW = 0;
    private static final int STATE_WIN_HUMAN = 1;
    private static final int STATE_WIN_AI = 2;

    private static final String MSG_WIN_HUMAN = "Победил игрок!";
    private static final String MSG_WIN_AI = "Победил компьютер!";
    private static final String MSG_DRAW = "Ничья!";

    private static final Random RANDOM = new Random();

    private int[][] field;
    private int fieldSizeX;
    private int fieldSizeY;
    private int winLength;
    private int cellWidth;
    private int cellHeight;
    private boolean isGameOver;
    private boolean initialized;
    Image imgX = null;

    GameMap() {
        setBackground(Color.WHITE);
        initialized = false;
        try {
            imgX = ImageIO.read(Map.class.getResourceAsStream("pic.png"));
        } catch (IOException | IllegalArgumentException x) {
            System.out.println(x.getMessage());
        }

    }

    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength) {
        this.fieldSizeY = fieldSizeY;
        this.fieldSizeX = fieldSizeX;
        field = new int[fieldSizeY][fieldSizeX];
        this.winLength = winLength;
        isGameOver = false;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                update(e);
            }
        });
        initialized = true;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }

    private void render(Graphics g) {
        if (!initialized) return;
        int width = getWidth();
        int height = getHeight();
        cellWidth = width / fieldSizeX;
        cellHeight = height / fieldSizeY;
        g.setColor(Color.BLACK);
        for (int i = 0; i < fieldSizeY; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, width, y);
        }
        for (int i = 0; i < fieldSizeX; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, height);
        }
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isEmptyCell(x, y)) continue;
                if (field[y][x] == DOT_HUMAN) {
                    if (imgX != null) {
                        g.drawImage(imgX, x * cellWidth, y * cellHeight, null);
                    } else {
                        g.setColor(Color.BLUE);
                        g.fillOval(x * cellWidth + DOT_PADDING,
                                y * cellHeight + DOT_PADDING,
                                cellWidth - DOT_PADDING * 2,
                                cellHeight - DOT_PADDING * 2);
                    }
                } else if (field[y][x] == DOT_AI) {
                    g.setColor(new Color(255, 1, 1));
                    g.fillOval(x * cellWidth + DOT_PADDING,
                            y * cellHeight + DOT_PADDING,
                            cellWidth - DOT_PADDING * 2,
                            cellHeight - DOT_PADDING * 2);
                } else {
                    throw new RuntimeException(
                            String.format("Can't recognize cell field[%d][%d]: %d",
                                    y, x, field[y][x]));
                }
            }
        }
        if (isGameOver) {
            showMessageGameOver(g);
        }
    }
    private void showMessageGameOver(Graphics g) {
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 200, getWidth(), 70);
        g.setColor(Color.YELLOW);
        g.setFont(new Font("Times new roman", Font.BOLD, 48));
        switch (stateGameOver) {
            case STATE_DRAW:
                g.drawString(MSG_DRAW, 180, getHeight() / 2);
                break;
            case STATE_WIN_AI:
                g.drawString(MSG_WIN_AI, 20, getHeight() / 2);
                break;
            case STATE_WIN_HUMAN:
                g.drawString(MSG_WIN_HUMAN, 70, getHeight() / 2);
                break;
            default:
                throw new RuntimeException("Unexpected gameOver state: " + stateGameOver);
        }
    }

    private void update(MouseEvent e) {
        if (!initialized) return;
        if (isGameOver) return;
        int cellX = e.getX() / cellWidth;
        int cellY = e.getY() / cellHeight;
        if (!isValidCell(cellX, cellY) || !isEmptyCell(cellX, cellY)) return;
        field[cellY][cellX] = DOT_HUMAN;
        if (checkWin(DOT_HUMAN)) {
            setGameOver(STATE_WIN_HUMAN);
            return;
        }
        if (isDraw()) {
            setGameOver(STATE_DRAW);
            return;
        }
        aiTurn();
        repaint();
        if (checkWin(DOT_AI)) {
            setGameOver(STATE_WIN_AI);
            return;
        }
        if (isDraw()) {
            setGameOver(STATE_DRAW);
            return;
        }

    }

    private void setGameOver(int gameOverState) {
        isGameOver = true;
        stateGameOver = gameOverState;
        repaint();
    }

    // Ход компьютера
    private void aiTurn() {
        if (turnAIWinCell()) return;        // проверим, не выиграет-ли комп на следующем ходу
        if (turnHumanWinCell()) return;    // проверим, не выиграет-ли игрок на следующем ходу
        int x, y;
        do {                            // или комп ходит в случайную клетку
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(x, y));
        field[y][x] = DOT_AI;
    }

    // Проверка, может ли выиграть комп
    private boolean turnAIWinCell() {
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                if (isEmptyCell(j, i)) {                // поставим нолик в каждую клетку поля по очереди
                    field[i][j] = DOT_AI;
                    if (checkWin(DOT_AI))
                        return true;    // если мы выиграли, вернём истину, оставив нолик в выигрышной позиции
                    field[i][j] = DOT_EMPTY;            // если нет - вернём обратно пустоту в клетку и пойдём дальше
                }
            }
        }
        return false;
    }

    // Проверка, выиграет-ли игрок своим следующим ходом
    private boolean turnHumanWinCell() {
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                if (isEmptyCell(j, i)) {
                    field[i][j] = DOT_HUMAN;            // поставим крестик в каждую клетку по очереди
                    if (checkWin(DOT_HUMAN)) {            // если игрок победит
                        field[i][j] = DOT_AI;            // поставить на то место нолик
                        return true;
                    }
                    field[i][j] = DOT_EMPTY;            // в противном случае вернуть на место пустоту
                }
            }
        }
        return false;
    }

    // проверка на победу
    private boolean checkWin(int c) {
        for (int i = 0; i < fieldSizeX; i++) {            // ползём по всему полю
            for (int j = 0; j < fieldSizeY; j++) {
                if (checkLine(i, j, 1, 0, winLength, c)) return true;    // проверим линию по х
                if (checkLine(i, j, 1, 1, winLength, c)) return true;    // проверим по диагонали х у
                if (checkLine(i, j, 0, 1, winLength, c)) return true;    // проверим линию по у
                if (checkLine(i, j, 1, -1, winLength, c)) return true;    // проверим по диагонали х -у
            }
        }
        return false;
    }

    // проверка линии
    private boolean checkLine(int x, int y, int vx, int vy, int len, int c) {
        final int far_x = x + (len - 1) * vx;            // посчитаем конец проверяемой линии
        final int far_y = y + (len - 1) * vy;
        if (!isValidCell(far_x, far_y)) return false;    // проверим не выйдет-ли проверяемая линия за пределы поля
        for (int i = 0; i < len; i++) {                    // ползём по проверяемой линии
            if (field[y + i * vy][x + i * vx] != c) return false;    // проверим одинаковые-ли символы в ячейках
        }
        return true;
    }

    private boolean isValidCell(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    private boolean isEmptyCell(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    private boolean isDraw() {
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                if (field[i][j] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }


}
