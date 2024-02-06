package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Entity
@AllArgsConstructor
@Table(name="Todo_app")
@Data
public class ToDo {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   @Column(name="todo_Id")
   private int todoId;
   @JsonProperty
   @Column(name="is_completed")
   private boolean isComplete;
   @Column(name="complete_date")
   private String completionDate;
   @Column(name="todo_name")
   private TodoName name;
   
}
