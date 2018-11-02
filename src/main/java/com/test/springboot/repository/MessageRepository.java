package com.test.springboot.repository;

import com.test.springboot.model.Message;

import java.util.List;

/**
 * Created by yinhao on 2018/11/2.
 */
public interface MessageRepository {

    public List<Message> findAll();

    public Message save(Message message);

    public Message update(Message message);

    public Message updateText(Message message);

    public Message findMessage(Long id);

    public void deleteMessage(Long id);

}
