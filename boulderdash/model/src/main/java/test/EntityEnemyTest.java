package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.EntityType;
import model.EntityEnemy;

public class EntityEnemyTest {

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
		EntityType typeTest = EntityType.ENEMY;
		final EntityEnemy e = new EntityEnemy(0, 0);
		assertEquals(e.getType(), typeTest);
	}

	@Test
	public void testGetPosx() {
		final int posxTest1 = 20;
		final EntityEnemy e = new EntityEnemy(posxTest1, 0);
		assertEquals (e.GetPosx(), posxTest1);
	}

	@Test
	public void testGetPosy() {
		final int posyTest2 = 5;
		final EntityEnemy e = new EntityEnemy(0, posyTest2);
		assertEquals (e.GetPosy(), posyTest2);
	}

}
