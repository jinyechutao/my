package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fulijisuan.fulijisuan_4;

public class Testprincipal  extends fulijisuan_4{

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void test1() {
	        fulijisuan_4 fuli = new fulijisuan_4();	       
	        assertEquals(false, fuli.deposit(500,-1,100));	       
	} 
	@org.junit.Test
	public void test2() {
	        fulijisuan_4 fuli = new fulijisuan_4();    
	        assertEquals(true, fuli.principal(0.66,10,500000));
	       
	} 
	@org.junit.Test
	public void test3() {
        fulijisuan_4 fuli = new fulijisuan_4();       
        assertEquals(false, fuli.principal(0,100,5000));;      
} 
	@org.junit.Test
	public void test4() {
        fulijisuan_4 fuli = new fulijisuan_4();       
        assertEquals(false, fuli.principal(100,250,100));;      
} 

}
