package com.multimodule.msa.model;

import javax.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id", updatable = false)
    private Long classId;

    @Column(name = "class_name")
    private String className;

    @Column(name = "introduce")
    private String introduce;

    @Column(name = "level")
    private String level;

    @Column(name = "capacity")
    private String capacity;

    @Column(name = "instructor_id", nullable = false)
    private Long instructorId;

    @Column(name = "ticket_id", nullable = false)
    private Long ticketId;

    @Builder
    public Class(String className, String introduce, String level, String capacity, Long instructorId, Long ticketId) {
        this.className = className;
        this.introduce = introduce;
        this.level = level;
        this.capacity = capacity;
        this.instructorId = instructorId;
        this.ticketId = ticketId;
    }
}
