package com.example.project;

public class TipCalculator {
    public static double roundToDecimal(double decimal, int spaces){
        double factor = Math.pow(10, spaces);
        return (int) (decimal * factor + 0.5) / factor;
    }
    public static double roundDown(double decimal, int spaces){
        double factor = Math.pow(10, spaces);
        return (int) (decimal * factor) / factor;
    }
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
        double tip = roundToDecimal((cost * percent / 100), 2);
        double totalWithTip = tip + cost;
        double costPerPerson = roundToDecimal(cost / people, 2);
        double tipPerPerson = roundToDecimal(tip / people, 2);
        double totalCostPerPerson = roundDown(totalWithTip / people, 2);
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n");
        result.append("Total tip: " + "$" + tip + "\n");
        result.append("Total Bill with tip: " + "$" + totalWithTip + "\n");
        result.append("Per person cost before tip: " + "$" + costPerPerson + "\n");
        result.append("Tip per person: " + "$" + tipPerPerson + "\n");
        result.append("Total cost per person: " + "$" + totalCostPerPerson + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12; 
        int percent = 15;
        double cost = 566.97;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
