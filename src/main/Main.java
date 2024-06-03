package main;

import models.Finance;
import util.UserInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*UserInterface userInterface = new UserInterface();

        double propertyValue = userInterface.askPropertyValue();
        int fundingPeriod = userInterface.askFundingPeriod();
        double annualFee = userInterface.askAnnualFee();

        Finance finance = new Finance(propertyValue,fundingPeriod,annualFee);

        double monthPayment = finance.calculateMonthlyPayment();
        double totalPayment = finance.calculateTotalPayment();

        System.out.println("Pagamento mensal: R$ " + String.format("%.2f",monthPayment));

        System.out.print("Pagamento Total: R$ " + String.format("%.2f", totalPayment));*/

        ArrayList<Finance> finances = new ArrayList<Finance>();
        finances.add(new Finance(200000, 360, 8));
        finances.add(new Finance(350000, 42, 5));
        finances.add(new Finance(400000, 460, 12));
        finances.add(new Finance(450000, 60, 4.5));
        for (int i = 0; i < finances.size(); i++) {
            Finance element = finances.get(i);
            System.out.println((i+1)+". Financiamento " + (i+1) + " - valor do imóvel: R$ " +String.format("%.2f",element.getPropertyValue())+ ", valor do financiamento: R$ "+ String.format("%.2f",element.calculateTotalPayment()));
        }
    }
}
