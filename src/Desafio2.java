import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> fibonacci = new ArrayList<>();
        Integer first = 0;
        Integer second = 1;
        Integer fiboNum;
        fibonacci.add(first);
        fibonacci.add(second);

        System.out.print("Digite o numero: ");
        Integer num = sc.nextInt();

        while(fibonacci.get(fibonacci.size() - 1) < num){
            fiboNum = first + second;
            first = second;
            second = fiboNum;
            fibonacci.add(fiboNum);
        }

        if(fibonacci.contains(num)){
            System.out.println("Pertence a sequência de Fibonacci!");
        }else{
            System.out.println("Não pertence a sequência de Fibonacci!");
        }

        System.out.println(fibonacci);
        sc.close();
    }
}
