package com.bsoft;

/**
 * @ClassName: ExecutorB
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-16 14:26
 **/
public class ExecutorB implements Executor{
    @Override
    public void done() {
        System.out.println("ExecutorB done");
    }
}
