package c_LiskovSubstitution_LSP.good;

import java.math.BigDecimal;

public class BankingAppWithdrawalService {
    private WithdrawableAccount withdrawableAccount;

    public BankingAppWithdrawalService(WithdrawableAccount withdrawableAccount) {
        this.withdrawableAccount = withdrawableAccount;
    }
    public void withdraw(BigDecimal amount) {
        withdrawableAccount.withdraw(amount);
    }
}