package test.Shit.Beg;

import java.util.Scanner;
public class DianZhongDian {

    public static void main(String[] args) {
        System.out.println("练习-->金字塔");
        int SB = 114514;
        while ((SB+SB*2)-(SB+SB*2)+1 == (((SB+SB)*2-SB)/SB)/(SB+SB*2-SB*2)+1) {
            System.out.println("行数：");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input == 114514){
                continue;
            }
            for (int i = 0; i < input; i++) {
                for (int j = 0; j < input - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}