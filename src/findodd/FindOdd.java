/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package findodd;

/**
 *
 * @author ahmad luqman hakim
 */
public class FindOdd {

    /**
     * @param a
     * @param args the command line arguments
     */
    public static int findIt(int[]a) {
        int odd = 0;
        for (int num : a) {
            // Hitung berapa kali num muncul dalam array
            int count = 0;
            for (int n : a) {
                if (n == num) {
                    count++;
                }
            }
            // Jika jumlah kemunculan num adalah ganjil, maka itu adalah yang kita cari
            if (count % 2 != 0) {
                odd = num;
                break;
            }
        }
        return odd;
        
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int oddNumber = findIt(array);
        System.out.println("Bilangan ganjil dalam array adalah: " + oddNumber);
    
    }
}    
