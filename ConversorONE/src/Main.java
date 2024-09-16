import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RequestCurrency request = new RequestCurrency();
        String[] defaultCurrencies = {"USD", "MXN", "ARS", "BRL"};
        String[] textFormat = {"base", "de cambio"};
        String[] choices = {"", ""};
        double amount = 0.0;
        int option = 0;
        System.out.println("CONVERSOR DE DIVISAS");


        for (int i = 0; i < choices.length; i++) {
            int choice = 0;
            System.out.print(String.format("""
                \nSeleccione la moneda %s
                  1. Dolar - USD
                  2. Peso Mexicano - MXN
                  3. Peso Argentino - ARS
                  4. Real Brasileño - BRL
                >_\s""", textFormat[i]));
            choice = input.nextInt();
            while (choice <= 0 || choice > 4) {
                System.out.print("Por favor, selecciona una opción válida.\n>_ ");
                choice = input.nextInt();
            }
            choices[i] = defaultCurrencies[choice - 1];
        }

        System.out.print("Desea convertir alguna cantidad en específico? 1.si: ");
        option = input.nextInt();

        if (option == 1) {
            System.out.print("Ingrese la cantidad: ");
            amount = input.nextDouble();
            while (amount < 0) {
                System.out.print("Por favor ingrese una cantidad válida: ");
                amount = input.nextDouble();
            }
        }

        PairCurrencies currencies = request.getConversion(choices[0], choices[1], amount);
        System.out.println(String.format("""
                \nTasa de cambio
                  1 %s ===> %f %s
                  %.2f  =  %.2f
                Última actualización: %s
                """,
                currencies.base_code(),
                currencies.conversion_rate(),
                currencies.target_code(),
                amount,
                currencies.conversion_result(),
                currencies.time_last_update_utc()
        ));
    }
}