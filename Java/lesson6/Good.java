package gb;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Good {
    // поля класса
    protected double price;
    public String vendorCode; // артикул
    protected LocalDateTime creationDate;
    int guarantee; // package-private(default)
    private List<Integer> groups;

    public Good(double price, String vendorCode, LocalDateTime creationDate, int guarantee) {
        this.price = price;
        this.vendorCode = vendorCode;
        this.creationDate = creationDate;
        this.guarantee = guarantee;
        this.groups = new ArrayList<>();
    }

    public List<Integer> getGroups() {
        return new ArrayList<>(groups);
    }

//    public void setGroups(List<Integer> groups) {
//        this.groups = groups;
//    }

    public void addGroup(int group) {
        this.groups.add(group);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //поля в классе еще называют СОСТОЯНИЕМ объекта

    //ПОВЕДЕНИЕМ объекта называют все его методы

    public String getGoodType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return getGoodType() + " {" +
                "price=" + price +
                ", vendorCode='" + vendorCode + '\'' +
                ", creationDate=" + creationDate +
                ", guarantee=" + guarantee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good good = (Good) o;
        return Double.compare(price, good.price) == 0 && guarantee == good.guarantee && Objects.equals(vendorCode, good.vendorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, vendorCode, guarantee);
    }


}
