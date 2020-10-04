/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.demo;

import java.util.Date;

/**
 *
 * @author student
 */
// Класс, описывающий пункт списка задач
public class TodoItem {
    // Поле объекта - уникальный идентификатор пункта списка задач
    public Integer id;
    // Поле объекта - заголовок
    public String title;
    // Подробности задачи (закрытое поле)
    private String details;
    // Дата и время, на которые планируется выпонить задачу
    public Date date;
    // Признак завершенности задачи
    public Boolean done;
    // Метод (функция, являющаяся членом класса) установки значения в поле details 
    // Тип возвращаемого значения - void
    // Аргумент метода - details типа String
    /* public void setDetails(String _details) {
        details = _details;
    } */
    public void setDetails(String details) throws Exception { // заголовок метода
        // тело метода
        // проверка аргумента details:
        // - на отсутствие ссылки на объект типа String в аргументе details;
        // - и на наличие пустой строки в аргументе details
        if (details != null && !details.equals("")) {
            // this указывает, что написанный после него details -
            // это поле объекта,
            // а details после знака "равно" - без слова this,
            // значит, это не поле (в данном случае это - аргумент метода)
            this.details = details;
        } else {
            throw new Exception("Аргумент details не должен быть пустым и не должен содержать пустую строку");
        }
    }
    // Метод чтения значения из поля details
    // public - модификатор доступа: метод открытый, то есть доступен для
    // вызова вне кода данного класса
    // Тип возвращаемого значения - String
    // Аргументов у этого метода нет
    public String getDetails() {
        // вернуть строку, хранящуюся в поле details
        return details;
    }
}
