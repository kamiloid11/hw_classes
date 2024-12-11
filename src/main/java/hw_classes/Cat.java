package hw_classes;

class Cat extends Mammal {
    public Cat(String name, String furColor) {
        super(name, furColor);
    }

    public String speak() {
        return name + " говорит: Мяу!";
    }
}