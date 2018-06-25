/*
FizzBuzz is a simple number game where you count, but say "Fizz" and/or "Buzz" instead of numbers adhering to certain rules.

Create a FizzBuzz() method that prints out the numbers 1 through 100.
Instead of numbers divisible by three print "Fizz".
Instead of numbers divisible by five print "Buzz".
Instead of numbers divisible by three and five print "FizzBuzz".

Sample Output:
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
*/

class FizzBuzz{

    static void fizzy(int n){
        for (int i = 0; i <= n; i++){
            if (i % 15 == 0){
                System.out.println("FizzBuzz");
            }

            else if (i % 3 == 0){
                System.out.println("Fizz");
            }

            else if (i % 5 == 0){
                System.out.println("Buzz");
            }

            else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args){
        fizzy(100);
    }
}

