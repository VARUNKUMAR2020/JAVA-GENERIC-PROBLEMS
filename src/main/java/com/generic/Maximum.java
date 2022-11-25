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
        Maximum<Float> m1 = new Maximum<Float>(8.8f, 5.7f, 3.667f);
        m1.maximum();
        System.out.println("Test Case 2: Max Number At 2nd Position.");
        Maximum<Float> m2 = new Maximum<Float>(5.33f, 8.444f, 3.8f);
        m2.maximum();
        System.out.println("Test Case 3: Max Number At 3rd Position.");
        Maximum<Float> m3 = new Maximum<Float>(3.54f, 5.23f, 8.044f);
        m3.maximum();
    }
}
