/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan44.hukumohm;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class IF0110118025Latihan44HukumOHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai baterai = new Baterai();
        Baterai baterai1 = new Baterai(3, 12);
        System.out.println("");
        System.out.printf("Kuat Arus\t: %.1f ampere%n", baterai1.getKuatArus());
        System.out.printf("Hambatan\t: %.1f ohm%n", baterai1.getHambatan());
        System.out.printf("Hasil Tegangan\t: %.1f volt%n", baterai1.hitungTegangan());
    }
    
}
