package cn.michael.poem.api;

import cn.michael.poem.pojo.Poem;
import cn.michael.poem.response.ListResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import java.io.IOException;
import java.util.List;

@Api(value = "诗词页面管理接口")
public interface PoemApi {

    @ApiOperation("查询诗词所有类别")
    List<String> queryCategory();

    @ApiOperation("根据诗词类别查询诗词作者和标题")
    @ApiImplicitParam(name = "category", value = "诗词类别", required = true, dataType = "String",paramType = "path")
    List<ListResponse> queryListByCategory(String category);

    @ApiOperation("根据诗词id查询诗词详情")
    @ApiImplicitParam(name = "id", value = "诗词id", required = true,dataType = "int",paramType = "path")
    Poem queryDetailById(int id);

    @ApiOperation("根据诗词id查询诗词详情")
    @ApiImplicitParam(name = "imageName", value = "图片名称", required = true,dataType = "String",paramType = "path")
    String getImage(String  imageName) throws IOException;
}