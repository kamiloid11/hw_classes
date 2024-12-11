package hw_classes;

class Dog extends Mammal {
    public Dog(String name, String furColor) {
        super(name, furColor);
    }

    public String speak() {
        return name + " говорит: Гав!";
    }
}