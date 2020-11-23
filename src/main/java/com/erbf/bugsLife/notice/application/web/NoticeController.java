package com.erbf.bugsLife.notice.application.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.erbf.bugsLife.notice.service.NoticeService;

@RequestMapping("/api/admin/notice/")
@RestController
public class NoticeController {
	
	@Autowired
	NoticeService noticeService;
	
	@GetMapping("/")
	public List<NoticeDto> getNoticeList() {
		List<NoticeDto> noticeList = noticeService.NoticeList();
		return noticeList;
	}
	
	@GetMapping("{id}")
	public NoticeDto NoticeDetail(@PathVariable Long id) {
		return noticeService.NoticeDetail(id);
	}
	
	@PostMapping()
	public ResponseEntity<?> noticeCreate(@RequestBody NoticeDto noticeDto) {
		noticeService.NoticeCreate(noticeDto);
		return new ResponseEntity<>("success", HttpStatus.OK);
	}

	@PutMapping()
	public ResponseEntity<?> noticeModify(@RequestBody NoticeDto noticeDto) {
		noticeService.NoticeModify(noticeDto);
		return new ResponseEntity<>("success", HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteNotice(@PathVariable Long id) {
		noticeService.NoticeDelete(id);
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
}
