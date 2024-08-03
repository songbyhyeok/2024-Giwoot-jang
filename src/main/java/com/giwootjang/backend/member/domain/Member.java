package com.giwootjang.backend.member.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "members")
public class Member {
    @Id
    @Column(name = "member_id", length = 20, nullable = false)
    private String memberId;

    @Column(name = "name", length = 4, nullable = false)
    private String name;

    @Column(name = "password", length = 30, nullable = false)
    private String password;

    @Column(name = "email", length = 40, nullable = false)
    private String email;

    @Column(name = "phone", length = 13, nullable = false)
    private String phone;

    @Column(name = "profile", length = 100)
    private String profile;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private MemberType type;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "points", precision = 10, scale = 2)
    private BigDecimal points;

    public Member() {
        // 기본 생성자
    }
}

enum Status {
    ACTIVE, SLEEP, QUIT
}

enum MemberType {
    DEFAULT, OAUTH
}

