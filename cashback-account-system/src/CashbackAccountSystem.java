import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class CashbackAccountSystem {

    List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        CashbackAccountSystem system = new CashbackAccountSystem();

        // Teste 1: buscar com a lista vazia
        System.out.println("Valores na lista " + system.list);

        // Teste 2: adicionar compra
        System.out.println("Adicionar compra de: '200'. Itens totais: " + system.addPurchase(200));
        System.out.println("Adicionar compra de: '90'. Itens totais: " + system.addPurchase(90));
        System.out.println("Adicionar compra de: '150'. Itens totais: " + system.addPurchase(150));
        System.out.println("Adicionar compra de: '300'. Itens totais: " + system.addPurchase(300));
        System.out.println("Adicionar compra de: '420'. Itens totais: " + system.addPurchase(420));
        System.out.println("Adicionar compra de: '600'. Itens totais: " + system.addPurchase(600));

        // Teste 3: cancelar compra
        System.out.println("Cancelar compra de '600': " + system.cancelPurchase(600));

        // Teste 4: ver o total de Cashback acumulado
        System.out.println("Total de CashBack acumulado: " + system.getTotalCashback());

        // Teste 5: ver a mediana das compras
        System.out.println("Mediana é: " + system.getMedianPurchase());

        // Teste 6: ver o maior valor de compra
        System.out.println("O(s) maior(es) valor(es) de compra acima de '400' é: " + system.getHighValuePurchases(400));

    }

    // NIVEL 1
    public int addPurchase(int amount) {
        list.add(amount);
        return list.size();
    }

    public boolean cancelPurchase(int amount) {
        return list.remove(Integer.valueOf(amount));
    }

    // NIVEL 2
    Optional<Double> getTotalCashback() {
        double totalCashback = 0.0;

        if (list.isEmpty()) {
            return Optional.empty();
        }

        for (int i : list) {
            if (i > 100) {
                totalCashback += (i * 0.05);
            }
        }
        return Optional.of(totalCashback);

    }

    // NIVEL 3
    Optional<Integer> getMedianPurchase() {
        if (list.isEmpty()) {
            return Optional.empty();
        }

        List<Integer> copy = new ArrayList<>(list);
        Collections.sort(copy);

        int median = (copy.size() -1) / 2;

        return Optional.of(copy.get(median));
    }

    // NIVEL 4
    List<Integer> getHighValuePurchases(int minThreshold) {

        List<Integer> result = new ArrayList<>();

        for (int i : list){
            if (i >= minThreshold) {
                result.add(i);
            }
        }


        return result;
    }
}
