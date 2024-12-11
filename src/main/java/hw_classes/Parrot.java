package hw_classes;

class Parrot extends Bird {
    protected String color;

    public Parrot(String name, int wingSpan, String color) {
        super(name, wingSpan);
        this.color = color;
    }

    public String speak() {
        return name + " говорит: Привет!";
    }
}