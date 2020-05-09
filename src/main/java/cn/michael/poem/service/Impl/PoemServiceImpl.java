package cn.michael.poem.service.Impl;

import cn.michael.poem.dao.PoemRepository;
import cn.michael.poem.pojo.Poem;
import cn.michael.poem.response.ListResponse;
import cn.michael.poem.service.PoemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PoemServiceImpl implements PoemService {
    @Autowired
    PoemRepository poemRepository;
    @Override
    public List<String> queryCategory() {
        return poemRepository.queryCategory();
    }

    @Override
    public List<ListResponse> queryListByCategory(String category) {
        List<Poem> poemList = poemRepository.findAllByCategory(category);
        List<ListResponse> responseList = new ArrayList<>();
        for (Poem poem : poemList) {
            ListResponse listResponse = new ListResponse();
            listResponse.setId(poem.getId());
            listResponse.setAuthor(poem.getAuthor());
            listResponse.setTitle(poem.getTitle());
            responseList.add(listResponse);
        }
        return responseList;
    }

    @Override
    public Poem queryDetailById(Integer id) {
        return poemRepository.findPoemById(id);
    }
}
