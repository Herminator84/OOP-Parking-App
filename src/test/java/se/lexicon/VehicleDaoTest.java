package se.lexicon;

import se.lexicon.dao.VehicleDao;
import se.lexicon.dao.VehicleDaoImpl;
import se.lexicon.model.Vehicle;

public class VehicleDaoTest {
}
private VehicleDao testObject;

@BeforeEach
public void setup(){
    testObject = new VehicleDaoImpl();
}

@Test
public void testCreate(){
    Vehicle expextedVehicle = new Vehicle()
}









@Test
public void testFind(){

}








@Test
public void test>FindbyCustomerId()
    Collection<Vehicle vehicles = testObject.findByCustomerId(1);
    Assertsions.assertEquals( expexted 1) , vehicles.size