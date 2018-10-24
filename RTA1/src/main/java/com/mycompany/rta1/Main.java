
package com.mycompany.rta1;

import java.io.IOException;


public class Main {
  public static void main(String args[])throws IOException{
     System.out.println("Creating Excel File"); 
     wikiData.scraper();
     Excel.writeExcel();
  }
}
