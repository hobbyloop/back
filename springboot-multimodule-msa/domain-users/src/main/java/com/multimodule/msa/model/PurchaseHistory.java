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
public class PurchaseHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purchase_id", updatable = false)
    private Long purchaseId;

    @Column(name="purchase_dt")
    private Date purchaseDt;

    @Column(name="class_id", nullable = false)
    private Long classId;

    @Column(name = "member_id", nullable = false)
    private Long memberId;

    @Column(name = "used_points")
    private int usedPoints;

    @Column(name = "used_coupon")
    private String usedCoupon;

    @Builder
    public PurchaseHistory(Date purchaseDt, Long classId, Long memberId, int usedPoints, String usedCoupon){
        this.purchaseDt = purchaseDt;
        this.classId = classId;
        this.memberId = memberId;
        this.usedPoints = usedPoints;
        this.usedCoupon = usedCoupon;
    }

}
