package ops.model.X.area.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import ops.model.X.base.entity.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "functions", indexes = {@Index(name = "functions_index", columnList = "area_id,f_type")})
public class Functions implements BaseEntity {

    @TableId(type = IdType.AUTO)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "area_id", nullable = false)
    private Long areaId;

    @Column(name = "parent_id", nullable = false)
    private Long parentId;

    @Column(name = "title", nullable = true, length = 255)
    private String title;

    @Column(name = "sub_title", nullable = true, length = 255)
    private String subTitle;

    @Lob
    @Column(name = "rich_text", nullable = true)
    private String richText;


    @Column(name = "image", nullable = true, length = 100)
    private String image;

    @Column(name = "author", nullable = true, length = 30)
    private String author;

    @TableField("f_type")
    @Column(name = "f_type", nullable = true, length = 2)
    private String type;

    @Column(name = "path", nullable = true, length = 50)
    private String path;

    @Column(name = "sort", nullable = true)
    private Long sort;


    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Column(name = "remark", nullable = true, length = 100)
    private String remark;

    @TableLogic
    @Column(nullable = false, columnDefinition = "int default 0")
    private Integer deleted;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRichText() {
        return richText;
    }

    public void setRichText(String richText) {
        this.richText = richText;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void beAdd() {
        if (this.sort == null) {
            this.sort = System.currentTimeMillis();
        }
    }

    public void beUpdate() {

    }
}
