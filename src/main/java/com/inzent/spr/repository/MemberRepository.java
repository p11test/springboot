package com.inzent.spr.repository;

import com.inzent.spr.domain.EnMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<EnMember,Long>  {
}
