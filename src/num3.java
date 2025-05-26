import java.math.BigInteger;

public class num3 {
    public static void main(String[] args) {
        BigInteger longMaxValue = new BigInteger("9223372036854775807");
        BigInteger n = sqrt(longMaxValue).add(BigInteger.ONE);

        for (int count = 0; count < 10; count++) {
            BigInteger square = n.pow(2);
            System.out.println(square.toString());
            n = n.add(BigInteger.ONE);
        }
    }

    private static BigInteger sqrt(BigInteger value) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = value.shiftRight(5).add(BigInteger.valueOf(8));

        while (b.compareTo(a) >= 0) {
            BigInteger mid = a.add(b).shiftRight(1);
            if (mid.multiply(mid).compareTo(value) > 0) {
                b = mid.subtract(BigInteger.ONE);
            } else {
                a = mid.add(BigInteger.ONE);
            }
        }
        return a.subtract(BigInteger.ONE);
    }
}