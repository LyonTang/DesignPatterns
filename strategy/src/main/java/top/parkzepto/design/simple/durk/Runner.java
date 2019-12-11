package top.parkzepto.design.simple.durk;

/**
 * @Description TODO
 * @Author 唐亮
 * @Date 2019-12-11 15:18
 * @Version 1.0
 */
public class Runner {

    public static void main(String[] args) {
        Duck red = new RedHeadDuck();
        Duck dark = new DarkDuck();

        red.discription();
        red.qauck();
        red.fly();

        dark.discription();
        dark.qauck();
        dark.fly();
    }
}
