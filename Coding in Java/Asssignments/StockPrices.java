package Asssignments;

import java.util.Arrays;

public class StockPrices {

    static float MAX_STOCK = 10;

    static Object[] stockPrices = {12, 45, 45, 6890, 334};

    public static void main(String[] args) {
        calculateAveragePrice();
        System.out.println(Arrays.deepToString(stockPrices));
        System.out.println("A stock price you case");
    }

    // Calculate the average of stock prices
    static float calculateAveragePrice(){
        for(int i = 0; i < stockPrices.length; i++){
            // float average = stockPrices[i] / i;
            System.out.println("Stock Price is: "+ stockPrices[i]);
        }
        return 0;

    }

    //Find the maximum stock price
    
    static float findMaximumPrice(){
        return  0;
    }

    // Determine the occurances count of a specific price
    static int countOccurrences(){
        return 0;
    }

    // Compute the cumulative sum of stock price:

    static float computeCumulativeSum(){
        return 0;
    }
}




