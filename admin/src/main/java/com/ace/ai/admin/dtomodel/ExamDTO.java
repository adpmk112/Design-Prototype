package com.ace.ai.admin.dtomodel;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ExamDTO {
    private String course_id;
    private String name;
    private String type;
    private String duration;
    private List<QuestionDTO> questions;
    private int total_point;


}
