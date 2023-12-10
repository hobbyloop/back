package com.multimodule.msa.model;

import javax.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ImageUrl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_url_id", updatable = false)
    private Long imageUrlId;

    @Column(name = "url")
    private String url;

    @Builder
    public ImageUrl(String url) {
        this.url = url;
    }
}
