package com.giwootjang.backend.message.domain;

import com.giwootjang.backend.chatRoom.domain.ChatRoom;
import com.giwootjang.backend.member.domain.Member;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "msg_no", nullable = false)
    private long msgNo;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @ManyToOne
    @JoinColumn(name = "chat_no", nullable = false)
    private ChatRoom chatRoom;

    @Column(name = "content", length = 255)
    private String content;

    @Column(name = "sender", length = 20, nullable = false)
    private String sender;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    public Message() {
        // 기본 생성자
    }
}
