package com.shakil.repository;

import com.shakil.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.multipart.MultipartFile;

public interface AttachmentRepository  extends JpaRepository<Attachment, Long> {

//    public Attachment readAttachment(Long id);
}
