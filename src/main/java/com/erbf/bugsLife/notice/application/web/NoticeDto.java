package com.erbf.bugsLife.notice.application.web;

import com.erbf.bugsLife.notice.domain.AdminCategory;
import com.erbf.bugsLife.notice.domain.Notice;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class NoticeDto {
	private Long id;
	private String writerId;
	private AdminCategory adminCategory;
	private String title;
	private String content;
	private String registDate;
	private String editDate;
	private int viewCnt;

	@Builder
	public NoticeDto(Long id, String writerId, AdminCategory adminCategory, String title, String content, String registDate, String editDate, int viewCnt) {
		this.id = id;
		this.writerId = writerId;
		this.adminCategory = adminCategory;
		this.title = title;
		this.content = content;
		this.registDate = registDate;
		this.editDate = editDate;
		this.viewCnt = viewCnt;
	}


	public Notice toEntity() {
		int i = 0;
		return 	Notice.builder()
				.id(this.id)
				.writerId(this.writerId)
				.adminCategory(this.adminCategory)
				.title(this.title)
				.content(this.content)
				.registDate(this.registDate)
				.editDate(this.editDate)
				.viewCnt(this.viewCnt)
				.build();
	}
	

}


