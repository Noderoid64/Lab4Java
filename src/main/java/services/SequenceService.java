package services;

public class SequenceService {
    public int getMax(int a, int b) {
        return a > b ? a : b;
    }

    private void init(int [][] matrix) {
        for(int i = 0; i< matrix.length; i++) {
            matrix[i][0] = 0;
        }
        for(int i = 0; i < matrix[0].length; i++) {
            matrix[0][i] = 0;
        }
    }

    public int act(int [] arr, int restr) {
        if (arr != null && arr.length >= 1) {
            int[][] matrix = new int[arr.length][restr+1];
            init(matrix);
            int max = 0;
            for(int k= 1; k < matrix.length; k++) {
                for (int w = 0; w < matrix[0].length; w++) {
                    int b = 0;
                    if (w-arr[k-1] >= 0) {
                        b = w - arr[k-1];
                        matrix[k][w] = getMax(matrix[k-1][w], matrix[k-1][b] + arr[k-1]);
                        if (max < matrix[k][w]) {
                            max = matrix[k][w];
                            if (max == restr) {
                                return max;
                            }
                        }
                    } else {
                        matrix[k][w] = matrix[k-1][w];
                    }

                }
            }
            return max;
        } else {
            return 0;
        }

    }
}
