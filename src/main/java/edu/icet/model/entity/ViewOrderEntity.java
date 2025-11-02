package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class ViewOrderEntity {

    @Id
    private String orderId;
    private LocalDate orderDate;
    private String custId;
    private String itemCode;

    @OneToOne
    private CustomerEntity customerEntity;

    @ManyToOne
    private  ItemEntity itemEntity;
}
