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
    public class FlowersLanguageType implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 花语id
            */
            @TableId(value = "f_language_id", type = IdType.AUTO)
    private Integer fLanguageId;

    private String fLanguageType;

        public Integer getfLanguageId() {
        return fLanguageId;
        }

            public void setfLanguageId(Integer fLanguageId) {
        this.fLanguageId = fLanguageId;
        }
        public String getfLanguageType() {
        return fLanguageType;
        }

            public void setfLanguageType(String fLanguageType) {
        this.fLanguageType = fLanguageType;
        }

    @Override
    public String toString() {
    return "FlowersLanguageType{" +
            "fLanguageId=" + fLanguageId +
            ", fLanguageType=" + fLanguageType +
    "}";
    }
}
