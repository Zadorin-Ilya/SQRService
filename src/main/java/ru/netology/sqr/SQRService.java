package ru.netology.sqr;


public class SQRService {
    public int calculate(int min, int max) {
        int count = 0;
        int ii;
        for (int i = 10; i <= 99; i++) {
            ii = i * i;
            if (ii >= min) {
                count++;
            }
        }
        return count;
    }


}
