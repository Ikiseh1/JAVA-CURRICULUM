package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {0,1};

        change(numbers);


    }

    private static void change(int[] numbers) {
        numbers[0]= 2;
        numbers[1]= 3;
        System.out.println(numbers[0]+"," + numbers[1]);
    }
}