package Model;

public class Model
{
    private static ModularCounter red = new ModularCounter(0,256);
    private static ModularCounter green = new ModularCounter(0,256);
    private static ModularCounter blue = new ModularCounter(0,256);

    public static void changeColorViaAbsoluteValue (ColorCode colorcode, int value)
    {
        switch (colorcode) {
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
    public static void changeColorViaRelativeValue (ColorCode colorcode, String value)
    {
        
    }
    public static String getHex()
    {

    }
}
