package gb.goods;


import gb.Good;

import java.time.LocalDateTime;

public class Milk extends Good {

    public String color;

    public Milk(
            double price,
            String vendorCode,
            LocalDateTime creationDate,
            int guarantee,
            String color
    ) {
        super(price, vendorCode, creationDate, guarantee);
        this.color = color;
    }

    @Override
    public String getGoodType() {
        return getClass().getSimpleName();
    }
}
