interface Animal1 {
    public void animalSound(); // interface method (does not have a body)

    public void sleep(); // interface method (does not have a body)
}

interface FirstInterface {
    public void myMethod(); // interface method
}

interface SecondInterface {
    public void myOtherMethod(); // interface method
}

class Pig implements Animal1, FirstInterface, SecondInterface {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    public void sleep() {
        System.out.println("Zzz");
    }

    public void myMethod() {
        System.out.println("Some text..");
    }

    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

class AnimalInterface {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
        myPig.myMethod();
        myPig.myOtherMethod();
    }
}
