// 12S20013 - Lydia Tesalonika
// 12S20017 - Lile Asima Manalu
import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int mahasiswa, n;
        
        mahasiswa = 5;
        n = mahasiswa;
        String[] nIM = new String[mahasiswa], nama = new String[mahasiswa], nomorTelepon = new String[mahasiswa];
        int selesai;
        
        selesai = mahasiswa - 1;
        for (mahasiswa = 0; mahasiswa <= selesai; mahasiswa++) {
            String programStudi, usernameGithub, namaPanggilan, jenisKelamin, sapaan, seluruhNomor;
            
            seluruhNomor = "";
            nIM[mahasiswa] = input.nextLine();
            if (nIM[mahasiswa].equals("---")) {
                selesai = mahasiswa;
            } else {
                nama[mahasiswa] = input.nextLine();
                programStudi = input.nextLine();
                usernameGithub = input.nextLine();
                int m;
                
                m = 3;
                for (n = 1; n <= m; n++) {
                    nomorTelepon[mahasiswa] = input.nextLine();
                    if (nomorTelepon[mahasiswa].equals("---")) {
                        nomorTelepon[mahasiswa] = "";
                        m = 2;
                    } else {
                        if (n > 1) {
                            seluruhNomor = seluruhNomor + ",";
                        }
                    }
                    seluruhNomor = seluruhNomor + nomorTelepon[mahasiswa];
                }
                namaPanggilan = input.nextLine();
                jenisKelamin = input.nextLine();
                String angkatan;
                
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
                System.out.println(nIM[mahasiswa] + "#" + nama[mahasiswa] + "#" + programStudi + "#" + usernameGithub + "#" + seluruhNomor);
                System.out.println(sapaan);
            }
        }
    }
}
