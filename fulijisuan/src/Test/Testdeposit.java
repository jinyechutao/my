package Test;

import static org.junit.Assert.*;

import java.awt.event.MouseEvent;

import org.junit.After;
import org.junit.Before;

import fulijisuan.fulijisuan_4;


public class Testdeposit extends fulijisuan_4{

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void test1() {
	        fulijisuan_4 fuli = new fulijisuan_4();	       
	        assertEquals(true, fuli.deposit(100000,0.1,100));	       
	} 
	@org.junit.Test
	public void test2() {
	        fulijisuan_4 fuli = new fulijisuan_4();       
	        assertEquals(false, fuli.deposit(-1,0.75,100));
	       
	} 
	@org.junit.Test
	public void test3() {
        fulijisuan_4 fuli = new fulijisuan_4();       
        assertEquals(false, fuli.deposit(0,100,0));;      
} 


}
