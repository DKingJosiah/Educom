//package com.example.schoolmanagementsystem.role.entity;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import com.example.schoolmanagementsystem.common.entity.BaseEntity;
//import com.example.schoolmanagementsystem.permission.entity.Permission;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.JoinTable;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "roles")
//public class Role extends BaseEntity {
//
//    @Column(nullable = false, unique = true, length = 50)
//    private String code;
//
//    @Column(nullable = false, length = 100)
//    private String name;
//
//    @Column(length = 255)
//    private String description;
//
//    @ManyToMany
//    @JoinTable(
//            name = "role_permissions",
//            joinColumns = @JoinColumn(name = "role_id"),
//            inverseJoinColumns = @JoinColumn(name = "permission_id")
//    )
//    private Set<Permission> permissions = new HashSet<>();
//
//    protected Role() {
//    }
//
//    public Role(String code, String name, String description) {
//        this.code = code;
//        this.name = name;
//        this.description = description;
//    }
//
//    public String getCode() {
//        return code;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public Set<Permission> getPermissions() {
//        return Set.copyOf(permissions);
//    }
//
//    public void addPermission(Permission permission) {
//        permissions.add(permission);
//    }
//
//    public void removePermission(Permission permission) {
//        permissions.remove(permission);
//    }
//}
