package com.company;
import java.util.Scanner;

public class Main {

    public static class Fib implements Runnable
    {

        static int[] fibnum = new int[256];

        private int target;

        public Fib(int target)
        {
            this.target = target;
        }

        public int f(int x)
        {
            if(x>2)
                return (fibnum[x-1] =( f(x-1) + f(x-2)));
            else if(x==1 || x==2)
                return (fibnum[x-1] = x-1);
            else
                return -1;
        }

        @Override
        public void run()
        {
            //for(int i=0;i<target;i++)
                System.out.println(f(target));
                for(int i=0;i<target;i++)
                    System.out.println(":" + fibnum[i]);
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Please input the number you want to get:");
        Scanner Input = new Scanner(System.in);
        int target = Input.nextInt();
        new Thread(new Fib(target)).start();
    }
}
