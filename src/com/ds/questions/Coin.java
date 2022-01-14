// A Naive recursive JAVA program to find minimum of coins
// to make a given change V
class Coin
{
    // m is size of coins array (number of different coins)
    static int minCoins(int coins[], int m, int V)
    {
        // base case
        if (V == 0) return 0;

        // Initialize result
        int res = Integer.MAX_VALUE;

        // Try every coin that has smaller value than V
        for (int i=0; i<m; i++)
        {
            if (coins[i] <= V)
            {
                int subRes = minCoins(coins, m, V-coins[i]);

                // Check for INT_MAX to avoid overflow and see if
                // result can minimized
                if (subRes != Integer.MAX_VALUE && subRes + 1 < res)
                    res = subRes + 1;
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        int coins[] =  {9, 6, 5, 1};
        int m = coins.length;
        int V = 11;
        System.out.println("Minimum coins required is "+ minCoins(coins, m, V) );
    }
}