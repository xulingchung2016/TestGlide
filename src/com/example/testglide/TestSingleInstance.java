package com.example.testglide;

import java.io.Serializable;

/**
 * ����ģʽ
 * @author Ī����
 *
 */
public class TestSingleInstance implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ����ģʽ
	 */
	/*private TestSingleInstance instance = new TestSingleInstance();
	
	private TestSingleInstance getInstance(){
		return instance;
	}*/
	/**
	 * �ռ���
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
