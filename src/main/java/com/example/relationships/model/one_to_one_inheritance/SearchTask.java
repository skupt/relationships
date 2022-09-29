package com.example.relationships.model.one_to_one_inheritance;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Data
@ToString(callSuper = true)
@Entity
public class SearchTask extends Task {

    @NotBlank
    private String domain;
    @NotBlank
    private String keywords;
    private String domainUser;
    private String domainPassword;
}
