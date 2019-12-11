package top.parkzepto.design.strategy;

import top.parkzepto.design.strategy.behavior.IFlyBehavior;
import top.parkzepto.design.strategy.behavior.IQuackBehavior;

/**
 * @Description TODO
 * @Author 唐亮
 * @Date 2019-12-11 15:26
 * @Version 1.0
 */
public abstract class Duck {
    protected IFlyBehavior flyBehavior;
    protected IQuackBehavior quackBehavior;

    public Duck(){}

    public abstract void discription();

    public void quack(){
        quackBehavior.qauck();
    }

    public void fly(){
        flyBehavior.fly();
    }
}
