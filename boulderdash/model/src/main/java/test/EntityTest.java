package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.EntityType;
import model.Entity;

public class EntityTest {

	protected Entity entity;
	
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
		//entity.setType(typeTest);
		assertEquals(entity.getType(), typeTest);
	}

	@Test
	public void testGetPosx() {
		int posxTest1 = 40;
		entity.setPosx(posxTest1);
		assertEquals(entity.getPosx(), posxTest1);
	}

	@Test
	public void testSetPosx() {
		int posxTest2 = 10;
		entity.setPosx(posxTest2);
		assertEquals(posxTest2, entity.getPosx());
	}

	@Test
	public void testGetPosy() {
		int posyTest3 = 20;
		entity.setPosy(posyTest3);
		assertEquals(entity.getPosy(), posyTest3);
	}

	@Test
	public void testSetPosy() {
		int posyTest4 = 25;
		entity.setPosy(posyTest4);
		assertEquals(posyTest4, entity.getPosy());
	}

}
