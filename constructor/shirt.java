package constructor;

public class shirt {
    public String color;
    public String size;
    public static String material; // static makes material changed every shirt within the class

    // public "static" String color;
    // public "static" String size;
    // When you use static, it means that these things (color and size) belong to
    // the whole class, not just one shirt. It's like if you and your friend share a
    // toy. You both play with the same toy, and if you change something about the
    // toy, it affects both of you.

    // shirt() {} //Default constructor, nothing needs to be in here, we don't even
    // need it
    shirt(String newColor, String newSize, String newMaterial) {
        color = newColor;
        size = newSize;
        material = newMaterial;
    }
}