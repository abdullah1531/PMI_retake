public class Matrix {
    public static int minimum(int[][] arr) {
        int minimum = arr[0][0];
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                if (arr[j][i] < minimum ) {
                    minimum = arr[j][i];
                }
            }
        }
        return minimum ;
    }


}
