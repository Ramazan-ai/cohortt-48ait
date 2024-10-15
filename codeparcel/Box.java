package homework.code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

class Box implements Iterable<Parcel>{
     private List<Parcel> parcels;

     public Box(){
         this.parcels=new ArrayList<>();
         Random random = new Random();
         int numberOfParsel= random.nextInt(6) + 5;
         IntStream.range(0,numberOfParsel)
                 .forEach(i -> parcels.add(new Parcel(2.0)));
     }
     public int getNumberOfParcel(){
         return parcels.size();
     }
     public Iterator<Parcel> iterator(){
         return parcels.iterator();
     }
}
