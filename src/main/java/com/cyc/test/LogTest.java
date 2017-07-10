package com.cyc.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by huzuxing on 2017/6/21.
 */
public class LogTest {

    private static final Logger logger = LoggerFactory.getLogger(LogTest.class);
    public static void main(String[] args) {
        logger.debug("test");
    }

    public LogTest() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

}
