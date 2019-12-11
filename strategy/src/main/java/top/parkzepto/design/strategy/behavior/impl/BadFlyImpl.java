package top.parkzepto.design.strategy.behavior.impl;

import top.parkzepto.design.strategy.behavior.IFlyBehavior;

/**
 * @Description TODO
 * @Author 唐亮
 * @Date 2019-12-11 15:25
 * @Version 1.0
 */
public class BadFlyImpl implements IFlyBehavior {
    public void fly() {
        System.out.println("I am not good at flying!");
    }
}
