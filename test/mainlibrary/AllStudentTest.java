/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainlibrary;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class AllStudentTest {
    
//    public AllStudentTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }

    /**
     * Test of main method, of class AllStudent.
     */
    @Test
    public void testMain() {
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AllStudent().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AllStudent.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
          
    }
    
}
