package com.erbf.bugsLife.notice.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erbf.bugsLife.notice.domain.Notice;

public interface NoticeRepository extends JpaRepository<Notice, Long>{

}
