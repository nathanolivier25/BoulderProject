package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.EntityType;
import model.BlocDirt;
import model.EntityDiamond;

public class BlocDirtTest {

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
		EntityType typeTest = EntityType.DIRT;
		final BlocDirt e = new BlocDirt(0, 0);
		assertEquals(e.getType(), typeTest);
	}

	@Test
	public void testGetPosx() {
		final int posxTest1 = 20;
		final BlocDirt e = new BlocDirt(posxTest1, 0);
		assertEquals (e.GetPosx(), posxTest1);
	}

	@Test
	public void testGetPosy() {
		final int posyTest2 = 5;
		final BlocDirt e = new BlocDirt(posyTest2, 0);
		assertEquals (e.GetPosx(), posyTest2);
	}

}
