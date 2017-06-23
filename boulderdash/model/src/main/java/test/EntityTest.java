package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.EntityType;
import model.Entity;
import model.EntityDiamond;

public class EntityTest {


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
		EntityType typeTest = EntityType.DIAMOND;
		final EntityDiamond e = new EntityDiamond(0, 0);
		assertEquals(e.getType(), typeTest);
	}

	@Test
	public void testGetPosx() {
		final int posxTest1 = 2;
		final EntityDiamond e = new EntityDiamond(posxTest1, 0);
		assertEquals (e.GetPosx(), posxTest1);
	}

	@Test
	public void testSetPosx() {
		int posxTest2 = 10;
		final EntityDiamond e = new EntityDiamond(posxTest2, 0);
		assertEquals(posxTest2, e.getPosx());
	}

	@Test
	public void testGetPosy() {
		int posyTest3 = 20;
		final EntityDiamond e = new EntityDiamond(0, posyTest3);
		assertEquals(e.getPosy(), posyTest3);
	}

	@Test
	public void testSetPosy() {
		int posyTest4 = 25;
		final EntityDiamond e = new EntityDiamond(0, posyTest4);
		assertEquals(posyTest4, e.getPosy());
	}

}
