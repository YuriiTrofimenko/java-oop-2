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
public class JavaOop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Создание экземпляра (объекта) типа TodoItem
        // и присвоение ссылки на него в переменную того же типа
        TodoItem item1 = new TodoItem();
        // Вывод данных из полей объекта item1 в консоль
        System.out.println(item1.id);
        System.out.println(item1.title);
        // Присвоение данных в поля объекта item1
        item1.id = 1;
        item1.title = "Купить хлеб";
        // Повторный вывод данных из полей объекта item1 в консоль
        System.out.println(item1.id);
        System.out.println(item1.title);
    }
    
}