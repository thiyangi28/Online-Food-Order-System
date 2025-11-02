package edu.icet.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class PlaceOrderEntity {

    @Id
    private String poOrderId;
    private String orderId;
    private String description;
    private int orderQty;
    private  Double total;

    @OneToOne
    public ViewOrderEntity viewOrderEntity;

}
