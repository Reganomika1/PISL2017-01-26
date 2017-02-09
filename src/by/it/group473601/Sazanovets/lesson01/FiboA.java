package by.it.group473601.Sazanovets.lesson01;

/*
 * Вам необходимо выполнить рекурсивный способ вычисления чисел Фибоначчи
 */

public class FiboA {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {
        FiboA fibo = new FiboA();
        int n = 33;
        System.out.printf("calc(%d)=%d \n\t time=%d \n\n", n, fibo.calc(n), fibo.time());


        fibo = new FiboA();
        n = 33;
        System.out.printf("slowA(%d)=%d \n\t time=%d \n\n", n, fibo.slowA(n), fibo.time());
    }


    private int calc(int n) {
        int fib1 = 1, fib2 = 1, sum = 0, i = 2;
        while( i < n){
            sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
            i++;
        }
        return sum;
    }


    int slowA(Integer n) {
        if(n ==1 || n == 2)
            return 1;
        else
            return slowA(n-1) + slowA(n-2);
    }



}

