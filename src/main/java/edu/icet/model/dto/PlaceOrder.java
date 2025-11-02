package edu.icet.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PlaceOrder {

    private String poOrderId;
    private String orderId;
    private String description;
    private int orderQty;
    private  Double total;

}
