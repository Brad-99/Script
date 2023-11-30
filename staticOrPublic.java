public class staticOrPublic {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[] args) {
        // staticOrPublic myObj0 = new staticOrPublic();
        // myObj0.myStaticMethod(); // Call the static method
        myStaticMethod(); // Call the static method

        staticOrPublic myObj = new staticOrPublic(); // Create an object of MyClass
        myObj.myPublicMethod(); // Call the public method
    }
}
