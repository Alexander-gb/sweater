package hw1;

import java.util.Scanner;

public class dz2 {

    static  void Ds(int year){
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }

    public static void main(String[] args) {
        Ds(2012);


    }
}



