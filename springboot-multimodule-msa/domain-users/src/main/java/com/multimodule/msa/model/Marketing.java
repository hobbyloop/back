package com.multimodule.msa.model;

import javax.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Marketing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "market_id", updatable = false)
    private Long marketId;

    @Column(name = "campaign")
    private String campaign;

    @Column(name = "marketing_type")
    private String marketingType;

    @Column(name = "bid")
    private String bid;

    @Column(name = "image")
    private String image;

    @Column(name = "phrases")
    private String phrases;

    @Column(name = "keyword")
    private String keyword;

    @Column(name = "market_start")
    private Date marketStart;

    @Column(name = "market_end")
    private Date marketEnd;

    @Column(name = "market_ranking")
    private String marketRanking;

    @Column(name = "market_amount")
    private String marketAmount;

    @Column(name = "planned_amount")
    private String plannedAmount;

    @Column(name = "market_noti")
    private String marketNoti;

    @Column(name = "market_charge")
    private String marketCharge;

    @Column(name = "market_chargenoti")
    private String marketChargenoti;

    @Column(name = "payment_balance")
    private String paymentBalance;

    @Column(name = "market_installment")
    private String marketInstallment;

    @Column(name="market_account")
    private String marketAccount;

    @Column(name="market_payment")
    private String marketPayment;

}
