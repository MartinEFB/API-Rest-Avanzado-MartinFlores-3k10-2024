package com.example.inicial1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.envers.Audited;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Table(name = "localidad")
@Audited
public class Localidad extends Base {

    @Column(name = "denominacion")
    private String denominacion;

}
