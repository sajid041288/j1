import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter Char");
        ch = sc.next().charAt(0);
        if(ch == 'a'|| ch =='e' || ch == 'i'|| ch =='o'|| ch =='u')
        {
            System.out.println("vowels");
        }
        else
            System.out.println("consonant");
        }
    }

