// Day 6/366 Coding Challenge 2024
// https://www.codewars.com/kata/5556282156230d0e5e000089/java

public class DNAtoRNA6 {

    public static String dnaToRna(String dna) {
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 'T') {
                dna = dna.substring(0, i) + "U" + dna.substring(i + 1, dna.length());
            }
        }
        return dna;  // Do your magic!
    } 

    public static void main(String[] args) {
        String DNA = "GTTTAU";
        System.out.print(dnaToRna(DNA));
    }
}