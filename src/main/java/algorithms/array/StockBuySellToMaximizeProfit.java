package algorithms.array;

/*
The cost of a stock on each day is given in an array, find the max profit that you can make by buying and selling in those days.
For example, if the given array is {100, 180, 260, 310, 40, 535, 695},
the maximum profit can earned by buying on day 0, selling on day 3.
Again buy on day 4 and sell on day 6. If the given array of prices is sorted in decreasing order,
then profit cannot be earned at all.

Input:
arr[] = {100, 180, 260, 310, 40, 535, 695}

Output:
(100, 310) (40, 695)
 */

public class StockBuySellToMaximizeProfit {

    public static void main(String[] args) {
        double arr[] = {100, 180, 260, 310, 40, 535, 695};

        Double initialBuy;

        for (int i = 0; i < arr.length-1; i++) {
            initialBuy = arr[i];
            while (i < arr.length-1 && initialBuy < arr[i+1]) {
                i++;
            }
            if(initialBuy < arr[i]) {
                Stock stock = new Stock(initialBuy, arr[i]);
                System.out.println(stock);
            }
        }
    }

    public static class Stock {
        Double buy;
        Double sell;

        public Stock(final Double buy, final Double sell) {
            this.buy = buy;
            this.sell = sell;
        }

        @Override
        public String toString() {
            return "Stock{" +
                    "buy=" + buy +
                    ", sell=" + sell +
                    '}';
        }
    }
}
