package com.inzent.spr.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class EnMember {

    @Id
    int memberId;

    String memberName;

}
