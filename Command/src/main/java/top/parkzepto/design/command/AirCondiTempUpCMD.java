package top.parkzepto.design.command;

import top.parkzepto.design.ICommand;
import top.parkzepto.design.StaticMode;

/**
 * @Description TODO
 * @Author 唐亮
 * @Date 2020-01-09 15:10
 * @Version 1.0
 */
public class AirCondiTempUpCMD implements ICommand {
    public void execute() {
        if(StaticMode.airCurrentTemp < StaticMode.MAX_TEMP){
            System.out.println("Air conditioner temperature " + (++StaticMode.airCurrentTemp) + "°C");
        }
    }
}
