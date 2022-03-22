package hello.itemservice.web.validation.form;


import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ItemSaveForm {


    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

}
