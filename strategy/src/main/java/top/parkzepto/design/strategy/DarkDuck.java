package top.parkzepto.design.strategy;

import top.parkzepto.design.strategy.behavior.impl.GagagaImpl;
import top.parkzepto.design.strategy.behavior.impl.GoodFlyImpl;

/**
 * @Description TODO
 * @Author 唐亮
 * @Date 2019-12-11 15:28
 * @Version 1.0
 */
public class DarkDuck extends Duck {
    public DarkDuck(){
        flyBehavior = new GoodFlyImpl();
        quackBehavior = new GagagaImpl();
    }

    public void discription() {
        System.out.println("I am DarkDuck!");
    }
}
