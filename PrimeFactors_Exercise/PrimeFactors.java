/*
Write a method generate(int n) that given an integer N will return a list of integers such that the numbers are the
factors of N and are arranged in increasing numerical order.

For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.
*/

import java.util.TreeSet;
import java.util.ArrayList;

class PrimeFactors{

    static ArrayList<Integer> generate(int n){
        TreeSet<Integer> allPrimes = new TreeSet<>();
        ArrayList<Integer> primeFactors = new ArrayList<>();


        for (Integer i = 2; i < n; i++){

                boolean isPrime = true;

                for (Integer prime : allPrimes){
                    if (i % prime == 0){
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime == true) {
                    allPrimes.add(i);

                    if (n % i == 0){
                        primeFactors.add(i);
                    }
                }
        }

        return primeFactors;
    }

    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);

        ArrayList primeFactors = generate(n);
        System.out.println(primeFactors);
    }
}