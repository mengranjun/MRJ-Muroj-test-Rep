import java.util.Scanner;
public class PeiXiuHelper {
    public static void main(String[] args) {
        System.out.print("你们好呀我是傻逼数学家小帮手，接下来");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入第一个数字");
            int input1 = scanner.nextInt();
            if (input1 < 1 || input1 >13) {
                System.out.println("不是哥们你玩的是数学家吗");
            }
            System.out.println("请输入第二个数字:");
            int input2 = scanner.nextInt();
            if (input2 < 1 || input2 >13) {
                System.out.println("不是哥们你玩的是数学家吗");
            }
            int results = (input1 + input2) % 13;
            if (results == 0) {
                results = 13;
            }
            System.out.println("爵制结果："+results);
            System.out.println("=======================");

        }
    }
}
