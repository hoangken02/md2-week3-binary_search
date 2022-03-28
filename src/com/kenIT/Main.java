package com.kenIT;

public class Main {

    public static void main(String[] args) {
        BinarySearch binary = null;
        int [] list = {2,4,5,7,8,9,10,12,14,22};
        System.out.println(binary.binarySearch(list,11));
        System.out.println(binary.binarySearch(list,12));
        System.out.println(binary.binarySearch(list,13));
        System.out.println(binary.binarySearch(list,14));
        System.out.println(binary.binarySearch(list,15));
    }
}
