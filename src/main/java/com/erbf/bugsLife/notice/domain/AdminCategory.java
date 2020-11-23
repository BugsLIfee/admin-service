package com.erbf.bugsLife.notice.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AdminCategory {

	INFO(200,"공지사항"),
	EVENT(201,"이벤트"),
	PAYMENT(300,"결제문의"),
	POINT(301,"포인트문의"),
	HOWTOUSE(302,"사이트이용문의"),
	ACCOUNT(303,"계정문의");
	
	private final int code;
	private final String name;

}
