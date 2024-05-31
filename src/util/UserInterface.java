package util;

import java.util.Scanner;

public class UserInterface{
    private Scanner scanner;

    public UserInterface(){
        scanner = new Scanner(System.in);
    }
    public double askPropertyValue() {
        double propertyValue;
        do {
            System.out.print("Digite o valor do imóvel: ");
            propertyValue = scanner.nextDouble();
            if (propertyValue <= 0){
                System.out.print("Erro: O valor do imóvel deve ser maior que 0. Tente novamente. ");
            }
        }while (propertyValue <= 0);
        return propertyValue;
    }
    public int askFundingPeriod(){
        int fundingPeriod;
        do {
            System.out.print("Digite o prazo do financiamento: ");
            fundingPeriod = scanner.nextInt();
            if (fundingPeriod <= 0){
                System.out.print("Erro: O prazo de financiamento deve ser maior que 0. Tente novamente. ");
            }
        }while (fundingPeriod <= 0);
        return fundingPeriod;
    }
    public double askAnnualFee(){
        double annualfee;
        do {
            System.out.print("Digite a taxa de juros anual: ");
            annualfee = scanner.nextDouble();
            if (annualfee < 0){
                System.out.print("Erro: A taxa de juros anual deve ser maior ou igual a 0. Tente novamente. ");
            }
        }while (annualfee < 0);
            return annualfee;
    }
}