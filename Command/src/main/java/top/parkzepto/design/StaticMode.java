package top.parkzepto.design;

/**
 * @Description TODO
 * @Author 唐亮
 * @Date 2020-01-09 15:46
 * @Version 1.0
 */
public class StaticMode {

    public final static String HOT = "Hot";
    public final static String COLD = "Cold";

    public static String airCurrentMode = HOT;

    public final static int ON = 1;
    public final static int OFF = 0;
    public static int airCurrentState = OFF;

    public final static int MAX_TEMP = 30;
    public final static int MIN_TEMP = 17;
    public static int airCurrentTemp = 26;
}
