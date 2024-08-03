package com.giwootjang.backend.stream.domain;

import com.giwootjang.backend.chatRoom.domain.ChatRoom;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "stream")
public class Stream {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stream_no", nullable = false)
    private long streamNo;

    @ManyToOne
    @JoinColumn(name = "chat_no", nullable = false)
    private ChatRoom chatRoom;

    @Column(name = "url", length = 255, nullable = false)
    private String url;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    public Stream() {
        // 기본 생성자
    }
}
