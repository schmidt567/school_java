package homework;
import java.util.Scanner;

public class Sep26th {
    public static void main(String[] arges){
        Scanner sc = new Scanner(System.in);
        //1.最大值
//       System.out.print("请输入三个整数:");
//       int num1 = sc.nextInt();
//       int num2 = sc.nextInt();
//       num1 =  num1>num2?num1:num2;
//       int num3 = sc.nextInt();
//       num1 =  num1>num3?num1:num3;
//       System.out.println("最大值为:"+num1);

        //2.月份季节转换(if)
//        System.out.print("请输入一个月份:");
//        int month = sc.nextInt();
//        if (month <= 5&&month >= 3){
//            System.out.println(month+"月是春季");
//        } else if (month <= 8&&month >= 6) {
//            System.out.println(month+"月是夏季");
//        } else if (month <= 11&&month >= 9) {
//            System.out.println(month+"月是秋季");
//        } else if (month == 12||month ==1||month == 2) {
//            System.out.println(month+"月是春季");
//        }else {
//            System.out.println("您输入的"+month+"月不存在");
//        }


        //3.月份季节转换(switch)
            System.out.print("请输入一个月份:");
            int month = sc.nextInt();
            if (month > 12||month < 1) {
                System.out.println("您输入的" + month + "月不存在");
            }
            else {
                switch ((month + 3) / 3){
                    case 2:System.out.println(month+"月是春季");
                        break;
                    case 3:System.out.println(month+"月是夏季");
                        break;
                    case 4:System.out.println(month+"月是秋季");
                        break;
                    default:System.out.println(month+"月是冬季");
                        break;
                }
            }

        //ex.学号、专业、姓名
//        System.out.print("请输入您的学号:");
//        int no = sc.nextInt();
//        System.out.print("请输入您的专业:");
//        String zhuanye = sc.next();
//        System.out.print("请输入您的姓名:");
//        String name = sc.next();
//        System.out.println("您的学号是:"+no);
//        System.out.println("您的专业是:"+zhuanye);
//        System.out.println("您的姓名是:"+name);

    }
}
