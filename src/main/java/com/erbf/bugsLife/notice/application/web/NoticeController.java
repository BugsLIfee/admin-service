package com.erbf.bugsLife.notice.application.web;

import com.erbf.bugsLife.config.TokenProvider;
import com.erbf.bugsLife.notice.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/api/admin/notice")
@RestController
public class NoticeController {
	
	@Autowired
	NoticeService noticeService;
	@Autowired
	TokenProvider tokenProvider;


	@GetMapping("")
	public List<NoticeDto> getNoticeList(HttpServletRequest request ) {
		System.out.println("-----controller: //infolist plz...");
//		String token = tokenProvider.getJwtFromRequest(request);
//		//String token = tokenProvider.validateToken(request);
//		Long userId = tokenProvider.getUserIdFromToken(token);
//		System.out.println("-----controller: infoList before----" +userId);
		List<NoticeDto> noticeList = noticeService.NoticeList();
		
		System.out.println("-----controller: infoList before----"+noticeList);
		return noticeList;
	}
	
	@GetMapping("/{id}")
	public NoticeDto NoticeDetail(@PathVariable Long id) {
		return noticeService.NoticeDetail(id);
	}
	
	@PostMapping()
	public void noticeCreate(@RequestBody NoticeDto noticeDto) {
		System.out.println("noticeController---------");
		noticeService.NoticeCreate(noticeDto);
	}
	@PutMapping()
	public void noticeModify(@RequestBody NoticeDto noticeDto) {
		System.out.println("noticeController---------");
		noticeService.NoticeModify(noticeDto);
	}
	
}
