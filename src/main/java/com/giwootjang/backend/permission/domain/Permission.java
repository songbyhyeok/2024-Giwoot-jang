package com.giwootjang.backend.permission.domain;

import com.giwootjang.backend.role.domain.Role;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "permission")
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "permission_no", nullable = false)
    private long permissionNo;

    @ManyToOne
    @JoinColumn(name = "role_no", nullable = false)
    private Role role;

    @Enumerated(EnumType.STRING)
    @Column(name = "name", nullable = false)
    private PermissionName name;

    @Column(name = "granted_at", nullable = false)
    private LocalDateTime grantedAt;

    @Column(name = "revoked_at")
    private LocalDateTime revokedAt;

    public Permission() {
        // 기본 생성자
    }
}

enum PermissionName {
    CREATE, READ, UPDATE, DELETE
}

