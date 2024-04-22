import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        PreSaleTicket preSaleTicket = new PreSaleTicket(1, TicketType.PRE_SALE, 20);
        System.out.println(preSaleTicket);
    }
}
