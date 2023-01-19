import java.math.RoundingMode;

public class CreditPaymentService {
    public double calculate(int loanAmount, int loanTerm, double yearlyPercent) {
        double monthPercent = (yearlyPercent / 12) / 100;

        double coefficient = (monthPercent * Math.pow(1 + monthPercent, loanTerm)) / (Math.pow(1 + monthPercent, loanTerm) - 1);
        double result = loanAmount * coefficient;

        return Math.round(result * 100.0) / 100.0;
    }


}
