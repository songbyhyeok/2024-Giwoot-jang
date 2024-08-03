package com.giwootjang.backend.tokenProvider.domain;

import com.giwootjang.backend.member.domain.Member;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "token_providers")
public class TokenProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "token_no", nullable = false)
    private long tokenNo;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Enumerated(EnumType.STRING)
    @Column(name = "provider", nullable = false)
    private TokenProviderType provider;

    @Column(name = "access_token", length = 255, nullable = false)
    private String accessToken;

    @Column(name = "issued_at", nullable = false)
    private LocalDateTime issuedAt;

    @Column(name = "expires_at")
    private LocalDateTime expiresAt;

    public TokenProvider() {
        // 기본 생성자
    }
}

enum TokenProviderType {
    JWT, NAVER
}
