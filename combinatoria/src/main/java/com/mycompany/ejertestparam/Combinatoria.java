package com.mycompany.ejertestparam;

public class Combinatoria {

    public int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public boolean isInteger(String string) {
        try {
            Integer.valueOf(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int calcular(int n, int x) {
        try {

            if (x < 0) {
                throw new IllegalArgumentException("x no puede ser negativo");
            } else if (n < 0) {
                throw new IllegalArgumentException("n no puede ser negativo");
            } else if (x > n) {
                throw new IllegalArgumentException("x es mayor que n");
            }

        } catch (Exception e) {
            System.out.println("error");
        }
        return  this.factorial(n) / (this.factorial(n - x) * this.factorial(x));
    }

}
