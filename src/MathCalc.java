public class MathCalc {

    private static final int SUN_DIAMETER = 865000;
    private static final int EARTH_DIAMETER = 7600;

    public static void main(String[] args) throws Exception {
        var earthVolume = calculateVolume(EARTH_DIAMETER);
        var sunVolume = calculateVolume(SUN_DIAMETER);
        var ratio = sunVolume / earthVolume;

        var res = String.format(
                "The volume of the Earth is %s cubic miles, the volume of the sun is %s cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is %s",
                earthVolume, sunVolume, ratio);
        System.out.println(res);
    }

    private static double calculateVolume(double diameter) throws Exception {
        if (diameter <= 0) {
            throw new Exception("Invalid diameter value");
        }
        var radius = diameter / 2;
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }

}

//-------------Console Output-------------
// The volume of the Earth is 2.2984729611703882E11 cubic miles, the volume of the sun is 3.3888078519931213E17 cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is 1474373.5990122468