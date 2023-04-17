package com.example.w23comp1008s2test3student;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;
public class CarTest {

    private Car car;
    @Before
    public void setUp() throws Exception {
        car = new Car("Ford","F150",57999.99, 2023);
    }

    @Test
    public void setMakeConstructor() {
        assertEquals("Ford",car.getMake());
    }

    @Test
    public void setMake() {
        car.setMake("GMC");
        assertEquals("GMC",car.getMake());
    }

    @Test
    public void setMakeWithWhiteSpace() {
        car.setMake("    GMC    ");
        assertEquals("GMC",car.getMake());
    }

    @Test
    public void setMakeHonda() {
        car.setMake("Honda");
        assertEquals("Honda",car.getMake());
    }

    @Test
    public void setMakeNissan() {
        car.setMake("Nissan");
        assertEquals("Nissan",car.getMake());
    }

    @Test
    public void setMakeConstructorInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Car("Invalid","F150",57999.99,2021);});
    }

    @Test
    public void setModelConstructorInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Car("Ford","a",57999.99,2021);});
    }

    @Test
    public void setPriceConstructorInvalidLow() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Car("Ford","F150",-1,2021);});
    }

    @Test
    public void setPriceConstructorInvalidHigh() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Car("Ford","F150",150000.01,2021);});
    }

    @Test
    public void setModel() {
        car.setModel("X3");
        assertEquals("X3",car.getModel());
    }

    @Test
    public void setModelWithWhiteSpaces() {
        car.setModel("   X3   ");
        assertEquals("X3",car.getModel());
    }

    @Test
    public void setModelInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            car.setModel("a");});
    }

    @Test
    public void setPrice() {
        car.setPrice(76292.34);
        assertEquals(76292.34, car.getPrice(),0.001);
    }

    @Test
    public void setPriceInvalidLow() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            car.setPrice(-1);});
    }

    @Test
    public void setPriceInvalidHigh() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            car.setPrice(150000.01);});
    }

    @Test
    public void setYear() {
        car.setYear(2022);
        assertEquals(2022, car.getYear());
    }

    @Test
    public void setYearInvalidHigh() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            car.setYear(2024);});
    }

    @Test
    public void setYearInvalidLow() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            car.setYear(1899);});
    }
    @Test
    public void testToString() {
        assertEquals("2023 Ford F150 $57999.99", car.toString());
    }

    @Test
    public void testToString2() {
        car = new Car("BMW", "X5", 87232.22,2021);
        assertEquals("2023 Ford F150 $57999.99", car.toString());
    }

}