import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Habito> habitos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o nome do hábito (ou 'sair' para encerrar):");
            String nome = scanner.nextLine();
            
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            System.out.println("Digite um emoji para representar esse hábito:");
            String emoji = scanner.nextLine();
            
            Habito novoHabito = new Habito(nome, emoji);
            habitos.add(novoHabito);
            
            System.out.println("Hábito cadastrado: " + novoHabito.getEmoji() + " " + novoHabito.getNome());    
        }

        System.out.println("\n=== Hábitos cadastrados ===");
        for (Habito h : habitos) {
            System.out.println(h.getEmoji() + " " + h.getNome());
        }

        scanner.close();
       
    }
}
