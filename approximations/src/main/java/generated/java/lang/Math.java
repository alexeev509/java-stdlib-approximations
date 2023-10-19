package generated.java.lang;

import org.jacodb.approximation.annotation.Approximate;

@Approximate(java.lang.Math.class)
public class Math {
    public static double max(double a, double b) {
        if (a != a)
            return a;   // a is NaN

        if ((a == 0.0d) && (b == 0.0d)) { // todo: negative zero
            // Raw conversion ok since NaN can't map to -0.0.
            return b;
        }

        return (a >= b) ? a : b;
    }
}
