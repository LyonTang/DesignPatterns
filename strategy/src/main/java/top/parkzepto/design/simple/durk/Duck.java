package top.parkzepto.design.simple.durk;

/**
 * @Description TODO
 * @Author 唐亮
 * @Date 2019-12-10 20:00
 * @Version 1.0
 */
public abstract class Duck {
    /**
     * 原始需求
     */
    public void qauck(){
        System.out.println("Gagaga");
    }

    public abstract void discription();
    // end

    /**
     * 新需求：部分鸭子会飞
     */
    public void fly(){
        System.out.println("I Can Fly!");
    }
    // end
}
