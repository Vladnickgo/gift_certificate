package com.epam.esm.repository.entity;

import lombok.*;

import java.time.ZonedDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@EqualsAndHashCode
@ToString
public class GiftCertificate {
    private Integer id;
    private String name;
    private Integer price;
    private Integer duration;
    private ZonedDateTime createDate;
    private ZonedDateTime lastUpdateDate;
}
