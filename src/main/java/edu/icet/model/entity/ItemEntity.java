package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class ItemEntity {

    @Id
    private String itemCode;
    private String description;
    private String packSize;
    private Double unitPrice;
    private  int quantity;
}
