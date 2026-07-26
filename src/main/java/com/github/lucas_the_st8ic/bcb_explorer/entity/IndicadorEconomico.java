package com.github.lucas_the_st8ic.bcb_explorer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "indicador")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class IndicadorEconomico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, precision = 5, scale = 3)
    private BigDecimal valor;
    @Column(nullable = false)
    private Integer codigoSerie;
    @Column(nullable = false)
    private LocalDate dataDeReferencia;
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime dataDeCriacao;

}
