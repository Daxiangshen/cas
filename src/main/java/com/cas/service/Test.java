package com.cas.service;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * Test  class
 *
 * @author : yuxiang
 * @date : 2019-07-13 10:25
 **/
public class Test {
    public static void main(String[] args) {
        AtomicStampedReference atomicStampedReference=new AtomicStampedReference(1,1);
        atomicStampedReference.compareAndSet(1,1,1,1);
        AtomicReference atomicReference=new AtomicReference();
        atomicReference.compareAndSet(1,1);
    }
}
