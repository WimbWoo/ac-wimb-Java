package com.wimb.pattern.chain;

/**
 * @Author: meng.wu01
 * @DateTime: 2021/11/14
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}