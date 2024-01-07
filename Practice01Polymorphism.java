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

abstract class Telephone {
    abstract void ring();

    abstract void lift();

    abstract void disconnected();
}

class SmartTelephone extends Telephone {
    public void ring() {
        System.out.println("Ringing..");
    }

    public void lift() {
        System.out.println("Lifting....");
    }

    public void disconnected() {
        System.out.println("Disconnected...");
    }
}

interface TVRemote {

}

interface SmartTVRemote extends TVRemote {

}

class TV implements TVRemote {

}

public class Practice01Polymorphism {
    public static void main(String[] args) {
        // Q1 + Q2
        FountainPen pen = new FountainPen();
        pen.Write();
        pen.Refill();
        pen.ChangeNib();
        // Q3
        Human prayas = new Human();
        prayas.sleep();
        prayas.eat();
        prayas.speak();
        //Q4
        Telephone tl = new SmartTelephone();
        tl.ring();
        tl.lift();
        tl.disconnected();

        // Q5
        Monkey m1 = new Human();
        m1.bite();
        m1.jump();
    }
}
