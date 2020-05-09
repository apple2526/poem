package cn.michael.poem.controller;

import cn.michael.poem.api.PoemApi;
import cn.michael.poem.pojo.Poem;
import cn.michael.poem.response.ListResponse;
import cn.michael.poem.service.PoemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class PoemController implements PoemApi {
    @Autowired
    PoemService poemService;

    @Override
    @GetMapping("/queryCategory")
    public List<String> queryCategory() {
        return poemService.queryCategory();
    }

    @Override
    @GetMapping("/poemList/{category}")
    public List<ListResponse> queryListByCategory(@PathVariable("category") String category) {
        return poemService.queryListByCategory(category);
    }

    @Override
    @GetMapping("/detail/{id}")
    public Poem queryDetailById(@PathVariable("id") int id) {
        return poemService.queryDetailById(id);
    }
}
