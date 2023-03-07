public class Prac {
    public class SProblem {
        public static int cntEights(String number, int prev, int ssf) {
            if (number.length() == 0) {
                return ssf;
            }
            if (number.charAt(0) == '8') {
                if (prev == 1) {
                    return cntEights(number.substring(1, number.length()), 0, ssf + 2);
                } else {
                    return cntEights(number.substring(1, number.length()), 1, ssf + 1);
                }
            } else {
                return cntEights(number.substring(1, number.length()), 0, ssf);
            }
        }
        public static void main(String[] args) {
            int num = 8818;
            System.out.println("value of nums is " + num);
            int result = cntEights(String.valueOf(num), 0, 0);
            System.out.println(result);
        }
    }
}
