package com.franc.domain.catalog.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;

@Entity
@Table(name="catalogs")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Catalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, length=120, unique=true)
    private String productId;

    @Column(nullable=false)
    private String productName;

    @Column(nullable=false)
    private Integer stock;

    @Column(nullable=false)
    private Integer unitPrice;

    @Column(nullable = false, updatable = false, insertable = false)
    @ColumnDefault(value = "CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;
}
