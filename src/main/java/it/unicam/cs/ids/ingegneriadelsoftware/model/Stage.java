package it.unicam.cs.ids.ingegneriadelsoftware.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.*;

@Entity
@Table(name = "STAGE")
@Getter
@Setter
@NoArgsConstructor
public class Stage {
}
