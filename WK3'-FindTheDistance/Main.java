package com.company;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> Distance = new HashMap<String,Integer>();
        int curNum = 0;
        String curCity = in.next();
        while(!curCity.equals("###"))
        {
            Distance.put(curCity, curNum);
            curNum++;
            curCity = in.next();
        }
//        System.out.println("City name done!");

        int[][] DisMap = new int[curNum][curNum];
        for(int i=0;i<curNum;i++)
            for(int j=0;j<curNum;j++)
                DisMap[i][j] = in.nextInt();

//        System.out.println("Distance matrix done!");

        String cityA = in.next();
        String cityB = in.next();
        int numA = Distance.get(cityA);
        int numB = Distance.get(cityB);

        System.out.println(DisMap[numA][numB]);

    }

}
