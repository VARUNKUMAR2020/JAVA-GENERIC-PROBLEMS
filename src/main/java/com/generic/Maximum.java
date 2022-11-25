package com.generic;

public class Maximum<T extends Comparable<T>> // T-Any type of Datatype can be used
{

    // Variables of data type(T- where can Have any datatype)
    T x, y, z;

    // constructor
    public Maximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum() {
        return Maximum.maximum(x, y, z);
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        // assiging x as maximum
        T max = x;
        // compare to method is used
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        // method for print is called
        printMax(x, y, z, max);
        return max;
    }

    public static <T> void printMax(T x, T y, T z, T max) {
        System.out.println("Max of " + x + ", " + y + " and " + z + " is : " + max + "\n");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Generic Problems: ");
        System.out.println("Test Case 1: Max Number At 1st Position.");
        Maximum<Integer> m1 = new Maximum<Integer>(8, 5, 3);
        m1.maximum();
        System.out.println("Test Case 2: Max Number At 2nd Position.");
        Maximum<Integer> m2 = new Maximum<Integer>(5, 8, 3);
        m2.maximum();
        System.out.println("Test Case 3: Max Number At 3rd Position.");
        Maximum<Integer> m3 = new Maximum<Integer>(3, 5, 8);
        m3.maximum();
    }
}