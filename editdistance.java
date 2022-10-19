class Solution {
    public int minDistance(String word1, String word2) {
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        int m=c1.length;
        int n=c2.length;
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++) dp[i][0]=i;
            for(int i=0;i<=n;i++) dp[0][i]=i;
                for(int i=1;i<=m;i++){
                    for(int j=1;j<=n;j++){
                        if(c1[i-1] == c2[j-1])
                            dp[i][j] = dp[i-1][j-1];
                        else
                            dp[i][j] = 1 + Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                    }
                }
                return dp[m][n];

    }
}
