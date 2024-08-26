package edu.grinnell;

import java.io.PrintWriter;

/**
 * A sample class.
 */
public class Sample {
  /** 
   * Do something boring, such as printing a message.
   */ 
   public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.println("Hello Sample");
    pen.close();
  } // main(String[])
} // class Sample
