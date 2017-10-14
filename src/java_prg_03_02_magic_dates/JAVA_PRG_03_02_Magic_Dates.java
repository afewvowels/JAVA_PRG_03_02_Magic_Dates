/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_03_02_magic_dates;

import javax.swing.JOptionPane;
/**
 *
 * @author bluebackdev
 * The date June, 10, 1960, is special because when we write it in the
 * following format, the month times the day equals the year:
 * 
 *      6/10/60
 * 
 * Write a program that asks the user to enter a month (in numeric form), a day
 * and a two-digit year. The program should then determine whether the month
 * times the day is equal to the year. If so, it should display a message
 * saying the date is magic. Otherwise, it should display a message saying the
 * date is not magic.
 */
public class JAVA_PRG_03_02_Magic_Dates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare int variables for month, day, year, and test variable
        int intMonth;
        int intDay;
        int intYear;
        int intTestNumber;
        
        // Declare strings for user input
        String strMonth;
        String strDay;
        String strYear;
        
        // Get user inputs
        strMonth = JOptionPane.showInputDialog("Please enter a month" +
                "in numeric form");
        strDay = JOptionPane.showInputDialog("Please enter a day");
        strYear = JOptionPane.showInputDialog("Please enter a two-digit year");
        
        // Convert user inputs to integer values for calculation
        intMonth = Integer.parseInt(strMonth);
        intDay = Integer.parseInt(strDay);
        intYear = Integer.parseInt(strYear);
        
        // If/else output to user whether the day is magic or not
        if(intMonth * intDay == intYear)
        {
            JOptionPane.showMessageDialog(null, "Congratulations, that date" +
                    " is magic!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Sorry, there is nothing" +
                    " nothing special about that date");
        }
    }
    
}
