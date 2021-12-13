package com.dayfive.assign;

import java.util.Random;

public class FlipCoin {
    public static void main(String[] args) {
        double randomnum;
        randomnum = Math.random();

        if (randomnum < 0.5) {
            System.out.println("heads");
        }
            else{
                System.out.println("tails");
            }

        }


    }

