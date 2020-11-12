import org.junit.jupiter.api.Test;

public class MyFirstTest {
    private int globalVar  = 10;


    //odnostrochnij kommentarij

    /*
    mnogostrochnij
    kommentarij
     */
    @Test //annotacija ona govorit Jave kak budem rabotat s posledujushej za nej peremennoj
    public void firstTest() {
        System.out.println("Hello corona maza faka!");
        int sum = sumTwoDigits(15, 20);
        System.out.println("Aaaand the sum is: " + sum + " MAZAFAKA");
        System.out.println(sumTwoDigits(3, 8));

    }

    private int sumTwoDigits(int a, int b) {
        int c = a + b;
        return c;
    }
}
