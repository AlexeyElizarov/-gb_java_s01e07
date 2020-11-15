public class Cat {

    private final String name;

    private final int appetite;
    private boolean isFull = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            isFull = true;
        }
    }

    public void info() {
        System.out.printf("%s wants %d of food.\n", name, appetite);
        System.out.printf("Is %s full? %b\n", name, isFull);
    }
}