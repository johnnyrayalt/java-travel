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
        Places places = setNewPlace();
        assertEquals(true, places instanceof Places);
    }

    @Test
    public void getPlaces_placesInstantiatesCorrectly_true() {
        Places places = setNewPlace();
        assertEquals("California", places.getPlace());
    }

    @After
    public void tearDown() throws Exception {
    }

    public static Places setNewPlace() {
        return new Places("California");
    }
}