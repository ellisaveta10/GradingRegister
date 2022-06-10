package com.example.gradingregister.data.dto;

import com.example.gradingregister.data.entity.Role;
import com.example.gradingregister.data.entity.School;
import com.example.gradingregister.data.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.OneToOne;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
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
