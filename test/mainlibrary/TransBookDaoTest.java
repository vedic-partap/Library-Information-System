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
public class TransBookDaoTest {
    
    public TransBookDaoTest() {
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
     * Test of checkBook method, of class TransBookDao.
     */
    @Test
    public void testCheckBook() {
        System.out.println("checkBook");
        String bookcallno = "3";
        boolean expResult = false;
        boolean result = TransBookDao.checkBook(bookcallno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of BookValidate method, of class TransBookDao.
     */
    @Test
    public void testBookValidate() {
        System.out.println("BookValidate");
        String BookID = "3";
        boolean expResult = false;
        boolean result = TransBookDao.BookValidate(BookID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of UserValidate method, of class TransBookDao.
     */
    @Test
    public void testUserValidate() {
        System.out.println("UserValidate");
        String UserID = "1";
        boolean expResult = true;
        boolean result = TransBookDao.UserValidate(UserID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of updatebook method, of class TransBookDao.
     */
    @Test
    public void testUpdatebook() {
        System.out.println("updatebook");
        String bookcallno = "3";
        int expResult = 0;
        int result = TransBookDao.updatebook(bookcallno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of IssueBook method, of class TransBookDao.
     */
    @Test
    public void testIssueBook() {
        System.out.println("IssueBook");
        int BookID = 0;
        int UserID = 0;
        String IDate = "";
        String RDate = "";
        int expResult = 0;
        int result = TransBookDao.IssueBook(BookID, UserID, IDate, RDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of ReturnBook method, of class TransBookDao.
     */
    @Test
    public void testReturnBook() {
        System.out.println("ReturnBook");
        int BookID = 0;
        int UserID = 0;
        int expResult = 0;
        int result = TransBookDao.ReturnBook(BookID, UserID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of CheckIssuedBook method, of class TransBookDao.
     */
    @Test
    public void testCheckIssuedBook() {
        System.out.println("CheckIssuedBook");
        int BookID = 0;
        boolean expResult = false;
        boolean result = TransBookDao.CheckIssuedBook(BookID);
        assertEquals(expResult, result);

    }

    /**
     * Test of Check method, of class TransBookDao.
     */
    @Test
    public void testCheck() {
        System.out.println("Check");
        int UserID = 0;
        int expResult = 1;
        int result = TransBookDao.Check(UserID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testCheckBook2() {
        System.out.println("checkBook2");
        String bookcallno = "56";
        boolean expResult = false;
        boolean result = TransBookDao.checkBook(bookcallno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of BookValidate method, of class TransBookDao.
     */
    @Test
    public void testBookValidate2() {
        System.out.println("BookValidate2");
        String BookID = "378";
        boolean expResult = false;
        boolean result = TransBookDao.BookValidate(BookID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of UserValidate method, of class TransBookDao.
     */
    @Test
    public void testUserValidate2() {
        System.out.println("UserValidate2");
        String UserID = "108";
        boolean expResult = false;
        boolean result = TransBookDao.UserValidate(UserID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of updatebook method, of class TransBookDao.
     */
    @Test
    public void testUpdatebook2() {
        System.out.println("updatebook2");
        String bookcallno = "309";
        int expResult = 0;
        int result = TransBookDao.updatebook(bookcallno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of IssueBook method, of class TransBookDao.
     */
    @Test
    public void testIssueBook2() {
        System.out.println("IssueBook2");
        int BookID = 0;
        int UserID = 0;
        String IDate = "";
        String RDate = "";
        int expResult = 0;
        int result = TransBookDao.IssueBook(BookID, UserID, IDate, RDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of ReturnBook method, of class TransBookDao.
     */
    @Test
    public void testReturnBook2() {
        System.out.println("ReturnBook2");
        int BookID = 12;
        int UserID = 34;
        int expResult = 0;
        int result = TransBookDao.ReturnBook(BookID, UserID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of CheckIssuedBook method, of class TransBookDao.
     */
    @Test
    public void testCheckIssuedBook2() {
        System.out.println("CheckIssuedBook2");
        int BookID = 120;
        boolean expResult = false;
        boolean result = TransBookDao.CheckIssuedBook(BookID);
        assertEquals(expResult, result);

    }

    /**
     * Test of Check method, of class TransBookDao.
     */
    @Test
    public void testCheck2() {
        System.out.println("Check2");
        int UserID = 120;
        int expResult = 1;
        int result = TransBookDao.Check(UserID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
