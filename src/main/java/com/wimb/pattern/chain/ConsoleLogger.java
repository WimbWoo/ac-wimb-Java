package com.wimb.pattern.chain;

/**
 * @Author: meng.wu01
 * @DateTime: 2021/11/14
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
