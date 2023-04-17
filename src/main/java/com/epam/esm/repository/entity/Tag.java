package com.epam.esm.repository.entity;

import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
@ToString
public class Tag {
    private Integer id;
    private String name;
}
