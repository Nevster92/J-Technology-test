public class Main {
    public static void main(String[] args)  {
        String[][] matrix = TestDataI.MATRIX;

        double maxRowAvrage= 0;
        for (int i = 0; i < matrix.length; i++) {
            double avrage = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                avrage += Double.parseDouble(matrix[i][j]);
            }
            maxRowAvrage = avrage > maxRowAvrage ? avrage : maxRowAvrage;
        }
        System.out.println("Sorátlagok maximuma: "+maxRowAvrage);

    }



}