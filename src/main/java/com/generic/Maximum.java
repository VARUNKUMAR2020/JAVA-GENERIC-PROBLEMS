package com.generic;

import java.util.*;

public class Maximum<T extends Comparable<T>> // T-Any type of Datatype can be used
{

    // Variables of data type(T- where can Have any datatype)
    T a, b, c, d, e;

    // Array list To Store the elements:
    List<T> list = new ArrayList<T>();

    public void sortList() {
        Maximum max = new Maximum(1, 2, 3, 4, 5);
        max.list.add(this.a);
        max.list.add(this.b);
        max.list.add(this.c);
        max.list.add(this.d);
        max.list.add(this.e);

        //This class(Collection) consists exclusively of static methods that operate on or return collections.
        Collections.sort(max.list);
        System.out.println(max.list);
    }

    // constructor
    public Maximum(T a, T b, T c, T d, T e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public T maximum() {
        return Maximum.maximum(a, b, c, d, e);
    }

    public static <T extends Comparable<T>> T maximum(T a, T b, T c, T d, T e) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        if (d.compareTo(max) > 0) {
            max = d;
        }
        if (e.compareTo(max) > 0) {
            max = e;
        }
        // method for print is called
        printMax(a, b, c, d, e, max);
        return max;
    }

    public static <T> void printMax(T a, T b, T c, T d, T e, T max) {
        System.out.println("\n" + "Max of " + a + ", " + b + ", " + c + ", " + d + " and " + e + " is : " + max);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Generic Problems: ");
        System.out.println("Max String ");
        Maximum<String> maxString = new Maximum<String>("Varun", "Chennai", "Hero", "Vellore", "Java");
        maxString.maximum();
        maxString.sortList();
        System.out.println("--------------");
        System.out.println(" Max Interger ");
        Maximum<Integer> maxInteger = new Maximum<Integer>(12, 58, 96, 54, 67);
        maxInteger.maximum();
        maxInteger.sortList();
        System.out.println("--------------");
        System.out.println("Max Float ");
        Maximum<Float> maxFloat = new Maximum<Float>(66.5f, 79.1578f, 79.15446f, 548.62f, 587.63f);
        maxFloat.maximum();
        maxFloat.sortList();

    }
}
