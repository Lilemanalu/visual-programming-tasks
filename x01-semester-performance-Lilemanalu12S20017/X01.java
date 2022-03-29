// 12S20017 - Lile Asima Manalu
import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kredit, nilaiHuruf;
        double performa, totalPerforma, totalKredit, iPS;
        
        totalPerforma = 0;
        totalKredit = 0;
        boolean stop;
        
        stop = true;
        while (stop) {
            kredit = input.nextLine();
            nilaiHuruf = input.nextLine();
            if (nilaiHuruf.equals("A")) {
                performa = Integer.parseInt(kredit) * 4.0;
            } else {
                if (nilaiHuruf.equals("AB")) {
                    performa = Integer.parseInt(kredit) * 3.5;
                } else {
                    if (nilaiHuruf.equals("B")) {
                        performa = Integer.parseInt(kredit) * 3.0;
                    } else {
                        if (nilaiHuruf.equals("BC")) {
                            performa = Integer.parseInt(kredit) * 2.5;
                        } else {
                            if (nilaiHuruf.equals("C")) {
                                performa = Integer.parseInt(kredit) * 2.0;
                            } else {
                                if (nilaiHuruf.equals("D")) {
                                    performa = Integer.parseInt(kredit) * 1.0;
                                } else {
                                    if (nilaiHuruf.equals("E")) {
                                        performa = Integer.parseInt(kredit) * 0.0;
                                    } else {
                                        stop = false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (stop) {
                System.out.println(performa);
                totalKredit = totalKredit + Integer.parseInt(kredit);
                totalPerforma = totalPerforma + performa;
            } else {
                System.out.println("");
            }
        }
        iPS = totalPerforma / totalKredit;
        System.out.println(toFixed(iPS,2));
        System.out.println(totalKredit);
    }
    
    public static String kredit(int kredit) {
        String sum;
        
        sum = kredit + kredit + kredit + kredit + kredit + kredit + kredit;
        
        return Sum(Kredit);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
