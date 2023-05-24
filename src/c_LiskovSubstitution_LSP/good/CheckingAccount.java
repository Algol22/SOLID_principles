package c_LiskovSubstitution_LSP.good;

import java.math.BigDecimal;

public class CheckingAccount extends WithdrawableAccount {
    @Override
    protected void deposit(BigDecimal amount) {
        // Deposit into this account
    }

    @Override
    protected void withdraw(BigDecimal amount) {
      //withdrawal
    }
}