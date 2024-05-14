/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duplicateencoder;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ahmad luqman hakim
 */
public class DuplicateEncoder {

    /**
     * @param args the command line arguments
     */
  public static String encode(String word) {
        word = word.toLowerCase();
        Map<Character, Integer> charCount = new HashMap<>();

        // Menghitung jumlah kemunculan setiap karakter
        for (char c : word.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Membuat string baru berdasarkan jumlah kemunculan setiap karakter
        StringBuilder result = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (charCount.get(c) > 1) {
                result.append(")");
            } else {
                result.append("(");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("din"));        // Hasil yang diharapkan: "((("
        System.out.println(encode("recede"));     // Hasil yang diharapkan: "()()()"
        System.out.println(encode("Success"));    // Hasil yang diharapkan: ")())())"
        System.out.println(encode("(( @"));      // Hasil yang diharapkan: "))(("
    }
}
