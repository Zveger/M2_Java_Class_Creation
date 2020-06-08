
/* Module 2. Task 1
 * Classname: Main
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

public class Main {

    public static void main(String[] args) {
        Cube cube1 = new Cube(5);
        System.out.println(cube1);
        System.out.println(cube1.hashCode());
        Cube cube2 = new Cube(2+3);
        boolean equals = cube1.equals(cube2);
        System.out.println(equals);

    }
}
