package com.baron.patterns.command.command;

/**
 * 命令对象接口，通过具体的命令对象将请求者和执行者解耦
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public interface Command {

    void execute();

    void undo();
}
