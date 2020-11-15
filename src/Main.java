public class Main {

    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Puzzik", 80),
                new Cat("Barsik", 50),
                new Cat("Murzik", 20),
                new Cat("Tuzik", 10),
        };

        Plate plate = new Plate(50);
        plate.info();

        for (Cat cat: cats) {
            cat.eat(plate);
            cat.info();
            plate.info();
        }

        plate.fillFood(130);
        plate.info();

        for (Cat cat: cats) {
            plate.info();
            cat.eat(plate);
            cat.info();

        }

    }
}