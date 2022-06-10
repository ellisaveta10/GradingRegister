package com.example.gradingregister.data.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UpdateRoleDTO {
    private long id;
    private String name;
    private int deleted;
}
