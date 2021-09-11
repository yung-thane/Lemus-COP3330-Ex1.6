/*
 * UCF COP3330 Fall 2021 Assignment 1.6 Solution
 * Copyright 2021 Ronald Lemus
 */


import java.util.Calendar;
import java.util.Scanner;

public class Retirement_Calculator {
    public static void main(String[] args){
        System.out.print("What is your current age? ");
        Scanner ageInp = new Scanner(System.in);
        String ageString = ageInp.nextLine();
        int ageCurrent = Integer.parseInt(ageString);

        System.out.print("At what age would you like to retire? ");
        Scanner ageRetInp = new Scanner(System.in);
        String ageRetString = ageRetInp.nextLine();
        int ageRetire = Integer.parseInt(ageRetString);

        int yearsTillRetire = ageRetire - ageCurrent;
        System.out.printf("You have %d years left until you can retire.", yearsTillRetire);

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int retireYear = currentYear + yearsTillRetire;
        System.out.printf("It's %d, so you can retire in %d.", currentYear, retireYear);


    }
}
