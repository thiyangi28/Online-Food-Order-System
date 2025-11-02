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

public class CustomerEntity {

    @Id
    private Long custId;
    private String custTitle;
    private String custName;
    private String custphone;
    private String city;
}
