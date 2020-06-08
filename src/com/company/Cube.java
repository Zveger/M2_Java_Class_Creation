/* Module 2. Task 1
 * Classname: Cube
 *
 * Version 1
 *
 * Zviertsev Herman, NTU KhPI
 *
 * Create a class from the attached document according to the order in your group . The class must contain
1. Constructor.
2. Getters/Setters.
3. 5 methods.
4. Override toString() method
5. Override hash() and equals() methods.
 */
package com.company;

import java.util.Objects;

//Create new class
public class Cube {
    private int sideCube;
    //Generate Constructor without parameter
    public Cube() {
    }
    //Generate Constructor with parameter
    public Cube(int sideCube) {
        this.sideCube = sideCube;
    }
    //Generate Getter
    public int getSideCube() {
        return sideCube;
    }
    //Generate Setter
    public void setSideCube(int sideCube) {
        this.sideCube = sideCube;
    }
    //Volume Method1
    public double getVolume(){
        return Math.pow(this.getSideCube(),3);
    }
    //Area Method2
    public double getArea(){
        return 6 * Math.pow(this.getSideCube(),2);
    }
    //Length Method3
    public double getLength(){
        return 12 * this.getSideCube();
    }
    //Diagonal Method4
    public double getDiagonalCube(){
        return this.getSideCube() * Math.sqrt(3);
    }
    //Radius Method5
    public double getRadiusSphereInCube(){
        return this.getSideCube()/2;
    }
    //To Strtig() Method
    @Override
    public String toString() {
        return "Cube{" +
                " sideCube=" + this.getSideCube() +
                " volume=" + this.getVolume() +
                " area=" + this.getArea() +
                " length=" + this.getLength()+
                " diagonal=" + this.getDiagonalCube() +
                " radius=" + this.getRadiusSphereInCube()+
                '}';
    }
//Equals Method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cube)) return false;
        Cube cube = (Cube) o;
        return getSideCube() == cube.getSideCube();
    }
    //HashCode Method
    @Override
    public int hashCode() {
        return Objects.hash(getSideCube());
    }
}