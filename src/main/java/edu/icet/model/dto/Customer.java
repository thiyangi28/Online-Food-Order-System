package edu.icet.model.dto;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class Customer {

    private Long custId;
    private String custTitle;
    private String custName;
    private String custphone;
    private String city;

}
