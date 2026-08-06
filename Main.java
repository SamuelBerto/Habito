import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Habito> habitos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do hábito:");
        String nome = scanner.nextLine();

        System.out.println("Digite o emoji para representar o hábito:");
        String emoji = scanner.nextLine();

        Habito novoHabito = new Habito(nome, emoji);
        habitos.add(novoHabito);

        System.out.println("Hábito Cadastrado: " + novoHabito.getEmoji() + " " + novoHabito.getNome());

        scanner.close();
       
    }
}