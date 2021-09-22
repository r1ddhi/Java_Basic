public class MultiDimensionalArray {
    public static void main(String[] args) {
        //basic method
        int[][] roll;
        roll = new int[2][3];
        roll[0][0] = 1;
        roll[0][1] = 2;
        roll[0][2] = 3;
        roll[1][0] = 4;
        roll[1][1] = 5;
        roll[1][2] = 6;
        for (int i = 0; i < roll.length; i++)
        {
            for (int j = 0; j <roll[i].length; j++){
            System.out.print(roll[i][j]);
                System.out.print(" ");}
            System.out.print("\n");
        }
    }
}
