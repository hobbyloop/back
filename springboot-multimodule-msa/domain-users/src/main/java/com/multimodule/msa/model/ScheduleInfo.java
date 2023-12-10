package com.multimodule.msa.model;

import javax.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ScheduleInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_id", updatable = false)
    private Long scheduleId;

    @Column(name = "schedule_date")
    private Date scheduleDate;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "schedule_phone")
    private String schedulePhone;

    @Builder
    public ScheduleInfo(Date scheduleDate, Date birthDate, String schedulePhone) {
        this.scheduleDate = scheduleDate;
        this.birthDate = birthDate;
        this.schedulePhone = schedulePhone;
    }


}
