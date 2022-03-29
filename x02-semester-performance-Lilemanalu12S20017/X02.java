// 12S20007 - Rufina Sitorus
// 12S20017 - Lile Manalu
import java.util.*;
import java.lang.Math;

public class X02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int index, n, j;
        
        n = 7;
        String[] mataKuliah = new String[n], kredit = new String[n], nilaiHuruf = new String[n], data = new String[n];
        double a, aB, b, bC, c, d, e;
        
        a = 4.0;
        aB = 3.5;
        b = 3.0;
        bC = 2.5;
        c = 2.0;
        d = 1.0;
        e = 0.0;
        String temp;
        
        for (index = 0; index <= n - 1; index++) {
            mataKuliah[index] = input.nextLine();
            kredit[index] = input.nextLine();
            nilaiHuruf[index] = input.nextLine();
            if (mataKuliah[index].equals("---")) {
                n = index;
            }
            data[index] = mataKuliah[index] + "#" + kredit[index] + "#" + nilaiHuruf[index];
        }
        for (index = 0; index <= n - 1; index++) {
            for (j = n - 1; j >= index + 1; j--) {
                if (nilaiHuruf[j].compareTo(nilaiHuruf[j - 1]) < 0) {
                    temp = nilaiHuruf[j];
                    nilaiHuruf[j] = nilaiHuruf[j - 1];
                    nilaiHuruf[j - 1] = temp;
                    temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
        for (index = 0; index <= n - 1; index++) {
            System.out.println(data[index]);
        }
    }
}
