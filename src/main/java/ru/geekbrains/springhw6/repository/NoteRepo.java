package ru.geekbrains.springhw6.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.springhw6.model.Note;

import java.util.Optional;

@Repository
public interface NoteRepo extends JpaRepository<Note, Long> {

    /**
     * Найти запись по id
     * @param id must not be {@literal null}.
     * @return возвращает запись.
     */
    Optional<Note> findById(Long id);
}
