package com.kroot.crudApp.repository;

import com.kroot.crudApp.model.Box;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Specifies methods used to obtain and modify box related information
 * which is stored in the database.
 */
public interface BoxRepository extends JpaRepository<Box, Long> {
}