import java.util.ArrayList;
import java.util.List;

public class OrderDiscountTracker {

    List<Double> orderTracker = new ArrayList<>();

    public static void main(String[] args) {
        OrderDiscountTracker tracker = new OrderDiscountTracker();

        // Testes Nivel 1:
        System.out.println("Adiciona pedido de:   $ 150.00 -> Total no carrinho:" + tracker.addOrder(150.0));
        System.out.println("Adiciona pedido de:   $ 50.00  -> Total no carrinho:" + tracker.addOrder(50.0));
        System.out.println("Adiciona pedido de: - $ 30.00  -> Total no carrinho:" + tracker.addOrder(-30.0)); // Ignorado
        System.out.println("Adiciona pedido de:   $ 200.00 -> Total no carrinho:" + tracker.addOrder(200.0));


        // Testes Nivel 2:
        // threshold = 100.0, rate = 0.10 (10% de desconto)
        // 150.0 -> 135.0
        // 50.0  -> 50.0
        // 200.0 -> 180.0
        // Total = 365.0

        System.out.println("Total de pedidos: " + tracker.orderTracker.size());
        System.out.println("Receita total com desconto: $ " + tracker.getTotalDiscountRevenue(100.0, 0.10));
        System.out.println("Pedidos acima de '$ 100.0': " + tracker.countOrdersAbove(100.0));


    }

    // NIVEL 1
    public int addOrder(double amount) {
        if (amount > 0.0) {
            orderTracker.add(amount);
        }
        return orderTracker.size();
    }

    public boolean cancelOrder(double amount) {
        return orderTracker.remove(amount);
    }

    // NIVEL 2
    public double getTotalDiscountRevenue(double discountThreshold, double discountRate) {

        double totalRevenue = 0.0;

        for (double amount : orderTracker) {
            if (amount > discountThreshold) {
                totalRevenue += amount * (1 - discountRate);
            } else {
                amount += totalRevenue;
            }
        }
        return totalRevenue;

    }

    public int countOrdersAbove(double threshold) {

        int count = 0;

        for (double amount : orderTracker) {
            if (amount > threshold) {
                count++;
            }
        }

        return count;

    }

}
