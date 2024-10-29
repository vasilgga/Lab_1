
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Main {
    public static void printRow(double[] row) {
        for (double i : row) {

            double v = i;
            if (Double.isNaN(i)){
                System.out.print(i);
                System.out.print("\t");
            }else{
                System.out.printf("%.3f",v);
                System.out.print("\t");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        short[] z = new short[17];
        short n = 2;

        for (int i = 0; i < z.length; i++) {
            z[i] = n;
            n++;

        }
        System.out.println(Arrays.toString(z));


        double[] x = new double[10];

        for (int j = 0; j < x.length; j++) {
            x[j] = ((double) Math.random() * ((14.0f - (-10.0f)))) - 10.0f;
        }
        System.out.println(Arrays.toString(x));


        double[][] Z = new double[9][10];
        for (int i = 0; i < Z.length; i++) {
            for (int j = 0; j < Z[i].length; j++) {
                double X = x[j];
                int[] f = {2, 4, 8, 14};
                int index = Arrays.binarySearch(f, i);
                if (z[i] == 18) {
                    double w = Math.pow((Math.log(Math.PI * (abs(X) + 1))),(Math.pow(X, 3)));
                    Z[i][j] = w;
                } else if (index > 0) {

                    double w = Math.cos(Math.pow(Math.E, Math.cbrt(X)));
                    Z[i][j] = w;

                } else {
                    double w = Math.atan(0.2 * (Math.PI / 4) * Math.pow((X + 2) / 24, 2));
                    Z[i][j] = w;
                }
            }
        }
        for (double[] row: Z){
            printRow(row);
        }
    }
}


