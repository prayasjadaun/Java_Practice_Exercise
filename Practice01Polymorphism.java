//Question ----------------------------------------

abstract class Pen {
    abstract void Write();

    abstract void Refill();
}

class FountainPen extends Pen {
    void Write() {
        System.out.println("Write");
    }

    void Refill() {
        System.out.println("Refill");
    }

    void ChangeNib() {
        System.out.println("Changing the Nib");
    }
}

class Monkey {
    void jump() {
        System.out.println("Jumping.....");
    }

    void bite() {
        System.out.println("Bite");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    void speak() {
        System.out.println("Hello Sir....");
    }

    @Override
    public void eat() {
        System.out.println("Eating.....");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping.....");
    }
}

public class Practice01Polymorphism {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.Write();
        pen.Refill();
        pen.ChangeNib();
        Human prayas = new Human();
        prayas.sleep();
        prayas.eat();
        prayas.speak();
    }
}
