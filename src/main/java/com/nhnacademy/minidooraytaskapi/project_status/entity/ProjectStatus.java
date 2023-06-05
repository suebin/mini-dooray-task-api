package com.nhnacademy.minidooraytaskapi.project_status.entity;

import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Table(name = "project_status")
public class ProjectStatus {
    @Id
    @Column(name = "project_status_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectStatusId;

    @Column(name = "name")
    private String name;
}