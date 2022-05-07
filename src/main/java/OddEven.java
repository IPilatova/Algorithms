public class OddEven {

    public String oddEven (long number) {

        String result = "Undefined";

        if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
            if (number % 2 == 0) {
                result = "Even";

            } else if (number % 2 != 0) {
                result = "Odd";
            }
        }

        return result;
    }
//    public static void main(String[] args) {
//        System.out.println(oddEven(2147483647L + 1));
//    }
}
