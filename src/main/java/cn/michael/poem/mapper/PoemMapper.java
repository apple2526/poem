package cn.michael.poem.mapper;

import cn.michael.poem.pojo.Poem;
import cn.michael.poem.response.ListResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PoemMapper {
   List<String> queryCategory();

   List<ListResponse> queryListByCategory(String category);

   Poem queryDetailById(Integer id);
}
