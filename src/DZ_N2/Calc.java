package DZ_N2;

import java.util.Scanner;

public class Calc {
    // 4) Создать класс калькулятор.
    //   В нем создать методы:
    //   summ, minus, multiply, division.
    //   Сложение, вычитание, умножение и деление соответственно.
    //   Каждый метод принимает в качестве параметров два значения типа double.
    //   И выводит в консоль результат действия.
    //
    //   Также в классе есть метод старт. Который выводит сообщение в консоль, что
    //   калькулятор запущен. И предлагает ввести действие в вашей консоли.
    //
    //   Калькулятор должен принимать только следующие типы действий:
    //   2+4;    - пример синтаксиса сложения;
    //   5-6;    - пример синтаксиса вычитания;
    //   25*3;   - пример синтаксиса умножения;
    //   34/3;   - пример синтаксиса деления;
    //   После ввода действия на консоль выводится ответ этого действия.
    //   И после снова выводится сообщение о предложении ввести действие.
    //
    //   в случае ввода другого синтаксисана консоль возвращается сообщение:
    //   "Введите корректное действие".
    //   И после снова выводится сообщение о предложении ввести действие.
    //
    //   Программа закрывается после ввода команды Stop.
    //   Перед закрытием на консоль должно выводится сообщение:
    //   "Калькулятор закрыт".

    public void sum(double a, double b) {
        System.out.println("Результат: " + (a + b));
    }

    public void minus(double a, double b) {
        System.out.println("Результат: " + (a - b));
    }

    public void multiply(double a, double b) {
        System.out.println("Результат: " + (a * b));
    }

    public void division(double a, double b) {
        System.out.println("Результат: " + (a / b));
    }

    public void start()
    {
        System.out.println("калькулятор запущен, stop закроет программу");
        Scanner in = new Scanner(System.in);
        String action;
            System.out.println("введите ваше действие:");
            action = in.nextLine();
        while (!action.equalsIgnoreCase("stop")){
          if (action.contains("+")) {
              double n1 = Double.parseDouble(action.split("\\+")[0]);
              double n2 = Double.parseDouble(action.split("\\+")[1]);
            sum(n1, n2);
        }else if (action.contains("-")) {
              double n1 = Double.parseDouble(action.split("\\-")[0]);
              double n2 = Double.parseDouble(action.split("\\-")[1]);
              minus(n1, n2);
        }else if (action.contains("*")) {
              double n1 = Double.parseDouble(action.split("\\*")[0]);
              double n2 = Double.parseDouble(action.split("\\*")[1]);
              multiply(n1, n2);
        }else if (action.contains("/")) {
              double n1 = Double.parseDouble(action.split("\\/")[0]);
              double n2 = Double.parseDouble(action.split("\\/")[1]);
              division(n1, n2);
        }else  {
              System.out.println("некоректный ввод!");
          }
            System.out.println("введите ваше действие:");
            action = in.nextLine();
    }
        System.out.println("калькулятор закрыт");
    }
}




