import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RequestCurrency request = new RequestCurrency();
        System.out.print("Escribe el código de la divisa a consultar información (Ej[USD/usd]: ");
        String currencyCode = input.nextLine();
        Currency currency = request.getCurrency(currencyCode);
        System.out.println("currency = " + currency);
    }
}