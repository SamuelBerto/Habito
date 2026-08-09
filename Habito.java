import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Habito {
    private String nome;
    private String emoji;
    private Map<LocalDate, Boolean> historico;

    public Habito(String nome, String emoji) {
        this.nome = nome;
        this.emoji = emoji;
        this.historico = new HashMap<>();

    }
    
    public void marcarComoFeito(LocalDate data) {
        historico.put(data, true);

    }

    public boolean foiFeitoNoDia(LocalDate data) {
        return historico.getOrDefault(data, false);

    }
    public int calcularStreak() {
        int streak = 0;
        LocalDate dataAtual = LocalDate.now() ;
        while (foiFeitoNoDia(dataAtual)) {
            streak++;
            dataAtual = dataAtual.minusDays(1);
        }
        return streak;
    }

    public String getNome() {
        return nome;
    }
    
    public String getEmoji() {
        return emoji;
    }
}
