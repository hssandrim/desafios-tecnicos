import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Collections;

public class ScoreTracker {

    List<Integer> scoreList = new ArrayList<>();

    public static void main(String[] args) {
        ScoreTracker scoreTracker = new ScoreTracker();

        // Teste 1: Buscar com a Lista vazia
        System.out.println("Lista está vazia? " + scoreTracker.getHighestScore());

        // Teste 2: Adicionar Pontuação (score)
        System.out.println("Adicionar score de 100: " + scoreTracker.recordScore(100));
        System.out.println("Adicionar score de 340: " + scoreTracker.recordScore(340));
        System.out.println("Adicionar score de 750: " + scoreTracker.recordScore(750));
        System.out.println("Adicionar score de 800: " + scoreTracker.recordScore(800));

        // Teste 3: Verificar qual o maior score na lista
        System.out.println("Qual o maior score?" + scoreTracker.getHighestScore());

        // Teste 4: Verificar qual o maior score após remover algum (ex: 800)
        System.out.println("Remover score '800': " + scoreTracker.removeScore(800));
        System.out.println("Qual o novo maior score?" + scoreTracker.getHighestScore()); // Deve retornar 750


    }

    // NIVEL 1
    public int recordScore(int score) {
        scoreList.add(score);
        return scoreList.size();
    }

    public boolean removeScore(int score) {
       return scoreList.remove(Integer.valueOf(score));
    }

    // NIVEL 2
    public Optional<Integer> getHighestScore() {


        if (scoreList.isEmpty()) {
            return Optional.empty();
        }

        int highestScore = Collections.max(scoreList);

        return Optional.of(highestScore);
    }

}
