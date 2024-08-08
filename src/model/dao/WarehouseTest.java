package model.dao;

import model.Detail;
import model.Gear;
import model.Lever;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {
    private Warehouse warehouse;

    @BeforeEach
    void setUp() {
        warehouse = new Warehouse();
    }

    @Test
    void addDetail() {
        Gear gear = new Gear(123456789l,10.5,"Steel","Vendor A",2.5,5.0,20);
        Lever lever = new Lever(987654321l,15.0,"Aluminum","Vendor b",1.2,100.0);
        warehouse.addDetail(gear);
        warehouse.addDetail(lever);
        assertNotNull(warehouse.findByBarcode(123456789l));
        assertNotNull(warehouse.findByBarcode(987654321l));
    }

    @Test
    void findByBarcode() {
        Gear gear = new Gear(123456789l,10.5,"Steel","Vendor A",2.5,5.0,20);
        warehouse.addDetail(gear);
        Detail foundDetail= warehouse.findByBarcode(123456789l);
        assertNotNull(foundDetail,"detal ne naedena");
        assertEquals(gear.getBarcode(),foundDetail.getBarcode(),"schtrich code ne cövpadaet");
    }

    @Test
    void updateDetail() {
        Gear gear = new Gear(123456789l,10.5,"Steel","Vendor A",2.5,5.0,20);
        warehouse.addDetail(gear);
         gear = new Gear(123456789l,10.5,"Steel","Vendor A",3.0,5.0,20);
        warehouse.updateDetail(gear);
        assertEquals(3.0,warehouse.findByBarcode(123456789l).getWeight(),0.01);
    }

    @Test
    void removeDetail() {
        Gear gear = new Gear(123456789l,10.5,"Steel","Vendor A",2.5,5.0,20);
        warehouse.addDetail(gear);
        warehouse.removeDetail(123456789l);
        assertNull(warehouse.findByBarcode(123456789l));
    }

    @Test
    void totalWeight() {
        Gear gear = new Gear(123456789l,10.5,"Steel","Vendor A",2.5,5.0,20);
        Lever lever = new Lever(987654321l,15.0,"Aluminum","Vendor b",1.2,100.0);
        warehouse.addDetail(gear);
        warehouse.addDetail(lever);
        assertEquals(3.7,warehouse.totalWeight(),0.01);
    }

    @Test
    void averageWeight() {
        Gear gear = new Gear(123456789l,10.5,"Steel","Vendor A",2.5,5.0,20);
        Lever lever = new Lever(987654321l,15.0,"Aluminum","Vendor b",1.2,100.0);
        warehouse.addDetail(gear);
        warehouse.addDetail(lever);
        assertEquals(1.85,warehouse.averageWeight(),0.01);
    }

    @Test
    void findDetailsBySizeRange() {
        Gear gear = new Gear(123456789l,10.5,"Steel","Vendor A",2.5,5.0,20);
        Lever lever = new Lever(987654321l,15.0,"Aluminum","Vendor b",1.2,100.0);
        warehouse.addDetail(gear);
        warehouse.addDetail(lever);
        List<Detail> detailsInRange= warehouse.findDetailsBySizeRange(10,15);
        assertEquals(2,detailsInRange.size());
    }
}