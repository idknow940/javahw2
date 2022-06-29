public class Hw2 {
    public static void main(String[] args) {
        int[] intA = {46, 5, 7, 46, 7};
        long[] longA = {8465354L, 1564153153L, 1561651L, 48486L};
        float[] floatA = {65456.6f, 4554.12f, 444.889f};
        double[] doubleA = {5454564564.5466, 8486468.44, 5645.44d};
        // max (idx) //
        int maxI = intA[0];
        long maxL = longA[0];
        float maxF = floatA[0];
        double maxD = doubleA[0];
        int maxIdxI = 0, maxIdxL = 0, maxIdxF = 0, maxIdxD = 0;
        for (int i = 1; i < intA.length; i++) {
            if (intA[i] > maxI) {
                maxI = intA[i];
                maxIdxI = i;
            }
        }
        for (int i = 1; i < longA.length; i++) {
            if (longA[i] > maxL) {
                maxL = longA[i];
                maxIdxL = i;
            }
        }
        for (int i = 1; i < floatA.length; i++) {
            if (floatA[i] > maxF) {
                maxF = floatA[i];
                maxIdxF = i;
            }
        }
        for (int i = 1; i < doubleA.length; i++) {
            if (doubleA[i] > maxD) {
                maxD = doubleA[i];
                maxIdxD = i;
            }
        }
        System.out.println("MAX: \n" + "Int:" + maxIdxI + " Long:" + maxIdxL + " Float:" + maxIdxF + " Double:" + maxIdxD);
        // min (idx) //
        int minI = intA[0];
        long minL = longA[0];
        float minF = floatA[0];
        double minD = doubleA[0];
        int minIdxI = 0, minIdxL = 0, minIdxF = 0, minIdxD = 0;

        for (int i = 1; i < intA.length; i++) {
            if (intA[i] < minI) {
                minI = intA[i];
                minIdxI = i;
            }
        }
        for (int i = 1; i < longA.length; i++) {
            if (longA[i] < minL) {
                minL = longA[i];
                minIdxL = i;
            }
        }
        for (int i = 1; i < floatA.length; i++) {
            if (floatA[i] < minF) {
                minF = floatA[i];
                minIdxF = i;
            }
        }
        for (int i = 1; i < doubleA.length; i++) {
            if (doubleA[i] < minD) {
                minD = doubleA[i];
                minIdxD = i;
            }
        }
        System.out.println("MIN: \n" + "Int:" + minIdxI + " Long:" + minIdxL + " Float:" + minIdxF + " Double:" + minIdxD);
        // add //
        int sumI = 0;
        long sumL = 0L;
        float sumF = 0F;
        double sumD = 0;
        for (int i = 0; i < intA.length; i++) {
            sumI += intA[i];
        }
        for (int i = 0; i < longA.length; i++) {
            sumL += longA[i];
        }
        for (int i = 0; i < floatA.length; i++) {
            sumF += floatA[i];
        }
        for (int i = 0; i < doubleA.length; i++) {
            sumD += doubleA[i];
        }
        System.out.println("SUM: \n" + "Int: " + sumI + " Long: " + sumL + " Float: " + sumF + " Double: " + sumD);

        // mult //
        int prodI = 1;
        long prodL = 1L;
        float prodF = 1F;
        double prodD = 1;
        for (int i = 0; i < intA.length; i++) {
            prodI *= intA[i];
        }
        for (int i = 0; i < longA.length; i++) {
            prodL *= longA[i];
        }
        for (int i = 0; i < floatA.length; i++) {
            prodF *= floatA[i];
        }
        for (int i = 0; i < doubleA.length; i++) {
            prodD *= doubleA[i];
        }
        System.out.println("MULTIPLICATION: \n" + "Int: " + prodI + " Long: " + prodL + " Float: " + prodF + " Double: " + prodD);
        // div //
        int divI = intA[0];
        long divL = longA[0];
        float divF = floatA[0];
        double divD = doubleA[0];
        for (int i = 1; i < intA.length; i++) {
            divI /= intA[i];
        }
        for (int i = 1; i < longA.length; i++) {
            divL /= longA[i];
        }
        for (int i = 1; i < floatA.length; i++) {
            divF /= floatA[i];
        }
        for (int i = 1; i < doubleA.length; i++) {
            divD /= doubleA[i];
        }
        System.out.println("DIVISION: \n" + "Int: " + divI + " Long: " + divL + " Float: " + divF + " Double: " + divD);
        // sub //
        int subI = 0;
        long subL = 0L;
        float subF = 0F;
        double subD = 0;
        for (int i = 0; i < intA.length; i++) {
            subI -= intA[i];
        }
        for (int i = 0; i < longA.length; i++) {
            subL -= longA[i];
        }
        for (int i = 0; i < floatA.length; i++) {
            subF -= floatA[i];
        }
        for (int i = 0; i < doubleA.length; i++) {
            subD -= doubleA[i];
        }
        System.out.println("SUBTRACTION: \n" + "Int: " + subI + " Long: " + subL + " Float: " + subF + " Double: " + subD);
    }
}
