import java.util.HashMap;
import java.util.Map;

//물건을 구매하고 거스름돈을 받았을 때
//동전의 개수가 최소가 되도록 하시오

public class Greedy2 {
    public static void getChangeCoins(int receivedMoney, int price) {
        final int[] coins = {500, 100, 50, 10, 5, 1};
        HashMap<Integer, Integer> result = new HashMap<>();

        int change = receivedMoney - price;
        int cnt = 0;
        for (int i = 0; i < coins.length; i++) {
            if (change < coins[i]) {
                continue;
            }

            int q = change / coins[i];

            result.put(coins[i], result.getOrDefault(coins[i], 0) + q);

            change %= coins[i];
            cnt +=1;
        }

        System.out.println("거스름돈 동전 개수: " + cnt);
        for (Map.Entry<Integer, Integer> item: result.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue());
        }
    }

    public static void main(String[] args) {
        // Test code
        getChangeCoins(1000, 100);
        getChangeCoins(1234, 500);
    }
}
