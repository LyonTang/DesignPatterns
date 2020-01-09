package top.parkzepto.design;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 组合命令
 * @Author 唐亮
 * @Date 2020-01-09 12:48
 * @Version 1.0
 */
public class MicroCommand implements ICommand{
    public ICommand[] commands;

    public MicroCommand(int size) {
        commands = new ICommand[size];

        for (int i = 0; i < size; i++) {
            commands[i] = new NoCommand();
        }
    }

    public void execute() {
        for (ICommand command: commands) {
            command.execute();
        }
    }

    public void setCommand(int slot, ICommand command) {
        if(slot < 0 || slot >= commands.length) { return; }
        commands[slot] = command;
    }
}
