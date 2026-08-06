import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Habito> habitos = new ArrayList<>();

        Habito beberAgua = new Habito("Beber Água", "💧");
        Habito estudarJava = new Habito("Estudar Java", "📚");

        habitos.add(beberAgua);
        habitos.add(estudarJava);

        beberAgua.marcarComoFeito(LocalDate.now());

        for (Habito h : habitos) {
            boolean feitoHoje = h.foiFeitoNoDia(LocalDate.now());
            System.out.println(h.getEmoji () + " "+ h.getNome () + " - Feito hoje? " + feitoHoje);
        }
    }
}