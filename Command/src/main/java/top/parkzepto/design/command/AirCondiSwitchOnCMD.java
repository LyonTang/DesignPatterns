package top.parkzepto.design.command;

import top.parkzepto.design.ICommand;
import top.parkzepto.design.StaticMode;

/**
 * @Description TODO
 * @Author 唐亮
 * @Date 2020-01-09 15:10
 * @Version 1.0
 */
public class AirCondiSwitchOnCMD implements ICommand {


    public void execute() {
        if(StaticMode.airCurrentState != StaticMode.ON) {
            StaticMode.airCurrentState = StaticMode.ON;
            System.out.println("Air conditioner ON!");
        }
    }
}
