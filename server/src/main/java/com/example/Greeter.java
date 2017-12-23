package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }


  /**
   * @param someone is name of a person
   * @return full greating string with person name 
   */
  public final String greet( final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
