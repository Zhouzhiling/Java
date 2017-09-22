package com.company;
import jdk.nashorn.internal.scripts.JO;

import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class Main {

//    /*求i1到i2的和*/
//    public static int CalculateSum(int i1,int i2)
//    {
//        int sum=0;
//        for(int i=i1;i<i2;i++)
//            sum += i;
//        return sum;
//    }
//    /*求i1到i2的和end*/
    public static void main(String[] args)  throws Exception{

        /*求i1到i2的和*/
        //System.out.println("Sum from 10 to 50 is " + CalculateSum(10,50));
        /*求i1到i2的和end*/

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
//        int option = JOptionPane.showConfirmDialog(null,"Continue");
//        switch (option)
//        {
//            case JOptionPane.YES_OPTION:System.out.println("Yes");break;
//            case JOptionPane.NO_OPTION:System.out.println("NO");break;
//            case JOptionPane.CANCEL_OPTION:System.out.println("Cancel");break;
//            default:System.out.println("???");break;
//        }

//        /*解一元二次方程*/
//        Scanner Input = new Scanner(System.in);
//        System.out.println("ax^2 + bx + c = 0");
//        System.out.println("Please input a, b, c:");
//        int a = Input.nextInt();
//        int b = Input.nextInt();
//        int c = Input.nextInt();
//        //if real roots exist
//        double real = Math.pow(b,2) - 4 * a * c;
//        if(real < 0)
//        {
//            System.out.println("No real root exists!");
//        }
//        else if (real == 0)
//        {
//            System.out.println("One real root exists!");
//            double result = -b / (2*a);
//            System.out.println("The only result is " + result);
//        }
//        else
//        {
//            System.out.println("Two real root exists!");
//            double result1 = (-b + Math.pow(real,1/2))/(2*a);
//            double result2 = (-b - Math.pow(real,1/2))/(2*a);
//            System.out.println("The two results are " + result1 + " and " + result2);
//        }

        /*4-4 sentinel Value.java*/
//        int sum = 0;
//        Scanner Input = new Scanner(System.in);
//        System.out.print("Enter an int value(exit at zero):");
//        int data = Input.nextInt();
//        while(data != 0)
//        {
//            sum += data;
//            System.out.println("Current value = " + sum);
//            System.out.print("Enter an int value(exit at zero):");
//            data = Input.nextInt();
//        }
//        System.out.print("The total sum is " + sum);

//        /*在五行中显示前50个素数*/
//        int num=1,i;
//        int count = 0;
//        while(count < 50)
//        {
//            num ++;
//            boolean isPrime = true;
//            for(i=2;i<=num/2;i++)
//            {
//                if (num % i == 0)
//                {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if(isPrime)
//            {
//                count++;
//                System.out.print(num + " ");
//                if(count % 10 == 0)
//                    System.out.print("\n");
//            }
//        }
//        /*在五行中显示前50个素数end*/

        /*循环对话框*/
//    int option = JOptionPane.YES_OPTION;
//    while(option == JOptionPane.YES_OPTION)
//    {
//        System.out.println("Continue loop!");
//        option = JOptionPane.showConfirmDialog(null,"Continues???");
//    }
        /*循环对话框end*/

//    /*程序清单5.8 输入十进制数转化成十六进制*/
//        Scanner Input = new Scanner(System.in);
//        System.out.print("Please input a number:");
//        int numberInDec = Input.nextInt();
//        System.out.println("The number in hex is:" + FromDecToHex(numberInDec));
//    /*程序清单5.8 输入十进制数转化成十六进制end*/

//    /*程序清单5-11 生成随机小写字母*/
//    int looptime = 20;
//    while(looptime-- != 0)
//    {
//        char tmp = (char)('a' + Math.random() * ('z'-'a' + 1));
//        System.out.printf("%c",tmp);
//    }
//    /*程序清单5-11 生成随机小写字母end*/
//
//        int[] tmp = {1,2,3,4,5,6,7};
//        int[] after = new int [7];
//        System.arraycopy(tmp,0,after,0,tmp.length);
//        for (int t:after
//             ) {
//            System.out.println(t+10);
//        }

//        /*不定数目的输入参数*/
//        printMax(5,29,45,7,5,1);
//        printMax(new int[]{6,5,4,3,3,555,1});
//        /*不定数目的输入参数end*/

        /*数组的比较和fill用法*/
//        int[] list = {1,2,3,4};
//        int[] list1 = {1,2,3,4};
//        int[] list2 = {4,2,7,10};
//        java.util.Arrays.fill(list,5);
//        for (int tmp:list
//             ) {
//            System.out.print(tmp + " ");
//        }
//        System.out.println(java.util.Arrays.equals(list,list1));
//        System.out.println(java.util.Arrays.equals(list2,list1));
        /*数组的比较和fill用法end*/

//        /*锯齿矩阵*/
//        int [][] triangleArray = new int [5][];
//        triangleArray[0] = new int[5];
//        triangleArray[1] = new int[4];
//        triangleArray[2] = new int[3];
//        triangleArray[3] = new int[2];
//        triangleArray[4] = new int[1];
//        /*锯齿矩阵end*/

//        /*class用法*/
//        Circle1 circle1 = new Circle1();
//        Circle1 circle2 = new Circle1(25);
//        Circle1 circle3 = new Circle1(125);
//        System.out.println("area of circle1 of radius " + circle1.radius + " is " + circle1.getArea());
//        System.out.println("area of circle2 of radius " + circle2.radius + " is " + circle2.getArea());
//        System.out.println("area of circle3 of radius " + circle3.radius + " is " + circle3.getArea());
//
//        circle3.radius = 1;
//        System.out.println("area of circle3 of radius " + circle3.radius + " is " + circle3.getArea());
//        /*class用法end*/

        /*随机类*/
//        java.util.Date date = new java.util.Date();
//        Random random1 = new Random();
//        System.out.println(random1.nextInt(20));
//        System.out.println(date.toString());
        /*随机类*/

//        /*跳出一个窗口*/
//        JFrame frame1 = new JFrame();
//        frame1.setTitle("2017.09.22 7:48");
//        frame1.setSize(200,150);
//        frame1.setLocation(200,100);
//        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame1.setVisible(true);
//        /*跳出一个窗口end*/

//        /*程序清单9-7 WriteData.java*/
//        java.io.File file = new java.io.File("scores.txt");
//        if(file.exists())
//        {
//            System.out.println("File already exists!");
//            System.exit(0);
//        }
//        java.io.PrintWriter output = new java.io.PrintWriter(file);
//        output.print("??? = ");
//        output.println("90");
//        output.print("Eric K Jones = ");
//        output.println("85");
//        output.close();
//        /*程序清单9-7 WriteData.java end*/


        /*程序清单9-8 ReadData.java*/

        java.io.File file = new java.io.File("scores.txt");
        Scanner input = new Scanner(file);
        while(input.hasNext())
        {
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstName + " " + mi + " " + lastName + " " + score);
        }
        input.close();

        /*程序清单9-8 ReadData.java end*/
    }
}

//    class Circle1
//    {
//        double radius;
//
//        Circle1()
//        {
//            radius = 1.0;
//        }
//
//        Circle1(double newRadius)
//        {
//            radius = newRadius;
//        }
//
//        double getArea()
//        {
//            return radius * radius * Math.PI;
//        }}
/*class用法end*/


//    /*不定数目的输入参数*/
//    public static void printMax(int ... input)
//    {
//        int tmp = -1;
//        for(int i=0;i<input.length;i++)
//            if(input[i] > tmp)
//                tmp = input[i];
//        System.out.println("The max number is " + tmp );
//    }
//    /*不定数目的输入参数end*/
//    /*程序清单5.8 输入十进制数转化成十六进制的函数*/
//    public static String FromDecToHex(int numberInDec)
//    {
//        String res = "";
//        while(numberInDec != 0)
//        {
//            int tmp = numberInDec % 16;
//            res = transfer(tmp) + res;
//            numberInDec = numberInDec / 16;
//        }
//        return res;
//    }
//    public static char transfer(int tmp)
//    {
//        if(tmp >= 0 && tmp <= 9)
//            return (char)(tmp + '0');
//        else
//            return (char)(tmp - 10 + 'A');
//    }
//    /*程序清单5.8 输入十进制数转化成十六进制的函数end*/
//}
