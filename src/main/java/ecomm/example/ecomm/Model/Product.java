package ecomm.example.ecomm.Model;

import lombok.*;
import org.hibernate.validator.constraints.Currency;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id private long id;

    @NonNull
    private int quantity;

    @NonNull
    private double price;

    @NonNull
    private String description;

    @NonNull
    private String name;

    @NonNull
    private String brand;

    @NonNull
    private String category;

    @NonNull
    private String image;

}
