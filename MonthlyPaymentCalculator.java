/*
@Author: Surina Arora 
@Date: Oct. 13th, 2023 
@Description: 
This program calculates the monthly payment on a loan of an amount specified by the user. 
*/ 

import java.util.Scanner;
import java.lang.Math;

class MonthlyPaymentCalculator<SurinaArora> {
   public static void main (String [] args) {
   
   Scanner uI = new Scanner (System.in);
   
   //lines 18-21 declare the set variables used in this code. 
   
   double priceOfProduct = 0; 
   double yearsForLoan = 0;
   double yearlyInterest = 0;
   String percent = "%";
   
   //lines 25-27 allow the user to input a principal amount for the product in purchace. 
   
   System.out.printf("Please enter the principal amount of the product you would like to buy: ");
   Scanner priceOfProductNum = new Scanner (System.in);
   priceOfProduct = uI.nextDouble();
   
   //lines 31-33 allow the user to input the number of years their loan will be for. 
   
   System.out.printf("Please enter the number of years the loan will be for: ");
   Scanner yearsForLoanNum = new Scanner (System.in);
   yearsForLoan = uI.nextDouble();
   
   //lines 37-39 allow the user to input the yearly interest for the product.  

   System.out.printf("Please enter the yearly interest for the product: ");
   Scanner yearlyInterestNum = new Scanner (System.in);
   yearlyInterest = uI.nextDouble();
   
   //line 43 is the variable that will be used when calculating the monthly payment. Instead of writing in the entire equation, it will be substitued as "monthlyPayment"
   
   double monthlyPayment = ((priceOfProduct*(yearlyInterest/12/100)) / (1-Math.pow(1+(yearlyInterest/12/100),-(double)yearsForLoan*12)));
   
   //line 47 finally states the monthly payment fully calculated. 

   System.out.printf("For the amount of $%.2f at a %.2f%s per year %.0f years, the monthly payment will be $%.2f",priceOfProduct,yearlyInterest,percent,yearsForLoan,monthlyPayment); 
   
   } // ends main() method
}  // ends the whole program 