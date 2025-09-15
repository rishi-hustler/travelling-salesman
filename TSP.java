import java.util.Arrays;
// BY: RISHI HUSTLER
public class TSP {

    static final int INF = 1_000_000_000;
    static int N;
    static int[][] dist;
    static int[][] dp;

    static int tsp(int mask, int pos) {
        if (mask == (1 << N) - 1) {
            return dist[pos][0];
        }

        if (dp[mask][pos] != -1) {
            return dp[mask][pos];
        }

        int ans = INF;

        for (int city = 0; city < N; city++) {
            if ((mask & (1 << city)) == 0) {
                int newAns = dist[pos][city] +
                             tsp(mask | (1 << city), city);
                ans = Math.min(ans, newAns);
            }
        }

        return dp[mask][pos] = ans;
    }

    public static void main(String[] args) {
        dist = new int[][] {
            {0, 10, 15, 20},
            {10, 0, 35, 25},
            {15, 35, 0, 30},
            {20, 25, 30, 0}
        };

        N = dist.length;
        dp = new int[1 << N][N];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int minCost = tsp(1, 0); // start from city 0
        System.out.println("Minimum travelling cost: " + minCost);
    }
}
