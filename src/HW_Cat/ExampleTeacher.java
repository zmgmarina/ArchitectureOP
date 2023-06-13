package HW_Cat;

public class ExampleTeacher {
    /**
     * Тарелка с едой
     */
    public class Plate {

        private int food;

        /**
         * Добавление еды в тарелку
         * @param amount  - кол-во еды (в условных единицах)
         */
        public void putFood(int amount) {
            this.food += amount;
            System.out.printf("Добавлено %d еды в тарелку, теперь в тарелке %d еды\n", amount, food);
        }

        /**
         * Удаление еды из тарелки
         * @param amount - кол-во еды (в условных единицах)
         * @return - если в тарелке, после удаления, остается достаточно еды, возвращаем результат операции true,
         * в противном случае, не удаляем еду, возвращаем результат операции false
         */
        public boolean decreaseFood(int amount) {
            if (this.food < amount) {
                System.out.println("Недостаточно еды для ее удаления");
                return false;
            }
            this.food -= amount;
            System.out.printf("Удалено %d еды из тарелки, теперь в тарелке %d еды\n", amount, food);
            return true;
        }

    }
//    Класс животного , например, кота.
//
//    Тут, основная идея, в метод eat передать экземпляр тарелки с едой и фактически расписать алгоритм кормления животного:

    /**
     * Кот
     */
    public class Cat {

        //#region Fields

        /**
         * Кличка
         */
        private String name;

        /**
         * Аппетит
         */
        private int appetite;

        /**
         * Сытость
         */
        private boolean satiety;

        //#endregion

        //#region Constructors

        /**
         *
         * @param name - кличка кота
         */
        public Cat(String name) {
            this.name = name;
            this.satiety = false;
        }

        /**
         *
         * @param name - кличка кота
         * @param appetite - сытость
         */
        public Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
            this.satiety = false;
        }

        //#endregion


        /**
         * Покормить кота
         * @param plate - тарелка с едой
         */
        public void eat(Plate plate) {
            // Удаляем еду из миски в соответствии с аппетитом кота
            if (plate.decreaseFood(this.appetite)) { // Еды оказалось достаточно
                System.out.println(this.name + " покушал в соответствии со своим аппетитом " + this.appetite);
                // Кот насытился
                this.satiety = true;
            } else { // Еды оказалось недостаточно
                // п.4 Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
                // то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
                System.out.println(this.name + " не будет есть эти крошки. Еды не хватило.");
            }
        }

        /**
         * Вернуть кличку кота
         * @return - кличка кота
         */
        public String getName() {
            return name;
        }

        /**
         * Установить кличку кота
         * @param name - кличка кота
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * Вернуть признак сытости кота
         * @return - сытость
         */
        public boolean isSatiety() {
            return satiety;
        }
    }
//    Ну и главный метод программы, тестирование наших классов.
//    Создадим несколько животных, наполним миску едой и попытаемся по очереди покормить животных.

    public static void main(String[] args) {

        // Создаем котов
//        Cat[] cats = {
//                new Cat("Барсик", 10),
//                new Cat("Мурзик", 15),
//                new Cat("Персик", 12),
//                new Cat("Борис", 14)
//        };
//
//        // Создаем тарелку и наполняем ее едой
//        Plate plate = new Plate();
//        plate.putFood(35);
//
//        System.out.println("***");
//
//        // Кормим котов
//        for (Cat c : cats) {
//            c.eat(plate);
//        }
//
//        System.out.println("***");
//
//        // Результаты кормления
//        for (Cat c : cats) {
//            System.out.println("Кот " + c.getName() + " сытость: " + c.isSatiety());
        }
    }
//    А вот и сам результат:
//
//    Добавлено 35 еды в тарелку, теперь в тарелке 35 еды
//***
//    Удалено 10 еды из тарелки, теперь в тарелке 25 еды
//    Барсик покушал в соответствии со своим аппетитом 10
//    Удалено 15 еды из тарелки, теперь в тарелке 10 еды
//    Мурзик покушал в соответствии со своим аппетитом 15
//    Недостаточно еды для ее удаления
//    Персик не будет есть эти крошки. Еды не хватило.
//    Недостаточно еды для ее удаления
//    Борис не будет есть эти крошки. Еды не хватило.
//***
//    Кот Барсик сытость: true
//    Кот Мурзик сытость: true
//    Кот Персик сытость: false
//    Кот Борис сытость: false

