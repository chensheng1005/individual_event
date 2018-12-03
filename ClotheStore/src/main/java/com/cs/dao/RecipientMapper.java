package com.cs.dao;

import com.cs.entity.Recipient;
import java.util.List;

public interface RecipientMapper {
    int deleteByPrimaryKey(Integer recipientId);

    int insert(Recipient record);

    Recipient selectByPrimaryKey(Integer recipientId);

    List<Recipient> selectAll();

    int updateByPrimaryKey(Recipient record);
}