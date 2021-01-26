package Model;

public class Model {
    private static ModularCounter red = new ModularCounter(0, 256);
    private static ModularCounter green = new ModularCounter(0, 256);
    private static ModularCounter blue = new ModularCounter(0, 256);

    public static void main(String[] args)
    {

    }
    public static void changeColorViaAbsoluteValue(ColorCode cc, int value) {
        switch (cc) {
            case RED:
                red.reset();
                red.inc(value);
                break;
            case BLUE:
                blue.reset();
                blue.inc(value);
                break;
            case GREEN:
                green.reset();
                green.inc(value);
                break;
        }
    }
    public static void changeColorViaRelativeValue(ColorCode cc, String operator) {
        if (operator.contains("+")) {
            switch (cc) {
                case RED:
                    red.inc(10);
                    break;
                case BLUE:
                    blue.inc(10);
                    break;
                case GREEN:
                    green.inc(10);
                    break;
            }
        }
        else{
            switch (cc){
                case RED:
                    red.dec(10);
                    break;
                case BLUE:
                    blue.dec(10);
                    break;
                case GREEN:
                    green.dec(10);
                    break;
            }
        }
    }

    public static int getRed()
    {
        return red.getValue();
    }
    public static int getBlue()
    {
        return blue.getValue();
    }
    public static int getGreen()
    {
        return green.getValue();
    }

    public static String getHex()
    {
        String s = "#";
        String RV = Integer.toHexString(getRed());
        String GV = Integer.toHexString(getGreen());
        String BV = Integer.toHexString(getBlue());

        if (RV.length() == 1)
        {
            RV = "0" + RV;
        }
        if (GV.length() == 1)
        {
            GV = "0" + GV;
        }
        if (BV.length() == 1)
        {
            BV = "0" + BV;
        }

        s += RV;
        s += GV;
        s += BV;

        return s;
    }
}
