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
public class PaymentRefund {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "refund_id", updatable = false)
    private Long refundId;

    @Column(name = "member_id", nullable = false)
    private Long memberId;

    @Column(name = "payment_time")
    private Date paymentTime;

    @Column(name = "payment_amount")
    private String paymentAmount;

    @Column(name = "payment_start")
    private Date paymentStart;

    @Column(name = "payment_end")
    private Date paymentEnd;

    @Column(name = "payment_info")
    private String paymentInfo;

    @Builder
    public PaymentRefund(Long memberId, Date paymentTime, String paymentAmount, Date paymentStart, Date paymentEnd, String paymentInfo) {
        this.memberId = memberId;
        this.paymentTime = paymentTime;
        this.paymentAmount = paymentAmount;
        this.paymentStart = paymentStart;
        this.paymentEnd = paymentEnd;
        this.paymentInfo = paymentInfo;
    }
}
