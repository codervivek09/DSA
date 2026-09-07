// Q.1672. Richest Customer Wealth

public class Q01672_Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for(int i = 0; i<accounts.length; i++) {
            int currentWealth = 0;
            for(int j = 0; j<accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, currentWealth);
        }
        return maxWealth;
    }
}