package com.example.testglide;

import java.io.Serializable;

/**
 * 单例模式
 * @author 莫筱晴
 *
 */
public class TestSingleInstance implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 饿汉模式
	 */
	/*private TestSingleInstance instance = new TestSingleInstance();
	
	private TestSingleInstance getInstance(){
		return instance;
	}*/
	/**
	 * 终极版
	 */
	
	private static class SingleHolder{
		
		static final TestSingleInstance instance = new TestSingleInstance();
		
	}
	
	public static TestSingleInstance getInsance(){
		
		return SingleHolder.instance;
	}
	
	private TestSingleInstance(){
		
		
	}

	private Object readResolve(){
		return getInsance();
	}
	
	
	

}
