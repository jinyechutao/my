package Test;

import static org.junit.Assert.*;

import java.awt.event.MouseEvent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fulijisuan.fulijisuan_4;

public class Testnull {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void test1() {
	        fulijisuan_4 fuli = new fulijisuan_4();        
	        MouseEvent event = null;
			fuli.jButton0MouseMouseClicked(event);
	       
	} 

}
