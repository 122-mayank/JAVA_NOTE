
public  class pattern{
     public static void main(String[] args) {
        int  n = 9;

       for(int row = 1 ; row <= n ; row++){
            for(int col = 1 ; col <=row ; col++ ){
                System.out.print(col +" ");
            }
            for(int sp = 1; sp<=n-row ;sp++){
                System.out.print("  ");
            }

          for(int sp2 = 1; sp2<=n-row ; sp2++){
                System.out.print("  ");
            }
            int start = row;
            for(int col = start ; col>=1 ; col--){
                  System.out.print(col + " ");

            }

            System.out.println();
       }

     }
}