package com.basic.exception.propagation;

public class License extends Exception {
    License(String notEligible) {
        super(notEligible);
    }

}
