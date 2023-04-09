package DZ_N2;

public class Tree {
    // 3) Создать класс Tree с перегруженными конструкторами.
    //   В классе есть Tree есть поля:
    //   String type; int height, int coutOfsticks, String colour;
    //
    //   Конструктор1 принимающий в параметры String type; int height
    //   и присваивающий значение полям coutOfsticks значение 13,
    //   colour "Зеленый".
    //
    //   Конструктор2 принимающий в параметры int height, int coutOfsticks,
    //   String colour и присваивающий значение полю type "пихта".
    //
    //   Констуктор по умолчанию 3, который присваивает height = 350, coutOfsticks = 29,
    //   сolour = "Желтый".
    //
    //   Конструктор4 который принимает в параметры String type,
    //   и вызывает внутри себя конструктор 3.
    //
    //   Создать в отдельном классе main 4 объекта класса Tree используя 4 созданных конструктора.


        int heigt;
        String type;
        int countOfsticks;
        String colour;

        public Tree(String type, int heigt) {
            this.type = type;
            this.heigt = heigt;
            this.countOfsticks = 13;
            this.colour = "Зелёный";
        }

        public Tree(int height, int coutOfsticks, String colour) {
            this.type = "Пихта";
            this.heigt = this.heigt;
            this.countOfsticks = coutOfsticks;
            this.colour = colour;
        }

        public Tree() {
            this.heigt = 350;
            this.countOfsticks = 29;
            this.colour = "Жёлтый";
        }

        public Tree(String type) {
            this();
            this.type = type;
        }

        public void getInfo() {
            System.out.println(this.type);
            System.out.println(this.heigt);
            System.out.println(this.countOfsticks);
            System.out.println(this.colour);
        }
    }


