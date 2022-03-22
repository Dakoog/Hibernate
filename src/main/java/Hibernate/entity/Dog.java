package Hibernate.entity;

import lombok.*;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;

import javax.persistence.*;
import java.sql.PreparedStatement;

@Data
@NoArgsConstructor
@Entity
@Table(name="dog")
public class Dog {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Integer age;
    private String race;

    public Dog(String name, Integer age, String race) {
        this.name = name;
        this.age = age;
        this.race = race;
    }

}


