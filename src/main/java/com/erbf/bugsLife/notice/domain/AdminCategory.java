package com.erbf.bugsLife.notice.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AdminCategory {

	INFO(200,"��������"),
	EVENT(201,"�̺�Ʈ"),
	PAYMENT(300,"����"),
	POINT(301,"����Ʈ"),
	HOWTOUSE(302,"����Ʈ�̿빮��"),
	BUG(303,"����Ʈ����");
	
	private final int code;
	private final String name;

}
