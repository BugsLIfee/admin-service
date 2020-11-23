package com.erbf.bugsLife.notice.application.web;

import com.erbf.bugsLife.notice.domain.AdminCategory;
import com.erbf.bugsLife.notice.domain.Notice;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class NoticeDto {
	private Long id;
	private Long userId;
	private AdminCategory adminCategory;
	private String title;
	private String content;
	private String registDate;
	private String editDate;
	private int viewCnt;
	
	public Notice toEntity() {
		int i = 0;
		return 	Notice.builder()
				.id(this.id)
				.userId(this.userId)
				.adminCategory(this.adminCategory)
				.title(this.title)
				.content(this.content)
				.registDate(this.registDate)
				.editDate(this.editDate)
				.viewCnt(this.viewCnt)
				.build();
	}
}


