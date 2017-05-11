package com.company.接口;

/**
 * Created by liupe on 2017/5/11 0011.
 */

abstract class Dad {
}

class Son extends Dad {
    protected void print() { System.out.println("Son"); }
}

abstract class SecondDad {
    abstract protected void print();
}

class SecondSon extends SecondDad {
    protected void print() { System.out.println("SecondSon"); }
}

public class T05 {
    public static void testPrint(Dad d) {
        ((Son)d).print();
    }
    public static void secondTestPrint(SecondDad sd) {
        sd.print();
    }
    public static void main(String[] args) {
        Son s = new Son();
        T05.testPrint(s);
        SecondSon ss = new SecondSon();
        T05.secondTestPrint(ss);
    }
}