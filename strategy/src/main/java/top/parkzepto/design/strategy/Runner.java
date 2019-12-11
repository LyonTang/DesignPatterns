package top.parkzepto.design.strategy;

/**
 * @Description TODO
 * @Author 唐亮
 * @Date 2019-12-11 15:22
 * @Version 1.0
 */
public class Runner {
    public static void main(String[] args) {
        Duck red = new RedDuck();
        Duck dark = new DarkDuck();

        red.discription();
        red.quack();
        red.fly();

        System.out.println("");

        dark.discription();
        dark.quack();
        dark.fly();
    }
}
