package org.example.carpartswholesaler.Model;

import jakarta.persistence.*;

@Entity
@Table(name="Parts")
public class Part {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    


}
