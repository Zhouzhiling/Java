package com.company;

public class Main {

    public static void main(String[] args) {
	    java.util.Scanner in = new java.util.Scanner(System.in);
	    Clock clock = new Clock(in.nextInt(),in.nextInt(),in.nextInt());
	    clock.tick();
	    System.out.println(clock);
        //clock.start();
        in.close();
    }

    static class Clock{
        private Display hour = new Display(24);
        private Display minute = new Display(60);
        private Display second = new Display(60);

        public Clock (int hh, int mm, int ss)
        {
            hour.SetTime(hh);
            minute.SetTime(mm);
            second.SetTime(ss);
        }

        public void tick()
        {
            second.increase();
            if(second.getValue()==0)
            {
                minute.increase();
                if(minute.getValue()==0)
                {
                    hour.increase();
                }
            }
        }

        public String toString()
        {
            return String.format("%02d:%02d:%02d",hour.getValue(),minute.getValue(),second.getValue());
        }

    }

    static class Display{
        //不写也会默认为零，但是写出来比较清楚
        private int value = 0;
        private int limit = 0;

        public void SetTime(int num)
        {
            value = num;
        }

        public Display(int limit)
        {
            this.limit = limit;
        }

        public void increase()
        {
            value++;
            if(value == limit)
                value = 0;
        }

        public int getValue()
        {
            return value;
        }
    }
}
