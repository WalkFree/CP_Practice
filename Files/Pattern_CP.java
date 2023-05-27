package Files;

public class Pattern_CP {

    static void binaryPattern(int n){
        for(int i = 1; i <= n; i++){
            var e = (i%2==0)?i : i+1;
            for(int j = (i%2);j < e; j++){
               var h = (j%2==0)?0 : 1;
               System.out.print(h+" ");
            }
            System.out.println();
        }
    }

    static void binaryPattern1(int n){
        for(int i = 0; i < n; i++){
            int start = i%2 == 0? 1 : 0;

            for(int j = 0;j <= i; j++){
                System.out.print(start+" ");
                start = 1-start;
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
       binaryPattern1(5);
    }
}
