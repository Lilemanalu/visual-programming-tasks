// 12S20017 - Lile Asima Manalu
import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nIM, fullName, studyProgram, usernameGithub, phoneNumber, nickName, gender;
        int generation;
        String greetings;
        String yourUsernameGithub;
        String optionGender;
        int yearGeneration;
        
        nIM = input.nextLine();
        fullName = input.nextLine();
        studyProgram = input.nextLine();
        yourUsernameGithub = input.nextLine();
        phoneNumber = input.nextLine();
        nickName = input.nextLine();
        optionGender = input.nextLine();
        yearGeneration = input.nextInt();
        if (yourUsernameGithub.equals("")) {
            usernameGithub = "---";
        } else {
            usernameGithub = yourUsernameGithub;
        }
        if (optionGender.equals("L")) {
            if (yearGeneration < 2020) {
                greetings = "Bang" + " " + nickName;
            } else {
                greetings = nickName;
            }
        } else {
            if (yearGeneration < 2020) {
                greetings = "Kak" + " " + nickName;
            } else {
                greetings = nickName;
            }
        }
        System.out.println(nIM + "#" + fullName + "#" + studyProgram + "#" + usernameGithub + "#" + phoneNumber);
        System.out.println(greetings);
    }
}
