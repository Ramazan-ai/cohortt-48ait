package model.dao;

import model.Detail;

import java.util.List;

public interface Stock {
    void addDetail(Detail detail);
    Detail findByBarcode(long barcode);
    void updateDetail(Detail detail);
    void removeDetail(long barcode);
    double totalWeight();
    double averageWeight();
    List<Detail> findDetailsBySizeRange(double minSize,double maxSize);

}
