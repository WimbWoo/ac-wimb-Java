package com.wimb.IO;

import lombok.Data;

import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;

/**
 * @Author: meng.wu01
 * @DateTime: 2021/8/26
 */
public class FileIO {

    public static void main(String[] args) {
        File file = new File("D:/tmpFile");
        for (String fileName : file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (dir.getName().endsWith(".zip")) {
                    return true;
                }
                return false;
            }
        })) {
            System.out.println(fileName);
        }
        String substring = "123456789".substring(2,4);
        System.out.println(substring);
    }
}

@Data
class A implements Serializable {
    // 该参数不参与序列化
    transient int age;
}
