package pl.jkanclerz.creditcard;

import java.math.BigDecimal;

public class CreditCard {
    String cardNumber;
    private BigDecimal balance;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void assignCredit(BigDecimal creditAmount) {
        if (isBelowThreshold(creditAmount)){
            throw new CreditLimitBelowThresholdException();
        }
        this.balance = creditAmount;
    }

    private boolean isBelowThreshold(BigDecimal creditAmount) {
        return creditAmount.compareTo(BigDecimal.valueOf(100))<0;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
