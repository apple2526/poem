package cn.michael.poem.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ListResponse implements Serializable {
    private static final long serialVersionUID = 3240063392913924962L;
    @ApiModelProperty("诗词id")
    private Integer id;
    @ApiModelProperty("诗词标题")
    private String title;
    @ApiModelProperty("诗词作者")
    private String author;
}
