package ops.model.X.base.page;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public class PageAble {

    private Integer page;

    private Integer size;


    public PageAble(Integer page, Integer size) {
        this.page = page;
        this.size = size;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }


    public Page getIPage() {
        if (this.page == null) {
            this.page = 1;
        }
        if (this.size == null) {
            this.size = 10;
        }
        return new Page(this.page, this.size);
    }

}
