package com.vietbnd.demospring.domains;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

public abstract class BaseEntity<TPrimaryKey> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private TPrimaryKey id;
    @Column(name = "is_deleted")
    private boolean isDeleted;
    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt = Instant.now();
    @LastModifiedDate
    @Column(name = "updated_at", nullable = true)
    private Instant updatedAt = Instant.now();
    @CreatedBy
    @Column(name = "created_by", length = 255, nullable = false)
    private String createdBy;
    @LastModifiedBy
    @Column(name = "updated_by", length = 255, nullable = true, updatable = true)
    private String updatedBy;
}
