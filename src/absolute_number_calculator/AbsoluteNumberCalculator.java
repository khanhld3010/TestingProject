package absolute_number_calculator;

public class AbsoluteNumberCalculator {
//    public AbsoluteNumberCalculator() {
//    }

    public int findAbsolute(int number){
        if (number==0){
            return 0;
        } else if (number>0) {
            return number;
        }else {
            return -number;
        }
    }
}
