package by.it.group473601.Sazanovets.lesson01;

import java.math.BigInteger;
import java.util.ArrayList;

/*
 * Вам необходимо выполнить способ вычисления чисел Фибоначчи с вспомогательным массивом
 * без ограничений на размер результата (BigInteger)
 */

public class FiboB {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {

        //вычисление чисел простым быстрым методом
        FiboB fibo = new FiboB();
        int n = 55555;
        System.out.printf("fastB(%d)=%d \n\t time=%d \n\n", n, fibo.fastB(n), fibo.time());
    }

    BigInteger fastB(Integer n) {
        ArrayList<BigInteger> fibo = new ArrayList();
        int  i = 2;
        BigInteger fib1 = BigInteger.valueOf(1);
        BigInteger fib2 = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.ZERO;

        fibo.add(BigInteger.ZERO);
        fibo.add(BigInteger.ONE);
        fibo.add(BigInteger.ONE);
        while( i < n){
            sum = fib1.add(fib2);
            fib1 = fib2;
            fib2 = sum;
            fibo.add(fib2);
            i++;
        }

        return (BigInteger)fibo.get(n);
    }

}

