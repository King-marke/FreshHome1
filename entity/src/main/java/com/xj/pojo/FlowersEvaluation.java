package com.xj.pojo;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.time.LocalDateTime;
    import java.io.Serializable;

/**
* <p>
    * 
    * </p>
*
* @author XQK
* @since 2019-11-23
*/
    public class FlowersEvaluation implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 评价ID
            */
            @TableId(value = "f_evaluation_id", type = IdType.AUTO)
    private Integer fEvaluationId;

            /**
            * 商品id
            */
    private Integer fFreshId;

            /**
            * 评价内容
            */
    private String fContent;

            /**
            * 描述相符评分
            */
    private Integer fDescribe;

            /**
            * 物流服务评分
            */
    private Integer fLogistics;

            /**
            * 服务态度评分
            */
    private Integer fAttitude;

            /**
            * 评价嗮图1
            */
    private String fPrint1;

            /**
            * 评价嗮图2
            */
    private String fPrint2;

            /**
            * 评价嗮图3
            */
    private String fPrint3;

            /**
            * 评价分数
            */
    private Integer fScore;

            /**
            * 用户id
            */
    private Integer uId;

            /**
            * 评价时间
            */
    private LocalDateTime fDate;

        public Integer getfEvaluationId() {
        return fEvaluationId;
        }

            public void setfEvaluationId(Integer fEvaluationId) {
        this.fEvaluationId = fEvaluationId;
        }
        public Integer getfFreshId() {
        return fFreshId;
        }

            public void setfFreshId(Integer fFreshId) {
        this.fFreshId = fFreshId;
        }
        public String getfContent() {
        return fContent;
        }

            public void setfContent(String fContent) {
        this.fContent = fContent;
        }
        public Integer getfDescribe() {
        return fDescribe;
        }

            public void setfDescribe(Integer fDescribe) {
        this.fDescribe = fDescribe;
        }
        public Integer getfLogistics() {
        return fLogistics;
        }

            public void setfLogistics(Integer fLogistics) {
        this.fLogistics = fLogistics;
        }
        public Integer getfAttitude() {
        return fAttitude;
        }

            public void setfAttitude(Integer fAttitude) {
        this.fAttitude = fAttitude;
        }
        public String getfPrint1() {
        return fPrint1;
        }

            public void setfPrint1(String fPrint1) {
        this.fPrint1 = fPrint1;
        }
        public String getfPrint2() {
        return fPrint2;
        }

            public void setfPrint2(String fPrint2) {
        this.fPrint2 = fPrint2;
        }
        public String getfPrint3() {
        return fPrint3;
        }

            public void setfPrint3(String fPrint3) {
        this.fPrint3 = fPrint3;
        }
        public Integer getfScore() {
        return fScore;
        }

            public void setfScore(Integer fScore) {
        this.fScore = fScore;
        }
        public Integer getuId() {
        return uId;
        }

            public void setuId(Integer uId) {
        this.uId = uId;
        }
        public LocalDateTime getfDate() {
        return fDate;
        }

            public void setfDate(LocalDateTime fDate) {
        this.fDate = fDate;
        }

    @Override
    public String toString() {
    return "FlowersEvaluation{" +
            "fEvaluationId=" + fEvaluationId +
            ", fFreshId=" + fFreshId +
            ", fContent=" + fContent +
            ", fDescribe=" + fDescribe +
            ", fLogistics=" + fLogistics +
            ", fAttitude=" + fAttitude +
            ", fPrint1=" + fPrint1 +
            ", fPrint2=" + fPrint2 +
            ", fPrint3=" + fPrint3 +
            ", fScore=" + fScore +
            ", uId=" + uId +
            ", fDate=" + fDate +
    "}";
    }
}
