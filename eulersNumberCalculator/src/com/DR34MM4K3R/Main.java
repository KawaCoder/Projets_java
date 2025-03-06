package com.DR34MM4K3R;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long startTime = 0;
        long endTime = 0;

        BigDecimal test = new BigDecimal(1);

        System.out.println("How many digits ?");
        int nbdecim = sc.nextInt();
        sc.nextLine();

        System.out.println("How many calculation row? (3 = bad precision but fast | 1000< = nice precision but slower");
        int row = sc.nextInt();

        System.out.println("Enable logs? (\"true\" | \"false\")");
        boolean logs = sc.nextBoolean();


        BigDecimal a = new BigDecimal(1);
        BigDecimal b = new BigDecimal(1);
        BigDecimal temp = new BigDecimal(1);

        startTime = System.currentTimeMillis();
        for (int i=1;i<=row;i++){
            b = b.multiply(BigDecimal.valueOf(i));
            a = a.add(test.divide(b, nbdecim, RoundingMode.HALF_UP));
            if (temp.equals(a)){
                break;

            }
            temp = a;
            if (logs){
                System.out.println("["+(System.currentTimeMillis() - startTime)+" ms] e = "+a);


            }



        }
        endTime = System.currentTimeMillis();
        System.out.println("e = "+a+"\nComputed in "+(endTime - startTime)+"ms.");




    }
}
