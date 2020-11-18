package com.erbf.bugsLife.notice.domain;

import com.erbf.bugsLife.notice.application.web.NoticeDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@Getter
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

    private String writerId;

    @Enumerated(EnumType.STRING)
    private AdminCategory adminCategory;
    private String title;
    private String content;
    private String registDate;
    private String editDate;
    private int viewCnt;


    @Builder
    public Notice(Long id, String writerId, AdminCategory adminCategory, String title, String content, String registDate, String editDate, int viewCnt) {
        this.id = id;
        this.writerId = writerId;
        this.adminCategory = adminCategory;
        this.title = title;
        this.content = content;
        this.registDate = registDate;
        this.editDate = editDate;
        this.viewCnt = viewCnt;
    }



    public void update( AdminCategory adminCategory,String title, String content,String editDate) {
        this.title = title;
        this.adminCategory = adminCategory;
        this.content = content;
        this.editDate=editDate;

    }

    public NoticeDto toDto() {
        NoticeDto noticeDto = NoticeDto.builder()
                .id(this.id)
                .writerId(this.writerId)
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