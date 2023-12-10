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
public class WaitingList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "waiting_id", updatable = false)
    private Long waitingId;

    @Column(name = "member_id", nullable = false)
    private Long memberId;

    @Column(name = "class_id", nullable = false)
    private Long classId;

    @Column(name = "waiting_num")
    private int waitingNum;

    @Column(name = "register_dt")
    private Date registerDt;

    @Column(name = "waiting_status")
    private String waitingStatus;


    @Builder
    public WaitingList(Long memberId, Long classId, int waitingNum, Date registerDt, String waitingStatus) {
        this.memberId = memberId;
        this.classId = classId;
        this.waitingNum = waitingNum;
        this.registerDt = registerDt;
        this.waitingStatus = waitingStatus;
    }

}
