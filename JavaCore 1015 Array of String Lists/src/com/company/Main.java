package com.company;

/*

1015 Array of String Lists
Create an array whose elements are lists of strings.
Fill the array with any data and display it on the screen.

Requirements:
1. The createList method must declare and initialize an array with the element type ArrayList.
2. The createList method should return the created array.
3. The createList method should add elements (lists of strings) to the array. Lists must not be empty.
4. The program should display data on the screen.
5. The main method should call the createList method.
6. The main method should call the printList method.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] lists = new ArrayList[5];

        for (int i = 0; i < lists.length; i++) {
            lists[i] = new ArrayList<>();
            lists[i].add("1");
            lists[i].add("2");
            lists[i].add("3");
        }

        return lists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}


















