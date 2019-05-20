package com.bsoft;

/**
 * @ClassName: Delegator
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-16 14:23
 **/
public class Delegator implements Executor{
    private Executor executor;

    public Delegator(Executor executor) {
        this.executor = executor;
    }

    public void done() {
        executor.done();
    }
}
