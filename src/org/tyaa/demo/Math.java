/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.demo;

/**
 *
 * @author student
 */
public class Math {
    // статический метод класса Math,
    // то есть, который будет не у объектов класса,
    // а у самого класса,
    // принимает один аргумент - дробное число x,
    // обязан возвращать дробное число 
    public static Double cube(Double x) {
        // рассчет куба числа х
        // и возврат результата в точку вызова метода
        return x * x * x;
    }
    
    public static Double ext(Double x, Integer n) {
        Double result = x;
        for (int i = 1; i < n; i++) {
            // result *= x;
            result = result * x;
        }
        return result;
    }
}
