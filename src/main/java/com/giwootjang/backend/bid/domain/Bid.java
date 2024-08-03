package com.giwootjang.backend.bid.domain;

import com.giwootjang.backend.auction.domain.Auction;
import com.giwootjang.backend.member.domain.Member;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "bid")
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bid_no", nullable = false)
    private long bidNo;

    @ManyToOne
    @JoinColumn(name = "auction_no", nullable = false)
    private Auction auction;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Column(name = "bid_amount", precision = 10, scale = 2, nullable = false)
    private BigDecimal bidAmount;

    @Column(name = "bid_time", nullable = false)
    private LocalDateTime bidTime;

    public Bid() {
        // 기본 생성자
    }
}
