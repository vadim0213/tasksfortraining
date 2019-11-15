package com.senlainc.denisikvadim.training.task2.numbercommonservice.implementation;

import com.senlainc.denisikvadim.training.task2.numbercommonservice.INumberCommonService;

public class NumberCommonService implements INumberCommonService {

    public Integer getLcm(Integer firstNumber, Integer secondNumber) {
        if (firstNumber == 0 || secondNumber == 0) {
            return 0;
        }
        int gcd = getGcd(firstNumber, secondNumber);
        return Math.abs(firstNumber * secondNumber) / gcd;
    }

    public Integer getGcd(Integer firstNumber, Integer secondNumber) {
        if (firstNumber == 0 || secondNumber == 0) {
            return firstNumber + secondNumber;
        }
        int absNumber1 = Math.abs(firstNumber);
        int absNumber2 = Math.abs(secondNumber);
        int biggerValue = Math.max(absNumber1, absNumber2);
        int smallerValue = Math.min(absNumber1, absNumber2);
        return getGcd(biggerValue % smallerValue, smallerValue);
    }

}
