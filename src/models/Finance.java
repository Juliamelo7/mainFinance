package models;

public class Finance {
    //atributos
    private double propertyValue;
    private int fundingPeriod;
    private double annualFee;
    //metodos
    public double getPropertyValue(){
        return this.propertyValue;
    }
    public int fundingPeriod(){
        return this.fundingPeriod;
    }
    public double annualFee(){
        return this.annualFee;
    }
    public Finance (double PropertyValue, int FundingPeriod, double AnnualFee){
        this.propertyValue = PropertyValue;
        this.fundingPeriod = FundingPeriod;
        this.annualFee = AnnualFee;
    }
    public double calculateMonthlyPayment(){
        return (propertyValue / (fundingPeriod * 12) * (1 + (annualFee/12)));
    }
    public double calculateTotalPayment(){
        return calculateMonthlyPayment() * fundingPeriod * 12;
    }
    public void showFinance(){
        System.out.println("O valor do imóvel é: " + this.propertyValue);
        System.out.println("O valor do pagamento total é: " + calculateTotalPayment());

    }
}
