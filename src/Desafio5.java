import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a String: ");
        String string = sc.nextLine();

        String inverso = inverte(string);

        System.out.println("Original: " + string);
        System.out.println("Invertido: " + inverso);

        sc.close();
    }

    public static String inverte(String string){
        String inverso = "";

        for(int i = string.length(); i > 0; i--){
            inverso += string.charAt(i-1);
        }
        return inverso;
    }
}
