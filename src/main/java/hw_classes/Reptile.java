package hw_classes;

class Reptile extends Animal {
    protected String scaleColor;

    public Reptile(String name, String scaleColor) {
        super(name);
        this.scaleColor = scaleColor;
    }

    public String speak() {
        return name + " говорит: Шшш!";
    }
}