package com.erbf.bugsLife.notice.service;

import java.util.List;
import java.util.NoSuchElementException;

import com.erbf.bugsLife.notice.application.web.NoticeDto;
import com.erbf.bugsLife.notice.domain.Notice;

public interface NoticeService {
	public abstract void NoticeCreate(NoticeDto noticeDto);
	public abstract NoticeDto NoticeDetail(Long id) throws NoSuchElementException;
	public abstract List<NoticeDto> NoticeList();
	public abstract void NoticeModify(NoticeDto noticeDto) throws NoSuchElementException;
	public abstract void NoticeDelete(Long id) throws NoSuchElementException;
}
