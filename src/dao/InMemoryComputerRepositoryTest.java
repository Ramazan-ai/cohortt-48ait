package dao;

import model.Computer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryComputerRepositoryTest {
    private InMemoryComputerRepository repository;

    @BeforeEach
    void setUp() {
        repository=new InMemoryComputerRepository();
    }
    @Test
    public void testCreateAndRead(){
        Computer computer = new Computer("1","Apple","MacPro",1999.99,0.15);
        repository.create(computer);
        Computer found = repository.read("1");
        assertEquals(computer,found);
    }
    @Test
    public void testUpdate(){
        Computer computer = new Computer("1","Apple","MacPro",1999.99,0.15);
        repository.create(computer);
        computer.setPrice(1899.99);
        repository.update(computer);
        assertEquals(1899.99,repository.read("1").getPrice());
    }
    @Test
    public void testDelete(){
        Computer computer = new Computer("1","Apple","MacPro",1999.99,0.15);
        repository.create(computer);
        repository.delete("1");
        assertNull(repository.read("1"));
    }
    @Test
    public void testFindDiscountedComputers(){
        Computer computer1 = new Computer("1","Apple","MacPro",1999.99,0.15);
        Computer computer2 = new Computer("2","Dell","XPS13",1499.99,0.0);
        repository.create(computer1);
        repository.create(computer2);
        List<Computer> discounted = repository.findDiscountedComputer();
        assertEquals(1,discounted.size());
        assertEquals(computer1,discounted.get(0));
    }
}