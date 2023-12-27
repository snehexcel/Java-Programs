public class HollowRect {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        //outer loop
        for (int i = 1; i <= 4; i++) {
            //inner loop
            for (int j  = 1; j <= 5; j++) {
                //cell->(i,j)
                if (i  == 1 || j == 1 || i == 4|| j == 5) {
                    System.out.print("*");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}
