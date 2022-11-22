package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Author : Khonimov Ulugbek
 * Date : 08.11.2022
 * Time : 10:02 AM
 */

@NoRepositoryBean
public interface GenericRepository<E> extends JpaRepository<E, Long>, BaseRepository {
}
