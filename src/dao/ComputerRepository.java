package dao;

import model.Computer;

import java.awt.*;
import java.util.List;

public interface ComputerRepository {
    void create(Computer computer);
    Computer read(String id);
    void update(Computer computer);
    void delete(String id);
    List<Computer> findDiscountedComputer();
}
