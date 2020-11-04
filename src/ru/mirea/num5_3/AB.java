package ru.mirea.num5_3;

import java.lang.*;
import java.util.Scanner;

public class AB
{
    public static int AB(int a,int b)
    {
        if(a<b)
        {
            return a;
        }else
        {
            return a;
        }
    }

    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int aa=a;
        if(a<b)
        {
            for (int i=0;i<b-a+1;i++)
                System.out.println(AB(a+i,b));
        }else
        {
            for (int i=0;i<(a-b+1);i++)
            {
                System.out.println(AB(a-i,b));
            }
        }
    }
}
