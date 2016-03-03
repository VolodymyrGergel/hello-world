/**
 * Created by Volodymyr.Gergel on 3/1/2016.
 */
public class ComputePayment {

    public static void main(String[] args) {
        double answer = computePayment(5, 10, 50, 12);
        System.out.println(answer);
    }

        public static double computePayment(double loanAmt, double rate, double futureValue, int numPeriods) {
            double interest = rate / 100.0;
            double partial1 = Math.pow((1 + interest), - numPeriods);
            double denominator = (1 - partial1) / interest;
            double answer = (-loanAmt / denominator)- ((futureValue * partial1) / denominator);
            return answer;

        }

}
