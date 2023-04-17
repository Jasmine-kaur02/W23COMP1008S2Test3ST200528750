package com.example.w23comp1008s2test3student;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class ElectricVehicleTest {

    ElectricVehicle ev;
    @Before
    public void setUp() throws Exception {
        ev = new ElectricVehicle("Ford","Mustang Mach-E",65798.33,2022,500);
    }

    @Test
    public void setRange() {
        ev.setRange(400);
        assertEquals(400, ev.getRange());
    }

    @Test
    public void setRangeConstructorLow(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            ElectricVehicle car = new ElectricVehicle("Ford","Mach-e",87732.33,2022,199);});
    }

    @Test
    public void setRangeConstructorHigh(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            ElectricVehicle car = new ElectricVehicle("Ford","Mach-e",87732.33,2022,601);});
    }

    @Test
    public void testToString() {
        assertEquals("2022 Ford Mustang Mach-E $65798.33-Electric",ev.toString());
    }

    @Test
    public void setRangeInvalidLow() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            ev.setRange(199);});
    }

    @Test
    public void setRangeInvalidHigh() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            ev.setRange(601);});
    }

    @Test
    public void isASubClass(){
        assertTrue(Car.class.isAssignableFrom(ElectricVehicle.class));
    }
}