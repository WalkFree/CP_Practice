package  Files;

public  class increasing_letter_triangle_pattern {

    static void increasing_letter_triangle(int n){
        int val = 65;
        for(int i = 0; i < n;i++){
            for(int j = 0; j <= i;j++) {
                int temp = 0;
                temp = j + val;
                System.out.print((char)temp+" ");
            }
            System.out.println("");
        }
    }

    static void pattern14(int N)
    {

        // Outer loop for the number of rows.
        for(int i=0;i<N;i++){

            // Inner loop will loop for i times and
            // print alphabets from A to A + i.
            for(char ch = 'A'; ch<='A'+i;ch++){
                System.out.print(ch + " ");

            }
            // As soon as the letters for each iteration are printed, we move to the
            // next row and give a line break otherwise all letters
            // would get printed in 1 line.
            System.out.println();

        }
    }

    public static void main(String[]args){
//        increasing_letter_triangle(3);

        int i = 3;
        for(char ch = 'A'; ch<='A'+i;ch++){
            System.out.print(ch + " ");

        }


    }

}

