package com.giwootjang.backend.level.domain;

import com.giwootjang.backend.role.domain.Role;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Entity
@Table(name = "levels")
public class Level {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "level_no", nullable = false)
    private Long levelNo;

    @ManyToOne
    @JoinColumn(name = "role_no", nullable = false)
    private Role role;

    @Enumerated(EnumType.STRING)
    @Column(name = "level_name", nullable = false)
    private LevelName levelName;

    @Column(name = "description", length = 50)
    private String description;

    @Column(name = "usage_discount", precision = 5, scale = 4, nullable = false)
    private BigDecimal usageDiscount;

    @Column(name = "fee_discount", precision = 5, scale = 4, nullable = false)
    private BigDecimal feeDiscount;

    @Column(name = "granted_at", nullable = false)
    private LocalDateTime grantedAt;

    @Column(name = "revoked_at")
    private LocalDateTime revokedAt;

    // Enum for level names
    public enum LevelName {
        GOLD, SILVER, BRONZE
    }

    // Getters and Setters omitted for brevity
}

