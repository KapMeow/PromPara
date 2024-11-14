package com.education.hszg.bmi;
import org.checkerframework.checker.units.qual.degrees;
public class BMICalculator {

    public double calculateBMI(double weightInKG, double heightInMeters) {
        if ((weightInKG < 30) || (weightInKG > 150)) return 0.0;
        if ((heightInMeters < 1.20)|| (heightInMeters > 2.50)) return 0.0;        
        return 
            weightInKG
            /
            (heightInMeters*heightInMeters);
        //double BMI = weightInKG / (heightInMeters * heightInMeters);
        //return BMI;


    }

    public String calculateBMIRecommendation(double weightInKG, double heightInMeters) 
    {
        if (calculateBMI(weightInKG, heightInMeters)< 21)
        {
            return "Please eat more often at McDonalds.";
        }
        if (calculateBMI(weightInKG, heightInMeters)> 24) 
        {
            return "Please do join a gym sports club.";
        }
        return "You have a healthy body";        
        
        
    }


    public static void main(String[] args) {
        
        BMICalculator bmicalculator = new BMICalculator();

        System.out.println("Test des BMI Calculators");
        System.out.println("Values: 70.0kg und 1.78m");
        System.out.println("BMI: " + bmicalculator.calculateBMI(70.0, 1.78));

    }


}