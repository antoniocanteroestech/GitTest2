package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    enum Meses {Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto,
        Septiembre, Octubre, Noviembre, Diciembre}


    public static void main(String[] args) {
       System.out.println("Introduce dos números");
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
    	System.out.println(i1);
    	System.out.println(i2);
        sc.close();
    }
}
