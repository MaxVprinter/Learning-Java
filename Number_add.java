public class Number_add {
    public static void main(String[] args) {
    
        double targetNum =3;

        double num1 = 1.0;
        double num2 = num1 + 1.0;
        double num3 = num2 + 1.0;
 System.out.println(num1);
        if (num1<targetNum){
            num1 += 1;
            System.out.println(num2);

        }if (num2<targetNum){
            num2 += 1;
            System.out.println(num3);
        }
        
        if (num3 == targetNum){
            System.out.println("Target number is reached script successfully executed");
        }

            
    }
}