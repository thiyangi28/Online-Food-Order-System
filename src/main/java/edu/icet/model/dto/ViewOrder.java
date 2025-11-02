package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ViewOrder {

    private String orderId;
    private LocalDate orderDate;
    private String custId;
    private String itemCode;

}
