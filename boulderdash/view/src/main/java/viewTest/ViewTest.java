 package viewTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import view.View;

public class ViewTest {
	
	private View v;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		View v = new View();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testGetOrder() {
		//because there is no order in test case
		assertNull(this.v.GetOrder());
	}

}
