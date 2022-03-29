// 12S20007 - Rufina Aprilina Storus
// 12S20017 - Lile Asima Manalu
import java.util.*;
import java.lang.Math;

public class T05 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String pilihan, func2;
        boolean pengulangan;
        
        pengulangan = true;
        do {
            pilihan = input.nextLine();
            if (pilihan.equals("---")) {
                pengulangan = false;
            } else {
                if (pilihan.equals("1")) {
                    func1();
                } else {
                    if (pilihan.equals("2")) {
                        func2();
                    } else {
                        if (pilihan.equals("3")) {
                            func3();
                        }
                    }
                }
            }
        } while (pengulangan);
    }
    
    public static void func1() {
    }
    
    public static void func2() {
        String nIM, namaLengkap, programStudi, usernameGithub, namaPanggilan, angkatan, jenisKelamin, sapaan;
        
        nIM = input.nextLine();
        namaLengkap = input.nextLine();
        programStudi = input.nextLine();
        usernameGithub = input.nextLine();
        int size, index;
        
        size = 3;
        String[] nomorTelepon = new String[size];
        String seluruhNomor;
        
        seluruhNomor = "";
        for (index = 0; index <= size - 1; index++) {
            nomorTelepon[index] = input.nextLine();
            if (nomorTelepon[index].equals("---")) {
                nomorTelepon[index] = "";
                size = 2;
            } else {
                if (size > 1) {
                    seluruhNomor = seluruhNomor + ",";
                }
            }
            seluruhNomor = seluruhNomor + nomorTelepon[index];
        }
        namaPanggilan = input.nextLine();
        jenisKelamin = input.nextLine();
        angkatan = input.nextLine();
        if (jenisKelamin.equals("P")) {
            if (Integer.parseInt(angkatan) < 2020) {
                sapaan = "Kak" + " " + namaPanggilan;
            } else {
                sapaan = namaPanggilan;
            }
        } else {
            if (Integer.parseInt(angkatan) < 2020) {
                sapaan = "Bang" + " " + namaPanggilan;
            } else {
                sapaan = namaPanggilan;
            }
        }
        String data1, data2;
        
        data1 = nIM + "#" + namaLengkap + "#" + programStudi + "#" + usernameGithub + "#" + seluruhNomor;
        data2 = sapaan;
    }
    
    public static void func3() {
    }
}
