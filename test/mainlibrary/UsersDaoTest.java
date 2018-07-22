/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainlibrary;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vedic
 */
public class UsersDaoTest {
    
    public UsersDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validate method, of class UsersDao.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        String name = "vedic";
        String password = "vedic13";
        boolean expResult = false;
        boolean result = UsersDao.validate(name, password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of CheckIfAlready method, of class UsersDao.
     */
    @Test
    public void testCheckIfAlready() {
        System.out.println("CheckIfAlready");
        String UserName = "vedic";
        boolean expResult = true;
        boolean result = UsersDao.CheckIfAlready(UserName);
        assertEquals(expResult, result);

    }
    @Test
    public void testValidate2() {
        System.out.println("validate2");
        String name = "vedic";
        String password = "vedic1123";
        boolean expResult = true;
        boolean result = UsersDao.validate(name, password);
        assertEquals(expResult, result);
      
    }
    @Test
    public void testValidate3() {
        System.out.println("validate3");
        String name = "vedic";
        String password = "vedic11";
        boolean expResult = false;
        boolean result = UsersDao.validate(name, password);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of CheckIfAlready method, of class UsersDao.
     */
    @Test
    public void testCheckIfAlready2() {
        System.out.println("CheckIfAlready2");
        String UserName = "vedic";
        boolean expResult = true;
        boolean result = UsersDao.CheckIfAlready(UserName);
        assertEquals(expResult, result);
        
    }
    
}
