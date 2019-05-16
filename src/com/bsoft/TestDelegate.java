package com.bsoft;

/**
 * @ClassName: TestDelegate
 * @Description: TODO
 * @Author: zhuangy
 * @Date: 2019-05-16 15:13
 **/
public class TestDelegate {
    public static void main(String[] args) {
        Delegator delegator = new Delegator(new ExecutorA());
        delegator.done();
    }
}
