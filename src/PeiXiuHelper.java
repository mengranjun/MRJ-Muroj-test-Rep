/*你们好我是三国杀玩家，我要玩裴秀，但我是大学生怎么办？
不必担心！这个傻逼东西可以可以让你知道爵制结果！再也不用两张换垃圾了！！！！!!!！！1111！！！
*/
//以下代码只是思路，打算开发成安卓应用,真要开发成应用应该不会这个用傻逼while重复执行↓
import java.util.Scanner;
public class PeiXiuHelper {
    public static void main(String[] args) {
        System.out.print("你们好呀我是傻逼数学家小帮手，接下来");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入第一个数字");
            int input1 = scanner.nextInt();
            if (input1 < 1 || input1 >13) {
                System.out.println("不是哥们三国杀有14点数吗");
                continue;
            }
            System.out.println("请输入第二个数字:");
            int input2 = scanner.nextInt();
            if (input2 < 1 || input2 >13) {
                System.out.println("不是哥们三国杀有14点数吗");
                continue;
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
