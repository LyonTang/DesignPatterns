package top.parkzepto.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 遥控器例子
 * @Author 唐亮
 * @Date 2020-01-09 12:32
 * @Version 1.0
 */
public class Control {
    // 假设遥控器有五排On/Off控件
    public enum CommandArea {
        LIGHT,   // 灯光控制
        AIR_COND_TEMP,  // 空调温度
        AIR_COND_SWITCH,// 空调开关和模式
        WATER_HEATER_SWITCH, // 热水器开关
        WATER_HEATER_TEMP,   // 热水器温度
    }

    public static CommandArea[] commandTypes = new CommandArea[] {
            CommandArea.LIGHT, CommandArea.AIR_COND_SWITCH, CommandArea.AIR_COND_TEMP, CommandArea.WATER_HEATER_SWITCH,
            CommandArea.WATER_HEATER_TEMP
    };

    private Map<CommandArea, ICommand> onCommands;
    private Map<CommandArea, ICommand> offCommands;

    public Control() {
        onCommands = new HashMap<CommandArea, ICommand>();
        offCommands = new HashMap<CommandArea, ICommand>();

        // 初始化使用NoCommand，可以有效的减少在执行其他使用操作时的if判断
        for (CommandArea type : commandTypes) {
            onCommands.put(type, new NoCommand());
            offCommands.put(type, new NoCommand());
        }
    }
    public void setCommand(CommandArea type, ICommand onCommand, ICommand offCommand){
        if(!onCommands.containsKey(type)) {return;}
        onCommands.remove(type);
        offCommands.remove(type);
        onCommands.put(type, onCommand);
        offCommands.put(type, offCommand);
    }


    public void onCommandReady(CommandArea type){
        if(!onCommands.containsKey(type)) {return;}
        onCommands.get(type).execute();
    }

    public void offCommandReady(CommandArea type){
        if(!offCommands.containsKey(type)) {return;}
        offCommands.get(type).execute();
    }
}
