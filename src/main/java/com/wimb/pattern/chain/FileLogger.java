package com.wimb.pattern.chain;

/**
 * @Author: meng.wu01
 * @DateTime: 2021/11/14
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}