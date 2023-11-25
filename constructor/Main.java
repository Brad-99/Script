package constructor;

public class Main {
    public static void main(String[] args) {
        shirt s = new shirt("White", "M", "wool");
        shirt blackShirt = new shirt("Black", "L", "cotton");

        System.out.println("s Color: " + s.color);
        System.out.println("s Size: " + s.size);
        System.out.println("s Material: " + s.material);
        System.out.println("-------------------------------------------------------");
        System.out.println("s Color: " + blackShirt.color);
        System.out.println("s Size: " + blackShirt.size);
        System.out.println("s Material: " + s.material);

    }
}

// all constructor does is make an object for you, that's why you can create
// like a Scanner
// Scanner scan = new Scanner(); // if we import Scanner class, just like in
// shirt class, we have lots of
// different constructors too, like Scanner(InputStream, String).. etc these are
// all constructors for a scanner
// just like we have shirt() that pass different parameters inside
// all constructor does is make an object