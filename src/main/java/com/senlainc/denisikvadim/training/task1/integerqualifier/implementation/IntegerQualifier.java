package com.senlainc.denisikvadim.training.task1.integerqualifier.implementation;

import com.senlainc.denisikvadim.training.task1.integerqualifier.IIntegerQualifier;

import java.math.BigInteger;

public class IntegerQualifier implements IIntegerQualifier {

    public String isEven(Integer number) {
        if (number % 2 == 0) {
            return "EVEN";
        }
        return "ODD";
    }

    public String isPrime(Integer number) {
        BigInteger bigInteger = BigInteger.valueOf(number);
        if (bigInteger.isProbablePrime((int) Math.log(number)) && number >= 0) {
            return "PRIME";
        }
        return "COMPOSITE";
    }

}

