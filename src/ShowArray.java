public class ShowArray {
    public static void main(String[] args) {

        int[][][] array = {{{1, 2, 3}, {1, 2}}, {{1}}};


        for (int k = 0; k < array.length; k++) {
            for (int j = 0; j < array[k].length; j++) {

                for (int i = 0; i < array[k][j].length; i++) {
                    System.out.print(array[k][j][i] + "[" + k + "," + j + "," + i + "]" + " ");
                }
                System.out.println();


            }
        }
    }

}


