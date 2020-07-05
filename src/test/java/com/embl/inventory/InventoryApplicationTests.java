package com.embl.inventory;

import java.util.ArrayList;
import java.util.List;

import com.embl.inventory.model.Report;
import com.embl.inventory.repository.InventoryRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
class InventoryApplicationTests {

    @Autowired
    InventoryRepository repository;

    @Test
    public void shouldReturnAllTheInventoryReports() {

        Report report1 = new Report(1L, "name01", 0);
        Report report2 = new Report(2L, "name02", 0);
        Report report3 = new Report(3L, "name03", 0);
        Report report4 = new Report(4L, "name04", 0);
        Report report5 = new Report(5L, "name05", 0);
        Report report6 = new Report(6L, "name06", 0);
        Report report7 = new Report(7L, "name07", 0);
        Report report8 = new Report(8L, "name08", 0);
        Report report9 = new Report(9L, "name09", 0);
        Report report10 = new Report(10L, "name10", 0);


        List<Report> expected = new ArrayList<>();
        expected.add(report1);
        expected.add(report2);
        expected.add(report3);
        expected.add(report4);
        expected.add(report5);
        expected.add(report6);
        expected.add(report7);
        expected.add(report8);
        expected.add(report9);
        expected.add(report10);

        List<Report> result = repository.findAll();

        System.out.println(result);
        Assert.assertEquals(result, expected);
    }

}