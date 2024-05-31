package main;

import models.Finance;
import util.UserInterface;

public class Main {
    public static void main(String[] args){
        UserInterface userInterface = new UserInterface();

        double propertyValue = userInterface.askPropertyValue();
        int fundingPeriod = userInterface.askFundingPeriod();
        double annualFee = userInterface.askAnnualFee();

        Finance finance = new Finance(propertyValue,fundingPeriod,annualFee);

        double monthPayment = finance.calculateMonthlyPayment();
        double totalPayment = finance.calculateTotalPayment();

        System.out.println("Pagamento mensal: R$ " + String.format("%.2f",monthPayment));

        System.out.print("Pagamento Total: R$ " + String.format("%.2f", totalPayment));
    }
}
