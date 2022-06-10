package com.example.gradingregister.data.dto;

import com.example.gradingregister.data.entity.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UpdateUserDTO {
    private long id;
    private String username;
    private String password;

    /*@Column
    private boolean isAccountNonExpired;

    @Column
    private boolean isAccountNonLocked;

    @Column
    private boolean isCredentialsNonExpired;

    @Column
    private boolean isEnabled;*/

    private Role role;
    private int deleted;
}
