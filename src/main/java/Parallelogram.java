/*
 * @author Vlad Ishtukin
 * @project MaveanNew
 * @class Parallelogram
 * @version 1.0.0
 * @since 15.07.2021 - 13.02
 */

import java.util.Objects;

public class Parallelogram {
    public double sideA;
    public double sideB;
    public double angle;


    public Parallelogram() {
    }

    public Parallelogram(double sideA, double sideB, double angle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelogram that = (Parallelogram) o;
        return Double.compare(that.getSideA(), getSideA()) == 0 && Double.compare(that.getSideB(), getSideB()) == 0 && Double.compare(that.getAngle(), getAngle()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSideA(), getSideB(), getAngle());
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", angle=" + angle +
                '}';
    }
    public double getSin(){
        return Math.sin(Math.toRadians(this.getAngle()));
    }

    //get area of parallelogram
    public double getArea(){
        return this.getSideB()*this.getHeight();
    }

    // get height to the sideB
    public double getHeight(){
        return this.getSideA()* Math.sin(Math.toRadians(this.getAngle()));
    }
    //get the other angle of the parallelogram
    public double getSecondAngle(){
        return 180 - this.angle;
    }
    //get the diagonal
    public double getDiagonal(){
        double sideAsqr=  Math.pow(this.getSideA(), 2);
        double sideBsqr=  Math.pow(this.getSideB(), 2);
        return Math.sqrt((sideAsqr + sideBsqr + (2*this.getSideA()*this.getSideB()*Math.cos(Math.toRadians(this.getAngle())))));
    }
    public double getPerimeter(){
        return (this.getSideA()+this.getSideB())*2;
    }


    /*
                sideB
      2  _____________________
        /|                    /
 sideA / |                   /
      /  | h                /
     /   |                 /
    /    |                /
 1  _____________________
    1 is the first angle that we enter in the coustructor
    2 - is the second angle tht we are calculate
    h - is th height that we are calculating

    My figure is Parallelogram (number 4)

    Input data:
    sideA = 3;
    sideB = 4;
    angle = 45 degrees;

    The output:

    "2.1213203435596424 Height

    6.478469167054602 Diagonal

    14.0 Perimeter

    135.0 Second angle

    8.48528137423857 Area "


    */



}
