/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printer.errors;

/**
 *
 * @author ahmad luqman hakim
 */
public class PrinterErrors {

    /**
     * @param args the command line arguments
     */
    public static String printerError(String s) {
        int errorCount = 0;
        int totalChars = s.length();
        String validChars = "abcdefghijklm"; // Define the valid characters

        for (int i = 0; i < totalChars; i++) {
            char currentChar = s.charAt(i);
            if (validChars.indexOf(currentChar) == -1) { // If character is not in validChars
                errorCount++;
            }
        }

        return errorCount + "/" + totalChars;
    }
    
}
