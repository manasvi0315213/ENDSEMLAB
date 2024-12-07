package com.klef.jfsd.exam.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class CommentService {

    private static final String COMMENTS_API_URL = "https://jsonplaceholder.typicode.com/comments";

    public List<Map<String, Object>> fetchComments() {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object>[] response = restTemplate.getForObject(COMMENTS_API_URL, Map[].class);
        return Arrays.asList(response);
    }
}
