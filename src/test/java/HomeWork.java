import org.junit.jupiter.api.Test;

public class HomeWork {
    private int globalVar  = 10;


    @Test
    public void firstTest() {

        int sum = percent(50000, 2);


        System.out.println("Summa ipoteki : " + sum);


    }

    private int percent (int a, int b) {
        int c = a * b / 100;
        return c + a;
    }
}
