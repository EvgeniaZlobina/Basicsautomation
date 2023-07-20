import ru.netology.CashbackHackService;


import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void CashbackTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void Cashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }
}