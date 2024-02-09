package com.basic.wrapperclass.autoboxing;

public class AutoBoxing {
    public static void main(String[] args) {

        //Boxing
        int integerValue = 20;
        Integer integerClass = new Integer(integerValue);
        System.out.println(integerClass);
        String stringValue = "12";
        Integer integerClass1 = Integer.valueOf(stringValue);
        System.out.println(integerClass1 * 5);
//      int num=Integer.parseInt(stringValue);
//      System.out.println(num*12);

        //AutoBoxing
        float floatValue = 22.3f;
        Float floatClassAuto = floatValue;
        System.out.println(floatClassAuto);
        char charValue = 'A';
        Integer integerClassAuto = Integer.valueOf(charValue);
        System.out.println(integerClassAuto);

    }
}
