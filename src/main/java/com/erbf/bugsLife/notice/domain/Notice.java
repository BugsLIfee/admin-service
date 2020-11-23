package com.erbf.bugsLife.notice.domain;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.erbf.bugsLife.notice.application.web.NoticeDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(
        name = "NOTICE_SEQ_GEN",
        sequenceName ="notice_seq",
        initialValue=1,
        allocationSize=2
)
@Entity
public class Notice {
    @Id
    @GeneratedValue(
            strategy=GenerationType.SEQUENCE,
            generator="NOTICE_SEQ_GEN"
    )
    private Long id;
    private Long userId;

    @Enumerated(EnumType.STRING)
    private AdminCategory adminCategory;
    private String title;
    private String content;
    private String registDate;
    private String editDate;
    private int viewCnt;

    public NoticeDto toDto() {
        NoticeDto noticeDto = NoticeDto.builder()
                .id(this.id)
                .userId(this.userId)
                .adminCategory(this.adminCategory)
                .title(this.title)
                .content(this.content)
                .registDate(this.registDate)
                .editDate(this.editDate)
                .viewCnt(this.viewCnt)
                .build();
        return noticeDto;

    }
    public static List<NoticeDto> toDtos(List<Notice> notices){

        return notices.stream().map(Notice::toDto).collect(Collectors.toList());
    }



}