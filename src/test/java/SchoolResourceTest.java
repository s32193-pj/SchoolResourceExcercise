import org.example.Employee;
import org.example.Equipment;
import org.example.TeachingMaterial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class SchoolResourceTest {

}

class EmployeeTest{
    Employee employee;
    ByteArrayOutputStream out_stream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp(){
        employee = new Employee(14,"employee","czlowiek",1800,"ICBM-Department");
        System.setOut(new PrintStream(out_stream));
    }

    @Test
    void getResourceDetails_test(){
        String given_string = employee.getResourceDetails();
        String expected_string = """
                ResourceID=14
                ResourceName=employee
                Salary=1800.0
                Department=ICBM-Department""";
        Assertions.assertEquals(given_string,expected_string);
    }

    @Test
    void getDetails_test(){
        String expected_string = """
                ResourceID=14
                ResourceName=employee
                Salary=1800.0
                Department=ICBM-Department""";
        employee.getDetails();
        Assertions.assertEquals(expected_string,out_stream.toString());
    }

    @Test
    void work_test(){
        employee.work();
        String expected_string = "czlowiek";
        Assertions.assertEquals(expected_string,out_stream.toString());
    }

}

class EquipmentTest{
    Equipment equipment;
    ByteArrayOutputStream out_stream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp(){
        equipment = new Equipment(14,"mleko","wodniste","toaleta",true);
        System.setOut(new PrintStream(out_stream));
    }

    @Test
    void relocate_test(){
        String test_location = "Battlecruiser";
        equipment.relocate(test_location);
        String new_location = equipment.getLocation();
        Assertions.assertEquals(test_location,new_location);
    }

    @Test
    void repair_test1(){
        equipment.repair();
        String test_repair_failure = "No need to repair equipment";
        Assertions.assertEquals(test_repair_failure,out_stream.toString());
    }
    @Test
    void repair_test2(){
        equipment.setFunctional(false);
        Assertions.assertFalse(equipment.isFunctional());
    }
    @Test
    void repair_test3(){
        equipment.repair();
        Assertions.assertTrue(equipment.isFunctional());
    }
}

class TeachingMaterialTest{
    TeachingMaterial teachingMaterial;
    ByteArrayOutputStream out_stream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp(){
        teachingMaterial = new TeachingMaterial(8,"ksiazka","duza ksiazka","necronomicon",true);
        System.setOut(new PrintStream(out_stream));
    }



}

