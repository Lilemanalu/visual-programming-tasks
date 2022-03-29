// 12S20017 - Lile Asima Manalu
import java.util.*;
import java.lang.Math;

public class X01A {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int size, i;
        
        size = 7;
        String[] mataKuliah = new String[size], kredit = new String[size], nilaiHuruf = new String[size];
        double[] max = new double[size], performa = new double[size], delta = new double[size];
        
        for (i = 0; i <= size - 1; i++) {
            mataKuliah[i] = input.nextLine();
            kredit[i] = input.nextLine();
            if (kredit[i].equals("4")) {
                max[i] = 4 * 4.0;
            } else {
                if (kredit[i].equals("3")) {
                    max[i] = 3 * 4.0;
                } else {
                    if (kredit[i].equals("2")) {
                        max[i] = 2 * 4.0;
                    } else {
                        if (kredit[i].equals("1")) {
                            max[i] = 1 * 4.0;
                        }
                    }
                }
            }
            nilaiHuruf[i] = input.nextLine();
            if (nilaiHuruf[i].equals("A")) {
                performa[i] = Integer.parseInt(kredit[i]) * 4.0;
            } else {
                if (nilaiHuruf[i].equals("AB")) {
                    performa[i] = Integer.parseInt(kredit[i]) * 3.5;
                } else {
                    if (nilaiHuruf[i].equals("B")) {
                        performa[i] = Integer.parseInt(kredit[i]) * 3.0;
                    } else {
                        if (nilaiHuruf[i].equals("BC")) {
                            performa[i] = Integer.parseInt(kredit[i]) * 2.5;
                        } else {
                            if (nilaiHuruf[i].equals("C")) {
                                performa[i] = Integer.parseInt(kredit[i]) * 2.0;
                            } else {
                                if (nilaiHuruf[i].equals("D")) {
                                    performa[i] = Integer.parseInt(kredit[i]) * 1.0;
                                } else {
                                    if (nilaiHuruf[i].equals("E")) {
                                        performa[i] = Integer.parseInt(kredit[i]) * 0.0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (mataKuliah[i].equals("---")) {
                size = i + 1;
            } else {
                delta[i] = max[i] - performa[i];
            }
        }
        for (i = 0; i <= size - 1; i++) {
            if (i == 0) {
                if (mataKuliah[i].equals("---")) {
                    System.out.println("---#---#---#---");
                }
            } else {
                if (i == 1) {
                    if (delta[i] == delta[i - 1]) {
                        System.out.println(mataKuliah[i - 1] + "#" + kredit[i - 1] + "#" + nilaiHuruf[i - 1] + "#" + toFixed(delta[i - 1],1));
                    } else {
                        if (delta[i] > delta[i - 1]) {
                            System.out.println(mataKuliah[i] + "#" + kredit[i] + "#" + nilaiHuruf[i] + "#" + toFixed(delta[i],1));
                        }
                    }
                } else {
                    if (i == 2) {
                        if (delta[i] == delta[i - 1]) {
                            System.out.println(mataKuliah[i - 1] + "#" + kredit[i - 1] + "#" + nilaiHuruf[i - 1] + "#" + toFixed(delta[i - 1],1));
                        } else {
                            if (delta[i] > delta[i - 1] && delta[i] > delta[i - 2]) {
                                System.out.println(mataKuliah[i] + "#" + kredit[i] + "#" + nilaiHuruf[i] + "#" + toFixed(delta[i],1));
                            }
                        }
                    }
                }
            }
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
