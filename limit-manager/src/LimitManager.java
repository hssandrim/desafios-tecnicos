import java.util.List;
import java.util.ArrayList;


public class LimitManager {

    List<Double> credit = new ArrayList<>();

    public static void main(String[] args) {
        LimitManager manager = new LimitManager();


        // Teste 1: Checar se está vazio no início
        System.out.println("Está vazio no início? " + manager.isEmpty());
        System.out.println("Limites acima de '1000.00' no inicio: " + manager.getLimitsAbove(1000.00));


        // Teste 2: Adicionando limites
        System.out.println("Total após adicionar '1500.00': " + manager.addLimit(1500.00));
        System.out.println("Total após adicionar '3000.00': " + manager.addLimit(3000.00));
        System.out.println("Total após adicionar '5000.00': " + manager.addLimit(5000.00));

        // Teste 3: Filtrando limites acima de '2000.00'
        System.out.println("Limites acima de '2000.00'" + manager.getLimitsAbove(2000.00));

        // Teste 4: Revogando um limite
        System.out.println("Revogou: '1500.00'. Resultado: " + manager.revokeLimit(1500.00));

        // Teste 5: Nova filtragem acima de '1000.00'
        System.out.println("Limites acima de '1000.00', após revogação: " + manager.getLimitsAbove(1000.00));


    }

    // NIVEL 1

    public boolean isEmpty() {
        return credit.isEmpty();
    }

    public int addLimit(double limit) {
        credit.add(limit);
        return credit.size();
    }

    public boolean revokeLimit(double limit) {
        return credit.remove(limit);
    }


    // NIVEL 2


    public List<Double> getLimitsAbove(double threshold) {

        List<Double> result = new ArrayList<>();


        for (double limit : credit) {
            if (limit > threshold) {
                result.add(limit);
            }
        }
        return result;
    }


}
