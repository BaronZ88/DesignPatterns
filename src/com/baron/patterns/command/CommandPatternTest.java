package com.baron.patterns.command;

import com.baron.patterns.command.command.LightOffCommand;
import com.baron.patterns.command.command.LightOnCommand;
import com.baron.patterns.command.command.StereoOffWithCDCommand;
import com.baron.patterns.command.command.StereoOnWithCDCommand;
import com.baron.patterns.command.executor.RemoteControl;
import com.baron.patterns.command.requester.Light;
import com.baron.patterns.command.requester.Stereo;

/**
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class CommandPatternTest {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);

        remoteControl.setCommand(lightOnCommand, lightOffCommand);
        remoteControl.onButtonPressed();
        remoteControl.offButtonPressed();

        System.out.println();

        remoteControl.setCommand(stereoOnWithCDCommand,stereoOffWithCDCommand);
        remoteControl.onButtonPressed();
        remoteControl.offButtonPressed();
    }
}
