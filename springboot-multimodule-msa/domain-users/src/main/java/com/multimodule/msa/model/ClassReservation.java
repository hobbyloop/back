package com.multimodule.msa.model;

import javax.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ClassReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id", updatable = false)
    private Long reservationId;

    @Column(name = "reservation_dt")
    private Date reservationDt;

    @Column(name = "class_dt")
    private Date classDt;

    @Column(name = "reservation_status")
    private String reservationStatus;

    @Column(name = "member_id", nullable = false)
    private Long memberId;

    @Column(name = "class_id", nullable = false)
    private Long classId;

    @Builder
    public ClassReservation(Date reservationDt, Date classDt, String reservationStatus, Long memberId, Long classId) {
        this.reservationDt = reservationDt;
        this.classDt = classDt;
        this.reservationStatus = reservationStatus;
        this.memberId = memberId;
        this.classId = classId;
    }
}
