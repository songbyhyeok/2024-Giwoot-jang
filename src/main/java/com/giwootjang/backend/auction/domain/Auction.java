package com.giwootjang.backend.auction.domain;

import com.giwootjang.backend.chatRoom.domain.ChatRoom;
import com.giwootjang.backend.member.domain.Member;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "auction")
public class Auction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auction_no", nullable = false)
    private long auctionNo;

    @ManyToOne
    @JoinColumn(name = "chat_no", nullable = false)
    private ChatRoom chatRoom;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Column(name = "item_name", length = 50, nullable = false)
    private String itemName;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "starting_price", precision = 10, scale = 2, nullable = false)
    private BigDecimal startingPrice;

    @Column(name = "closing_delay", nullable = false)
    private int closingDelay;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "end_time", nullable = false)
    private LocalDateTime endTime;

    @Column(name = "expired_at")
    private LocalDateTime expiredAt;

    public Auction() {
        // 기본 생성자
    }
}
