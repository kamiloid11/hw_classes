package hw_classes;

class Fish extends Animal {
    protected String finSize;

    public Fish(String name, String finSize) {
        super(name);
        this.finSize = finSize;
    }

    public String speak() {
        return name + " не говорит, он рыбка!";
    }
}