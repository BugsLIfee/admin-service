package com.erbf.bugsLife.notice.respository;

import com.erbf.bugsLife.notice.domain.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice, Long>{

}
