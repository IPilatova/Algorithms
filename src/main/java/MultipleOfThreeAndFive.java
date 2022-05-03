public class MultipleOfThreeAndFive {

    public String multipleOfThreeAndFive(int m) {

        String result;

        if ((m % 3 == 0) && (m % 5 == 0)) {
            result = "Good Number";
        } else if ((m % 3 == 0) && (m % 5 != 0)) {
            result = "Bad Number";
        } else if ((m % 3 != 0) && (m % 5 == 0)) {
            result = "Poor Number";
        } else {
            result = "-1";
        }

        return result;
    }
}
