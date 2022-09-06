package com.gilfoyle.design.structural.facade.design;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-07 00:32
 */
public class Computer {
	
	private CPU cpu;
	
	private Memory memory;
	
	private Disk disk;
	
	public Computer() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.disk = new Disk();
	}
	
	public void startup() {
		System.out.println("start this computer");
		cpu.startup();
		memory.startup();
		disk.startup();
		
		System.out.println("start computer end");
		
	}
	
	public void shutdown() {
		System.out.println("begin to close the computer!");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		System.out.println("computer closed!");
	}
}
