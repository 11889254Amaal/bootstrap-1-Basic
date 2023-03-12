package com.example.demo.malling.repositories;

import com.example.demo.malling.models.EmailDetails;

public interface EmailRepositry {
    String sendSimpleMailToMany(EmailDetails emailDetails);
    String sendSimpleMail(EmailDetails emailDetails);
    String sendMailWithAttachmentToMany(EmailDetails emailDetails);
    String sendMailWithAttachment(EmailDetails emailDetails);
}
