package com.gilfoyle.design.creational.singleton.cas;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author jaylee
 * @description: Cas单例模式
 * @author: Mr.JayLee
 * @create: 2022-07-08 10:08
 */

/**
 * 优点：
 * 1、java并发库提供很多原子类来支持并发访问的数据安全性；
 * AtomicInteger、AtomicBoolean、AtomicLong、AtomicReference
 * 2、AtomicReference 可以封装引用一个 T实例，支持并发访问单例
 * 3、使用CAS 不需要锁机制，并发量不高情况下 效率高
 * 4、使用CAS 线程安全（底层JVM调用操作系统原语指令 Unsafe）
 * 5、非阻塞 减少了线程上下文切换
 * 缺点：
 * 1、并发度高的情况下， 自旋 循环时间长，开销大，占用CPU资源
 * 2、可能会出现ABA问题（其实某些场景下，不影响正常业务）
 * 【
 * 可以使用
 * {@link java.util.concurrent.atomic.AtomicStampedReference}、
 * {@link java.util.concurrent.atomic.AtomicMarkableReference}
 * 解决ABA问题
 * 】
 * 3、底层调用了 一条汇编指令 lock cmpxchg（cpu 中的一条 cmpxchg指令，各个操作系统有所不同），简单理解就是 把 内存总线锁住（锁南北桥），锁住后，其他线程不能修改，只能自旋等 释放总线后 尝试修改。 耗CPU
 */
public class CasSingleton {
	
	private static final AtomicReference<CasSingleton> INSTANCE = new AtomicReference<>();
	
	private CasSingleton() {
	}
	
	public static CasSingleton getInstance() {
		for (; ; ) {
			CasSingleton instance = INSTANCE.get();
			if (instance != null) {
				return instance;
			}
			INSTANCE.compareAndSet(null, new CasSingleton());
			return INSTANCE.get();
		}
	}
	
}
