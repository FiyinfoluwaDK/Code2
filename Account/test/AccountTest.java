import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    AccountApp accountApp = new AccountApp();

    @Test
    public void testAccountBalance() {
        int balance = 1000;
        int result = accountApp.checkBalance(balance);
        assertEquals(balance, result);

    }

    @Test
    public void testIfBalanceRemainsZeroWhenWithdrawing2_000() {
        int balance = 0;
        int result = accountApp.withdraw(balance, 2000, 1234);
        assertEquals(0, result);
    }

    @Test
    public void testIfBalanceRemainsZeroWhenWithdrawingNegativeAmount() {
        int balance = 0;
        int result = accountApp.withdraw(balance, -500, 1234);
        assertEquals(0, result);
    }

    @Test
    public void testIfBalanceIncreasesWhenDepositingPositiveAmount() {
        int balance = 1000;
        int result = accountApp.deposit(balance, 500);
        assertEquals(1500, result);
    }

    @Test
    public void testifpinIsValid() {
        int pin = 1234;
        assertTrue(pin >= 1000 && pin <= 9999);
    }

}