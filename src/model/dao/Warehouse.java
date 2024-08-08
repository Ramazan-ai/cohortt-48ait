package model.dao;

import model.Detail;

import java.util.ArrayList;
import java.util.List;

public class Warehouse implements Stock {
    private List<Detail> details;

    public Warehouse() {
        this.details = new ArrayList<>();
    }

    @Override
    public void addDetail(Detail detail) {
        details.add(detail);

    }

    @Override
    public Detail findByBarcode(long barcode) {
        for (Detail detail : details) {
            if (detail.getBarcode() == barcode) {
                return detail;
            }
        }
        return null;
    }

    @Override
    public void updateDetail(Detail detail) {
        for (int i = 0; i < details.size(); i++) {
            if (details.get(i).getBarcode() == detail.getBarcode()) {
                details.set(i, detail);
                return;
            }

        }

    }

    @Override
    public void removeDetail(long barcode) {
        details.removeIf(detail -> detail.getBarcode() == barcode);

    }

    @Override
    public double totalWeight() {
        double totalWeight = 0;
        for (Detail detail : details) {
            totalWeight += detail.getWeight();
        }
        return totalWeight;
    }

    @Override
    public double averageWeight() {
        if (details.isEmpty()) {
            return 0;
        }
        return totalWeight() / details.size();
    }

    @Override
    public List<Detail> findDetailsBySizeRange(double minSize, double maSize) {
        List<Detail> result = new ArrayList<>();
        for (Detail detail : details) {
            if (detail.getSize() >= minSize && detail.getSize() <= maSize){
            result.add(detail);
         }

        }
return result;
    }
}