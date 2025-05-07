package com.junit.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer deptNo;
    @Column(unique = true)
    String deptName;
    String loc;
}
