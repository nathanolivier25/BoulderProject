package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.EntityType;
import model.BlocDirt;
import model.BlockEnd;

public class BlockEndTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	public void testGetType() {
		EntityType typeTest = EntityType.END;
		final BlockEnd e = new BlockEnd(0, 0);
		assertEquals(e.getType(), typeTest);
	}

	@Test
	public void testGetPosx() {
		final int posxTest1 = 20;
		final BlockEnd e = new BlockEnd(posxTest1, 0);
		assertEquals (e.GetPosx(), posxTest1);
	}

	@Test
	public void testGetPosy() {
		final int posyTest2 = 5;
		final BlockEnd e = new BlockEnd(0, posyTest2);
		assertEquals (e.GetPosy(), posyTest2);
	}

}
