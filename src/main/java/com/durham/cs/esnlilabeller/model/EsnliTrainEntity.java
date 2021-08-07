package com.durham.cs.esnlilabeller.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "esnli_train")
public class EsnliTrainEntity {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String pairId;
    private String goldLabel;
    @TableField(value = "sentence_1")
    private String sentence1;
    @TableField(value = "sentence_2")
    private String sentence2;
    private String explanation;
    private String workerId;
    @TableField(value = "sentence_1_marked")
    private String sentence1Marked;
    @TableField(value = "sentence_2_marked")
    private String sentence2Marked;
    @TableField(value = "sentence_1_highlighted")
    private String sentence1Highlighted;
    @TableField(value = "sentence_2_highlighted")
    private String sentence2Highlighted;
}
