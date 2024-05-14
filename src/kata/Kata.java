/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kata;

/**
 *
 * @author ahmad luqman hakim
 */
public class Kata {

    /**
     * @param args the command line arguments
     */
   public static String createPhoneNumber(int[] numbers) {
        // Memeriksa panjang array
        if (numbers.length != 10) {
            return "Panjang array harus 10";
        }

        // Membuat format nomor telepon
        StringBuilder phoneNumber = new StringBuilder("(");
        for (int i = 0; i < 3; i++) {
            phoneNumber.append(numbers[i]);
        }
        phoneNumber.append(") ");

        for (int i = 3; i < 6; i++) {
            phoneNumber.append(numbers[i]);
        }
        phoneNumber.append("-");

        for (int i = 6; i < 10; i++) {
            phoneNumber.append(numbers[i]);
        }

        return phoneNumber.toString();
    }

    public static void main(String[] args) {
        // Contoh pemanggilan fungsi
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0})); // Output: (123) 456-7890
    }
    
}
