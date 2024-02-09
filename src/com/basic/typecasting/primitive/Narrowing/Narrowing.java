package com.basic.typecasting.primitive.Narrowing;

public class Narrowing {
    double doubleNumber = 33.4;
    long longNumber = 123456789;
    float floatNumber = 22.10f;

    int intNumber = (int) doubleNumber;
    int intNumber1 = (int) longNumber;
    int intNumber2 = (int) floatNumber;

    byte byteNumber=(byte)doubleNumber;
    byte byteNumber1=(byte)longNumber;
    byte byteNumber2=(byte)floatNumber;



}
