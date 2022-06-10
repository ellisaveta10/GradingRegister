package com.example.gradingregister.data.dto;

import com.example.gradingregister.data.entity.School;
import com.example.gradingregister.data.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UpdateSchoolPrincipalDTO {
    private long id;
    private String name;
    private School school;
    private User user;
    private int deleted;
}
