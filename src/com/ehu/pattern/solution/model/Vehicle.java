package com.ehu.pattern.solution.model;

public abstract class Vehicle {
 private static int nextId = 1;
 private final int id;
 private String name;

 // Синхронизированный метод для получения следующего id
 private static synchronized int getNextId() {
     return nextId++;
 }

 // Конструктор, который устанавливает уникальный id для каждого объекта
 protected Vehicle() {
     this.id = getNextId();
 }

 public int getId() {
     return id;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }
}
