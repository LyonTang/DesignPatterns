package top.parkzepto.design.command;

import top.parkzepto.design.ICommand;

/**
 * @Description TODO
 * @Author 唐亮
 * @Date 2020-01-09 17:48
 * @Version 1.0
 */
public class LightOnCMD implements ICommand {
    public void execute() {
        System.out.println("Light ON!");
    }
}
