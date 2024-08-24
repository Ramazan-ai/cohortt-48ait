package dao;

import model.Computer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryComputerRepository implements ComputerRepository{
    private List<Computer> computers =new ArrayList<>();

    @Override
    public void create(Computer computer) {
        computers.add(computer);

    }

    @Override
    public Computer read(String id) {
        return computers.stream()
                .filter(computer -> computer.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void update(Computer computer) {
        int index = computers.indexOf(read(computer.getId()));
        if (index!=-1){
            computers.set(index,computer);
        }

    }

    @Override
    public void delete(String id) {
        computers.removeIf(computer -> computer.getId().equals(id));

    }

    @Override
    public List<Computer> findDiscountedComputer() {
        return computers.stream()
                .filter(computer -> computer.getDiscount()>0)
                .collect(Collectors.toList());
    }
}
