package com.senlainc.denisikvadim.training.task5.palindromeservice.implementation;

import com.senlainc.denisikvadim.training.task5.palindromeservice.IPalindromeService;

import java.util.ArrayList;
import java.util.List;


public class PalindromeService implements IPalindromeService {

    public List<Integer> findPalindromes(int length) {
        List<Integer> numbers = new ArrayList<>();
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < length; i++) {
            string.append(i);
            if (string.toString().equals(string.reverse().toString())) {
                numbers.add(i);
            }
            string.setLength(0);
        }
        return numbers;
    }
}
