package com.DreamFly.DreamFly.entities;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String flightNumber;
    private String origin;
    private String destination;
    private Date departureDate;
    private Date arrivalDate;
}
