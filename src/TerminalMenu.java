
import java.util.Scanner;

import Factory.*;
import Figures.*;

public class TerminalMenu {

    static void startMenu() {
        System.out.println(startMenuText);
        Scanner input = new Scanner(System.in);
        switch (input.next()){
            case "1":
                break;
            case "2":
                TerminalMenu.acionsMenu();
                break;
            case "3":
                TerminalMenu.addFigureMenu();
                break;
            case "4":
                break;
            default:
                System.out.println("Введено некорректное значение");
                System.out.println(separator);
                TerminalMenu.startMenu();
                break;
        }
    }

    static void acionsMenu(){
        System.out.println(actionMenuText);
        Scanner input = new Scanner(System.in);
        IAbstarctFactory factory;
        switch (input.next()) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                TerminalMenu.startMenu();
                break;
            default:
                System.out.println("Введено некорректное значение");
                TerminalMenu.acionsMenu();
                break;
        }
    }

    static void addFigureMenu(){
        IAbstarctFactory factory = null;
        System.out.println(addFigureMenuText);
        Scanner input = new Scanner(System.in);
        switch (input.next()) {
            case "1":
                factory = new ellipseFactory();
                break;
            case "2":
                factory = new triangleFactory();
                break;
            case "3":
                factory = new rectangleFactory();
                break;
            case "4":
                factory = new rhombusFactory();
                break;
            case "5":
                TerminalMenu.startMenu();
                break;
            default:
                System.out.println("Введено некорректное значение");
                TerminalMenu.addFigureMenu();
                break;
        }
        assert factory != null;
        factory.createFigure();
        TerminalMenu.addFigureMenu();
    }

    private static String separator = "============================================\n";
    private static String startMenuText = "Выберете действие:\n" +
            "  1 - Вывод всех фигур\n" +
            "  2 - Выбрать фигуру\n" +
            "  3 - Добавить фигуру\n" +
            "  4 - Выход";
    private static String actionMenuText = "Выберете действие:\n" +
            "  1 - Поворот фигуры\n" +
            "  2 - Перемещение фигуры\n" +
            "  3 - Масштабирование фигуры\n" +
            "  4 - Рассчитать площадь\n" +
            "  5 - Удалить фигуру\n" +
            "  6 - Вернуться в главное меню";
    private static String addFigureMenuText = "Добавить фигуру:\n" +
            "  1 - Добавить эллипс \u2B2D \n" +
            "  2 - Добавить треугольник \u25B3 \n" +
            "  3 - Добавить прямоугольник \u25A1 \n" +
            "  4 - Добавить ромб \u25CA \n" +
            "  5 - Выход";
}
