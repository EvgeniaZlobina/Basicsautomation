package ru.netology;

public class CashbackHackService {
// расчет
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}

