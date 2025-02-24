package ra;
@FunctionalInterface
public interface IColorAble {
    public static void display(){
        System.out.println("hello world");
    }
    public default void move(){
        System.out.println("moving");
    }
    void showColor(String color);
}
