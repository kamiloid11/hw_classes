package hw_classes;

class Bird extends Animal {
    protected int wingSpan;

    public Bird(String name, int wingSpan) {
        super(name);
        this.wingSpan = wingSpan;
    }

    public String speak() {
        return name + " говорит: Чирик!";
    }
}