package Files;

public class Increasing_Number_Triangle_Pattern {
    static void increasing_number_triangle_pattern(int n){
        int cnt = 1;
        for(int i = 0; i < n;i++){
            for(int j = 0; j <= i;j++){
                System.out.print(cnt+" ");
                cnt +=1;
            }
            System.out.println("");
        }
    }



    public static void main(String[] args) {
        increasing_number_triangle_pattern(3);

    }
}
