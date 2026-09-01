import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class DigitalWalletSystem {

    List<Integer> wallet = new ArrayList<>();

    public static void main(String[] args) {
        DigitalWalletSystem dws = new DigitalWalletSystem();

        // Teste 1: buscar com lista vazia
        System.out.println("Transações da carteira: " + dws.wallet);

        // Teste 2: adicionar transação
        System.out.println("Adicionar transação de: $200.  Transações totais: " + dws.addTransaction(200));
        System.out.println("Adicionar transação de: $400.  Transações totais: " + dws.addTransaction(400));
        System.out.println("Adicionar transação de: $540.  Transações totais: " + dws.addTransaction(540));
        System.out.println("Adicionar transação de: $790.  Transações totais: " + dws.addTransaction(790));
        System.out.println("Adicionar transação de: $1190. Transações totais: " + dws.addTransaction(1190));

        // Teste 3: remover transação
        System.out.println("Remover transação de: $790." + dws.cancelTransaction(790));
        System.out.println("Remover transação de: $732." + dws.cancelTransaction(732)); // retorna false

        // Teste 4: calcula as recompensas (10% de bonus para transações > 150)
        System.out.println("Recompensas em '$' totais: " + dws.calculateRewards());

        // Teste 5: pega a mediana das transações totais
        System.out.println("Mediana das transações realizadas: " + dws.getMedianTransaction());

        // Teste 6: filtrar transações entre valores especificados
        System.out.println("Transações entre '$400' e '$1190': " + dws.filterTransactionsByRange(400, 1190));


    }

    // NIVEL 1
    public int addTransaction(int amount) {
        wallet.add(amount);
        return wallet.size();
    }

    public boolean cancelTransaction(int amount) {
        return wallet.remove(Integer.valueOf(amount));
    }

    // NIVEL 2
    Optional<Double> calculateRewards() {
        double totalReward = 0.0;

        if (wallet.isEmpty()) {
            return Optional.empty();
        }

        for (int i : wallet) {
            if (i > 150) {
                totalReward += (i * 0.10);
            }
        }
        return Optional.of(totalReward);

    }

    // NIVEL 3
    Optional<Integer> getMedianTransaction() {
        List<Integer> temp = new ArrayList<>(wallet);
        Collections.sort(temp);

        if (temp.isEmpty()) {
            return Optional.empty();
        }

        int median = (temp.size() - 1) / 2;
        return Optional.of(temp.get(median));
    }

    // NIVEL 4
    List<Integer> filterTransactionsByRange(int minAmount, int maxAmount) {
        List<Integer> tempFilter = new ArrayList<>();

        for (int i : wallet) {
            if (i >= minAmount && i <= maxAmount) {
                tempFilter.add(i);
            }
        }
        return tempFilter;


    }

}
