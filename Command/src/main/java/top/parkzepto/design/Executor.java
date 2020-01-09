package top.parkzepto.design;

import top.parkzepto.design.command.*;

/**
 * @Description TODO
 * @Author 唐亮
 * @Date 2020-01-09 14:17
 * @Version 1.0
 */
public class Executor {

    public static void main(String[] args) {
        Control control = new Control();

        // 空调开关
        AirCondiSwitchOnCMD airCondiSwitchOnCMD = new AirCondiSwitchOnCMD();
        AirCondiSwitchOffCMD airCondiSwitchOffCMD = new AirCondiSwitchOffCMD();
        AirCondiModeCMD airCondiModeCMD = new AirCondiModeCMD();
        // 开状态 能执行开启并设定模式
        MicroCommand airSwitchOnCMD = new MicroCommand(2);
        airSwitchOnCMD.setCommand(0, airCondiSwitchOnCMD);
        airSwitchOnCMD.setCommand(1, airCondiModeCMD);

        // 空调温度调控
        AirCondiTempUpCMD airCondiTempUpCMD = new AirCondiTempUpCMD();
        AirCondiTempDownCMD airCondiTempDownCMD = new AirCondiTempDownCMD();

        // 灯
        LightOnCMD lightOnCMD = new LightOnCMD();
        LightOffCMD lightOffCMD = new LightOffCMD();

        // 开空调是个组合命令，包括开空调和设置运行模式
        control.setCommand(Control.CommandArea.AIR_COND_SWITCH, airSwitchOnCMD, airCondiSwitchOffCMD);
        control.setCommand(Control.CommandArea.AIR_COND_TEMP, airCondiTempUpCMD, airCondiTempDownCMD);
        control.setCommand(Control.CommandArea.LIGHT, lightOnCMD, lightOffCMD);

        // 开空调
        control.onCommandReady(Control.CommandArea.AIR_COND_SWITCH);
        // 调模式
        control.onCommandReady(Control.CommandArea.AIR_COND_SWITCH);
        control.onCommandReady(Control.CommandArea.AIR_COND_SWITCH);
        // 加温度
        control.offCommandReady(Control.CommandArea.AIR_COND_TEMP);
        // 关空调
        control.offCommandReady(Control.CommandArea.AIR_COND_SWITCH);


        // 热水器虽没有装,但不会因为此报错，因为初始化是一个不执行任务的命令
        control.onCommandReady(Control.CommandArea.WATER_HEATER_SWITCH);
    }
}
