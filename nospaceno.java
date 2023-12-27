public class nospaceno {
    public static void main(String[] args) {
        int spaces = 2*(n-1);
        // Number, Space, Number
        // [1,6,1]
        // [2,4,2]
        // [3,2,3]
        // [4,0,4]
        for(int i=1; i<=n; i++){
            //numbers
            for(int j=1; j<=1; j++){
                System.out.print(j);
            }

            //space
            for(int j=1; j<= spaces; j++){
                System.out.print(" ");
            }

            //numbers
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            System.out.println();
            spaces -=2;


        }
    }



    