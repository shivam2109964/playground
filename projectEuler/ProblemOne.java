package projectEuler;

public class ProblemOne {
    public static void main(String[] args) {
        int sum = 0; 
        int naturalNo = 1000; 
        for(int i = 1; i < naturalNo; i++){
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
