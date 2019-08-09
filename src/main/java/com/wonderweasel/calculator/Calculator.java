package com.wonderweasel.calculator;
import org.springframework.stereotype.Service;

/**
 * Business logic for the Calculator
 */
@Service
public class Calculator {
    int sum(int a, int b) {
        return a + b;
    } 
}
