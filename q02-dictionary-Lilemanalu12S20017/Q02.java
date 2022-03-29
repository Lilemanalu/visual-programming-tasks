// 12S20007 - Rufina Aprilina Sitorus
// 12S20017 - Lile Asima Manalu
import java.util.*;
import java.lang.Math;

public class Q02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String option;
        boolean stop;
        
        stop = false;
        int index, n;
        
        index = 5;
        String[] kata = new String[index], jenisKata = new String[index], arti = new String[index];
        String[] dictionary = new String[index];
        
        n = 10;
        for (index = 0; index <= n; index++) {
            kata[index] = "";
            option = input.nextLine();
            if (option.equals("---")) {
                stop = true;
            } else {
                if (option.equals("register")) {
                    register(index, kata, jenisKata, arti, dictionary);
                } else {
                    if (option.equals("find")) {
                        find(kata, dictionary, index);
                    }
                }
            }
        }
    }
    
    public static void find(String[] kata, String[] dictionary, int index) {
        String cariKata;
        
        cariKata = input.nextLine();
        for (index = 0; index <= 4; index++) {
            if (cariKata.equals(kata[index])) {
                System.out.println(dictionary[index]);
            }
        }
    }
    
    public static void register(int index, String[] kata, String[] jenisKata, String[] arti, String[] dictionary) {
        if (index <= 5) {
            kata[index] = input.nextLine();
            jenisKata[index] = input.nextLine();
            arti[index] = input.nextLine();
            dictionary[index] = kata[index] + "#" + jenisKata[index] + "#" + arti[index];
        }
    }
}
