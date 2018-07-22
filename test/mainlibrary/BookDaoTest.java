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
public class BookDaoTest {
    
    public BookDaoTest() {
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
     * Test of save method, of class BookDao.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String callno = "2";
        String name = "my life";
        String author = "vedic";
        String publisher = "pearson";
        int quantity = 1;
        int expResult = 0;
        int result = BookDao.save(callno, name, author, publisher, quantity);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of PublisherValidate method, of class BookDao.
     */
    @Test
    public void testPublisherValidate() {
        System.out.println("PublisherValidate");
        String Publisher = "asd";
        boolean expResult = false;
        boolean result = BookDao.PublisherValidate(Publisher);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of AddPublisher method, of class BookDao.
     */
    @Test
    public void testAddPublisher() {
        System.out.println("AddPublisher");
        String Publisher = "Pearson";
        int expResult = 1;
        int result = BookDao.AddPublisher(Publisher);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of SaveBook method, of class BookDao.
     */
    @Test
    public void testSaveBook() {
        System.out.println("SaveBook");
        String BookN = "13";
        String AuthorN = "Jane and Austin";
        String PublisherN = "Read Book";
        String ShelfN = "12";
        String RowN = "E";
        String GenreN = "Drama";
        int expResult = 1;
        int result = BookDao.SaveBook(BookN, AuthorN, PublisherN, ShelfN, RowN, GenreN);
        assertEquals(expResult, result);
        
    }
      @Test
    public void testSaveBook2() {
        System.out.println("SaveBook2");
        String BookN = "13";
        String AuthorN = "Jane and Austin";
        String PublisherN = "Read Book";
        String ShelfN = "12";
        String RowN = "E";
        String GenreN = "Drama";
        int expResult = 1;
        int result = BookDao.SaveBook(BookN, AuthorN, PublisherN, ShelfN, RowN, GenreN);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of Delete method, of class BookDao.
     */
    @Test
    public void testDelete() {
        System.out.println("Delete");
        int BookID = 3;
        int expResult = 0;
        int result = BookDao.Delete(BookID);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testDelete2() {
        System.out.println("Delete another");
        int BookID = 4;
        int expResult = 0;
        int result = BookDao.Delete(BookID);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testDelete3() {
        System.out.println("Delete another");
        int BookID = 32;
        int expResult = 1;
        int result = BookDao.Delete(BookID);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testDelete4() {
        System.out.println("Delete another");
        int BookID = 33;
        int expResult = 1;
        int result = BookDao.Delete(BookID);
        assertEquals(expResult, result);
       
    }
    
}
