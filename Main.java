package com.Sharad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Students> arr = new ArrayList<>();

        for(int a =0;a<2;a++){
            arr.add(new Students(a+1,input.next(),input.nextInt(),input.nextInt(),input.nextInt()));
        }

        System.out.println(arr.toString());

    }

}