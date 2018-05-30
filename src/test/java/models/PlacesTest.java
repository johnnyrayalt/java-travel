package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlacesTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void placesClassInstantiatesCorrectly_true() throws Exception{
        Places places = new Places();
        assertEquals(true, places instanceof Places);
    }

    @After
    public void tearDown() throws Exception {
    }
}