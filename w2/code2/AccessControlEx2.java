package w2.code2;

import w2.code2.net2.mindview.util.*;
import java.util.*;

public class AccessControlEx2 {
    public static void main(String[] args) {
        w2.code2.net2.mindview.util.Vector customVector = new w2.code2.net2.mindview.util.Vector();
        customVector.display();

        java.util.Vector<Integer> javaVector = new java.util.Vector<>();
        javaVector.add(1);
        javaVector.add(2);
        System.out.println("Nội dung của java.util.Vector: " + javaVector);

    }

}
