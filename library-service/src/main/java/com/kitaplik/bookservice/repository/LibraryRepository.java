package com.kitaplik.bookservice.repository;

import com.kitaplik.bookservice.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository <Library, String> {

}
