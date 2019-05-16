package com.bsoft;

/**
 * @ClassName: ExecutorA
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-16 14:23
 **/
public class ExecutorA implements Executor{
    @Override
    public void done() {
        System.out.println("ExecutorA done!");
    }
}
