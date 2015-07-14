package org.iceberg.controller.test;

/**
 * Created by dell on 2015/7/14.
 */
public class StringSwitchTest {

    public static void main(String[] args) {
        String name = "b";

        switch (name){
            case "a":{
                System.out.println("错误的分支");
                break;
            }
            case "b":{
                System.out.println("正确的分支");
                break;
            }

        }
    }
}
