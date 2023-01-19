public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        double interestRate = 9.99;
        int loanTerm = 12; // срок кредита
        int loanAmount = 1_000_000; // сумма кредита
        double monthlyPayments = service.calculate(loanAmount, loanTerm, interestRate);

        System.out.println("Ежемесячный платеж:" + monthlyPayments);


        double interestRate2 = 9.99;
        int loanTerm2 = 24; // срок кредита
        int loanAmount2 = 1_000_000; // сумма кредита
        double monthlyPayments2 = service.calculate(loanAmount2, loanTerm2, interestRate2);

        System.out.println("Ежемесячный платеж:" + monthlyPayments2);

        double interestRate3 = 9.99;
        int loanTerm3 = 36; // срок кредита
        int loanAmount3 = 1_000_000; // сумма кредита
        double monthlyPayments3 = service.calculate(loanAmount3, loanTerm3, interestRate3);

        System.out.println("Ежемесячный платеж:" + monthlyPayments3);
    }
}