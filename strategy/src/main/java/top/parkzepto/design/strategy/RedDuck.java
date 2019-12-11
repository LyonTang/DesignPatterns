package top.parkzepto.design.strategy;

import top.parkzepto.design.strategy.behavior.impl.BadFlyImpl;
import top.parkzepto.design.strategy.behavior.impl.GegegeImpl;

/**
 * @Description TODO
 * @Author 唐亮
 * @Date 2019-12-11 15:30
 * @Version 1.0
 */
public class RedDuck extends Duck {
    public RedDuck(){
        flyBehavior = new BadFlyImpl();
        quackBehavior = new GegegeImpl();
    }

    public void discription() {
        System.out.println("I am RedDuck!");
    }
}
