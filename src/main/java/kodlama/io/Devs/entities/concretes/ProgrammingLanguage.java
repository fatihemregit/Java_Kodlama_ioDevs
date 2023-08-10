package kodlama.io.Devs.entities.concretes;


import jakarta.persistence.*;
import lombok.*;


@Table(name = "ProgrammingLanguages")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;

    @Column(name = "name")
    private  String name;
}
