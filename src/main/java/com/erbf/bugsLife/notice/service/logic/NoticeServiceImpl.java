package com.erbf.bugsLife.notice.service.logic;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erbf.bugsLife.notice.application.web.NoticeDto;
import com.erbf.bugsLife.notice.domain.Notice;
import com.erbf.bugsLife.notice.respository.NoticeRepository;
import com.erbf.bugsLife.notice.service.NoticeService;



@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	NoticeRepository noticeRepo;
	
	@Override
	public void NoticeCreate(NoticeDto noticeDto) {
		noticeRepo.save(Notice.builder()
				.id(noticeDto.getId())
				.userId(noticeDto.getUserId())
				.adminCategory(noticeDto.getAdminCategory())
				.title(noticeDto.getTitle())
				.content(noticeDto.getContent())
				.registDate(noticeDto.getRegistDate())
				.editDate(noticeDto.getEditDate())
				.viewCnt(0)
				.build()
				);
		
	}

	@Override
	public NoticeDto NoticeDetail(Long id) throws NoSuchElementException {
		Optional<Notice> noticeOpt = noticeRepo.findById(id);
		
		return noticeOpt.map(Notice::toDto).get();
	}

	@Override
	public List<NoticeDto> NoticeList() {
		List<Notice> notices = noticeRepo.findAll();
		return Notice.toDtos(notices);
	}

	@Override
	public void NoticeModify(NoticeDto noticeDto) throws NoSuchElementException {
		noticeRepo.save(Notice.builder()
				.id(noticeDto.getId())
				.userId(noticeDto.getUserId())
				.adminCategory(noticeDto.getAdminCategory())
				.title(noticeDto.getTitle())
				.content(noticeDto.getContent())
				.registDate(noticeDto.getRegistDate())
				.editDate(noticeDto.getEditDate())
				.viewCnt(noticeDto.getViewCnt())
				.build());		
	}
	
	@Override
	public void NoticeDelete(Long id) throws NoSuchElementException {
		noticeRepo.deleteById(id);
	}
}
