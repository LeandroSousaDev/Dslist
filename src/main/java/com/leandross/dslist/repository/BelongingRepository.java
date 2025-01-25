package com.leandross.dslist.repository;

import com.leandross.dslist.entity.Belonging;
import com.leandross.dslist.entity.BelongingPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BelongingRepository extends JpaRepository<Belonging, BelongingPK> {
//    List<Belonging> findByGameList(Integer id);
}
