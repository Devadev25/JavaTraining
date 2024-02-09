package com.basic.methodoverloading;

public class Payment {

    public void payment(String wallettype, int UID) {
        System.out.println("WalletType : " + wallettype);
        System.out.println("UID : " + UID);
    }

    public void payment(String cardtype, long cardno, int cvvnumber) {
        System.out.println("CardType : " + cardtype);
        System.out.println("CardNo : " + cardno);
        System.out.println("CvvNumber : " + cvvnumber);
    }

    public void payment(String type, String username, int pwd, long
            Accountnumber) {
        System.out.println("Type : " + type);
        System.out.println("Username : " + username);
        System.out.println("Pwd : " + pwd);
        System.out.println("AccountNumber : " + Accountnumber);
    }

}

