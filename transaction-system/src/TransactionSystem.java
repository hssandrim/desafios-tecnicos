import java.util.List;
import java.util.ArrayList;
import java.util.Optional;


public class TransactionSystem {

    List<Double> transactions = new ArrayList<>();

    public static void main(String[] args) {
        TransactionSystem system = new TransactionSystem();

        // Teste 1: Buscar média com a lista vazia
        System.out.println("Média Inicial: " + system.getAverageTransaction());

        // Teste 2: Adicionar transações e ver o tamanho total retornado
        System.out.println("Total de itens após inserir '100': " + system.addTransaction(100.0));
        System.out.println("Total de itens após inserir '200': " + system.addTransaction(200.0));
        System.out.println("Total de itens após inserir '300': " + system.addTransaction(300.0));

        // Teste 3: Calcular a média (100 + 200 + 300) / 3 = 200.0
        System.out.println("Média calculada: " + system.getAverageTransaction());

        // Teste 4: Cancelar uma transação existente
        System.out.println("Cancelar uma transação existente: " + system.cancelTransaction(100.0));

        // Teste 5: Nova média após a remoção (200 + 300) / 2 = 250.0
        System.out.println("Média após cancelamento: " + system.getAverageTransaction());

        // Teste 6: Tentar cancelar um valor que não existe
        System.out.println("Cancelou '500.0' (não existe): " + system.cancelTransaction(500.0));

    }


    // NIVEL 1
    public int addTransaction(double amount) {
        transactions.add(amount);
        return transactions.size();
    }

    public boolean cancelTransaction(double amount) {
        return transactions.remove(amount);
    }

    // NIVEL 2
    public Optional<Double> getAverageTransaction() {

        double sum = 0.0;

        if (transactions.isEmpty()) {
            return Optional.empty();
        }

        for (double amount : transactions) {
            sum += amount;
        }

        double average = sum / transactions.size();

        return Optional.of(average);

    }


}

