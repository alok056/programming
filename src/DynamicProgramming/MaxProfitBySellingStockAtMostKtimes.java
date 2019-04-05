package DynamicProgramming;

public class MaxProfitBySellingStockAtMostKtimes {

    private static int maxProfit(int[] price, int k) {
        Integer[][] profit = new Integer[k+1][price.length];

        return maxProfitRec(price, profit, k, price.length - 1);
    }

    private static int maxProfitRec(int[] price, Integer[][] profit, int k, int currentDay) {
        System.out.println("Calculating profit[" + k + "][" + currentDay + "]");

        if (k == 0) {
            return 0;
        }

        if (currentDay == 0) {
            return 0;
        }

        if (profit[k][currentDay] == null) {
            int maxProfit = maxProfitRec(price, profit, k, currentDay-1);

            for (int i=0; i < currentDay; i++) {
                maxProfit = Math.max(maxProfit, price[currentDay] - price[i] + maxProfitRec(price, profit, k-1, currentDay - 1));
            }

            profit[k][currentDay] = maxProfit;
        }

        System.out.println("profit[" + k + "][" + currentDay + "] = " + profit[k][currentDay]);

        return profit[k][currentDay];
    }

    public static void main(String[] args) {
        MaxProfitBySellingStockAtMostKtimes m = new MaxProfitBySellingStockAtMostKtimes();
        int k = 2;
        int[] price = { 10, 22, 5, 75, 65, 80};

        System.out.println(maxProfit(price, k));
    }
}
