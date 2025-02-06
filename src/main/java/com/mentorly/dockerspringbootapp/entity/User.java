/**
 * @author Starling Diaz on 2/5/2025.
 * @Github https://github.com/NSTLRD
 * @Website https://mentorly.blog/
 * @Academy https://www.mentor-ly.com/
 * @version docker-springboot-app 1.0
 * @since 2/5/2025.
 */

package com.mentorly.dockerspringbootapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    private long id;
    private String name;
    private String email;

}
