package com.giwootjang.backend.role.domain;

import com.giwootjang.backend.member.domain.Member;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_no", nullable = false)
    private Long roleNo;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Enumerated(EnumType.STRING)
    @Column(name = "name", nullable = false)
    private RoleName name;

    @Column(name = "permissions", nullable = false)
    private int permissions;

    @Column(name = "granted_at", nullable = false)
    private LocalDateTime grantedAt;

    @Column(name = "revoked_at")
    private LocalDateTime revokedAt;

    // Enum for role names
    public enum RoleName {
        ADMIN, AUCTIONEER, ADVERTISER
    }

    // Getters and Setters omitted for brevity
}
