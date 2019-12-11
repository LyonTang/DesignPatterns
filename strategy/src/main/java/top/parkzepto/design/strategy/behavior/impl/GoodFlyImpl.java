package top.parkzepto.design.strategy.behavior.impl;

import top.parkzepto.design.strategy.behavior.IFlyBehavior;

/**
 * @Description TODO
 * @Author 唐亮
 * @Date 2019-12-11 15:23
 * @Version 1.0
 */
public class GoodFlyImpl implements IFlyBehavior {
    public void fly() {
        System.out.println("I am good at flying");
    }
}
