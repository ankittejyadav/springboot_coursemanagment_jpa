package com.example.courseapidata.dataapi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        // List<Topic> topics=new ArrayList<>();
        // topicRepository.findAll().forEach(topics::add);
        // return topics;
        return (List<Topic>) topicRepository.findAll();

    }

    public Topic getTopic(String id){
        return topicRepository.findById(id).orElseThrow();
    }

    public Optional<Topic> getTopicName(String name){
        return topicRepository.findById(name);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic){
        topicRepository.save(topic);
    }

    public void deleteTopic(String id){
        topicRepository.deleteById(id);
    } 
}
