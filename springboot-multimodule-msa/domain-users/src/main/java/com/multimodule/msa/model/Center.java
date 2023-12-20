package com.multimodule.msa.model;

import com.multimodule.msa.authentication.UserRole;
import com.multimodule.msa.authentication.UserStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Getter
@NoArgsConstructor
@MappedSuperclass
public class Center {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "center_id", updatable = false)
    private long centerId;

    @Column(name = "center_name", updatable = false)
    private String centerName;

    private String address;

    @Column(name = "announcement", updatable = false)
    private String announceMent;

    private String introduce;

    private String contact;

    @Column(name = "kakao_link", updatable = false)
    private String kakaoLink;

    @Column(name = "member_id", nullable = false)
    private Long memberId;

    @Column(name = "class_id", nullable = false)
    private Long classId;

    @Builder
    public Center(long centerId, String centerName, String address, String announceMent, String introduce, String contact, String kakaoLink, Long memberId, Long classId) {
        this.centerId = centerId;
        this.centerName = centerName;
        this.address = address;
        this.announceMent = announceMent;
        this.introduce = introduce;
        this.contact = contact;
        this.kakaoLink = kakaoLink;
        this.memberId = memberId;
        this.classId = classId;
    }

}
