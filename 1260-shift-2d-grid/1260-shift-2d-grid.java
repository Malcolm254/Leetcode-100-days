import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;        
        k = k % total;
        int[][] result = new int[m][n];
        
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                int old1D = r * n + c;
                int new1D = (old1D + k) % total;
                int newRow = new1D / n;
                int newCol = new1D % n;
                result[newRow][newCol] = grid[r][c];
            }
        }
        
        List<List<Integer>> output = new ArrayList<>();
        for (int[] row : result) {
            List<Integer> rowList = new ArrayList<>();
            for (int val : row) {
                rowList.add(val);
            }
            output.add(rowList);
        }
        
        return output;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna