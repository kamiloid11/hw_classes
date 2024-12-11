package hw_classes;

class Mammal extends Animal {
    protected String furColor;

    public Mammal(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }

    public String speak(String name) {
        return name + " говорит: Гав!";
    }
}