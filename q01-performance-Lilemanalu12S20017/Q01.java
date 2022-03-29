// 12S20017 - Lile Asima Manalu
import java.util.*;
import java.lang.Math;

public class Q01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kredit, nilaiHuruf;
        double performa;
        boolean stop;
        
        stop = false;
        performa = 0.0;
        while (!stop) {
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
                                        stop = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!stop) {
                System.out.println(performa);
            } else {
                System.out.println("");
            }
        }
    }
}
