package com.erbf.bugsLife.notice.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AdminCategory {

	INFO(200,"공지사항"),
	EVENT(201,"이벤트"),
	PAYMENT(300,"결제"),
	POINT(301,"포인트"),
	HOWTOUSE(302,"사이트이용문의"),
	BUG(303,"사이트버그");
	
	private final int code;
	private final String name;
	

	
	
	
}
