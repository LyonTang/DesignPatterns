package top.parkzepto.design.command;

import top.parkzepto.design.ICommand;
import top.parkzepto.design.StaticMode;

/**
 * @Description TODO
 * @Author 唐亮
 * @Date 2020-01-09 15:10
 * @Version 1.0
 */
public class AirCondiModeCMD implements ICommand {

    public void execute() {
        StaticMode.airCurrentMode = StaticMode.airCurrentMode == StaticMode.HOT ?  StaticMode.COLD : StaticMode.HOT;
        System.out.println("Air conditioner mode " + StaticMode.airCurrentMode);
    }
}
