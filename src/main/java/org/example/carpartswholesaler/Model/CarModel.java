package org.example.carpartswholesaler.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="CarModels")
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String Name;
}
