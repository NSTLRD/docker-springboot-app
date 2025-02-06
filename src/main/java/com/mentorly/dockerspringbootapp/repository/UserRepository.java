/**
 * @author Starling Diaz on 2/5/2025.
 * @Github https://github.com/NSTLRD
 * @Website https://mentorly.blog/
 * @Academy https://www.mentor-ly.com/
 * @version docker-springboot-app 1.0
 * @since 2/5/2025.
 */

package com.mentorly.dockerspringbootapp.repository;

import com.mentorly.dockerspringbootapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
