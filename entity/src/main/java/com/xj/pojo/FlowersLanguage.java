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
    public class FlowersLanguage implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "language_id", type = IdType.AUTO)
    private Integer languageId;

    private Integer fLanguageId;

    private String languageImage;

    private String languageTitle;

    private String languageYulan;

    private String languageContents;

        public Integer getLanguageId() {
        return languageId;
        }

            public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
        }
        public Integer getfLanguageId() {
        return fLanguageId;
        }

            public void setfLanguageId(Integer fLanguageId) {
        this.fLanguageId = fLanguageId;
        }
        public String getLanguageImage() {
        return languageImage;
        }

            public void setLanguageImage(String languageImage) {
        this.languageImage = languageImage;
        }
        public String getLanguageTitle() {
        return languageTitle;
        }

            public void setLanguageTitle(String languageTitle) {
        this.languageTitle = languageTitle;
        }
        public String getLanguageYulan() {
        return languageYulan;
        }

            public void setLanguageYulan(String languageYulan) {
        this.languageYulan = languageYulan;
        }
        public String getLanguageContents() {
        return languageContents;
        }

            public void setLanguageContents(String languageContents) {
        this.languageContents = languageContents;
        }

    @Override
    public String toString() {
    return "FlowersLanguage{" +
            "languageId=" + languageId +
            ", fLanguageId=" + fLanguageId +
            ", languageImage=" + languageImage +
            ", languageTitle=" + languageTitle +
            ", languageYulan=" + languageYulan +
            ", languageContents=" + languageContents +
    "}";
    }
}
