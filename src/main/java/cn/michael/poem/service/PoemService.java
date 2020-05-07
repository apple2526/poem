package cn.michael.poem.service;

import cn.michael.poem.pojo.Poem;
import cn.michael.poem.response.ListResponse;

import java.util.List;

public interface PoemService {

    List<String> queryCategory();

    List<ListResponse> queryListByCategory(String category);

    Poem queryDetailById(Integer id);

    String getImage(String imageName);
}
