package com.baron.patterns.command.executor;

import com.baron.patterns.command.command.Command;

/**
 * 遥控器，执行请求的对象
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class RemoteControl {

    private Command onCommand;
    private Command offCommand;

    public RemoteControl() {
    }

    public void setCommand(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void onButtonPressed() {
        if (this.onCommand != null) {
            this.onCommand.execute();
        }
    }

    public void offButtonPressed() {
        if (this.offCommand != null) {
            this.offCommand.execute();
        }
    }
}
