package Files;

public class Reverse_Letter_Triangle_Pattern {

    static  void reverse_letter_triangle_pattern(int n){
        for(int i = 0; i < n; i++){
            char c = 'A';
            for(char j='A'; j < 'A'+n-i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }

    }

    static void pattern15(int N)
    {

        // Outer loop for the number of rows.
        for(int i=0;i<N;i++){

            // Inner loop will loop for i times and
            // print alphabets from A to A + (N-i-1).
            for(char ch = 'A'; ch<='A'+(N-i-1);ch++){
                System.out.print(ch + " ");

            }
            // As soon as the letters for each iteration are printed, we move to the
            // next row and give a line break otherwise all letters
            // would get printed in 1 line.
            System.out.println();

        }
    }

    public static void main(String[] args) {
        reverse_letter_triangle_pattern(5);

    }

}
