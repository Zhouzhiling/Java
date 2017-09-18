package com.company;
import jdk.nashorn.internal.scripts.JO;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {

        /*计算当前时间*/
//        long totalMillis = System.currentTimeMillis();
//        long totalSeconds = totalMillis / 1000;
//        long currentSecond = totalSeconds % 60;
//        long totalMinute = totalSeconds / 60;
//        long currentMinute = totalMinute % 60;
//        long totalHour = totalMinute / 60;
//        long currentHour = totalHour % 24;
//        long PKTime = currentHour + 8;
//        System.out.println("Current time is " + PKTime + " : " + currentMinute + " : " + currentSecond + " GMT.");
//      /*计算当前时间止*/
//
// /*根据营业额计算税额，保留两位小数*/
//    Scanner input = new Scanner(System.in);
//    System.out.print("Input the total number:");
//    double total = input.nextDouble();
//    double tax = total * 0.06;
//    System.out.println("The tax is " + (int)(tax*100)/100.0);
//  /*根据营业额计算税额，保留两位小数止*/

//        /*计算幂*/
//    System.out.println(Math.pow(2,3));

//        /*弹窗提示*/
//        JOptionPane.showMessageDialog(null,"Are you OK?");
//
//        /*转义*/
//        System.out.println("He said \"Java is fun \"! ");

//        /*加法训练器orz*/
//        int flag = 1;
////        int num1 = (int)(System.currentTimeMillis() % 10);
////        int num2 = (int)(System.currentTimeMillis() * 3 % 10);
//        int num1 = (int)(Math.random() * 10);
//        int num2 = (int)(Math.random() * 10);
//        String answer = JOptionPane.showInputDialog(null,"What\'s " + num1 + " + " + num2 + " ?","Answer me!",JOptionPane.QUESTION_MESSAGE);
//        int answerInInt = Integer.parseInt(answer);
//        while(answerInInt != num1+num2)
//        {
//            flag ++;
//            answer = JOptionPane.showInputDialog(null,"What\'s " + num1 + " + " + num2 + " ?","Wrong! Again!",JOptionPane.QUESTION_MESSAGE);
//            answerInInt = Integer.parseInt(answer);
//        }
//        JOptionPane.showMessageDialog(null,"Bingo! You used " + flag + " times to guess!");
        /*加法训练器止*/

        /*减法训练器orz*/
//        int flag = 1;
////        int num1 = (int)(System.currentTimeMillis() % 10);
////        int num2 = (int)(System.currentTimeMillis() * 3 % 10);
//        int num1 = (int)(Math.random() * 10);
//        int num2 = (int)(Math.random() * 10);
//        if(num1 < num2)
//        {
//            num1 = num1 - num2;
//            num2 = num1 + num2;
//            num1 = num2 - num1;
//        }
//        String answer = JOptionPane.showInputDialog(null,"What\'s " + num1 + " - " + num2 + " ?","Answer me!",JOptionPane.QUESTION_MESSAGE);
//        int answerInInt = Integer.parseInt(answer);
//        while(answerInInt != num1-num2)
//        {
//            flag ++;
//            answer = JOptionPane.showInputDialog(null,flag + " time: " + "What\'s " + num1 + " - " + num2 + " ?","Wrong! Again!",JOptionPane.QUESTION_MESSAGE);
//            answerInInt = Integer.parseInt(answer);
//        }
//        JOptionPane.showMessageDialog(null,"Bingo! You used " + flag + " times to guess!");
    /*减法训练器止*/


//    /*编写程序，提示用户输入以英镑为单位的体重，以英尺为单位的身高。
//    计算之后显示BMI和体重提示，其中一磅是0.45359237kg，一英尺是0.0254米*/
//    final double KILO_PER_POUND = 0.45359237;
//    final double METER_PER_INCH = 0.0254;
//    Scanner Input = new Scanner(System.in);
//    System.out.print("Enter your weight in pounds:");
//    double weight = Input.nextDouble();
//    System.out.print("Enter your height in inches:");
//    double height = Input.nextDouble();
//    double weightInKg = KILO_PER_POUND * weight;
//    double heightInMe = METER_PER_INCH * height;
//    double BMI = weightInKg / Math.pow(heightInMe,2);
//    System.out.println("Your BMI is " + BMI);
//    if(BMI < 16)
//        System.out.println("You are seriously underweight.");
//    else if (BMI < 18)
//        System.out.println("You are underweight.");
//    else if (BMI < 24)
//        System.out.println("You are normal weight.");
//    else if (BMI < 29)
//        System.out.println("You are overweight.");
//    else if (BMI < 35)
//        System.out.println("You are seriously overweight.");
//    else if (BMI >= 35)
//        System.out.println("You are greatly overweight.");


//        /*Calculate if it's a leap year*/
//        Scanner Input = new Scanner(System.in);
//        System.out.print("Please input the year: ");
//        int year = Input.nextInt();
//        boolean ifLeapYear = (year%4==0) && (year%100!=0 || year%400==0);
//        if(ifLeapYear)
//            System.out.println("Leap!");
//        else
//            System.out.println("No!");

        /*确认对话框*/
        int option = JOptionPane.showConfirmDialog(null,"Continue");
        switch (option)
        {
            case JOptionPane.YES_OPTION:System.out.println("Yes");break;
            case JOptionPane.NO_OPTION:System.out.println("NO");break;
            case JOptionPane.CANCEL_OPTION:System.out.println("Cancel");break;
            default:System.out.println("???");break;


        }
    }
}
