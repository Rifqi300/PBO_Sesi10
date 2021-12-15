/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractinterface;

/**
 *
 * @author LENOVO
 */
public class Shapes {
  public static void main(String[] args) {
    Shape segitiga = new Triangle(20,4);
    Shape lingkaran = new Circle(5);
    System.out.println("==============Tugas PBO Sesi 10=============");
    System.out.println("=============Abstract & Interface===========");
    System.out.println("");
    System.out.println("Luas dari segitiga adalah " + segitiga.getArea());
    System.out.println("Luas dari lingkaran adalah " + lingkaran.getArea());
    System.out.println("");
    System.out.println("===========Muhammad Rifqi Darmawan=========");
    System.out.println("================Reguler TI20A==============");
    System.out.println("");
  }
}

abstract class Shape {
  String color;

  void setColor(String color) {
    this.color = color;
  }

  String getColor() {
    return this.color;
  }

  abstract float getArea(); 
}

class Triangle extends Shape {
  float base;
  float height;

  Triangle(float base, float height) {
    this.base = base;
    this.height = height;
  }

  @Override
  float getArea() {
    return 0.5f * base * height; 
  }
}


class Circle extends Shape {
  float radius;

  Circle(float radius) {
    this.radius = radius;
  }

  @Override
  float getArea() {
    return (float) Math.PI * radius * radius; 
  }
}