import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite seu primeiro nome!");
        String primeiroNome = scanner.next();

        System.out.println("Por favor, digite seu segundo nome!");
        String segundoNome = scanner.next();

        System.out.println("Por favor, digite o número da sua conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua agencia!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu saldo!");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + primeiroNome + " " + segundoNome + " ," + "obrigado por criar uma conta em nosso banco, sua agência é " + (String) agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " está disponível para saque");

    }
}
