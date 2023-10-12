public class Primes {

    public static void main(String[] args) throws Exception {
        int nValues = 50;

        next: for (int i = 2; i <= nValues; i++) {
            var squareRoot = (int) (Math.sqrt(i));
            for (int j = 2; j <= squareRoot; j++) {
                if (i % j == 0) {
                    continue next;
                }
            }
            System.out.println(i);
        }
    }

}

//-------------Console Output-------------
// 2
// 3
// 5
// 7
// 11
// 13
// 17
// 19
// 23
// 29
// 31
// 37
// 41
// 43
// 47