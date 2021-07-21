/*
 * @author Vlad Ishtukin
 * @project MaveanNew
 * @class Main
 * @version 1.0.0
 * @since 15.07.2021 - 10.43
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");


        Parallelogram p1 = new Parallelogram(3,4,45);
        System.out.println(p1.getArea());
        System.out.println(p1.getHeight());
        System.out.println(p1.getAngle());
        System.out.println(p1.getDiagonal());
        System.out.println(p1.getPerimeter());
    }
}
