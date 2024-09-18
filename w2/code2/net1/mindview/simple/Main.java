package w2.code2.net1.mindview.simple;

import java.util.*;

import w2.code2.net1.mindview.simple.*;

public class Main {
    public static void main(String[] args) {
        w2.code2.net1.mindview.simple.Vector myVector = new w2.code2.net1.mindview.simple.Vector();
        myVector.display();

        java.util.Vector<Integer> javaVector = new java.util.Vector<>();
        javaVector.add(1);
        javaVector.add(2);
        System.err.println("contents of java.util.Vector: " + javaVector);

    }

}
