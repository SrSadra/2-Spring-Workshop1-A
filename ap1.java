import java.util.Scanner;

public class ap1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String operand = input.next();
        int b = input.nextInt();
        if ( op.equals("+") ){            
            System.out.println( a + b);
        }
        else if ( op.equals("-") ){
            System.out.println( a - b );
        }
        else if ( op.equals("*")){
            System.out.println( a * b );
        }
        else if ( op.equals("/") ){
            System.out.println( a / b );
        }

    }
}
