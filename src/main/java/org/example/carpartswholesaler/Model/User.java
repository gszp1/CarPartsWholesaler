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
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(unique = true, nullable = false)
    private String Username;

    private String FirstName;

    private String Surname;

    @Column(unique = true, nullable = false)
    private String Email;

    private String PhoneNumber;
}
