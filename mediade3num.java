import java.util.Scanner;

class mediade3num {
    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner scan = new Scanner (System.in);
        System.out.println("Digite o 1º numero");

num1 = scan.nextInt();

        System.out.println("Digite o 2º numero");
num2 = scan.nextInt();

        System.out.println("Digite o 3º numero");
        num3 = scan.nextInt();

        System.out.print("A média dos 3 números é: "  + (num1 + num2 + num3) / 3);
    }
}
