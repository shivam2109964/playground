package projectEuler;

public class ProblemTwo {
    public static void main(String[] args) {
        int initial = 1; 
        int constant = 1; 
        int next;
        int sum = 0; 

        while(true){
            next = initial + constant;
            if(next % 2 == 0){
                sum += next;
            }
            initial = constant; 
            constant = next; 
            if(next > 4000000){
                break;
            }
        }
        System.out.println(sum);
    }
}
