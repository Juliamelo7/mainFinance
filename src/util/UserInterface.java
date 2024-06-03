package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface{
    private Scanner scanner;

    public UserInterface(){
        scanner = new Scanner(System.in);
    }
    public double askPropertyValue() {
        double propertyValue;
        do {
            try {
                System.out.print("Digite o valor do imóvel: ");
                String propertyValueStr = scanner.next();
                propertyValue = Double.parseDouble(propertyValueStr.replace(',', '.'));
                if (propertyValue <= 0){
                    System.out.println("Erro: O valor do imóvel deve ser maior que 0. Tente novamente. ");
                }
            }catch (NumberFormatException exception) {
                System.out.println("Erro: O valor do imóvel deve ser um número. Tente novamente. ");
                propertyValue = 0;
            }
        }while (propertyValue <= 0);
        return propertyValue;
    }
    public int askFundingPeriod(){
        int fundingPeriod;
        do {
            try {
                System.out.print("Digite o prazo do financiamento: ");
                String fundingPeriodStr = scanner.next();
                fundingPeriod = Integer.parseInt(fundingPeriodStr.replace(',','.'));
                if (fundingPeriod <= 0){
                    System.out.println("Erro: O prazo de financiamento deve ser maior que 0. Tente novamente. ");
                }
            }catch (NumberFormatException exception){
                System.out.println("Erro: O prazo de financiamento deve ser um número. Tente novamente. ");
                fundingPeriod = 0;
            }
        }while (fundingPeriod <= 0);
        return fundingPeriod;
    }
    public double askAnnualFee(){
        double annualfee;
        do {
            try {
                System.out.print("Digite a taxa de juros anual: ");
                String annualfeeStr = scanner.next();
                annualfee = Double.parseDouble(annualfeeStr.replaceAll("%", ""));
                if (annualfee < 0){
                    System.out.print("Erro: O valor do imóvel deve ser maior que 0. Tente novamente. ");
                }
            }catch (NumberFormatException exception) {
                System.out.println("Erro: O valor do imóvel deve ser um número. Tente novamente. ");
                annualfee = 0;
            }
        }while (annualfee < 0);
            return annualfee;
    }
}