package cn.michael.poem.service.Impl;

import cn.michael.poem.mapper.PoemMapper;
import cn.michael.poem.pojo.Poem;
import cn.michael.poem.response.ListResponse;
import cn.michael.poem.service.PoemService;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class PoemServiceImpl implements PoemService {
    @Autowired
    PoemMapper poemMapper;

    @Override
    public List<String> queryCategory() {
        return poemMapper.queryCategory();
    }

    @Override
    public List<ListResponse> queryListByCategory(String category) {
        return poemMapper.queryListByCategory(category);
    }

    @Override
    public Poem queryDetailById(Integer id) {
        return poemMapper.queryDetailById(id);
    }

    @Override
    public String getImage(String imageName) {
        String path = "E:\\MyWork\\poem\\src\\main\\resources\\" + imageName + ".jpg";
        byte[] bytes = new byte[0];
        try {
            bytes = FileUtils.readFileToByteArray(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "data:image/jpg;base64," + Base64.encode(bytes);
    }
}
