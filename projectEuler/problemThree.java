package projectEuler;

public class problemThree {
    public static void main(String[] args) {
        Long number = 600851475143l; 
        for(int i = 2; i * i <= number; i++){
            while(number % i == 0){
                System.err.println(i);
                number /= i;
            }
        }
        // if anything is left is also a prime number 
        if(number > 1){
            System.err.println(number);
        }
    }
}
