import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.Normalizer;

public class Main {

    public static String normalizar (String texto) {
        String semAcento = Normalizer.normalize(texto, Normalizer.Form.NFD);
        semAcento = semAcento.replaceAll("[^\\p{ASCII}]", "");
        return semAcento.toLowerCase();
    }
   
    public static void main(String[] args) {
        ArrayList<Habito> habitos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println ("\n--- Menu ---");
            System.out.println ("1. Cadastrar hábito");
            System.out.println ("2. Marcar hábito como concluído");
            System.out.println ("3. Lista de hábitos");
            System.out.println ("4. Sair");
            System.out.println ("Escolha uma opção: ");
            
            String opcao = scanner.nextLine();

            if (opcao.equals("1")) {
                System.out.println("Digite o nome do hábito:");
                String nome = scanner.nextLine();

                System.out.println("Digite um emoji para representar o hábito:");
                String emoji = scanner.nextLine();

                habitos.add(new Habito(nome, emoji));
                System.out.println("Hábito cadastrado com sucesso!");

            } else if (opcao.equals("2")) {
                System.out.println("Digite o nome do hábito para marcar como feito:");
                String nomeParaMarcar = scanner.nextLine();

                Habito habitoEncontrado = null;
                for (Habito h : habitos) {
                    if (normalizar(h.getNome()).equals(normalizar(nomeParaMarcar))) {
                        habitoEncontrado = h;
                        break;
                    }
                }
                if (habitoEncontrado != null) {
                    habitoEncontrado.marcarComoFeito(LocalDate.now());
                    System.out.println(habitoEncontrado.getEmoji() + " " + habitoEncontrado.getNome() + " Marcado como feito hoje!");

                } else {
                    System.out.println("Hábito não encontrado.");
                }
            } else if (opcao.equals("3")) {
                if (habitos.isEmpty()) {
                    System.out.println("Nenhum hábito cadastrado ainda.");
                } else {
                    System.out.println("=== Hábitos cadastrados ===");
                    for (Habito h : habitos) {
                        System.out.println(h.getEmoji () + " " + h.getNome() +  " - Streak: " + h.calcularStreak() + " dias");

                    }
                }
            } else if (opcao.equals("4")) {
                System.out.println("Até mais!");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
            
            
        }

        scanner.close();
       
    }
}
