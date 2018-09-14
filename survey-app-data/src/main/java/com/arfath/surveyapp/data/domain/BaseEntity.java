package com.arfath.surveyapp.data.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @CreationTimestamp
    private LocalDateTime createdLocalDateTime;

    @UpdateTimestamp
    private LocalDateTime updatedLocalDateTime;
}
