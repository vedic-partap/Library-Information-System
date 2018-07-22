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
public class LibrarianDaoTest {
    
    public LibrarianDaoTest() {
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
     * Test of save method, of class LibrarianDao.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String name = "Vedic";
        String password = "vedic1123";
        String email = "vedicpartap1999@gmail.com";
        String address = "1123";
        String city = "kharagpur";
        String contact = "9680694809";
        int expResult = 0;
        int result = LibrarianDao.save(name, password, email, address, city, contact);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class LibrarianDao.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 1;
        int expResult = 0;
        int result = LibrarianDao.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testDelete3() {
        System.out.println("delete3");
        int id = 2;
        int expResult = 0;
        int result = LibrarianDao.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of validate method, of class LibrarianDao.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        String name = "Encosier";
        String password = "1234";
        boolean expResult = true;
        boolean result = LibrarianDao.validate(name, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    @Test
    public void testValidate2() {
        System.out.println("validate2");
        String name = "";
        String password = "";
        boolean expResult = false;
        boolean result = LibrarianDao.validate(name, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    @Test
    public void testValidate3() {
        System.out.println("validate3");
        String name = "Ve";
        String password = "ved";
        boolean expResult = false;
        boolean result = LibrarianDao.validate(name, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    @Test
    public void testValidate4() {
        System.out.println("validate4");
        String name = "ENCOSIER";
        String password = "1234";
        boolean expResult = true;
        boolean result = LibrarianDao.validate(name, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
