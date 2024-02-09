package com.basic.wrapperclass.unboxing;

public class UnBoxing {
    public static void main(String[] args) {

        //Unboxing
        Integer integerClass = new Integer(15);
        int integerValue = integerClass.intValue();
        System.out.println(integerClass);
        Character characterClass = Character.valueOf('C');
        int integerValue1 = characterClass;
        System.out.println(integerValue1);

        //Auto-Unboxing
        Character characterClass1 = new Character('a');
        int integerValue3 = characterClass1;
        System.out.println(integerValue3);
        Double doubleClass = new Double(22.5);
        double doubleValue = doubleClass;
        System.out.println(doubleValue);
    }
}
