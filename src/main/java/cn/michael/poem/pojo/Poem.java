package cn.michael.poem.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class Poem implements Serializable {

    private static final long serialVersionUID = -3462246040994887002L;
    @ApiModelProperty("诗词id")
    @Id
    private Integer id;
    @ApiModelProperty("诗词标题")
    private String title;
    @ApiModelProperty("作者年代")
    private String dynasty;
    @ApiModelProperty("诗词作者")
    private String author;
    @ApiModelProperty("诗词内容")
    private String content;
    @ApiModelProperty("诗词分类")
    private String category;
}
