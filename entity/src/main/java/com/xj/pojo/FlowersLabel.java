package com.xj.pojo;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.io.Serializable;

/**
* <p>
    * 
    * </p>
*
* @author XQK
* @since 2019-11-23
*/
    public class FlowersLabel implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 鲜花标签ID
            */
            @TableId(value = "f_label_id", type = IdType.AUTO)
    private Integer fLabelId;

            /**
            * 鲜花标签
            */
    private String fLabel;

        public Integer getfLabelId() {
        return fLabelId;
        }

            public void setfLabelId(Integer fLabelId) {
        this.fLabelId = fLabelId;
        }
        public String getfLabel() {
        return fLabel;
        }

            public void setfLabel(String fLabel) {
        this.fLabel = fLabel;
        }

    @Override
    public String toString() {
    return "FlowersLabel{" +
            "fLabelId=" + fLabelId +
            ", fLabel=" + fLabel +
    "}";
    }
}
