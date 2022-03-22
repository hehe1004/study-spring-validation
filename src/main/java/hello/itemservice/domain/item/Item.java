package hello.itemservice.domain.item;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class Item {

    private Long id;

//    @NotBlank(groups = UpdateCheck.class) V3 GROUP
    private String itemName;

//    @NotNull(groups = {UpdateCheck.class, SaveCheck.class})
//    @Range(min = 1000, max = 1000000, groups = {UpdateCheck.class, SaveCheck.class})
    private Integer price;

//    @NotNull(groups = {UpdateCheck.class, SaveCheck.class})
//    @Max(value = 9999, groups = {SaveCheck.class})
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
