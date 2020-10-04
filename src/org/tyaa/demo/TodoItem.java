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
    // Подробности задачи
    public String details;
    // Дата и время, на которые планируется выпонить задачу
    public Date date;
    // Признак завершенности задачи
    public Boolean done;
}
