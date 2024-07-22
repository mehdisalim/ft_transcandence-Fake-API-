package com.salim.FakeAPI.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.salim.FakeAPI.persistence.entity.Conversations;

@Repository
public interface ConversationsRepository extends JpaRepository<Conversations, Long>{

    @Query("from Conversations c1_0 where (c1_0.senderId= ?1 and c1_0.receiverId= ?2 ) or (c1_0.senderId= ?2 and c1_0.receiverId= ?1 ) order by c1_0.time asc")
    List<Conversations> findAllBySenderIdAndReceiverId(Long senderId, Long receiverId);
}
