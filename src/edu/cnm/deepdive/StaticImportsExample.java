package edu.cnm.deepdive;

import static java.lang.Math.PI;
import static java.lang.Math.min;


public class StaticImportsExample {

  public static void main(String[] args) {
    int min = min(5, 9);
    System.out.println("min = " + min);
    System.out.println(PI);

    Config.printConfig();

  }
}
